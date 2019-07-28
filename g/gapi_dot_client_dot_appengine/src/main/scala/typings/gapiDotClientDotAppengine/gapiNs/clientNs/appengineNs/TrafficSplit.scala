package typings.gapiDotClientDotAppengine.gapiNs.clientNs.appengineNs

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrafficSplit extends js.Object {
  /**
    * Mapping from version IDs within the service to fractional (0.000, 1] allocations of traffic for that version. Each version can be specified only once,
    * but some versions in the service may not have any traffic allocation. Services that have traffic allocated cannot be deleted until either the service
    * is deleted or their traffic allocation is removed. Allocations must sum to 1. Up to two decimal place precision is supported for IP-based splits and up
    * to three decimal places is supported for cookie-based splits.
    */
  var allocations: js.UndefOr[Record[String, Double]] = js.undefined
  /**
    * Mechanism used to determine which version a request is sent to. The traffic selection algorithm will be stable for either type until allocations are
    * changed.
    */
  var shardBy: js.UndefOr[String] = js.undefined
}

object TrafficSplit {
  @scala.inline
  def apply(allocations: Record[String, Double] = null, shardBy: String = null): TrafficSplit = {
    val __obj = js.Dynamic.literal()
    if (allocations != null) __obj.updateDynamic("allocations")(allocations)
    if (shardBy != null) __obj.updateDynamic("shardBy")(shardBy)
    __obj.asInstanceOf[TrafficSplit]
  }
}

