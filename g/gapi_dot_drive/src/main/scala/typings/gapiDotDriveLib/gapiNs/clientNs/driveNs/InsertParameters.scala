package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertParameters extends js.Object {
  var convert: js.UndefOr[scala.Boolean] = js.undefined
  var ocr: js.UndefOr[scala.Boolean] = js.undefined
  var ocrLanguage: js.UndefOr[java.lang.String] = js.undefined
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  var supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined
  var timedTextLanguage: js.UndefOr[java.lang.String] = js.undefined
  var timedTextTrackName: js.UndefOr[java.lang.String] = js.undefined
  var uploadType: java.lang.String
  var usecontentAsIndexableText: js.UndefOr[scala.Boolean] = js.undefined
  var visibility: js.UndefOr[java.lang.String] = js.undefined
}

object InsertParameters {
  @scala.inline
  def apply(
    uploadType: java.lang.String,
    convert: js.UndefOr[scala.Boolean] = js.undefined,
    ocr: js.UndefOr[scala.Boolean] = js.undefined,
    ocrLanguage: java.lang.String = null,
    pinned: js.UndefOr[scala.Boolean] = js.undefined,
    supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined,
    timedTextLanguage: java.lang.String = null,
    timedTextTrackName: java.lang.String = null,
    usecontentAsIndexableText: js.UndefOr[scala.Boolean] = js.undefined,
    visibility: java.lang.String = null
  ): InsertParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("uploadType")(uploadType)
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert)
    if (!js.isUndefined(ocr)) __obj.updateDynamic("ocr")(ocr)
    if (ocrLanguage != null) __obj.updateDynamic("ocrLanguage")(ocrLanguage)
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives)
    if (timedTextLanguage != null) __obj.updateDynamic("timedTextLanguage")(timedTextLanguage)
    if (timedTextTrackName != null) __obj.updateDynamic("timedTextTrackName")(timedTextTrackName)
    if (!js.isUndefined(usecontentAsIndexableText)) __obj.updateDynamic("usecontentAsIndexableText")(usecontentAsIndexableText)
    if (visibility != null) __obj.updateDynamic("visibility")(visibility)
    __obj.asInstanceOf[InsertParameters]
  }
}

