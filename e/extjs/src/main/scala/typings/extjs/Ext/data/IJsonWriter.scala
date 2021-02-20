package typings.extjs.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IJsonWriter
  extends typings.extjs.Ext.data.writer.IWriter {
  
  /** [Config Option] (Boolean) */
  var allowSingle: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var encode: js.UndefOr[Boolean] = js.native
  
  /** [Config Option] (Boolean) */
  var expandData: js.UndefOr[Boolean] = js.native
  
  /** [Method] The Reader classes support dot delimited data mappings for extracting nested raw data into fields so the writer must
    * @param data Object
    */
  var getExpandedData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.native
  
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.native
}
object IJsonWriter {
  
  @scala.inline
  def apply(): IJsonWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonWriter]
  }
  
  @scala.inline
  implicit class IJsonWriterMutableBuilder[Self <: IJsonWriter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowSingle(value: Boolean): Self = StObject.set(x, "allowSingle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowSingleUndefined: Self = StObject.set(x, "allowSingle", js.undefined)
    
    @scala.inline
    def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    @scala.inline
    def setExpandData(value: Boolean): Self = StObject.set(x, "expandData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpandDataUndefined: Self = StObject.set(x, "expandData", js.undefined)
    
    @scala.inline
    def setGetExpandedData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getExpandedData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetExpandedDataUndefined: Self = StObject.set(x, "getExpandedData", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
