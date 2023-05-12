package typings.fhirKitClient.anon

import typings.std.HeadersInit
import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OptionsSearchParams extends StObject {
  
  var headers: js.UndefOr[HeadersInit] = js.undefined
  
  var options: js.UndefOr[RequestInit] = js.undefined
  
  var searchParams: typings.fhirKitClient.mod.SearchParams
}
object OptionsSearchParams {
  
  inline def apply(searchParams: typings.fhirKitClient.mod.SearchParams): OptionsSearchParams = {
    val __obj = js.Dynamic.literal(searchParams = searchParams.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsSearchParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OptionsSearchParams] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setOptions(value: RequestInit): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    inline def setSearchParams(value: typings.fhirKitClient.mod.SearchParams): Self = StObject.set(x, "searchParams", value.asInstanceOf[js.Any])
  }
}
