package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of all preserved resources.
  */
@js.native
trait Schema$StatefulPolicyPreservedResources extends js.Object {
  /**
    * Disks created on the instances that will be preserved on instance delete,
    * resize down, etc.
    */
  var disks: js.UndefOr[js.Array[Schema$StatefulPolicyPreservedDisk]] = js.native
}

object Schema$StatefulPolicyPreservedResources {
  @scala.inline
  def apply(disks: js.Array[Schema$StatefulPolicyPreservedDisk] = null): Schema$StatefulPolicyPreservedResources = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StatefulPolicyPreservedResources]
  }
}

