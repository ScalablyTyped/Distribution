package typings.gapiClientTesting.gapi.client.testing

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnvironmentMatrix extends js.Object {
  /**
    * A list of Android devices; the test will be run only on the specified
    * devices.
    */
  var androidDeviceList: js.UndefOr[AndroidDeviceList] = js.native
  /** A matrix of Android devices. */
  var androidMatrix: js.UndefOr[AndroidMatrix] = js.native
}

object EnvironmentMatrix {
  @scala.inline
  def apply(): EnvironmentMatrix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnvironmentMatrix]
  }
  @scala.inline
  implicit class EnvironmentMatrixOps[Self <: EnvironmentMatrix] (val x: Self) extends AnyVal {
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
    def setAndroidDeviceList(value: AndroidDeviceList): Self = this.set("androidDeviceList", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidDeviceList: Self = this.set("androidDeviceList", js.undefined)
    @scala.inline
    def setAndroidMatrix(value: AndroidMatrix): Self = this.set("androidMatrix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAndroidMatrix: Self = this.set("androidMatrix", js.undefined)
  }
  
}

