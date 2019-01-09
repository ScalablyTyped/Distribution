package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  /** User creation timestamp. */
  var createdAt: js.UndefOr[java.lang.String] = js.undefined
  /** The custom attributes to be set in the user's id token. */
  var customAttributes: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the user is authenticated by the developer. */
  var customAuth: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether the user is disabled. */
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  /** The name of the user. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** The email of the user. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the email has been verified. */
  var emailVerified: js.UndefOr[scala.Boolean] = js.undefined
  /** last login timestamp. */
  var lastLoginAt: js.UndefOr[java.lang.String] = js.undefined
  /** The local ID of the user. */
  var localId: js.UndefOr[java.lang.String] = js.undefined
  /** The user's hashed password. */
  var passwordHash: js.UndefOr[java.lang.String] = js.undefined
  /** The timestamp when the password was last updated. */
  var passwordUpdatedAt: js.UndefOr[scala.Double] = js.undefined
  /** User's phone number. */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The URL of the user profile photo. */
  var photoUrl: js.UndefOr[java.lang.String] = js.undefined
  /** The IDP of the user. */
  var providerUserInfo: js.UndefOr[js.Array[gapiDotClientDotIdentitytoolkitLib.Anon_DisplayNameEmail]] = js.undefined
  /** The user's plain text password. */
  var rawPassword: js.UndefOr[java.lang.String] = js.undefined
  /** The user's password salt. */
  var salt: js.UndefOr[java.lang.String] = js.undefined
  /** User's screen name at Twitter or login name at Github. */
  var screenName: js.UndefOr[java.lang.String] = js.undefined
  /** Timestamp in seconds for valid login token. */
  var validSince: js.UndefOr[java.lang.String] = js.undefined
  /** Version of the user's password. */
  var version: js.UndefOr[scala.Double] = js.undefined
}

