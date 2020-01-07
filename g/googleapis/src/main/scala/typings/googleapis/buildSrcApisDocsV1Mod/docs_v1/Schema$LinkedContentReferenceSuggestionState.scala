package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base
  * LinkedContentReference have been changed in this suggestion. For any field
  * set to true, there is a new suggested value.
  */
@js.native
trait Schema$LinkedContentReferenceSuggestionState extends js.Object {
  /**
    * A mask that indicates which of the fields in sheets_chart_reference have
    * been changed in this suggestion.
    */
  var sheetsChartReferenceSuggestionState: js.UndefOr[Schema$SheetsChartReferenceSuggestionState] = js.native
}

object Schema$LinkedContentReferenceSuggestionState {
  @scala.inline
  def apply(sheetsChartReferenceSuggestionState: Schema$SheetsChartReferenceSuggestionState = null): Schema$LinkedContentReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (sheetsChartReferenceSuggestionState != null) __obj.updateDynamic("sheetsChartReferenceSuggestionState")(sheetsChartReferenceSuggestionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$LinkedContentReferenceSuggestionState]
  }
}

