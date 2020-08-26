package typings.googleVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberFormatOptions extends js.Object {
  /**
    * A character to use as the decimal marker. The default is a dot (.).
    */
  var decimalSymbol: js.UndefOr[String] = js.native
  /**
    * A number specifying how many digits to display after the decimal. The default is 2. If you specify more digits than the number contains, it will display zeros for the smaller values. Truncated values will be rounded (5 rounded up).
    */
  var fractionDigits: js.UndefOr[Double] = js.native
  /**
    * A character to be used to group digits to the left of the decimal into sets of three. Default is a comma (,).
    */
  var groupingSymbol: js.UndefOr[String] = js.native
  /**
    * The text color for negative values. No default value. Values can be any acceptable HTML color value, such as "red" or "#FF0000".
    */
  var negativeColor: js.UndefOr[String] = js.native
  /**
    * A boolean, where true indicates that negative values should be surrounded by parentheses. Default is true.
    */
  var negativeParens: js.UndefOr[Boolean] = js.native
  /**
    * A format string. When provided, all other options are ignored, except negativeColor.
    * The format string is a subset of the ICU pattern set. For instance, {pattern:'#,###%'} will result in output values "1,000%", "750%", and "50%" for values 10, 7.5, and 0.5.
    */
  var pattern: js.UndefOr[String] = js.native
  /**
    * A string prefix for the value, for example "$".
    */
  var prefix: js.UndefOr[String] = js.native
  /**
    * A string suffix for the value, for example "%".
    */
  var suffix: js.UndefOr[String] = js.native
}

object NumberFormatOptions {
  @scala.inline
  def apply(): NumberFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberFormatOptions]
  }
  @scala.inline
  implicit class NumberFormatOptionsOps[Self <: NumberFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDecimalSymbol(value: String): Self = this.set("decimalSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalSymbol: Self = this.set("decimalSymbol", js.undefined)
    @scala.inline
    def setFractionDigits(value: Double): Self = this.set("fractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFractionDigits: Self = this.set("fractionDigits", js.undefined)
    @scala.inline
    def setGroupingSymbol(value: String): Self = this.set("groupingSymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupingSymbol: Self = this.set("groupingSymbol", js.undefined)
    @scala.inline
    def setNegativeColor(value: String): Self = this.set("negativeColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeColor: Self = this.set("negativeColor", js.undefined)
    @scala.inline
    def setNegativeParens(value: Boolean): Self = this.set("negativeParens", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeParens: Self = this.set("negativeParens", js.undefined)
    @scala.inline
    def setPattern(value: String): Self = this.set("pattern", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePattern: Self = this.set("pattern", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
  }
  
}

