package typings.fhirKitClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchParams extends StObject {
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.mod.ResourceType
  
  var searchParams: typings.fhirKitClient.mod.SearchParams
}
object SearchParams {
  
  @scala.inline
  def apply(
    resourceType: typings.fhirKitClient.mod.ResourceType,
    searchParams: typings.fhirKitClient.mod.SearchParams
  ): SearchParams = {
    val __obj = js.Dynamic.literal(resourceType = resourceType.asInstanceOf[js.Any], searchParams = searchParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchParams]
  }
  
  @scala.inline
  implicit class SearchParamsMutableBuilder[Self <: SearchParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.mod.ResourceType): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchParams(value: typings.fhirKitClient.mod.SearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
  }
}
