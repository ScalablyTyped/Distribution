package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountIdentifier extends js.Object {
  /** The aggregator ID, set for aggregators and subaccounts (in that case, it represents the aggregator of the subaccount). */
  var aggregatorId: js.UndefOr[java.lang.String] = js.undefined
  /** The merchant account ID, set for individual accounts and subaccounts. */
  var merchantId: js.UndefOr[java.lang.String] = js.undefined
}

object AccountIdentifier {
  @scala.inline
  def apply(aggregatorId: java.lang.String = null, merchantId: java.lang.String = null): AccountIdentifier = {
    val __obj = js.Dynamic.literal()
    if (aggregatorId != null) __obj.updateDynamic("aggregatorId")(aggregatorId)
    if (merchantId != null) __obj.updateDynamic("merchantId")(merchantId)
    __obj.asInstanceOf[AccountIdentifier]
  }
}

