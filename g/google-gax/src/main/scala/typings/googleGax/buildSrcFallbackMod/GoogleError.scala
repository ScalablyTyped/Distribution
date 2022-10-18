package typings.googleGax.buildSrcFallbackMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-gax/build/src/fallback", "GoogleError")
@js.native
open class GoogleError ()
  extends typings.googleGax.buildSrcGoogleErrorMod.GoogleError
/* static members */
object GoogleError {
  
  @JSImport("google-gax/build/src/fallback", "GoogleError")
  @js.native
  val ^ : js.Any = js.native
  
  inline def parseGRPCStatusDetails(err: typings.googleGax.buildSrcGoogleErrorMod.GoogleError): typings.googleGax.buildSrcGoogleErrorMod.GoogleError = ^.asInstanceOf[js.Dynamic].applyDynamic("parseGRPCStatusDetails")(err.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.buildSrcGoogleErrorMod.GoogleError]
  
  inline def parseHttpError(json: Any): typings.googleGax.buildSrcGoogleErrorMod.GoogleError = ^.asInstanceOf[js.Dynamic].applyDynamic("parseHttpError")(json.asInstanceOf[js.Any]).asInstanceOf[typings.googleGax.buildSrcGoogleErrorMod.GoogleError]
}
