package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetPoolsRemoveInstanceRequest extends js.Object {
  /** URLs of the instances to be removed from target pool. */
  var instances: js.UndefOr[js.Array[InstanceReference]] = js.undefined
}

object TargetPoolsRemoveInstanceRequest {
  @scala.inline
  def apply(instances: js.Array[InstanceReference] = null): TargetPoolsRemoveInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (instances != null) __obj.updateDynamic("instances")(instances.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetPoolsRemoveInstanceRequest]
  }
}

