package typings.googleCloudStorage.fileMod

import typings.googleCloudStorage.googleCloudStorageBooleans.`false`
import typings.googleCloudStorage.googleCloudStorageBooleans.`true`
import typings.googleCloudStorage.googleCloudStorageStrings.crc32c
import typings.googleCloudStorage.googleCloudStorageStrings.md5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadOptions extends CreateReadStreamOptions {
  var destination: js.UndefOr[String] = js.undefined
}

object DownloadOptions {
  @scala.inline
  def apply(
    decompress: js.UndefOr[Boolean] = js.undefined,
    destination: String = null,
    end: Int | Double = null,
    start: Int | Double = null,
    userProject: String = null,
    validation: md5 | crc32c | `false` | `true` = null
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decompress)) __obj.updateDynamic("decompress")(decompress.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOptions]
  }
}

