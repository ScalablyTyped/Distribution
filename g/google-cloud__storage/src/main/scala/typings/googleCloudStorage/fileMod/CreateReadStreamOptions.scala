package typings.googleCloudStorage.fileMod

import typings.googleCloudStorage.googleCloudStorageBooleans.`false`
import typings.googleCloudStorage.googleCloudStorageBooleans.`true`
import typings.googleCloudStorage.googleCloudStorageStrings.crc32c
import typings.googleCloudStorage.googleCloudStorageStrings.md5
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateReadStreamOptions extends js.Object {
  var decompress: js.UndefOr[Boolean] = js.undefined
  var end: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var userProject: js.UndefOr[String] = js.undefined
  var validation: js.UndefOr[md5 | crc32c | `false` | `true`] = js.undefined
}

object CreateReadStreamOptions {
  @scala.inline
  def apply(
    decompress: js.UndefOr[Boolean] = js.undefined,
    end: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined,
    userProject: String = null,
    validation: md5 | crc32c | `false` | `true` = null
  ): CreateReadStreamOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(decompress)) __obj.updateDynamic("decompress")(decompress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(end)) __obj.updateDynamic("end")(end.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    if (userProject != null) __obj.updateDynamic("userProject")(userProject.asInstanceOf[js.Any])
    if (validation != null) __obj.updateDynamic("validation")(validation.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReadStreamOptions]
  }
}

