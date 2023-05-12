package typings.fhirKitClient.anon

import typings.std.HeadersInit
import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compartment extends StObject {
  
  var compartment: js.UndefOr[typings.fhirKitClient.mod.Compartment] = js.undefined
  
  var headers: js.UndefOr[HeadersInit] = js.undefined
  
  var options: js.UndefOr[RequestInit] = js.undefined
  
  var resourceType: typings.fhirKitClient.mod.ResourceType
  
  var searchParams: js.UndefOr[typings.fhirKitClient.mod.SearchParams] = js.undefined
}
object Compartment {
  
  inline def apply(resourceType: typings.fhirKitClient.mod.ResourceType): Compartment = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compartment]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Compartment] (val x: Self) extends AnyVal {
    
    inline def setCompartment(value: typings.fhirKitClient.mod.Compartment): Self = StObject.set(x, "compartment", value.asInstanceOf[js.Any])
    
    inline def setCompartmentUndefined: Self = StObject.set(x, "compartment", js.undefined)
    
    inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setOptions(value: RequestInit): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.mod.ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSearchParams(value: typings.fhirKitClient.mod.SearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
    
    inline def setSearchParamsUndefined: Self = StObject.set(x, "searchParams", js.undefined)
  }
}
