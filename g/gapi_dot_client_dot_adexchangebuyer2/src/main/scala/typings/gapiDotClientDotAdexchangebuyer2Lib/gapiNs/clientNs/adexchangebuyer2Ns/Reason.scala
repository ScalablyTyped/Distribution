package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Reason extends js.Object {
  /**
    * The number of times the creative was filtered for the status. The
    * count is aggregated across all publishers on the exchange.
    */
  var count: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The filtering status code. Please refer to the
    * [creative-status-codes.txt](https://storage.googleapis.com/adx-rtb-dictionaries/creative-status-codes.txt)
    * file for different statuses.
    */
  var status: js.UndefOr[scala.Double] = js.undefined
}

object Reason {
  @scala.inline
  def apply(count: java.lang.String = null, status: scala.Int | scala.Double = null): Reason = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
}

