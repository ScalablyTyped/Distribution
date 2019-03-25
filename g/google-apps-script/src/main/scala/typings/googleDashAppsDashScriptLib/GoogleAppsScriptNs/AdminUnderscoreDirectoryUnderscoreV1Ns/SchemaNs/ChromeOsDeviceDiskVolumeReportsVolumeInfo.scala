package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.AdminUnderscoreDirectoryUnderscoreV1Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeOsDeviceDiskVolumeReportsVolumeInfo extends js.Object {
  var storageFree: js.UndefOr[java.lang.String] = js.undefined
  var storageTotal: js.UndefOr[java.lang.String] = js.undefined
  var volumeId: js.UndefOr[java.lang.String] = js.undefined
}

object ChromeOsDeviceDiskVolumeReportsVolumeInfo {
  @scala.inline
  def apply(
    storageFree: java.lang.String = null,
    storageTotal: java.lang.String = null,
    volumeId: java.lang.String = null
  ): ChromeOsDeviceDiskVolumeReportsVolumeInfo = {
    val __obj = js.Dynamic.literal()
    if (storageFree != null) __obj.updateDynamic("storageFree")(storageFree)
    if (storageTotal != null) __obj.updateDynamic("storageTotal")(storageTotal)
    if (volumeId != null) __obj.updateDynamic("volumeId")(volumeId)
    __obj.asInstanceOf[ChromeOsDeviceDiskVolumeReportsVolumeInfo]
  }
}

