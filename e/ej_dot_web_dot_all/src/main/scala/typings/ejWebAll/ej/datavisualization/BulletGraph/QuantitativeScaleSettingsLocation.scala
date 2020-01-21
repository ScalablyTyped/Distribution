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
  def apply(x: Int | Double = null, y: Int | Double = null): QuantitativeScaleSettingsLocation = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[QuantitativeScaleSettingsLocation]
  }
}

