package typings.ejWebAll.ej.PivotGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelFormatSettings extends js.Object {
  /** Allows you to set the number of digits displayed after decimal point.
    * @Default {5}
    */
  var decimalPlaces: js.UndefOr[Double] = js.undefined
  /** Allows the user to change the number format of the label values in PivotGauge.
    * @Default {ej.PivotGauge.NumberFormat.Default}
    */
  var numberFormat: js.UndefOr[NumberFormat | String] = js.undefined
  /** Allows you to add a text at the beginning of the label.
    */
  var prefixText: js.UndefOr[String] = js.undefined
  /** Allows you to add text at the end of the label.
    */
  var suffixText: js.UndefOr[String] = js.undefined
}

object LabelFormatSettings {
  @scala.inline
  def apply(
    decimalPlaces: Int | Double = null,
    numberFormat: NumberFormat | String = null,
    prefixText: String = null,
    suffixText: String = null
  ): LabelFormatSettings = {
    val __obj = js.Dynamic.literal()
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces.asInstanceOf[js.Any])
    if (numberFormat != null) __obj.updateDynamic("numberFormat")(numberFormat.asInstanceOf[js.Any])
    if (prefixText != null) __obj.updateDynamic("prefixText")(prefixText.asInstanceOf[js.Any])
    if (suffixText != null) __obj.updateDynamic("suffixText")(suffixText.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelFormatSettings]
  }
}

