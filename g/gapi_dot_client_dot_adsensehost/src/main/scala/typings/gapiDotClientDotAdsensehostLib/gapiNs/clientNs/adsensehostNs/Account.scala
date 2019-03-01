package typings
package gapiDotClientDotAdsensehostLib.gapiNs.clientNs.adsensehostNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Account extends js.Object {
  /** Unique identifier of this account. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** Kind of resource this is, in this case adsensehost#account. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Name of this account. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** Approval status of this account. One of: PENDING, APPROVED, DISABLED. */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

object Account {
  @scala.inline
  def apply(
    id: java.lang.String = null,
    kind: java.lang.String = null,
    name: java.lang.String = null,
    status: java.lang.String = null
  ): Account = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (name != null) __obj.updateDynamic("name")(name)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[Account]
  }
}

