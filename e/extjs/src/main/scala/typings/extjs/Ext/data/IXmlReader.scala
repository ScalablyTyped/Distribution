package typings.extjs.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IXmlReader
  extends StObject
     with typings.extjs.Ext.data.reader.IReader {
  
  /** [Method] Normalizes the data object
    * @param data Object The raw data object
    * @returns Object The documentElement property of the data object if present, or the same object if not.
    */
  var getData: js.UndefOr[js.Function1[/* data */ js.UndefOr[js.Any], js.Any]] = js.undefined
  
  /** [Config Option] (String) */
  var namespace: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.undefined
  
  /** [Property] (Object) */
  var xmlData: js.UndefOr[js.Any] = js.undefined
}
object IXmlReader {
  
  @scala.inline
  def apply(): IXmlReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IXmlReader]
  }
  
  @scala.inline
  implicit class IXmlReaderMutableBuilder[Self <: IXmlReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetData(value: /* data */ js.UndefOr[js.Any] => js.Any): Self = StObject.set(x, "getData", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetDataUndefined: Self = StObject.set(x, "getData", js.undefined)
    
    @scala.inline
    def setNamespace(value: String): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespaceUndefined: Self = StObject.set(x, "namespace", js.undefined)
    
    @scala.inline
    def setRecord(value: String): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    @scala.inline
    def setXmlData(value: js.Any): Self = StObject.set(x, "xmlData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXmlDataUndefined: Self = StObject.set(x, "xmlData", js.undefined)
  }
}
