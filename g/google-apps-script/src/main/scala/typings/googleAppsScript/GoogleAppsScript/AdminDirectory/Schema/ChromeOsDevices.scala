package typings.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChromeOsDevices extends js.Object {
  var chromeosdevices: js.UndefOr[js.Array[ChromeOsDevice]] = js.native
  var etag: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var nextPageToken: js.UndefOr[String] = js.native
}

object ChromeOsDevices {
  @scala.inline
  def apply(): ChromeOsDevices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChromeOsDevices]
  }
  @scala.inline
  implicit class ChromeOsDevicesOps[Self <: ChromeOsDevices] (val x: Self) extends AnyVal {
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
    def setChromeosdevicesVarargs(value: ChromeOsDevice*): Self = this.set("chromeosdevices", js.Array(value :_*))
    @scala.inline
    def setChromeosdevices(value: js.Array[ChromeOsDevice]): Self = this.set("chromeosdevices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChromeosdevices: Self = this.set("chromeosdevices", js.undefined)
    @scala.inline
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEtag: Self = this.set("etag", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setNextPageToken(value: String): Self = this.set("nextPageToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextPageToken: Self = this.set("nextPageToken", js.undefined)
  }
  
}

