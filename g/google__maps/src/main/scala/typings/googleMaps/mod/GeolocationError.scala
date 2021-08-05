package typings.googleMaps.mod

import typings.googleMaps.anon.Code
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeolocationError extends StObject {
  
  var error: Code
}
object GeolocationError {
  
  inline def apply(error: Code): GeolocationError = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[GeolocationError]
  }
  
  extension [Self <: GeolocationError](x: Self) {
    
    inline def setError(value: Code): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
