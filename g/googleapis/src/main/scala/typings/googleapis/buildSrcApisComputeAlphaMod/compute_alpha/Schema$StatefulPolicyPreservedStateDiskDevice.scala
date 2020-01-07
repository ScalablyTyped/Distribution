package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$StatefulPolicyPreservedStateDiskDevice extends js.Object {
  /**
    * These stateful disks will never be deleted during autohealing, update or
    * VM instance recreate operations. This flag is used to configure if the
    * disk should be deleted after it is no longer used by the group, e.g. when
    * the given instance or the whole group is deleted. Note: disks attached in
    * READ_ONLY mode cannot be auto-deleted.
    */
  var autoDelete: js.UndefOr[String] = js.native
}

object Schema$StatefulPolicyPreservedStateDiskDevice {
  @scala.inline
  def apply(autoDelete: String = null): Schema$StatefulPolicyPreservedStateDiskDevice = {
    val __obj = js.Dynamic.literal()
    if (autoDelete != null) __obj.updateDynamic("autoDelete")(autoDelete.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StatefulPolicyPreservedStateDiskDevice]
  }
}

