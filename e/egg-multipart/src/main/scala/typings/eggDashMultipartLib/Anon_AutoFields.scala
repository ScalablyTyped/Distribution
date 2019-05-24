package typings
package eggDashMultipartLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AutoFields extends js.Object {
  var autoFields: js.UndefOr[scala.Boolean] = js.undefined
  var cleanSchedule: js.UndefOr[ScheduleOptions] = js.undefined
  var defaultCharset: js.UndefOr[java.lang.String] = js.undefined
  var fieldNameSize: js.UndefOr[scala.Double] = js.undefined
  var fieldSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var fields: js.UndefOr[scala.Double] = js.undefined
  var fileExtensions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var fileModeMatch: js.UndefOr[stdLib.RegExp] = js.undefined
  var fileSize: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var files: js.UndefOr[scala.Double] = js.undefined
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var tmpdir: js.UndefOr[java.lang.String] = js.undefined
  var whitelist: js.UndefOr[js.Function0[js.Array[java.lang.String]] | js.Array[java.lang.String]] = js.undefined
}

object Anon_AutoFields {
  @scala.inline
  def apply(
    autoFields: js.UndefOr[scala.Boolean] = js.undefined,
    cleanSchedule: ScheduleOptions = null,
    defaultCharset: java.lang.String = null,
    fieldNameSize: scala.Int | scala.Double = null,
    fieldSize: java.lang.String | scala.Double = null,
    fields: scala.Int | scala.Double = null,
    fileExtensions: js.Array[java.lang.String] = null,
    fileModeMatch: stdLib.RegExp = null,
    fileSize: java.lang.String | scala.Double = null,
    files: scala.Int | scala.Double = null,
    mode: java.lang.String = null,
    tmpdir: java.lang.String = null,
    whitelist: js.Function0[js.Array[java.lang.String]] | js.Array[java.lang.String] = null
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

