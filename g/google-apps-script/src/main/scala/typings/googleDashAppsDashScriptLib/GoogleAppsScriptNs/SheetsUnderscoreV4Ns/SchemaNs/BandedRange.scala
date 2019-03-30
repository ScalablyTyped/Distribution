package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsUnderscoreV4Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BandedRange extends js.Object {
  var bandedRangeId: js.UndefOr[scala.Double] = js.undefined
  var columnProperties: js.UndefOr[BandingProperties] = js.undefined
  var range: js.UndefOr[GridRange] = js.undefined
  var rowProperties: js.UndefOr[BandingProperties] = js.undefined
}

object BandedRange {
  @scala.inline
  def apply(
    bandedRangeId: scala.Int | scala.Double = null,
    columnProperties: BandingProperties = null,
    range: GridRange = null,
    rowProperties: BandingProperties = null
  ): BandedRange = {
    val __obj = js.Dynamic.literal()
    if (bandedRangeId != null) __obj.updateDynamic("bandedRangeId")(bandedRangeId.asInstanceOf[js.Any])
    if (columnProperties != null) __obj.updateDynamic("columnProperties")(columnProperties)
    if (range != null) __obj.updateDynamic("range")(range)
    if (rowProperties != null) __obj.updateDynamic("rowProperties")(rowProperties)
    __obj.asInstanceOf[BandedRange]
  }
}

