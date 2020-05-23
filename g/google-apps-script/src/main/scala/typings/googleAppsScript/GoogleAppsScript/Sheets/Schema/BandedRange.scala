package typings.googleAppsScript.GoogleAppsScript.Sheets.Schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BandedRange extends js.Object {
  var bandedRangeId: js.UndefOr[Double] = js.undefined
  var columnProperties: js.UndefOr[BandingProperties] = js.undefined
  var range: js.UndefOr[GridRange] = js.undefined
  var rowProperties: js.UndefOr[BandingProperties] = js.undefined
}

object BandedRange {
  @scala.inline
  def apply(
    bandedRangeId: js.UndefOr[Double] = js.undefined,
    columnProperties: BandingProperties = null,
    range: GridRange = null,
    rowProperties: BandingProperties = null
  ): BandedRange = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bandedRangeId)) __obj.updateDynamic("bandedRangeId")(bandedRangeId.get.asInstanceOf[js.Any])
    if (columnProperties != null) __obj.updateDynamic("columnProperties")(columnProperties.asInstanceOf[js.Any])
    if (range != null) __obj.updateDynamic("range")(range.asInstanceOf[js.Any])
    if (rowProperties != null) __obj.updateDynamic("rowProperties")(rowProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[BandedRange]
  }
}

