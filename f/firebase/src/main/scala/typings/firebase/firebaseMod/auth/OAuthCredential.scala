package typings.firebase.firebaseMod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface that represents the OAuth credentials returned by an OAuth
  * provider. Implementations specify the details about each auth provider's
  * credential requirements.
  *
  */
@JSImport("firebase", "auth.OAuthCredential")
@js.native
class OAuthCredential protected () extends AuthCredential {
  /**
    * The OAuth access token associated with the credential if it belongs to
    * an OAuth provider, such as `facebook.com`, `twitter.com`, etc.
    */
  var accessToken: js.UndefOr[String] = js.native
  /**
    * The OAuth ID token associated with the credential if it belongs to an
    * OIDC provider, such as `google.com`.
    */
  var idToken: js.UndefOr[String] = js.native
  /**
    * The OAuth access token secret associated with the credential if it
    * belongs to an OAuth 1.0 provider, such as `twitter.com`.
    */
  var secret: js.UndefOr[String] = js.native
}

