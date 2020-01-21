package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryYAxisAlternateGridBand extends js.Object {
  /** Options for customizing even grid band.
    */
  var even: js.UndefOr[PrimaryYAxisAlternateGridBandEven] = js.undefined
  /** Options for customizing odd grid band.
    */
  var odd: js.UndefOr[PrimaryYAxisAlternateGridBandOdd] = js.undefined
}

object PrimaryYAxisAlternateGridBand {
  @scala.inline
  def apply(even: PrimaryYAxisAlternateGridBandEven = null, odd: PrimaryYAxisAlternateGridBandOdd = null): PrimaryYAxisAlternateGridBand = {
    val __obj = js.Dynamic.literal()
    if (even != null) __obj.updateDynamic("even")(even.asInstanceOf[js.Any])
    if (odd != null) __obj.updateDynamic("odd")(odd.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryYAxisAlternateGridBand]
  }
}

