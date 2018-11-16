package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SignupInfo extends js.Object {
  /** An opaque token that will be required, along with the Enterprise Token, for obtaining the enterprise resource from CompleteSignup. */
  var completionToken: js.UndefOr[java.lang.String] = js.undefined
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#signupInfo". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** A URL under which the Admin can sign up for an enterprise. The page pointed to cannot be rendered in an iframe. */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

