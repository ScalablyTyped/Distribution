package typings.fhirKitClient.anon

import typings.fhirKitClient.mod.FhirResource
import typings.std.HeadersInit
import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchParams[T /* <: FhirResource */] extends StObject {
  
  var body: T
  
  var headers: js.UndefOr[HeadersInit] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var options: js.UndefOr[RequestInit] = js.undefined
  
  var resourceType: typings.fhirKitClient.mod.ResourceType
  
  var searchParams: js.UndefOr[typings.fhirKitClient.mod.SearchParams] = js.undefined
}
object SearchParams {
  
  inline def apply[T /* <: FhirResource */](body: T, resourceType: typings.fhirKitClient.mod.ResourceType): SearchParams[T] = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = resourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParams[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SearchParams[?], T /* <: FhirResource */] (val x: Self & SearchParams[T]) extends AnyVal {
    
    inline def setBody(value: T): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setOptions(value: RequestInit): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setResourceType(value: typings.fhirKitClient.mod.ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    inline def setSearchParams(value: typings.fhirKitClient.mod.SearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
    
    inline def setSearchParamsUndefined: Self = StObject.set(x, "searchParams", js.undefined)
  }
}
