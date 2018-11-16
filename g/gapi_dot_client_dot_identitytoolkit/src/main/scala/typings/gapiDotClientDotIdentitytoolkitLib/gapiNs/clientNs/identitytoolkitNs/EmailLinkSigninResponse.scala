package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EmailLinkSigninResponse extends js.Object {
  /** The user's email. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** Expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[java.lang.String] = js.undefined
  /** The STS id token to login the newly signed in user. */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the user is new. */
  var isNewUser: js.UndefOr[scala.Boolean] = js.undefined
  /** The fixed string "identitytoolkit#EmailLinkSigninResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The RP local ID of the user. */
  var localId: js.UndefOr[java.lang.String] = js.undefined
  /** The refresh token for the signed in user. */
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
}

