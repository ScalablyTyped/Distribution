package typings.googleapis.appengineV1betaMod.appengineV1beta

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Traffic routing configuration for versions within a single service. Traffic
  * splits define how traffic directed to the service is assigned to versions.
  */
@js.native
trait SchemaTrafficSplit extends js.Object {
  /**
    * Mapping from version IDs within the service to fractional (0.000, 1]
    * allocations of traffic for that version. Each version can be specified
    * only once, but some versions in the service may not have any traffic
    * allocation. Services that have traffic allocated cannot be deleted until
    * either the service is deleted or their traffic allocation is removed.
    * Allocations must sum to 1. Up to two decimal place precision is supported
    * for IP-based splits and up to three decimal places is supported for
    * cookie-based splits.
    */
  var allocations: js.UndefOr[StringDictionary[Double]] = js.native
  /**
    * Mechanism used to determine which version a request is sent to. The
    * traffic selection algorithm will be stable for either type until
    * allocations are changed.
    */
  var shardBy: js.UndefOr[String] = js.native
}

object SchemaTrafficSplit {
  @scala.inline
  def apply(allocations: StringDictionary[Double] = null, shardBy: String = null): SchemaTrafficSplit = {
    val __obj = js.Dynamic.literal()
    if (allocations != null) __obj.updateDynamic("allocations")(allocations.asInstanceOf[js.Any])
    if (shardBy != null) __obj.updateDynamic("shardBy")(shardBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaTrafficSplit]
  }
}

