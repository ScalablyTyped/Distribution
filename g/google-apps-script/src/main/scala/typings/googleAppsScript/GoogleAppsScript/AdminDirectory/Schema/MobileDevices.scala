package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MobileDevices extends js.Object {
  var etag: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var mobiledevices: js.UndefOr[js.Array[MobileDevice]] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object MobileDevices {
  @scala.inline
  def apply(): MobileDevices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MobileDevices]
  }
  @scala.inline
  implicit class MobileDevicesOps[Self <: MobileDevices] (val x: Self) extends AnyVal {
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setMobiledevicesVarargs(value: MobileDevice*): Self = this.set("mobiledevices", js.Array(value :_*))
    @scala.inline
    def setMobiledevices(value: js.Array[MobileDevice]): Self = this.set("mobiledevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMobiledevices: Self = this.set("mobiledevices", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

