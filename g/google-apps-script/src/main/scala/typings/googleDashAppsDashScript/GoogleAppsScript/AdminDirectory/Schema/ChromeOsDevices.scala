package typings.googleDashAppsDashScript.GoogleAppsScript.AdminDirectory.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDevices extends js.Object {
  var chromeosdevices: js.UndefOr[js.Array[ChromeOsDevice]] = js.undefined
  var etag: js.UndefOr[String] = js.undefined
  var kind: js.UndefOr[String] = js.undefined
  var nextPageToken: js.UndefOr[String] = js.undefined
}

object ChromeOsDevices {
  @scala.inline
  def apply(
    chromeosdevices: js.Array[ChromeOsDevice] = null,
    etag: String = null,
    kind: String = null,
    nextPageToken: String = null
  ): ChromeOsDevices = {
    val __obj = js.Dynamic.literal()
    if (chromeosdevices != null) __obj.updateDynamic("chromeosdevices")(chromeosdevices.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromeOsDevices]
  }
}

