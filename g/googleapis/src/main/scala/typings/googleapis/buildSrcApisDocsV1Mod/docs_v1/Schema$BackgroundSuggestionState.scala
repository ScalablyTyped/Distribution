package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base Background have been
  * changed in this suggestion. For any field set to true, the Backgound has a
  * new suggested value.
  */
@js.native
trait Schema$BackgroundSuggestionState extends js.Object {
  /**
    * Indicates whether the current background color has been modified in this
    * suggestion.
    */
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.native
}

object Schema$BackgroundSuggestionState {
  @scala.inline
  def apply(backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined): Schema$BackgroundSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backgroundColorSuggested)) __obj.updateDynamic("backgroundColorSuggested")(backgroundColorSuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$BackgroundSuggestionState]
  }
}

