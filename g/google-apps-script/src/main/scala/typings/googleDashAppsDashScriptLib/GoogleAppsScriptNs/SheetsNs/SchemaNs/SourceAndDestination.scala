package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SheetsNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SourceAndDestination extends js.Object {
  var dimension: js.UndefOr[java.lang.String] = js.undefined
  var fillLength: js.UndefOr[scala.Double] = js.undefined
  var source: js.UndefOr[GridRange] = js.undefined
}

object SourceAndDestination {
  @scala.inline
  def apply(
    dimension: java.lang.String = null,
    fillLength: scala.Int | scala.Double = null,
    source: GridRange = null
  ): SourceAndDestination = {
    val __obj = js.Dynamic.literal()
    if (dimension != null) __obj.updateDynamic("dimension")(dimension)
    if (fillLength != null) __obj.updateDynamic("fillLength")(fillLength.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source)
    __obj.asInstanceOf[SourceAndDestination]
  }
}

