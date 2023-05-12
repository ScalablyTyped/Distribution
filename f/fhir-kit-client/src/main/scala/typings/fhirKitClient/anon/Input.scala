package typings.fhirKitClient.anon

import typings.fhirKitClient.fhirKitClientStrings.GET
import typings.fhirKitClient.fhirKitClientStrings.POST
import typings.fhirKitClient.mod.RequestInitWithoutMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Input extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
  
  var input: js.UndefOr[Any] = js.undefined
  
  var method: js.UndefOr[POST | GET] = js.undefined
  
  var name: String
  
  var options: js.UndefOr[RequestInitWithoutMethod] = js.undefined
  
  var resourceType: js.UndefOr[typings.fhirKitClient.mod.ResourceType] = js.undefined
}
object Input {
  
  inline def apply(name: String): Input = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Input]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Input] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setInput(value: Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    
    inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
    
    inline def setMethod(value: POST | GET): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: RequestInitWithoutMethod): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.mod.ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "resourceType", js.undefined)
  }
}
