package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base CropProperties have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait Schema$CropPropertiesSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to angle.
    */
  var angleSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to offset_bottom.
    */
  var offsetBottomSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to offset_left.
    */
  var offsetLeftSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to offset_right.
    */
  var offsetRightSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to offset_top.
    */
  var offsetTopSuggested: js.UndefOr[Boolean] = js.native
}

object Schema$CropPropertiesSuggestionState {
  @scala.inline
  def apply(
    angleSuggested: js.UndefOr[Boolean] = js.undefined,
    offsetBottomSuggested: js.UndefOr[Boolean] = js.undefined,
    offsetLeftSuggested: js.UndefOr[Boolean] = js.undefined,
    offsetRightSuggested: js.UndefOr[Boolean] = js.undefined,
    offsetTopSuggested: js.UndefOr[Boolean] = js.undefined
  ): Schema$CropPropertiesSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(angleSuggested)) __obj.updateDynamic("angleSuggested")(angleSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetBottomSuggested)) __obj.updateDynamic("offsetBottomSuggested")(offsetBottomSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetLeftSuggested)) __obj.updateDynamic("offsetLeftSuggested")(offsetLeftSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetRightSuggested)) __obj.updateDynamic("offsetRightSuggested")(offsetRightSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(offsetTopSuggested)) __obj.updateDynamic("offsetTopSuggested")(offsetTopSuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CropPropertiesSuggestionState]
  }
}

