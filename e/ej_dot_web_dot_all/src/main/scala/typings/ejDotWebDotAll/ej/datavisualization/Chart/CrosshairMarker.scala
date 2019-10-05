package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CrosshairMarker extends js.Object {
  /** Options for customizing the border.
    */
  var border: js.UndefOr[CrosshairMarkerBorder] = js.undefined
  /** Opacity of the marker.
    * @Default {true}
    */
  var opacity: js.UndefOr[Boolean] = js.undefined
  /** Options for customizing the size of the marker.
    */
  var size: js.UndefOr[CrosshairMarkerSize] = js.undefined
  /** Show/hides the marker.
    * @Default {true}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object CrosshairMarker {
  @scala.inline
  def apply(
    border: CrosshairMarkerBorder = null,
    opacity: js.UndefOr[Boolean] = js.undefined,
    size: CrosshairMarkerSize = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): CrosshairMarker = {
    val __obj = js.Dynamic.literal()
    if (border != null) __obj.updateDynamic("border")(border)
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity)
    if (size != null) __obj.updateDynamic("size")(size)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[CrosshairMarker]
  }
}

