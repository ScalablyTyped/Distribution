package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Payments extends js.Object {
  /** The list of Payments for the account. One or both of a) the account's most recent payment; and b) the account's upcoming payment. */
  var items: js.UndefOr[js.Array[Payment]] = js.undefined
  /** Kind of list this is, in this case adsense#payments. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
}

