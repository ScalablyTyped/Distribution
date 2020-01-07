package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base EmbeddedObject have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait Schema$EmbeddedObjectSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to description.
    */
  var descriptionSuggested: js.UndefOr[Boolean] = js.native
  /**
    * A mask that indicates which of the fields in embedded_drawing_properties
    * have been changed in this suggestion.
    */
  var embeddedDrawingPropertiesSuggestionState: js.UndefOr[Schema$EmbeddedDrawingPropertiesSuggestionState] = js.native
  /**
    * A mask that indicates which of the fields in embedded_object_border have
    * been changed in this suggestion.
    */
  var embeddedObjectBorderSuggestionState: js.UndefOr[Schema$EmbeddedObjectBorderSuggestionState] = js.native
  /**
    * A mask that indicates which of the fields in image_properties have been
    * changed in this suggestion.
    */
  var imagePropertiesSuggestionState: js.UndefOr[Schema$ImagePropertiesSuggestionState] = js.native
  /**
    * A mask that indicates which of the fields in linked_content_reference
    * have been changed in this suggestion.
    */
  var linkedContentReferenceSuggestionState: js.UndefOr[Schema$LinkedContentReferenceSuggestionState] = js.native
  /**
    * Indicates if there was a suggested change to margin_bottom.
    */
  var marginBottomSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to margin_left.
    */
  var marginLeftSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to margin_right.
    */
  var marginRightSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to margin_top.
    */
  var marginTopSuggested: js.UndefOr[Boolean] = js.native
  /**
    * A mask that indicates which of the fields in size have been changed in
    * this suggestion.
    */
  var sizeSuggestionState: js.UndefOr[Schema$SizeSuggestionState] = js.native
  /**
    * Indicates if there was a suggested change to title.
    */
  var titleSuggested: js.UndefOr[Boolean] = js.native
}

object Schema$EmbeddedObjectSuggestionState {
  @scala.inline
  def apply(
    descriptionSuggested: js.UndefOr[Boolean] = js.undefined,
    embeddedDrawingPropertiesSuggestionState: Schema$EmbeddedDrawingPropertiesSuggestionState = null,
    embeddedObjectBorderSuggestionState: Schema$EmbeddedObjectBorderSuggestionState = null,
    imagePropertiesSuggestionState: Schema$ImagePropertiesSuggestionState = null,
    linkedContentReferenceSuggestionState: Schema$LinkedContentReferenceSuggestionState = null,
    marginBottomSuggested: js.UndefOr[Boolean] = js.undefined,
    marginLeftSuggested: js.UndefOr[Boolean] = js.undefined,
    marginRightSuggested: js.UndefOr[Boolean] = js.undefined,
    marginTopSuggested: js.UndefOr[Boolean] = js.undefined,
    sizeSuggestionState: Schema$SizeSuggestionState = null,
    titleSuggested: js.UndefOr[Boolean] = js.undefined
  ): Schema$EmbeddedObjectSuggestionState = {
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
    __obj.asInstanceOf[Schema$EmbeddedObjectSuggestionState]
  }
}

