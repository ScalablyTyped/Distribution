package typings.googleAppsScript.GoogleAppsScript.Docs.Schema

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
    if (!js.isUndefined(descriptionSuggested)) __obj.updateDynamic("descriptionSuggested")(descriptionSuggested.asInstanceOf[js.Any])
    if (embeddedDrawingPropertiesSuggestionState != null) __obj.updateDynamic("embeddedDrawingPropertiesSuggestionState")(embeddedDrawingPropertiesSuggestionState.asInstanceOf[js.Any])
    if (embeddedObjectBorderSuggestionState != null) __obj.updateDynamic("embeddedObjectBorderSuggestionState")(embeddedObjectBorderSuggestionState.asInstanceOf[js.Any])
    if (imagePropertiesSuggestionState != null) __obj.updateDynamic("imagePropertiesSuggestionState")(imagePropertiesSuggestionState.asInstanceOf[js.Any])
    if (linkedContentReferenceSuggestionState != null) __obj.updateDynamic("linkedContentReferenceSuggestionState")(linkedContentReferenceSuggestionState.asInstanceOf[js.Any])
    if (!js.isUndefined(marginBottomSuggested)) __obj.updateDynamic("marginBottomSuggested")(marginBottomSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(marginLeftSuggested)) __obj.updateDynamic("marginLeftSuggested")(marginLeftSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(marginRightSuggested)) __obj.updateDynamic("marginRightSuggested")(marginRightSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(marginTopSuggested)) __obj.updateDynamic("marginTopSuggested")(marginTopSuggested.asInstanceOf[js.Any])
    if (sizeSuggestionState != null) __obj.updateDynamic("sizeSuggestionState")(sizeSuggestionState.asInstanceOf[js.Any])
    if (!js.isUndefined(titleSuggested)) __obj.updateDynamic("titleSuggested")(titleSuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmbeddedObjectSuggestionState]
  }
}

