package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryXAxisAlternateGridBandOdd extends js.Object {
  /** Fill color of the odd grid bands
    * @Default {transparent}
    */
  var fill: js.UndefOr[java.lang.String] = js.undefined
  /** Opacity of odd grid band
    * @Default {1}
    */
  var opacity: js.UndefOr[scala.Double] = js.undefined
}

object PrimaryXAxisAlternateGridBandOdd {
  @scala.inline
  def apply(fill: java.lang.String = null, opacity: scala.Int | scala.Double = null): PrimaryXAxisAlternateGridBandOdd = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryXAxisAlternateGridBandOdd]
  }
}

