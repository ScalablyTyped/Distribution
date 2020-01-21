package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryYAxisAlternateGridBandOdd extends js.Object {
  /** Fill color of the odd grid bands.
    * @Default {transparent}
    */
  var fill: js.UndefOr[String] = js.undefined
  /** Opacity of odd grid band.
    * @Default {1}
    */
  var opacity: js.UndefOr[Double] = js.undefined
}

object PrimaryYAxisAlternateGridBandOdd {
  @scala.inline
  def apply(fill: String = null, opacity: Int | Double = null): PrimaryYAxisAlternateGridBandOdd = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryYAxisAlternateGridBandOdd]
  }
}

