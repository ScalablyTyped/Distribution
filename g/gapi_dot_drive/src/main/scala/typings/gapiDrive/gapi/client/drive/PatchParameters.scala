package typings.gapiDrive.gapi.client.drive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchParameters extends js.Object {
  var convert: js.UndefOr[Boolean] = js.undefined
  var fileId: String
  var modifiedDateBehavior: js.UndefOr[String] = js.undefined
  var newRevision: js.UndefOr[Boolean] = js.undefined
  var ocr: js.UndefOr[Boolean] = js.undefined
  var ocrLanguage: js.UndefOr[String] = js.undefined
  var pinned: js.UndefOr[Boolean] = js.undefined
  var removeParents: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[FileResource] = js.undefined
  var setModifiedDate: js.UndefOr[Boolean] = js.undefined
  var supportsTeamDrives: js.UndefOr[Boolean] = js.undefined
  var timedTextLanguage: js.UndefOr[String] = js.undefined
  var timedTextTrackName: js.UndefOr[String] = js.undefined
  var updateViewedData: js.UndefOr[Boolean] = js.undefined
  var useContentAsIndexableText: js.UndefOr[Boolean] = js.undefined
}

object PatchParameters {
  @scala.inline
  def apply(
    fileId: String,
    convert: js.UndefOr[Boolean] = js.undefined,
    modifiedDateBehavior: String = null,
    newRevision: js.UndefOr[Boolean] = js.undefined,
    ocr: js.UndefOr[Boolean] = js.undefined,
    ocrLanguage: String = null,
    pinned: js.UndefOr[Boolean] = js.undefined,
    removeParents: String = null,
    resource: FileResource = null,
    setModifiedDate: js.UndefOr[Boolean] = js.undefined,
    supportsTeamDrives: js.UndefOr[Boolean] = js.undefined,
    timedTextLanguage: String = null,
    timedTextTrackName: String = null,
    updateViewedData: js.UndefOr[Boolean] = js.undefined,
    useContentAsIndexableText: js.UndefOr[Boolean] = js.undefined
  ): PatchParameters = {
    val __obj = js.Dynamic.literal(fileId = fileId.asInstanceOf[js.Any])
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert.asInstanceOf[js.Any])
    if (modifiedDateBehavior != null) __obj.updateDynamic("modifiedDateBehavior")(modifiedDateBehavior.asInstanceOf[js.Any])
    if (!js.isUndefined(newRevision)) __obj.updateDynamic("newRevision")(newRevision.asInstanceOf[js.Any])
    if (!js.isUndefined(ocr)) __obj.updateDynamic("ocr")(ocr.asInstanceOf[js.Any])
    if (ocrLanguage != null) __obj.updateDynamic("ocrLanguage")(ocrLanguage.asInstanceOf[js.Any])
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned.asInstanceOf[js.Any])
    if (removeParents != null) __obj.updateDynamic("removeParents")(removeParents.asInstanceOf[js.Any])
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    if (!js.isUndefined(setModifiedDate)) __obj.updateDynamic("setModifiedDate")(setModifiedDate.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives.asInstanceOf[js.Any])
    if (timedTextLanguage != null) __obj.updateDynamic("timedTextLanguage")(timedTextLanguage.asInstanceOf[js.Any])
    if (timedTextTrackName != null) __obj.updateDynamic("timedTextTrackName")(timedTextTrackName.asInstanceOf[js.Any])
    if (!js.isUndefined(updateViewedData)) __obj.updateDynamic("updateViewedData")(updateViewedData.asInstanceOf[js.Any])
    if (!js.isUndefined(useContentAsIndexableText)) __obj.updateDynamic("useContentAsIndexableText")(useContentAsIndexableText.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchParameters]
  }
}

