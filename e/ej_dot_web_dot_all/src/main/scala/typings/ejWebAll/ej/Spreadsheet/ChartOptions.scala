package typings.ejWebAll.ej.Spreadsheet

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
    if (!js.isUndefined(enable3D)) __obj.updateDynamic("enable3D")(enable3D.get.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartOptions]
  }
}

