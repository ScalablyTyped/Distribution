package typings.ejWebAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrimaryXAxisAlternateGridBand extends js.Object {
  /** Options for customizing even grid band.
    */
  var even: js.UndefOr[PrimaryXAxisAlternateGridBandEven] = js.undefined
  /** Options for customizing odd grid band.
    */
  var odd: js.UndefOr[PrimaryXAxisAlternateGridBandOdd] = js.undefined
}

object PrimaryXAxisAlternateGridBand {
  @scala.inline
  def apply(even: PrimaryXAxisAlternateGridBandEven = null, odd: PrimaryXAxisAlternateGridBandOdd = null): PrimaryXAxisAlternateGridBand = {
    val __obj = js.Dynamic.literal()
    if (even != null) __obj.updateDynamic("even")(even.asInstanceOf[js.Any])
    if (odd != null) __obj.updateDynamic("odd")(odd.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrimaryXAxisAlternateGridBand]
  }
}

