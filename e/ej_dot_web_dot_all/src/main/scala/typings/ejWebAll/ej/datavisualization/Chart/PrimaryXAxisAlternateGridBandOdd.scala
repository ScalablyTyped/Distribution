package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryXAxisAlternateGridBandOdd extends js.Object {
  /** Fill color of the odd grid bands
    * @Default {transparent}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Opacity of odd grid band
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PrimaryXAxisAlternateGridBandOdd {
  @scala.inline
  def apply(fill: String = null, opacity: js.UndefOr[Double] = js.undefined): PrimaryXAxisAlternateGridBandOdd = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryXAxisAlternateGridBandOdd]
  }
}

