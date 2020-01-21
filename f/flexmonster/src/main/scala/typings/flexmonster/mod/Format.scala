package typings.flexmonster.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var beautifyFloatingPoint: js.UndefOr[Boolean] = js.undefined
  var currencySymbol: js.UndefOr[String] = js.undefined
  var currencySymbolAlign: js.UndefOr[String] = js.undefined
  var decimalPlaces: js.UndefOr[Double] = js.undefined
  var decimalSeparator: js.UndefOr[String] = js.undefined
  var divideByZeroValue: js.UndefOr[String] = js.undefined
  var infinityValue: js.UndefOr[String] = js.undefined
  var isPercent: js.UndefOr[Boolean] = js.undefined
  var maxDecimalPlaces: js.UndefOr[Double] = js.undefined
  var maxSymbols: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var negativeCurrencyFormat: js.UndefOr[String] = js.undefined
  var nullValue: js.UndefOr[String] = js.undefined
  var positiveCurrencyFormat: js.UndefOr[String] = js.undefined
  var textAlign: js.UndefOr[String] = js.undefined
  var thousandsSeparator: js.UndefOr[String] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    beautifyFloatingPoint: js.UndefOr[Boolean] = js.undefined,
    currencySymbol: String = null,
    currencySymbolAlign: String = null,
    decimalPlaces: Int | Double = null,
    decimalSeparator: String = null,
    divideByZeroValue: String = null,
    infinityValue: String = null,
    isPercent: js.UndefOr[Boolean] = js.undefined,
    maxDecimalPlaces: Int | Double = null,
    maxSymbols: Int | Double = null,
    name: String = null,
    negativeCurrencyFormat: String = null,
    nullValue: String = null,
    positiveCurrencyFormat: String = null,
    textAlign: String = null,
    thousandsSeparator: String = null
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beautifyFloatingPoint)) __obj.updateDynamic("beautifyFloatingPoint")(beautifyFloatingPoint.asInstanceOf[js.Any])
    if (currencySymbol != null) __obj.updateDynamic("currencySymbol")(currencySymbol.asInstanceOf[js.Any])
    if (currencySymbolAlign != null) __obj.updateDynamic("currencySymbolAlign")(currencySymbolAlign.asInstanceOf[js.Any])
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces.asInstanceOf[js.Any])
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator.asInstanceOf[js.Any])
    if (divideByZeroValue != null) __obj.updateDynamic("divideByZeroValue")(divideByZeroValue.asInstanceOf[js.Any])
    if (infinityValue != null) __obj.updateDynamic("infinityValue")(infinityValue.asInstanceOf[js.Any])
    if (!js.isUndefined(isPercent)) __obj.updateDynamic("isPercent")(isPercent.asInstanceOf[js.Any])
    if (maxDecimalPlaces != null) __obj.updateDynamic("maxDecimalPlaces")(maxDecimalPlaces.asInstanceOf[js.Any])
    if (maxSymbols != null) __obj.updateDynamic("maxSymbols")(maxSymbols.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (negativeCurrencyFormat != null) __obj.updateDynamic("negativeCurrencyFormat")(negativeCurrencyFormat.asInstanceOf[js.Any])
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue.asInstanceOf[js.Any])
    if (positiveCurrencyFormat != null) __obj.updateDynamic("positiveCurrencyFormat")(positiveCurrencyFormat.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (thousandsSeparator != null) __obj.updateDynamic("thousandsSeparator")(thousandsSeparator.asInstanceOf[js.Any])
    __obj.asInstanceOf[Format]
  }
}

