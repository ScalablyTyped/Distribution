package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CreateAuthUriResponse extends js.Object {
  /** all providers the user has once used to do federated login */
  var allProviders: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The URI used by the IDP to authenticate the user. */
  var authUri: js.UndefOr[java.lang.String] = js.undefined
  /** True if captcha is required. */
  var captchaRequired: js.UndefOr[scala.Boolean] = js.undefined
  /** True if the authUri is for user's existing provider. */
  var forExistingProvider: js.UndefOr[scala.Boolean] = js.undefined
  /** The fixed string identitytoolkit#CreateAuthUriResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The provider ID of the auth URI. */
  var providerId: js.UndefOr[java.lang.String] = js.undefined
  /** Whether the user is registered if the identifier is an email. */
  var registered: js.UndefOr[scala.Boolean] = js.undefined
  /** Session ID which should be passed in the following verifyAssertion request. */
  var sessionId: js.UndefOr[java.lang.String] = js.undefined
  /** All sign-in methods this user has used. */
  var signinMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

