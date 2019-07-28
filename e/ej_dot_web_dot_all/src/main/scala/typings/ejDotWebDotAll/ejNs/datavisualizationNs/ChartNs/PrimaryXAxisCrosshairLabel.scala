package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryXAxisCrosshairLabel extends js.Object {
  /** Show/hides the crosshair label associated with this axis.
    * @Default {false}
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object PrimaryXAxisCrosshairLabel {
  @scala.inline
  def apply(visible: js.UndefOr[Boolean] = js.undefined): PrimaryXAxisCrosshairLabel = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[PrimaryXAxisCrosshairLabel]
  }
}

