package typings.googleAuthLibrary.oauth2clientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CertificateFormat extends js.Object
@JSImport("google-auth-library/build/src/auth/oauth2client", "CertificateFormat")
@js.native
object CertificateFormat extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CertificateFormat with String] = js.native
  
  @js.native
  sealed trait JWK extends CertificateFormat
  /* "JWK" */ @js.native
  object JWK extends TopLevel[JWK with String]
  
  @js.native
  sealed trait PEM extends CertificateFormat
  /* "PEM" */ @js.native
  object PEM extends TopLevel[PEM with String]
}
