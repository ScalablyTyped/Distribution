package typings
package firebaseLib.firebaseMod.firebaseNs.authNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface that represents the OAuth credentials returned by an OAuth
  * provider. Implementations specify the details about each auth provider's
  * credential requirements.
  *
  */
trait OAuthCredential extends AuthCredential {
  /**
    * The OAuth access token associated with the credential if it belongs to
    * an OAuth provider, such as `facebook.com`, `twitter.com`, etc.
    */
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The OAuth ID token associated with the credential if it belongs to an
    * OIDC provider, such as `google.com`.
    */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The OAuth access token secret associated with the credential if it
    * belongs to an OAuth 1.0 provider, such as `twitter.com`.
    */
  var secret: js.UndefOr[java.lang.String] = js.undefined
}

object OAuthCredential {
  @scala.inline
  def apply(
    providerId: java.lang.String,
    signInMethod: java.lang.String,
    accessToken: java.lang.String = null,
    idToken: java.lang.String = null,
    secret: java.lang.String = null
  ): OAuthCredential = {
    val __obj = js.Dynamic.literal(providerId = providerId, signInMethod = signInMethod)
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (idToken != null) __obj.updateDynamic("idToken")(idToken)
    if (secret != null) __obj.updateDynamic("secret")(secret)
    __obj.asInstanceOf[OAuthCredential]
  }
}

