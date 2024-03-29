package typings.fhirKitClient.anon

import typings.fhirKitClient.mod.FhirResource
import typings.std.HeadersInit
import typings.std.RequestInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeadersOptions extends StObject {
  
  var body: FhirResource & Type
  
  var headers: js.UndefOr[HeadersInit] = js.undefined
  
  var options: js.UndefOr[RequestInit] = js.undefined
}
object HeadersOptions {
  
  inline def apply(body: FhirResource & Type): HeadersOptions = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeadersOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HeadersOptions] (val x: Self) extends AnyVal {
    
    inline def setBody(value: FhirResource & Type): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setOptions(value: RequestInit): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
  }
}
