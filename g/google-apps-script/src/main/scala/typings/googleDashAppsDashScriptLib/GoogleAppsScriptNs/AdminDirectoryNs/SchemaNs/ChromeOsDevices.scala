package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminDirectoryNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDevices extends js.Object {
  var chromeosdevices: js.UndefOr[js.Array[ChromeOsDevice]] = js.undefined
  var etag: js.UndefOr[java.lang.String] = js.undefined
  var kind: js.UndefOr[java.lang.String] = js.undefined
  var nextPageToken: js.UndefOr[java.lang.String] = js.undefined
}

object ChromeOsDevices {
  @scala.inline
  def apply(
    chromeosdevices: js.Array[ChromeOsDevice] = null,
    etag: java.lang.String = null,
    kind: java.lang.String = null,
    nextPageToken: java.lang.String = null
  ): ChromeOsDevices = {
    val __obj = js.Dynamic.literal()
    if (chromeosdevices != null) __obj.updateDynamic("chromeosdevices")(chromeosdevices)
    if (etag != null) __obj.updateDynamic("etag")(etag)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    __obj.asInstanceOf[ChromeOsDevices]
  }
}

