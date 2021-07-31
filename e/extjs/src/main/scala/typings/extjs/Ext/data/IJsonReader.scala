package typings.extjs.Ext.data

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IJsonReader
  extends StObject
     with typings.extjs.Ext.data.reader.IReader {
  
  /** [Property] (Object) */
  var jsonData: js.UndefOr[js.Any] = js.undefined
  
  /** [Config Option] (String) */
  var metaProperty: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (String) */
  var record: js.UndefOr[String] = js.undefined
  
  /** [Config Option] (Boolean) */
  var useSimpleAccessors: js.UndefOr[Boolean] = js.undefined
}
object IJsonReader {
  
  @scala.inline
  def apply(): IJsonReader = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IJsonReader]
  }
  
  @scala.inline
  implicit class IJsonReaderMutableBuilder[Self <: IJsonReader] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setJsonData(value: js.Any): Self = StObject.set(x, "jsonData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJsonDataUndefined: Self = StObject.set(x, "jsonData", js.undefined)
    
    @scala.inline
    def setMetaProperty(value: String): Self = StObject.set(x, "metaProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaPropertyUndefined: Self = StObject.set(x, "metaProperty", js.undefined)
    
    @scala.inline
    def setRecord(value: String): Self = StObject.set(x, "record", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecordUndefined: Self = StObject.set(x, "record", js.undefined)
    
    @scala.inline
    def setUseSimpleAccessors(value: Boolean): Self = StObject.set(x, "useSimpleAccessors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseSimpleAccessorsUndefined: Self = StObject.set(x, "useSimpleAccessors", js.undefined)
  }
}
