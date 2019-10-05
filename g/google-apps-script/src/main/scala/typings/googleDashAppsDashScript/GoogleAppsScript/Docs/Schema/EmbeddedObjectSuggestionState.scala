package typings.googleDashAppsDashScript.GoogleAppsScript.Docs.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmbeddedObjectSuggestionState extends js.Object {
  var descriptionSuggested: js.UndefOr[Boolean] = js.undefined
  var embeddedDrawingPropertiesSuggestionState: js.UndefOr[js.Any] = js.undefined
  var embeddedObjectBorderSuggestionState: js.UndefOr[EmbeddedObjectBorderSuggestionState] = js.undefined
  var imagePropertiesSuggestionState: js.UndefOr[ImagePropertiesSuggestionState] = js.undefined
  var linkedContentReferenceSuggestionState: js.UndefOr[LinkedContentReferenceSuggestionState] = js.undefined
  var marginBottomSuggested: js.UndefOr[Boolean] = js.undefined
  var marginLeftSuggested: js.UndefOr[Boolean] = js.undefined
  var marginRightSuggested: js.UndefOr[Boolean] = js.undefined
  var marginTopSuggested: js.UndefOr[Boolean] = js.undefined
  var sizeSuggestionState: js.UndefOr[SizeSuggestionState] = js.undefined
  var titleSuggested: js.UndefOr[Boolean] = js.undefined
}

object EmbeddedObjectSuggestionState {
  @scala.inline
  def apply(
    descriptionSuggested: js.UndefOr[Boolean] = js.undefined,
    embeddedDrawingPropertiesSuggestionState: js.Any = null,
    embeddedObjectBorderSuggestionState: EmbeddedObjectBorderSuggestionState = null,
    imagePropertiesSuggestionState: ImagePropertiesSuggestionState = null,
    linkedContentReferenceSuggestionState: LinkedContentReferenceSuggestionState = null,
    marginBottomSuggested: js.UndefOr[Boolean] = js.undefined,
    marginLeftSuggested: js.UndefOr[Boolean] = js.undefined,
    marginRightSuggested: js.UndefOr[Boolean] = js.undefined,
    marginTopSuggested: js.UndefOr[Boolean] = js.undefined,
    sizeSuggestionState: SizeSuggestionState = null,
    titleSuggested: js.UndefOr[Boolean] = js.undefined
  ): EmbeddedObjectSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(descriptionSuggested)) __obj.updateDynamic("descriptionSuggested")(descriptionSuggested)
    if (embeddedDrawingPropertiesSuggestionState != null) __obj.updateDynamic("embeddedDrawingPropertiesSuggestionState")(embeddedDrawingPropertiesSuggestionState)
    if (embeddedObjectBorderSuggestionState != null) __obj.updateDynamic("embeddedObjectBorderSuggestionState")(embeddedObjectBorderSuggestionState)
    if (imagePropertiesSuggestionState != null) __obj.updateDynamic("imagePropertiesSuggestionState")(imagePropertiesSuggestionState)
    if (linkedContentReferenceSuggestionState != null) __obj.updateDynamic("linkedContentReferenceSuggestionState")(linkedContentReferenceSuggestionState)
    if (!js.isUndefined(marginBottomSuggested)) __obj.updateDynamic("marginBottomSuggested")(marginBottomSuggested)
    if (!js.isUndefined(marginLeftSuggested)) __obj.updateDynamic("marginLeftSuggested")(marginLeftSuggested)
    if (!js.isUndefined(marginRightSuggested)) __obj.updateDynamic("marginRightSuggested")(marginRightSuggested)
    if (!js.isUndefined(marginTopSuggested)) __obj.updateDynamic("marginTopSuggested")(marginTopSuggested)
    if (sizeSuggestionState != null) __obj.updateDynamic("sizeSuggestionState")(sizeSuggestionState)
    if (!js.isUndefined(titleSuggested)) __obj.updateDynamic("titleSuggested")(titleSuggested)
    __obj.asInstanceOf[EmbeddedObjectSuggestionState]
  }
}

