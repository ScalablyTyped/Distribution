package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base Shading have been
  * changed in this suggested change. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait Schema$ShadingSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to the Shading.
    */
  var backgroundColorSuggested: js.UndefOr[Boolean] = js.native
}

object Schema$ShadingSuggestionState {
  @scala.inline
  def apply(backgroundColorSuggested: js.UndefOr[Boolean] = js.undefined): Schema$ShadingSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(backgroundColorSuggested)) __obj.updateDynamic("backgroundColorSuggested")(backgroundColorSuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ShadingSuggestionState]
  }
}

