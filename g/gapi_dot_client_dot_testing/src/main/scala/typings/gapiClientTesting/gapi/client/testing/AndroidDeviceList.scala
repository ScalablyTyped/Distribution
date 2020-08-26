package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AndroidDeviceList extends js.Object {
  /**
    * A list of Android devices
    * Required
    */
  var androidDevices: js.UndefOr[js.Array[AndroidDevice]] = js.native
}

object AndroidDeviceList {
  @scala.inline
  def apply(): AndroidDeviceList = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidDeviceList]
  }
  @scala.inline
  implicit class AndroidDeviceListOps[Self <: AndroidDeviceList] (val x: Self) extends AnyVal {
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
    def setAndroidDevicesVarargs(value: AndroidDevice*): Self = this.set("androidDevices", js.Array(value :_*))
    @scala.inline
    def setAndroidDevices(value: js.Array[AndroidDevice]): Self = this.set("androidDevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidDevices: Self = this.set("androidDevices", js.undefined)
  }
  
}

