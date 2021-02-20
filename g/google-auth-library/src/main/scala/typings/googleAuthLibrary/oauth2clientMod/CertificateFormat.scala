package typings.googleAuthLibrary.oauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CertificateFormat extends StObject
@JSImport("google-auth-library/build/src/auth/oauth2client", "CertificateFormat")
@js.native
object CertificateFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CertificateFormat with String] = js.native
  
  @js.native
  sealed trait JWK extends CertificateFormat
  /* "JWK" */ val JWK: typings.googleAuthLibrary.oauth2clientMod.CertificateFormat.JWK with String = js.native
  
  @js.native
  sealed trait PEM extends CertificateFormat
  /* "PEM" */ val PEM: typings.googleAuthLibrary.oauth2clientMod.CertificateFormat.PEM with String = js.native
}
