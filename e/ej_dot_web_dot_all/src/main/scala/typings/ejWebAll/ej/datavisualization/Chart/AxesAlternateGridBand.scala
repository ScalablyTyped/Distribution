package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxesAlternateGridBand extends js.Object {
  /** Options for customizing even grid band.
    */
  var even: js.UndefOr[AxesAlternateGridBandEven] = js.undefined
  /** Options for customizing odd grid band.
    */
  var odd: js.UndefOr[AxesAlternateGridBandOdd] = js.undefined
}

object AxesAlternateGridBand {
  @scala.inline
  def apply(even: AxesAlternateGridBandEven = null, odd: AxesAlternateGridBandOdd = null): AxesAlternateGridBand = {
    val __obj = js.Dynamic.literal()
    if (even != null) __obj.updateDynamic("even")(even.asInstanceOf[js.Any])
    if (odd != null) __obj.updateDynamic("odd")(odd.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxesAlternateGridBand]
  }
}

