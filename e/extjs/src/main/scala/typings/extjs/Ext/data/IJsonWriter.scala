package typings.extjs.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IJsonWriter
  extends StObject
     with typings.extjs.Ext.data.writer.IWriter {
  
  /** [Config Option] (Boolean) */
  var allowSingle: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var encode: js.UndefOr[Boolean] = js.undefined
  
  /** [Config Option] (Boolean) */
  var expandData: js.UndefOr[Boolean] = js.undefined
  
  /** [Method] The Reader classes support dot delimited data mappings for extracting nested raw data into fields so the writer must
    * @param data Object
    */
  var getExpandedData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], Unit]] = js.undefined
  
  /** [Config Option] (String) */
  var root: js.UndefOr[String] = js.undefined
}
object IJsonWriter {
  
  inline def apply(): IJsonWriter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonWriter]
  }
  
  extension [Self <: IJsonWriter](x: Self) {
    
    inline def setAllowSingle(value: Boolean): Self = StObject.set(x, "allowSingle", value.asInstanceOf[js.Any])
    
    inline def setAllowSingleUndefined: Self = StObject.set(x, "allowSingle", js.undefined)
    
    inline def setEncode(value: Boolean): Self = StObject.set(x, "encode", value.asInstanceOf[js.Any])
    
    inline def setEncodeUndefined: Self = StObject.set(x, "encode", js.undefined)
    
    inline def setExpandData(value: Boolean): Self = StObject.set(x, "expandData", value.asInstanceOf[js.Any])
    
    inline def setExpandDataUndefined: Self = StObject.set(x, "expandData", js.undefined)
    
    inline def setGetExpandedData(value: /* data */ js.UndefOr[js.Any] => Unit): Self = StObject.set(x, "getExpandedData", js.Any.fromFunction1(value))
    
    inline def setGetExpandedDataUndefined: Self = StObject.set(x, "getExpandedData", js.undefined)
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
