package typings.googleGax.mod.fallback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax", "fallback.GoogleError")
@js.native
open class GoogleError ()
  extends typings.googleGax.fallbackMod.GoogleError
/* static members */
object GoogleError {
  
  @JSImport("google-gax", "fallback.GoogleError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseGRPCStatusDetails(err: typings.googleGax.googleErrorMod.GoogleError): typings.googleGax.googleErrorMod.GoogleError = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGRPCStatusDetails")(err.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.googleErrorMod.GoogleError]
  
  inline def parseHttpError(json: Any): typings.googleGax.googleErrorMod.GoogleError = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHttpError")(json.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.googleErrorMod.GoogleError]
}
