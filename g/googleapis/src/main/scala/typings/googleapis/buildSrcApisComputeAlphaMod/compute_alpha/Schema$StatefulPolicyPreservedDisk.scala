package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$StatefulPolicyPreservedDisk extends js.Object {
  /**
    * Device name of the disk to be preserved
    */
  var deviceName: js.UndefOr[String] = js.native
}

object Schema$StatefulPolicyPreservedDisk {
  @scala.inline
  def apply(deviceName: String = null): Schema$StatefulPolicyPreservedDisk = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StatefulPolicyPreservedDisk]
  }
}

