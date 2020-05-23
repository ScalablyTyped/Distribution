package typings.ejWebAll.ej.datavisualization.BulletGraph

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QuantitativeScaleSettingsLocation extends js.Object {
  /** This property specifies the x position for rendering quantitative scale.
    * @Default {10}
    */
  var x: js.UndefOr[Double] = js.undefined
  /** This property specifies the y position for rendering quantitative scale.
    * @Default {10}
    */
  var y: js.UndefOr[Double] = js.undefined
}

object QuantitativeScaleSettingsLocation {
  @scala.inline
  def apply(x: js.UndefOr[Double] = js.undefined, y: js.UndefOr[Double] = js.undefined): QuantitativeScaleSettingsLocation = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(x)) __obj.updateDynamic("x")(x.get.asInstanceOf[js.Any])
    if (!js.isUndefined(y)) __obj.updateDynamic("y")(y.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsLocation]
  }
}

