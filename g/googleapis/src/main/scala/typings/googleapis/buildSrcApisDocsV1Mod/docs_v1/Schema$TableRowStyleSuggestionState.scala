package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base TableRowStyle have
  * been changed in this suggestion. For any field set to true, there is a new
  * suggested value.
  */
@js.native
trait Schema$TableRowStyleSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to min_row_height.
    */
  var minRowHeightSuggested: js.UndefOr[Boolean] = js.native
}

object Schema$TableRowStyleSuggestionState {
  @scala.inline
  def apply(minRowHeightSuggested: js.UndefOr[Boolean] = js.undefined): Schema$TableRowStyleSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(minRowHeightSuggested)) __obj.updateDynamic("minRowHeightSuggested")(minRowHeightSuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$TableRowStyleSuggestionState]
  }
}

