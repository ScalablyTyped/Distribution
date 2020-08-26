package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeOsDeviceDiskVolumeReports extends js.Object {
  var volumeInfo: js.UndefOr[js.Array[ChromeOsDeviceDiskVolumeReportsVolumeInfo]] = js.native
}

object ChromeOsDeviceDiskVolumeReports {
  @scala.inline
  def apply(): ChromeOsDeviceDiskVolumeReports = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOsDeviceDiskVolumeReports]
  }
  @scala.inline
  implicit class ChromeOsDeviceDiskVolumeReportsOps[Self <: ChromeOsDeviceDiskVolumeReports] (val x: Self) extends AnyVal {
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
    def setVolumeInfoVarargs(value: ChromeOsDeviceDiskVolumeReportsVolumeInfo*): Self = this.set("volumeInfo", js.Array(value :_*))
    @scala.inline
    def setVolumeInfo(value: js.Array[ChromeOsDeviceDiskVolumeReportsVolumeInfo]): Self = this.set("volumeInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVolumeInfo: Self = this.set("volumeInfo", js.undefined)
  }
  
}

