package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFillRequest extends js.Object {
  var range: js.UndefOr[GridRange] = js.undefined
  var sourceAndDestination: js.UndefOr[SourceAndDestination] = js.undefined
  var useAlternateSeries: js.UndefOr[Boolean] = js.undefined
}

object AutoFillRequest {
  @scala.inline
  def apply(
    range: GridRange = null,
    sourceAndDestination: SourceAndDestination = null,
    useAlternateSeries: js.UndefOr[Boolean] = js.undefined
  ): AutoFillRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (sourceAndDestination != null) __obj.updateDynamic("sourceAndDestination")(sourceAndDestination.asInstanceOf[js.Any])
    if (!js.isUndefined(useAlternateSeries)) __obj.updateDynamic("useAlternateSeries")(useAlternateSeries.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoFillRequest]
  }
}

