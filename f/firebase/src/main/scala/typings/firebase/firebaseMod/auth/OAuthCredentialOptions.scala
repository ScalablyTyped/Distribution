package typings.firebase.firebaseMod.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the options for initializing an
  * {@link firebase.auth.OAuthCredential}. For ID tokens with nonce claim,
  * the raw nonce has to also be provided.
  */
trait OAuthCredentialOptions extends js.Object {
  /**
    * The OAuth access token used to initialize the OAuthCredential.
    */
  var accessToken: js.UndefOr[String] = js.undefined
  /**
    * The OAuth ID token used to initialize the OAuthCredential.
    */
  var idToken: js.UndefOr[String] = js.undefined
  /**
    * The raw nonce associated with the ID token. It is required when an ID token
    * with a nonce field is provided. The SHA-256 hash of the raw nonce must match
    * the nonce field in the ID token.
    */
  var rawNonce: js.UndefOr[String] = js.undefined
}

object OAuthCredentialOptions {
  @scala.inline
  def apply(accessToken: String = null, idToken: String = null, rawNonce: String = null): OAuthCredentialOptions = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (idToken != null) __obj.updateDynamic("idToken")(idToken.asInstanceOf[js.Any])
    if (rawNonce != null) __obj.updateDynamic("rawNonce")(rawNonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthCredentialOptions]
  }
}

