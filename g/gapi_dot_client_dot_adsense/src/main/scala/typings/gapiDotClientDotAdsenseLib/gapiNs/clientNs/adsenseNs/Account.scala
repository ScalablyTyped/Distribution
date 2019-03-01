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

object Account {
  @scala.inline
  def apply(
    creation_time: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    premium: js.UndefOr[scala.Boolean] = js.undefined,
    subAccounts: js.Array[Account] = null,
    timezone: java.lang.String = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (creation_time != null) __obj.updateDynamic("creation_time")(creation_time)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(premium)) __obj.updateDynamic("premium")(premium)
    if (subAccounts != null) __obj.updateDynamic("subAccounts")(subAccounts)
    if (timezone != null) __obj.updateDynamic("timezone")(timezone)
    __obj.asInstanceOf[Account]
  }
}

