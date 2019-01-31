package typings
package googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CertificateFormat extends js.Object

@JSImport("google-auth-library/build/src/auth/oauth2client", "CertificateFormat")
@js.native
object CertificateFormat extends js.Object {
  @js.native
  sealed trait JWK
    extends googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.CertificateFormat
  
  @js.native
  sealed trait PEM
    extends googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.CertificateFormat
  
  /* "JWK" */ val JWK: JWK with java.lang.String = js.native
  /* "PEM" */ val PEM: PEM with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    googleDashAuthDashLibraryLib.buildSrcAuthOauth2clientMod.CertificateFormat with java.lang.String
  ] = js.native
}

