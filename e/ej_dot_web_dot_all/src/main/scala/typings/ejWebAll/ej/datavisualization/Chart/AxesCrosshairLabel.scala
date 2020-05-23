package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesCrosshairLabel extends js.Object {
  /** Show/hides the crosshair label associated with this axis.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object AxesCrosshairLabel {
  @scala.inline
  def apply(visible: js.UndefOr[Boolean] = js.undefined): AxesCrosshairLabel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesCrosshairLabel]
  }
}

