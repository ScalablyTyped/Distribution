package typings.fhirKitClient.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsSearchParams extends StObject {
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var searchParams: typings.fhirKitClient.mod.SearchParams
}
object OptionsSearchParams {
  
  inline def apply(searchParams: typings.fhirKitClient.mod.SearchParams): OptionsSearchParams = {
    val __obj = js.Dynamic.literal(searchParams = searchParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsSearchParams]
  }
  
  extension [Self <: OptionsSearchParams](x: Self) {
    
    inline def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSearchParams(value: typings.fhirKitClient.mod.SearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
  }
}
