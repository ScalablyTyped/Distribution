package typings
package ejDotWebDotAllLib.ejNs.PivotGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelFormatSettings extends js.Object {
  /** Allows you to set the number of digits displayed after decimal point.
    * @Default {5}
    */
  var decimalPlaces: js.UndefOr[scala.Double] = js.undefined
  /** Allows the user to change the number format of the label values in PivotGauge.
    * @Default {ej.PivotGauge.NumberFormat.Default}
    */
  var numberFormat: js.UndefOr[NumberFormat | java.lang.String] = js.undefined
  /** Allows you to add a text at the beginning of the label.
    */
  var prefixText: js.UndefOr[java.lang.String] = js.undefined
  /** Allows you to add text at the end of the label.
    */
  var suffixText: js.UndefOr[java.lang.String] = js.undefined
}

object LabelFormatSettings {
  @scala.inline
  def apply(
    decimalPlaces: scala.Int | scala.Double = null,
    numberFormat: NumberFormat | java.lang.String = null,
    prefixText: java.lang.String = null,
    suffixText: java.lang.String = null
  ): LabelFormatSettings = {
    val __obj = js.Dynamic.literal()
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (prefixText != null) __obj.updateDynamic("prefixText")(prefixText)
    if (suffixText != null) __obj.updateDynamic("suffixText")(suffixText)
    __obj.asInstanceOf[LabelFormatSettings]
  }
}

