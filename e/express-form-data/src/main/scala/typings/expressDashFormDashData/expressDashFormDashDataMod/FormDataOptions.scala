package typings.expressDashFormDashData.expressDashFormDashDataMod

import typings.multiparty.multipartyMod.FormOptions
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
    maxFields: Int | Double = null,
    maxFieldsSize: Int | Double = null,
    maxFilesSize: Int | Double = null,
    uploadDir: String = null
  ): FormDataOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoClean)) __obj.updateDynamic("autoClean")(autoClean.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFields)) __obj.updateDynamic("autoFields")(autoFields.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFiles)) __obj.updateDynamic("autoFiles")(autoFiles.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (maxFields != null) __obj.updateDynamic("maxFields")(maxFields.asInstanceOf[js.Any])
    if (maxFieldsSize != null) __obj.updateDynamic("maxFieldsSize")(maxFieldsSize.asInstanceOf[js.Any])
    if (maxFilesSize != null) __obj.updateDynamic("maxFilesSize")(maxFilesSize.asInstanceOf[js.Any])
    if (uploadDir != null) __obj.updateDynamic("uploadDir")(uploadDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormDataOptions]
  }
}

