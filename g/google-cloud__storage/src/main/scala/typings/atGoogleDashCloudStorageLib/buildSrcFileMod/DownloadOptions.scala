package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadOptions extends CreateReadStreamOptions {
  var destination: js.UndefOr[java.lang.String] = js.undefined
}

object DownloadOptions {
  @scala.inline
  def apply(
    destination: java.lang.String = null,
    end: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null,
    userProject: java.lang.String = null,
    validation: atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.md5 | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.crc32c | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibNumbers.`false` | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibNumbers.`true` = null
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination)
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOptions]
  }
}

