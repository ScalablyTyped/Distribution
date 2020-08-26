package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceRequest extends js.Object {
  var Capabilities: js.UndefOr[js.Array[js.Array[String]]] = js.native
  var Count: js.UndefOr[Double] = js.native
  var DeviceIDs: js.UndefOr[js.Array[String]] = js.native
  var Driver: js.UndefOr[String] = js.native
  var Options: js.UndefOr[StringDictionary[String]] = js.native
}

object DeviceRequest {
  @scala.inline
  def apply(): DeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceRequest]
  }
  @scala.inline
  implicit class DeviceRequestOps[Self <: DeviceRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapabilitiesVarargs(value: js.Array[String]*): Self = this.set("Capabilities", js.Array(value :_*))
    @scala.inline
    def setCapabilities(value: js.Array[js.Array[String]]): Self = this.set("Capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapabilities: Self = this.set("Capabilities", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("Count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("Count", js.undefined)
    @scala.inline
    def setDeviceIDsVarargs(value: String*): Self = this.set("DeviceIDs", js.Array(value :_*))
    @scala.inline
    def setDeviceIDs(value: js.Array[String]): Self = this.set("DeviceIDs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceIDs: Self = this.set("DeviceIDs", js.undefined)
    @scala.inline
    def setDriver(value: String): Self = this.set("Driver", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDriver: Self = this.set("Driver", js.undefined)
    @scala.inline
    def setOptions(value: StringDictionary[String]): Self = this.set("Options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("Options", js.undefined)
  }
  
}

