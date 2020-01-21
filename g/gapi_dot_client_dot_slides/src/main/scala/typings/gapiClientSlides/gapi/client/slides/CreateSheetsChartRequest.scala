package typings.gapiClientSlides.gapi.client.slides

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSheetsChartRequest extends js.Object {
  /** The ID of the specific chart in the Google Sheets spreadsheet. */
  var chartId: js.UndefOr[Double] = js.undefined
  /**
    * The element properties for the chart.
    *
    * When the aspect ratio of the provided size does not match the chart aspect
    * ratio, the chart is scaled and centered with respect to the size in order
    * to maintain aspect ratio. The provided transform is applied after this
    * operation.
    */
  var elementProperties: js.UndefOr[PageElementProperties] = js.undefined
  /**
    * The mode with which the chart is linked to the source spreadsheet. When
    * not specified, the chart will be an image that is not linked.
    */
  var linkingMode: js.UndefOr[String] = js.undefined
  /**
    * A user-supplied object ID.
    *
    * If specified, the ID must be unique among all pages and page elements in
    * the presentation. The ID should start with a word character [a-zA-Z0-9_]
    * and then followed by any number of the following characters [a-zA-Z0-9_-:].
    * The length of the ID should not be less than 5 or greater than 50.
    * If empty, a unique identifier will be generated.
    */
  var objectId: js.UndefOr[String] = js.undefined
  /** The ID of the Google Sheets spreadsheet that contains the chart. */
  var spreadsheetId: js.UndefOr[String] = js.undefined
}

object CreateSheetsChartRequest {
  @scala.inline
  def apply(
    chartId: Int | Double = null,
    elementProperties: PageElementProperties = null,
    linkingMode: String = null,
    objectId: String = null,
    spreadsheetId: String = null
  ): CreateSheetsChartRequest = {
    val __obj = js.Dynamic.literal()
    if (chartId != null) __obj.updateDynamic("chartId")(chartId.asInstanceOf[js.Any])
    if (elementProperties != null) __obj.updateDynamic("elementProperties")(elementProperties.asInstanceOf[js.Any])
    if (linkingMode != null) __obj.updateDynamic("linkingMode")(linkingMode.asInstanceOf[js.Any])
    if (objectId != null) __obj.updateDynamic("objectId")(objectId.asInstanceOf[js.Any])
    if (spreadsheetId != null) __obj.updateDynamic("spreadsheetId")(spreadsheetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSheetsChartRequest]
  }
}

