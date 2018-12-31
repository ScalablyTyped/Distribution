package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegionInstanceGroupManagersSetTargetPoolsRequest extends js.Object {
  /**
    * Fingerprint of the target pools information, which is a hash of the contents. This field is used for optimistic locking when you update the target pool
    * entries. This field is optional.
    */
  var fingerprint: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The URL of all TargetPool resources to which instances in the instanceGroup field are added. The target pools automatically apply to all of the
    * instances in the managed instance group.
    */
  var targetPools: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

