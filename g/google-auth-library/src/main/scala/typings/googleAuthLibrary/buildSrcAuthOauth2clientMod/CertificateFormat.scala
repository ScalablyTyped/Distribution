package typings.googleAuthLibrary.buildSrcAuthOauth2clientMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CertificateFormat extends StObject
@JSImport("google-auth-library/build/src/auth/oauth2client", "CertificateFormat")
@js.native
object CertificateFormat extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CertificateFormat & String] = js.native
  
  @js.native
  sealed trait JWK
    extends StObject
       with CertificateFormat
  /* "JWK" */ val JWK: typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.CertificateFormat.JWK & String = js.native
  
  @js.native
  sealed trait PEM
    extends StObject
       with CertificateFormat
  /* "PEM" */ val PEM: typings.googleAuthLibrary.buildSrcAuthOauth2clientMod.CertificateFormat.PEM & String = js.native
}
