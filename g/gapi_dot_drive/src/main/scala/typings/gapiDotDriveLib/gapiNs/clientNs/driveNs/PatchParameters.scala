package typings
package gapiDotDriveLib.gapiNs.clientNs.driveNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchParameters extends js.Object {
  var convert: js.UndefOr[scala.Boolean] = js.undefined
  var fileId: java.lang.String
  var modifiedDateBehavior: js.UndefOr[java.lang.String] = js.undefined
  var newRevision: js.UndefOr[scala.Boolean] = js.undefined
  var ocr: js.UndefOr[scala.Boolean] = js.undefined
  var ocrLanguage: js.UndefOr[java.lang.String] = js.undefined
  var pinned: js.UndefOr[scala.Boolean] = js.undefined
  var removeParents: js.UndefOr[java.lang.String] = js.undefined
  var resource: js.UndefOr[FileResource] = js.undefined
  var setModifiedDate: js.UndefOr[scala.Boolean] = js.undefined
  var supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined
  var timedTextLanguage: js.UndefOr[java.lang.String] = js.undefined
  var timedTextTrackName: js.UndefOr[java.lang.String] = js.undefined
  var updateViewedData: js.UndefOr[scala.Boolean] = js.undefined
  var useContentAsIndexableText: js.UndefOr[scala.Boolean] = js.undefined
}

object PatchParameters {
  @scala.inline
  def apply(
    fileId: java.lang.String,
    convert: js.UndefOr[scala.Boolean] = js.undefined,
    modifiedDateBehavior: java.lang.String = null,
    newRevision: js.UndefOr[scala.Boolean] = js.undefined,
    ocr: js.UndefOr[scala.Boolean] = js.undefined,
    ocrLanguage: java.lang.String = null,
    pinned: js.UndefOr[scala.Boolean] = js.undefined,
    removeParents: java.lang.String = null,
    resource: FileResource = null,
    setModifiedDate: js.UndefOr[scala.Boolean] = js.undefined,
    supportsTeamDrives: js.UndefOr[scala.Boolean] = js.undefined,
    timedTextLanguage: java.lang.String = null,
    timedTextTrackName: java.lang.String = null,
    updateViewedData: js.UndefOr[scala.Boolean] = js.undefined,
    useContentAsIndexableText: js.UndefOr[scala.Boolean] = js.undefined
  ): PatchParameters = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("fileId")(fileId)
    if (!js.isUndefined(convert)) __obj.updateDynamic("convert")(convert)
    if (modifiedDateBehavior != null) __obj.updateDynamic("modifiedDateBehavior")(modifiedDateBehavior)
    if (!js.isUndefined(newRevision)) __obj.updateDynamic("newRevision")(newRevision)
    if (!js.isUndefined(ocr)) __obj.updateDynamic("ocr")(ocr)
    if (ocrLanguage != null) __obj.updateDynamic("ocrLanguage")(ocrLanguage)
    if (!js.isUndefined(pinned)) __obj.updateDynamic("pinned")(pinned)
    if (removeParents != null) __obj.updateDynamic("removeParents")(removeParents)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (!js.isUndefined(setModifiedDate)) __obj.updateDynamic("setModifiedDate")(setModifiedDate)
    if (!js.isUndefined(supportsTeamDrives)) __obj.updateDynamic("supportsTeamDrives")(supportsTeamDrives)
    if (timedTextLanguage != null) __obj.updateDynamic("timedTextLanguage")(timedTextLanguage)
    if (timedTextTrackName != null) __obj.updateDynamic("timedTextTrackName")(timedTextTrackName)
    if (!js.isUndefined(updateViewedData)) __obj.updateDynamic("updateViewedData")(updateViewedData)
    if (!js.isUndefined(useContentAsIndexableText)) __obj.updateDynamic("useContentAsIndexableText")(useContentAsIndexableText)
    __obj.asInstanceOf[PatchParameters]
  }
}

