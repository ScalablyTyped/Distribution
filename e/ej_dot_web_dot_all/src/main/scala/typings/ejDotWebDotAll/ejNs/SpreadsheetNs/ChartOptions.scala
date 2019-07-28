package typings.ejDotWebDotAll.ejNs.SpreadsheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartOptions extends js.Object {
  /** Pass the enable3D condition
    */
  var enable3D: js.UndefOr[Boolean] = js.undefined
  /** Pass the marker object to change type
    */
  var marker: js.UndefOr[js.Any] = js.undefined
  /** Pass the chart type
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object ChartOptions {
  @scala.inline
  def apply(enable3D: js.UndefOr[Boolean] = js.undefined, marker: js.Any = null, `type`: String = null): ChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enable3D)) __obj.updateDynamic("enable3D")(enable3D)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[ChartOptions]
  }
}

