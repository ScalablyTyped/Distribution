package typings
package googleDotVisualizationLib.googleNs.visualizationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormatOptions extends js.Object {
  /**
    * A character to use as the decimal marker. The default is a dot (.).
    */
  var decimalSymbol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A number specifying how many digits to display after the decimal. The default is 2. If you specify more digits than the number contains, it will display zeros for the smaller values. Truncated values will be rounded (5 rounded up).
    */
  var fractionDigits: js.UndefOr[scala.Double] = js.undefined
  /**
    * A character to be used to group digits to the left of the decimal into sets of three. Default is a comma (,).
    */
  var groupingSymbol: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The text color for negative values. No default value. Values can be any acceptable HTML color value, such as "red" or "#FF0000".
    */
  var negativeColor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A boolean, where true indicates that negative values should be surrounded by parentheses. Default is true.
    */
  var negativeParens: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A format string. When provided, all other options are ignored, except negativeColor.
    * The format string is a subset of the ICU pattern set. For instance, {pattern:'#,###%'} will result in output values "1,000%", "750%", and "50%" for values 10, 7.5, and 0.5.
    */
  var pattern: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A string prefix for the value, for example "$".
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A string suffix for the value, for example "%".
    */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
}

object NumberFormatOptions {
  @scala.inline
  def apply(
    decimalSymbol: java.lang.String = null,
    fractionDigits: scala.Int | scala.Double = null,
    groupingSymbol: java.lang.String = null,
    negativeColor: java.lang.String = null,
    negativeParens: js.UndefOr[scala.Boolean] = js.undefined,
    pattern: java.lang.String = null,
    prefix: java.lang.String = null,
    suffix: java.lang.String = null
  ): NumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    if (decimalSymbol != null) __obj.updateDynamic("decimalSymbol")(decimalSymbol)
    if (fractionDigits != null) __obj.updateDynamic("fractionDigits")(fractionDigits.asInstanceOf[js.Any])
    if (groupingSymbol != null) __obj.updateDynamic("groupingSymbol")(groupingSymbol)
    if (negativeColor != null) __obj.updateDynamic("negativeColor")(negativeColor)
    if (!js.isUndefined(negativeParens)) __obj.updateDynamic("negativeParens")(negativeParens)
    if (pattern != null) __obj.updateDynamic("pattern")(pattern)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    __obj.asInstanceOf[NumberFormatOptions]
  }
}

