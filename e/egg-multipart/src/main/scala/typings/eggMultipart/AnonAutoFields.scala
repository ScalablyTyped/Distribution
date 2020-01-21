package typings.eggMultipart

import typings.eggMultipart.mod.MatchItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAutoFields extends js.Object {
  var autoFields: js.UndefOr[Boolean] = js.undefined
  var cleanSchedule: js.UndefOr[ScheduleOptions] = js.undefined
  var defaultCharset: js.UndefOr[String] = js.undefined
  var fieldNameSize: js.UndefOr[Double] = js.undefined
  var fieldSize: js.UndefOr[String | Double] = js.undefined
  var fields: js.UndefOr[Double] = js.undefined
  var fileExtensions: js.UndefOr[js.Array[String]] = js.undefined
  var fileModeMatch: js.UndefOr[MatchItem | js.Array[MatchItem]] = js.undefined
  var fileSize: js.UndefOr[String | Double] = js.undefined
  var files: js.UndefOr[Double] = js.undefined
  var mode: js.UndefOr[String] = js.undefined
  var tmpdir: js.UndefOr[String] = js.undefined
  var whitelist: js.UndefOr[js.Function0[js.Array[String]] | js.Array[String]] = js.undefined
}

object AnonAutoFields {
  @scala.inline
  def apply(
    autoFields: js.UndefOr[Boolean] = js.undefined,
    cleanSchedule: ScheduleOptions = null,
    defaultCharset: String = null,
    fieldNameSize: Int | Double = null,
    fieldSize: String | Double = null,
    fields: Int | Double = null,
    fileExtensions: js.Array[String] = null,
    fileModeMatch: MatchItem | js.Array[MatchItem] = null,
    fileSize: String | Double = null,
    files: Int | Double = null,
    mode: String = null,
    tmpdir: String = null,
    whitelist: js.Function0[js.Array[String]] | js.Array[String] = null
  ): AnonAutoFields = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFields)) __obj.updateDynamic("autoFields")(autoFields.asInstanceOf[js.Any])
    if (cleanSchedule != null) __obj.updateDynamic("cleanSchedule")(cleanSchedule.asInstanceOf[js.Any])
    if (defaultCharset != null) __obj.updateDynamic("defaultCharset")(defaultCharset.asInstanceOf[js.Any])
    if (fieldNameSize != null) __obj.updateDynamic("fieldNameSize")(fieldNameSize.asInstanceOf[js.Any])
    if (fieldSize != null) __obj.updateDynamic("fieldSize")(fieldSize.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (fileExtensions != null) __obj.updateDynamic("fileExtensions")(fileExtensions.asInstanceOf[js.Any])
    if (fileModeMatch != null) __obj.updateDynamic("fileModeMatch")(fileModeMatch.asInstanceOf[js.Any])
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (tmpdir != null) __obj.updateDynamic("tmpdir")(tmpdir.asInstanceOf[js.Any])
    if (whitelist != null) __obj.updateDynamic("whitelist")(whitelist.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAutoFields]
  }
}

