package typings.googleapis.buildSrcApisDocsV1Mod.docs_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A mask that indicates which of the fields on the base SheetsChartReference
  * have been changed in this suggestion. For any field set to true, there is a
  * new suggested value.
  */
@js.native
trait Schema$SheetsChartReferenceSuggestionState extends js.Object {
  /**
    * Indicates if there was a suggested change to chart_id.
    */
  var chartIdSuggested: js.UndefOr[Boolean] = js.native
  /**
    * Indicates if there was a suggested change to spreadsheet_id.
    */
  var spreadsheetIdSuggested: js.UndefOr[Boolean] = js.native
}

object Schema$SheetsChartReferenceSuggestionState {
  @scala.inline
  def apply(
    chartIdSuggested: js.UndefOr[Boolean] = js.undefined,
    spreadsheetIdSuggested: js.UndefOr[Boolean] = js.undefined
  ): Schema$SheetsChartReferenceSuggestionState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(chartIdSuggested)) __obj.updateDynamic("chartIdSuggested")(chartIdSuggested.asInstanceOf[js.Any])
    if (!js.isUndefined(spreadsheetIdSuggested)) __obj.updateDynamic("spreadsheetIdSuggested")(spreadsheetIdSuggested.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SheetsChartReferenceSuggestionState]
  }
}

