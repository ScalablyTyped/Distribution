package typings
package gapiDotClientDotAndroidenterpriseLib.gapiNs.clientNs.androidenterpriseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthenticationToken extends js.Object {
  /** Identifies what kind of resource this is. Value: the fixed string "androidenterprise#authenticationToken". */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The authentication token to be passed to the device policy client on the device where it can be used to provision the account for which this token was
    * generated.
    */
  var token: js.UndefOr[java.lang.String] = js.undefined
}

