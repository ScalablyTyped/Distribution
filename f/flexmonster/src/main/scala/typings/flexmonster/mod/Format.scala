package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Format extends js.Object {
  var beautifyFloatingPoint: js.UndefOr[Boolean] = js.native
  var currencySymbol: js.UndefOr[String] = js.native
  var currencySymbolAlign: js.UndefOr[String] = js.native
  var decimalPlaces: js.UndefOr[Double] = js.native
  var decimalSeparator: js.UndefOr[String] = js.native
  var divideByZeroValue: js.UndefOr[String] = js.native
  var infinityValue: js.UndefOr[String] = js.native
  var isPercent: js.UndefOr[Boolean] = js.native
  var maxDecimalPlaces: js.UndefOr[Double] = js.native
  var maxSymbols: js.UndefOr[Double] = js.native
  var name: js.UndefOr[String] = js.native
  var negativeCurrencyFormat: js.UndefOr[String] = js.native
  var nullValue: js.UndefOr[String] = js.native
  var positiveCurrencyFormat: js.UndefOr[String] = js.native
  var textAlign: js.UndefOr[String] = js.native
  var thousandsSeparator: js.UndefOr[String] = js.native
}

object Format {
  @scala.inline
  def apply(): Format = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Format]
  }
  @scala.inline
  implicit class FormatOps[Self <: Format] (val x: Self) extends AnyVal {
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
    def setBeautifyFloatingPoint(value: Boolean): Self = this.set("beautifyFloatingPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBeautifyFloatingPoint: Self = this.set("beautifyFloatingPoint", js.undefined)
    @scala.inline
    def setCurrencySymbol(value: String): Self = this.set("currencySymbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencySymbol: Self = this.set("currencySymbol", js.undefined)
    @scala.inline
    def setCurrencySymbolAlign(value: String): Self = this.set("currencySymbolAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrencySymbolAlign: Self = this.set("currencySymbolAlign", js.undefined)
    @scala.inline
    def setDecimalPlaces(value: Double): Self = this.set("decimalPlaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalPlaces: Self = this.set("decimalPlaces", js.undefined)
    @scala.inline
    def setDecimalSeparator(value: String): Self = this.set("decimalSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecimalSeparator: Self = this.set("decimalSeparator", js.undefined)
    @scala.inline
    def setDivideByZeroValue(value: String): Self = this.set("divideByZeroValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDivideByZeroValue: Self = this.set("divideByZeroValue", js.undefined)
    @scala.inline
    def setInfinityValue(value: String): Self = this.set("infinityValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfinityValue: Self = this.set("infinityValue", js.undefined)
    @scala.inline
    def setIsPercent(value: Boolean): Self = this.set("isPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPercent: Self = this.set("isPercent", js.undefined)
    @scala.inline
    def setMaxDecimalPlaces(value: Double): Self = this.set("maxDecimalPlaces", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDecimalPlaces: Self = this.set("maxDecimalPlaces", js.undefined)
    @scala.inline
    def setMaxSymbols(value: Double): Self = this.set("maxSymbols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSymbols: Self = this.set("maxSymbols", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNegativeCurrencyFormat(value: String): Self = this.set("negativeCurrencyFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNegativeCurrencyFormat: Self = this.set("negativeCurrencyFormat", js.undefined)
    @scala.inline
    def setNullValue(value: String): Self = this.set("nullValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNullValue: Self = this.set("nullValue", js.undefined)
    @scala.inline
    def setPositiveCurrencyFormat(value: String): Self = this.set("positiveCurrencyFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePositiveCurrencyFormat: Self = this.set("positiveCurrencyFormat", js.undefined)
    @scala.inline
    def setTextAlign(value: String): Self = this.set("textAlign", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextAlign: Self = this.set("textAlign", js.undefined)
    @scala.inline
    def setThousandsSeparator(value: String): Self = this.set("thousandsSeparator", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThousandsSeparator: Self = this.set("thousandsSeparator", js.undefined)
  }
  
}

