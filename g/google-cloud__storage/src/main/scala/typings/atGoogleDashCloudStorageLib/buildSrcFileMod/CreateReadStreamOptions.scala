package typings
package atGoogleDashCloudStorageLib.buildSrcFileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReadStreamOptions extends js.Object {
  var end: js.UndefOr[scala.Double] = js.undefined
  var start: js.UndefOr[scala.Double] = js.undefined
  var userProject: js.UndefOr[java.lang.String] = js.undefined
  var validation: js.UndefOr[
    atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.md5 | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.crc32c | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibNumbers.`false` | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibNumbers.`true`
  ] = js.undefined
}

object CreateReadStreamOptions {
  @scala.inline
  def apply(
    end: scala.Int | scala.Double = null,
    start: scala.Int | scala.Double = null,
    userProject: java.lang.String = null,
    validation: atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.md5 | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibStrings.crc32c | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibNumbers.`false` | atGoogleDashCloudStorageLib.atGoogleDashCloudStorageLibNumbers.`true` = null
  ): CreateReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject)
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReadStreamOptions]
  }
}

