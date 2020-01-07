package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$ManagedInstanceOverrideDiskOverride extends js.Object {
  /**
    * The name of the device on the VM
    */
  var deviceName: js.UndefOr[String] = js.native
  /**
    * The mode in which to attach this disk, either READ_WRITE or READ_ONLY. If
    * not specified, the default is to attach the disk in READ_WRITE mode.
    */
  var mode: js.UndefOr[String] = js.native
  /**
    * The disk that is/will be mounted
    */
  var source: js.UndefOr[String] = js.native
}

object Schema$ManagedInstanceOverrideDiskOverride {
  @scala.inline
  def apply(deviceName: String = null, mode: String = null, source: String = null): Schema$ManagedInstanceOverrideDiskOverride = {
    val __obj = js.Dynamic.literal()
    if (deviceName != null) __obj.updateDynamic("deviceName")(deviceName.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ManagedInstanceOverrideDiskOverride]
  }
}

