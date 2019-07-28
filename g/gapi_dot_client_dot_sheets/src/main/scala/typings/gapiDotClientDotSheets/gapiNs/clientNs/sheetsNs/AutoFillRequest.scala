package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoFillRequest extends js.Object {
  /**
    * The range to autofill. This will examine the range and detect
    * the location that has data and automatically fill that data
    * in to the rest of the range.
    */
  var range: js.UndefOr[GridRange] = js.undefined
  /**
    * The source and destination areas to autofill.
    * This explicitly lists the source of the autofill and where to
    * extend that data.
    */
  var sourceAndDestination: js.UndefOr[SourceAndDestination] = js.undefined
  /**
    * True if we should generate data with the "alternate" series.
    * This differs based on the type and amount of source data.
    */
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
    if (range != null) __obj.updateDynamic("range")(range)
    if (sourceAndDestination != null) __obj.updateDynamic("sourceAndDestination")(sourceAndDestination)
    if (!js.isUndefined(useAlternateSeries)) __obj.updateDynamic("useAlternateSeries")(useAlternateSeries)
    __obj.asInstanceOf[AutoFillRequest]
  }
}

