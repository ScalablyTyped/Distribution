package typings.googleDashAuthDashLibrary.buildSrcAuthOauth2clientMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CertificateFormat with String] = js.native
  /* "JWK" */ @js.native
  object JWK extends TopLevel[JWK with String]
  
  /* "PEM" */ @js.native
  object PEM extends TopLevel[PEM with String]
  
}

