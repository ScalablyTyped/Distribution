package typings.expressFormData.mod

import typings.multiparty.mod.FormOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormDataOptions extends FormOptions {
  var autoClean: js.UndefOr[Boolean] = js.undefined
}

object FormDataOptions {
  @scala.inline
  def apply(
    autoClean: js.UndefOr[Boolean] = js.undefined,
    autoFields: js.UndefOr[Boolean] = js.undefined,
    autoFiles: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    maxFields: js.UndefOr[Double] = js.undefined,
    maxFieldsSize: js.UndefOr[Double] = js.undefined,
    maxFilesSize: js.UndefOr[Double] = js.undefined,
    uploadDir: String = null
  ): FormDataOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClean)) __obj.updateDynamic("autoClean")(autoClean.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFields)) __obj.updateDynamic("autoFields")(autoFields.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFiles)) __obj.updateDynamic("autoFiles")(autoFiles.get.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFields)) __obj.updateDynamic("maxFields")(maxFields.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFieldsSize)) __obj.updateDynamic("maxFieldsSize")(maxFieldsSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxFilesSize)) __obj.updateDynamic("maxFilesSize")(maxFilesSize.get.asInstanceOf[js.Any])
    if (uploadDir != null) __obj.updateDynamic("uploadDir")(uploadDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormDataOptions]
  }
}

