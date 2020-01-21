package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Configuration of all preserved resources.
  */
@js.native
trait SchemaStatefulPolicyPreservedResources extends js.Object {
  /**
    * Disks created on the instances that will be preserved on instance delete,
    * resize down, etc.
    */
  var disks: js.UndefOr[js.Array[SchemaStatefulPolicyPreservedDisk]] = js.native
}

object SchemaStatefulPolicyPreservedResources {
  @scala.inline
  def apply(disks: js.Array[SchemaStatefulPolicyPreservedDisk] = null): SchemaStatefulPolicyPreservedResources = {
    val __obj = js.Dynamic.literal()
    if (disks != null) __obj.updateDynamic("disks")(disks.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStatefulPolicyPreservedResources]
  }
}

