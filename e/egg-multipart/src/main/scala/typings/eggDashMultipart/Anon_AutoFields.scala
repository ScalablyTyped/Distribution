package typings.eggDashMultipart

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoFields extends js.Object {
  var autoFields: js.UndefOr[Boolean] = js.undefined
  var cleanSchedule: js.UndefOr[ScheduleOptions] = js.undefined
  var defaultCharset: js.UndefOr[String] = js.undefined
  var fieldNameSize: js.UndefOr[Double] = js.undefined
  var fieldSize: js.UndefOr[String | Double] = js.undefined
  var fields: js.UndefOr[Double] = js.undefined
  var fileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  var fileModeMatch: js.UndefOr[RegExp] = js.undefined
  var fileSize: js.UndefOr[String | Double] = js.undefined
  var files: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var tmpdir: js.UndefOr[String] = js.undefined
  var whitelist: js.UndefOr[js.Function0[js.Array[String]] | js.Array[String]] = js.undefined
}

object Anon_AutoFields {
  @scala.inline
  def apply(
    autoFields: js.UndefOr[Boolean] = js.undefined,
    cleanSchedule: ScheduleOptions = null,
    defaultCharset: String = null,
    fieldNameSize: Int | Double = null,
    fieldSize: String | Double = null,
    fields: Int | Double = null,
    fileExtensions: js.Array[String] = null,
    fileModeMatch: RegExp = null,
    fileSize: String | Double = null,
    files: Int | Double = null,
    mode: String = null,
    tmpdir: String = null,
    whitelist: js.Function0[js.Array[String]] | js.Array[String] = null
  ): Anon_AutoFields = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFields)) __obj.updateDynamic("autoFields")(autoFields)
    if (cleanSchedule != null) __obj.updateDynamic("cleanSchedule")(cleanSchedule)
    if (defaultCharset != null) __obj.updateDynamic("defaultCharset")(defaultCharset)
    if (fieldNameSize != null) __obj.updateDynamic("fieldNameSize")(fieldNameSize.asInstanceOf[js.Any])
    if (fieldSize != null) __obj.updateDynamic("fieldSize")(fieldSize.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fileExtensions != null) __obj.updateDynamic("fileExtensions")(fileExtensions)
    if (fileModeMatch != null) __obj.updateDynamic("fileModeMatch")(fileModeMatch)
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (tmpdir != null) __obj.updateDynamic("tmpdir")(tmpdir)
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AutoFields]
  }
}

