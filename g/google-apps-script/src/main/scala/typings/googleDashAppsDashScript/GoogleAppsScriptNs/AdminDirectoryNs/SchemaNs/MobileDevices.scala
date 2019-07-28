package typings.googleDashAppsDashScript.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

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
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (mobiledevices != null) __obj.updateDynamic("mobiledevices")(mobiledevices)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[MobileDevices]
  }
}

