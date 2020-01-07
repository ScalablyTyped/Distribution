package typings.googleapis.buildSrcApisOauth2V1Mod.oauth2_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$Tokeninfo extends js.Object {
  /**
    * The access type granted with this token. It can be offline or online.
    */
  var access_type: js.UndefOr[String] = js.native
  /**
    * Who is the intended audience for this token. In general the same as
    * issued_to.
    */
  var audience: js.UndefOr[String] = js.native
  /**
    * The email address of the user. Present only if the email scope is present
    * in the request.
    */
  var email: js.UndefOr[String] = js.native
  /**
    * Boolean flag which is true if the email address is verified. Present only
    * if the email scope is present in the request.
    */
  var email_verified: js.UndefOr[Boolean] = js.native
  /**
    * The expiry time of the token, as number of seconds left until expiry.
    */
  var expires_in: js.UndefOr[Double] = js.native
  /**
    * The issue time of the token, as number of seconds.
    */
  var issued_at: js.UndefOr[Double] = js.native
  /**
    * To whom was the token issued to. In general the same as audience.
    */
  var issued_to: js.UndefOr[String] = js.native
  /**
    * Who issued the token.
    */
  var issuer: js.UndefOr[String] = js.native
  /**
    * Nonce of the id token.
    */
  var nonce: js.UndefOr[String] = js.native
  /**
    * The space separated list of scopes granted to this token.
    */
  var scope: js.UndefOr[String] = js.native
  /**
    * The obfuscated user id.
    */
  var user_id: js.UndefOr[String] = js.native
  /**
    * Boolean flag which is true if the email address is verified. Present only
    * if the email scope is present in the request.
    */
  var verified_email: js.UndefOr[Boolean] = js.native
}

object Schema$Tokeninfo {
  @scala.inline
  def apply(
    access_type: String = null,
    audience: String = null,
    email: String = null,
    email_verified: js.UndefOr[Boolean] = js.undefined,
    expires_in: Int | Double = null,
    issued_at: Int | Double = null,
    issued_to: String = null,
    issuer: String = null,
    nonce: String = null,
    scope: String = null,
    user_id: String = null,
    verified_email: js.UndefOr[Boolean] = js.undefined
  ): Schema$Tokeninfo = {
    val __obj = js.Dynamic.literal()
    if (access_type != null) __obj.updateDynamic("access_type")(access_type.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (!js.isUndefined(email_verified)) __obj.updateDynamic("email_verified")(email_verified.asInstanceOf[js.Any])
    if (expires_in != null) __obj.updateDynamic("expires_in")(expires_in.asInstanceOf[js.Any])
    if (issued_at != null) __obj.updateDynamic("issued_at")(issued_at.asInstanceOf[js.Any])
    if (issued_to != null) __obj.updateDynamic("issued_to")(issued_to.asInstanceOf[js.Any])
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    if (!js.isUndefined(verified_email)) __obj.updateDynamic("verified_email")(verified_email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Tokeninfo]
  }
}

