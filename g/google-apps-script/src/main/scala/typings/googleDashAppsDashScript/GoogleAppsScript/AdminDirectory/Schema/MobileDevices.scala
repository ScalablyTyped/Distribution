package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileDevices extends js.Object {
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var mobiledevices: js.UndefOr[js.Array[MobileDevice]] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object MobileDevices {
  @scala.inline
  def apply(
    etag: String = null,
    kind: String = null,
    mobiledevices: js.Array[MobileDevice] = null,
    nextPageToken: String = null
  ): MobileDevices = {
    val __obj = js.Dynamic.literal()
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (mobiledevices != null) __obj.updateDynamic("mobiledevices")(mobiledevices.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[MobileDevices]
  }
}

