package typings.gapiDotClientDotSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllShapesWithSheetsChartRequest extends js.Object {
  /** The ID of the specific chart in the Google Sheets spreadsheet. */
  var chartId: js.UndefOr[Double] = js.undefined
  /**
    * The criteria that the shapes must match in order to be replaced. The
    * request will replace all of the shapes that contain the given text.
    */
  var containsText: js.UndefOr[SubstringMatchCriteria] = js.undefined
  /**
    * The mode with which the chart is linked to the source spreadsheet. When
    * not specified, the chart will be an image that is not linked.
    */
  var linkingMode: js.UndefOr[String] = js.undefined
  /**
    * If non-empty, limits the matches to page elements only on the given pages.
    *
    * Returns a 400 bad request error if given the page object ID of a
    * notes page or a
    * notes master, or if a
    * page with that object ID doesn't exist in the presentation.
    */
  var pageObjectIds: js.UndefOr[js.Array[String]] = js.undefined
  /** The ID of the Google Sheets spreadsheet that contains the chart. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
}

object ReplaceAllShapesWithSheetsChartRequest {
  @scala.inline
  def apply(
    chartId: Int | Double = null,
    containsText: SubstringMatchCriteria = null,
    linkingMode: String = null,
    pageObjectIds: js.Array[String] = null,
    spreadsheetId: String = null
  ): ReplaceAllShapesWithSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (containsText != null) __obj.updateDynamic("containsText")(containsText)
    if (linkingMode != null) __obj.updateDynamic("linkingMode")(linkingMode)
    if (pageObjectIds != null) __obj.updateDynamic("pageObjectIds")(pageObjectIds)
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId)
    __obj.asInstanceOf[ReplaceAllShapesWithSheetsChartRequest]
  }
}

