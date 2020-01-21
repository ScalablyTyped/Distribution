package typings.gapiClientOauth2.gapi.client.oauth2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tokeninfo extends js.Object {
  /** The access type granted with this token. It can be offline or online. */
  var access_type: js.UndefOr[String] = js.undefined
  /** Who is the intended audience for this token. In general the same as issued_to. */
  var audience: js.UndefOr[String] = js.undefined
  /** The email address of the user. Present only if the email scope is present in the request. */
  var email: js.UndefOr[String] = js.undefined
  /** The expiry time of the token, as number of seconds left until expiry. */
  var expires_in: js.UndefOr[Double] = js.undefined
  /** To whom was the token issued to. In general the same as audience. */
  var issued_to: js.UndefOr[String] = js.undefined
  /** The space separated list of scopes granted to this token. */
  var scope: js.UndefOr[String] = js.undefined
  /** The token handle associated with this token. */
  var token_handle: js.UndefOr[String] = js.undefined
  /** The obfuscated user id. */
  var user_id: js.UndefOr[String] = js.undefined
  /** Boolean flag which is true if the email address is verified. Present only if the email scope is present in the request. */
  var verified_email: js.UndefOr[Boolean] = js.undefined
}

object Tokeninfo {
  @scala.inline
  def apply(
    access_type: String = null,
    audience: String = null,
    email: String = null,
    expires_in: Int | Double = null,
    issued_to: String = null,
    scope: String = null,
    token_handle: String = null,
    user_id: String = null,
    verified_email: js.UndefOr[Boolean] = js.undefined
  ): Tokeninfo = {
    val __obj = js.Dynamic.literal()
    if (access_type != null) __obj.updateDynamic("access_type")(access_type.asInstanceOf[js.Any])
    if (audience != null) __obj.updateDynamic("audience")(audience.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (expires_in != null) __obj.updateDynamic("expires_in")(expires_in.asInstanceOf[js.Any])
    if (issued_to != null) __obj.updateDynamic("issued_to")(issued_to.asInstanceOf[js.Any])
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    if (token_handle != null) __obj.updateDynamic("token_handle")(token_handle.asInstanceOf[js.Any])
    if (user_id != null) __obj.updateDynamic("user_id")(user_id.asInstanceOf[js.Any])
    if (!js.isUndefined(verified_email)) __obj.updateDynamic("verified_email")(verified_email.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tokeninfo]
  }
}

