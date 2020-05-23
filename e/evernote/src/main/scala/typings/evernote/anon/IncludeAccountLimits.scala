package typings.evernote.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeAccountLimits extends js.Object {
  var includeAccountLimits: js.UndefOr[Boolean] = js.undefined
  var includeContent: js.UndefOr[Boolean] = js.undefined
  var includeNoteAppDataValues: js.UndefOr[Boolean] = js.undefined
  var includeResourceAppDataValues: js.UndefOr[Boolean] = js.undefined
  var includeResourcesAlternateData: js.UndefOr[Boolean] = js.undefined
  var includeResourcesData: js.UndefOr[Boolean] = js.undefined
  var includeResourcesRecognition: js.UndefOr[Boolean] = js.undefined
  var includeSharedNotes: js.UndefOr[Boolean] = js.undefined
}

object IncludeAccountLimits {
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
  ): IncludeAccountLimits = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeAccountLimits)) __obj.updateDynamic("includeAccountLimits")(includeAccountLimits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeContent)) __obj.updateDynamic("includeContent")(includeContent.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNoteAppDataValues)) __obj.updateDynamic("includeNoteAppDataValues")(includeNoteAppDataValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeResourceAppDataValues)) __obj.updateDynamic("includeResourceAppDataValues")(includeResourceAppDataValues.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeResourcesAlternateData)) __obj.updateDynamic("includeResourcesAlternateData")(includeResourcesAlternateData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeResourcesData)) __obj.updateDynamic("includeResourcesData")(includeResourcesData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeResourcesRecognition)) __obj.updateDynamic("includeResourcesRecognition")(includeResourcesRecognition.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeSharedNotes)) __obj.updateDynamic("includeSharedNotes")(includeSharedNotes.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeAccountLimits]
  }
}

