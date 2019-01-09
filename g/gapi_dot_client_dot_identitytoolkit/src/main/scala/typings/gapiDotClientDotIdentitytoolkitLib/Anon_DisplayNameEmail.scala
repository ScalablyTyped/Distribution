package typings
package gapiDotClientDotIdentitytoolkitLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DisplayNameEmail extends js.Object {
  /** The user's display name at the IDP. */
  var displayName: js.UndefOr[java.lang.String] = js.undefined
  /** User's email at IDP. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** User's identifier at IDP. */
  var federatedId: js.UndefOr[java.lang.String] = js.undefined
  /** User's phone number. */
  var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
  /** The user's photo url at the IDP. */
  var photoUrl: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The IdP ID. For white listed IdPs it's a short domain name, e.g., google.com, aol.com, live.net and yahoo.com. For other OpenID IdPs it's the OP
    * identifier.
    */
  var providerId: js.UndefOr[java.lang.String] = js.undefined
  /** User's raw identifier directly returned from IDP. */
  var rawId: js.UndefOr[java.lang.String] = js.undefined
  /** User's screen name at Twitter or login name at Github. */
  var screenName: js.UndefOr[java.lang.String] = js.undefined
}

