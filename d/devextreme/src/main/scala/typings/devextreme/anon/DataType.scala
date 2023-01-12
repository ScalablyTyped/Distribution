package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataType extends StObject {
  
  var data: js.UndefOr[String] = js.undefined
  
  var dataType: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[Any] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
  
  var xhrFields: js.UndefOr[Any] = js.undefined
}
object DataType {
  
  inline def apply(): DataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataType] (val x: Self) extends AnyVal {
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataType(value: String): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setHeaders(value: Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setXhrFields(value: Any): Self = StObject.set(x, "xhrFields", value.asInstanceOf[js.Any])
    
    inline def setXhrFieldsUndefined: Self = StObject.set(x, "xhrFields", js.undefined)
  }
}
