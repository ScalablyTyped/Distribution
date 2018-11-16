package typings
package gapiDotClientDotAdsenseLib.gapiNs.clientNs.adsenseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Account extends js.Object {
  var creation_time: js.UndefOr[java.lang.String] = js.undefined
  /** Unique identifier of this account. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adsense#account. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this account. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Whether this account is premium. */
  var premium: js.UndefOr[scala.Boolean] = js.undefined
  /** Sub accounts of the this account. */
  var subAccounts: js.UndefOr[js.Array[Account]] = js.undefined
  /** AdSense timezone of this account. */
  var timezone: js.UndefOr[java.lang.String] = js.undefined
}

