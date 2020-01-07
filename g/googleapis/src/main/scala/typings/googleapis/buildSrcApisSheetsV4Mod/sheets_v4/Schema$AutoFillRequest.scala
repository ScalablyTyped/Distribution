package typings.googleapis.buildSrcApisSheetsV4Mod.sheets_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Fills in more data based on existing data.
  */
@js.native
trait Schema$AutoFillRequest extends js.Object {
  /**
    * The range to autofill. This will examine the range and detect the
    * location that has data and automatically fill that data in to the rest of
    * the range.
    */
  var range: js.UndefOr[Schema$GridRange] = js.native
  /**
    * The source and destination areas to autofill. This explicitly lists the
    * source of the autofill and where to extend that data.
    */
  var sourceAndDestination: js.UndefOr[Schema$SourceAndDestination] = js.native
  /**
    * True if we should generate data with the &quot;alternate&quot; series.
    * This differs based on the type and amount of source data.
    */
  var useAlternateSeries: js.UndefOr[Boolean] = js.native
}

object Schema$AutoFillRequest {
  @scala.inline
  def apply(
    range: Schema$GridRange = null,
    sourceAndDestination: Schema$SourceAndDestination = null,
    useAlternateSeries: js.UndefOr[Boolean] = js.undefined
  ): Schema$AutoFillRequest = {
    val __obj = js.Dynamic.literal()
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (sourceAndDestination != null) __obj.updateDynamic("sourceAndDestination")(sourceAndDestination.asInstanceOf[js.Any])
    if (!js.isUndefined(useAlternateSeries)) __obj.updateDynamic("useAlternateSeries")(useAlternateSeries.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$AutoFillRequest]
  }
}

