package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaStatefulPolicyPreservedDisk extends js.Object {
  /**
    * Device name of the disk to be preserved
    */
  var deviceName: js.UndefOr[String] = js.native
}

object SchemaStatefulPolicyPreservedDisk {
  @scala.inline
  def apply(deviceName: String = null): SchemaStatefulPolicyPreservedDisk = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaStatefulPolicyPreservedDisk]
  }
}

