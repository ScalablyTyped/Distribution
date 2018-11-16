package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SetAccountInfoResponse extends js.Object {
  /** The name of the user. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** If email has been verified. */
  var emailVerified: js.UndefOr[scala.Boolean] = js.undefined
  /** If idToken is STS id token, then this field will be expiration time of STS id token in seconds. */
  var expiresIn: js.UndefOr[java.lang.String] = js.undefined
  /** The Gitkit id token to login the newly sign up user. */
  var idToken: js.UndefOr[java.lang.String] = js.undefined
  /** The fixed string "identitytoolkit#SetAccountInfoResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The local ID of the user. */
  var localId: js.UndefOr[java.lang.String] = js.undefined
  /** The new email the user attempts to change to. */
  var newEmail: js.UndefOr[java.lang.String] = js.undefined
  /** The user's hashed password. */
  var passwordHash: js.UndefOr[java.lang.String] = js.undefined
  /** The photo url of the user. */
  var photoUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The user's profiles at the associated IdPs. */
  var providerUserInfo: js.UndefOr[js.Array[gapiDotClientDotIdentitytoolkitLib.Anon_DisplayName]] = js.undefined
  /** If idToken is STS id token, then this field will be refresh token. */
  var refreshToken: js.UndefOr[java.lang.String] = js.undefined
}

