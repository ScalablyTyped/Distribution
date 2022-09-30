package typings.googleCloudTextToSpeech.anon

import org.scalablytyped.runtime.Instantiable0
import typings.googleGax.mod.fallback.GoogleError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofGoogleError
  extends StObject
     with Instantiable0[GoogleError] {
  
  def parseGRPCStatusDetails(err: typings.googleGax.googleErrorMod.GoogleError): typings.googleGax.googleErrorMod.GoogleError = js.native
  
  def parseHttpError(json: Any): typings.googleGax.googleErrorMod.GoogleError = js.native
}
