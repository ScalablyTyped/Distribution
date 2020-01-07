package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base Size have been
  * changed in this suggestion. For any field set to true, the Size has a new
  * suggested value.
  */
@js.native
trait Schema$SizeSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to height.
    */
  var heightSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to width.
    */
  var widthSuggested: js.UndefOr[Boolean] = js.native
}

object Schema$SizeSuggestionState {
  @scala.inline
  def apply(
    heightSuggested: js.UndefOr[Boolean] = js.undefined,
    widthSuggested: js.UndefOr[Boolean] = js.undefined
  ): Schema$SizeSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(heightSuggested)) __obj.updateDynamic("heightSuggested")(heightSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(widthSuggested)) __obj.updateDynamic("widthSuggested")(widthSuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SizeSuggestionState]
  }
}

