package typings
package gapiDotClientDotOauth2Lib.gapiNs.clientNs.oauth2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Tokeninfo extends js.Object {
  /** The access type granted with this token. It can be offline or online. */
  var access_type: js.UndefOr[java.lang.String] = js.undefined
  /** Who is the intended audience for this token. In general the same as issued_to. */
  var audience: js.UndefOr[java.lang.String] = js.undefined
  /** The email address of the user. Present only if the email scope is present in the request. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** The expiry time of the token, as number of seconds left until expiry. */
  var expires_in: js.UndefOr[scala.Double] = js.undefined
  /** To whom was the token issued to. In general the same as audience. */
  var issued_to: js.UndefOr[java.lang.String] = js.undefined
  /** The space separated list of scopes granted to this token. */
  var scope: js.UndefOr[java.lang.String] = js.undefined
  /** The token handle associated with this token. */
  var token_handle: js.UndefOr[java.lang.String] = js.undefined
  /** The obfuscated user id. */
  var user_id: js.UndefOr[java.lang.String] = js.undefined
  /** Boolean flag which is true if the email address is verified. Present only if the email scope is present in the request. */
  var verified_email: js.UndefOr[scala.Boolean] = js.undefined
}

