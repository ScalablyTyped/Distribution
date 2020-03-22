package typings.evernote

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeAccountLimits extends js.Object {
  var includeAccountLimits: js.UndefOr[Boolean] = js.undefined
  var includeContent: js.UndefOr[Boolean] = js.undefined
  var includeNoteAppDataValues: js.UndefOr[Boolean] = js.undefined
  var includeResourceAppDataValues: js.UndefOr[Boolean] = js.undefined
  var includeResourcesAlternateData: js.UndefOr[Boolean] = js.undefined
  var includeResourcesData: js.UndefOr[Boolean] = js.undefined
  var includeResourcesRecognition: js.UndefOr[Boolean] = js.undefined
  var includeSharedNotes: js.UndefOr[Boolean] = js.undefined
}

object AnonIncludeAccountLimits {
  @scala.inline
  def apply(
    includeAccountLimits: js.UndefOr[Boolean] = js.undefined,
    includeContent: js.UndefOr[Boolean] = js.undefined,
    includeNoteAppDataValues: js.UndefOr[Boolean] = js.undefined,
    includeResourceAppDataValues: js.UndefOr[Boolean] = js.undefined,
    includeResourcesAlternateData: js.UndefOr[Boolean] = js.undefined,
    includeResourcesData: js.UndefOr[Boolean] = js.undefined,
    includeResourcesRecognition: js.UndefOr[Boolean] = js.undefined,
    includeSharedNotes: js.UndefOr[Boolean] = js.undefined
  ): AnonIncludeAccountLimits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAccountLimits)) __obj.updateDynamic("includeAccountLimits")(includeAccountLimits.asInstanceOf[js.Any])
    if (!js.isUndefined(includeContent)) __obj.updateDynamic("includeContent")(includeContent.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNoteAppDataValues)) __obj.updateDynamic("includeNoteAppDataValues")(includeNoteAppDataValues.asInstanceOf[js.Any])
    if (!js.isUndefined(includeResourceAppDataValues)) __obj.updateDynamic("includeResourceAppDataValues")(includeResourceAppDataValues.asInstanceOf[js.Any])
    if (!js.isUndefined(includeResourcesAlternateData)) __obj.updateDynamic("includeResourcesAlternateData")(includeResourcesAlternateData.asInstanceOf[js.Any])
    if (!js.isUndefined(includeResourcesData)) __obj.updateDynamic("includeResourcesData")(includeResourcesData.asInstanceOf[js.Any])
    if (!js.isUndefined(includeResourcesRecognition)) __obj.updateDynamic("includeResourcesRecognition")(includeResourcesRecognition.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSharedNotes)) __obj.updateDynamic("includeSharedNotes")(includeSharedNotes.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeAccountLimits]
  }
}

