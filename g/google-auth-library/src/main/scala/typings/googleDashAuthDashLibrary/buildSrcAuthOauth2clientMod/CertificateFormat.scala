package typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CertificateFormat extends js.Object

@JSImport("google-auth-library/build/src/auth/oauth2client", "CertificateFormat")
@js.native
object CertificateFormat extends js.Object {
  @js.native
  sealed trait JWK extends CertificateFormat
  
  @js.native
  sealed trait PEM extends CertificateFormat
  
  /* "JWK" */ val JWK: typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.CertificateFormat.JWK with String = js.native
  /* "PEM" */ val PEM: typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod.CertificateFormat.PEM with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CertificateFormat with String] = js.native
}

