package typings
package gapiDotClientDotIdentitytoolkitLib.gapiNs.clientNs.identitytoolkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ResetPasswordResponse extends js.Object {
  /** The user's email. If the out-of-band code is for email recovery, the user's original email. */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /** The fixed string "identitytoolkit#ResetPasswordResponse". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** If the out-of-band code is for email recovery, the user's new email. */
  var newEmail: js.UndefOr[java.lang.String] = js.undefined
  /** The request type. */
  var requestType: js.UndefOr[java.lang.String] = js.undefined
}

