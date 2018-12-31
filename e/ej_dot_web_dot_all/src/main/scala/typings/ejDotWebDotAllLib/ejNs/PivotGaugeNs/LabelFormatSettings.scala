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

