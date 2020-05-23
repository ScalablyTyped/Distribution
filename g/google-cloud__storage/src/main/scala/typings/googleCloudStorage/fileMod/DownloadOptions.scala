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
    end: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined,
    userProject: String = null,
    validation: md5 | crc32c | `false` | `true` = null
  ): DownloadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decompress)) __obj.updateDynamic("decompress")(decompress.get.asInstanceOf[js.Any])
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadOptions]
  }
}

