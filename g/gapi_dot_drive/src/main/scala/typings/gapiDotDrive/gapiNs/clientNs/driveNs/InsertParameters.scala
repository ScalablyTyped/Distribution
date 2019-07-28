package typings.gapiDotDrive.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsertParameters extends js.Object {
  var convert: js.UndefOr[Boolean] = js.undefined
  var ocr: js.UndefOr[Boolean] = js.undefined
  var ocrLanguage: js.UndefOr[String] = js.undefined
  var pinned: js.UndefOr[Boolean] = js.undefined
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  var timedTextLanguage: js.UndefOr[String] = js.undefined
  var timedTextTrackName: js.UndefOr[String] = js.undefined
  var uploadType: String
  var usecontentAsIndexableText: js.UndefOr[Boolean] = js.undefined
  var visibility: js.UndefOr[String] = js.undefined
}

object InsertParameters {
  @scala.inline
  def apply(
    uploadType: String,
    convert: js.UndefOr[Boolean] = js.undefined,
    ocr: js.UndefOr[Boolean] = js.undefined,
    ocrLanguage: String = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    timedTextLanguage: String = null,
    timedTextTrackName: String = null,
    usecontentAsIndexableText: js.UndefOr[Boolean] = js.undefined,
    visibility: String = null
  ): InsertParameters = {
    val __obj = js.Dynamic.literal(uploadType = uploadType)
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

