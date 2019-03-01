package typings
package gapiDotClientDotAdexchangebuyer2Lib.gapiNs.clientNs.adexchangebuyer2Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealtimeTimeRange extends js.Object {
  /** The start timestamp of the real-time RTB metrics aggregation. */
  var startTimestamp: js.UndefOr[java.lang.String] = js.undefined
}

object RealtimeTimeRange {
  @scala.inline
  def apply(startTimestamp: java.lang.String = null): RealtimeTimeRange = {
    val __obj = js.Dynamic.literal()
    if (startTimestamp != null) __obj.updateDynamic("startTimestamp")(startTimestamp)
    __obj.asInstanceOf[RealtimeTimeRange]
  }
}

