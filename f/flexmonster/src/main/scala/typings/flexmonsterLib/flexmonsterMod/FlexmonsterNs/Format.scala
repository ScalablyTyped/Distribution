package typings
package flexmonsterLib.flexmonsterMod.FlexmonsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Format extends js.Object {
  var beautifyFloatingPoint: js.UndefOr[scala.Boolean] = js.undefined
  var currencySymbol: js.UndefOr[java.lang.String] = js.undefined
  var currencySymbolAlign: js.UndefOr[java.lang.String] = js.undefined
  var decimalPlaces: js.UndefOr[scala.Double] = js.undefined
  var decimalSeparator: js.UndefOr[java.lang.String] = js.undefined
  var divideByZeroValue: js.UndefOr[java.lang.String] = js.undefined
  var infinityValue: js.UndefOr[java.lang.String] = js.undefined
  var isPercent: js.UndefOr[scala.Boolean] = js.undefined
  var maxDecimalPlaces: js.UndefOr[scala.Double] = js.undefined
  var maxSymbols: js.UndefOr[scala.Double] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var nullValue: js.UndefOr[java.lang.String] = js.undefined
  var textAlign: js.UndefOr[java.lang.String] = js.undefined
  var thousandsSeparator: js.UndefOr[java.lang.String] = js.undefined
}

object Format {
  @scala.inline
  def apply(
    beautifyFloatingPoint: js.UndefOr[scala.Boolean] = js.undefined,
    currencySymbol: java.lang.String = null,
    currencySymbolAlign: java.lang.String = null,
    decimalPlaces: scala.Int | scala.Double = null,
    decimalSeparator: java.lang.String = null,
    divideByZeroValue: java.lang.String = null,
    infinityValue: java.lang.String = null,
    isPercent: js.UndefOr[scala.Boolean] = js.undefined,
    maxDecimalPlaces: scala.Int | scala.Double = null,
    maxSymbols: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    nullValue: java.lang.String = null,
    textAlign: java.lang.String = null,
    thousandsSeparator: java.lang.String = null
  ): Format = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(beautifyFloatingPoint)) __obj.updateDynamic("beautifyFloatingPoint")(beautifyFloatingPoint)
    if (currencySymbol != null) __obj.updateDynamic("currencySymbol")(currencySymbol)
    if (currencySymbolAlign != null) __obj.updateDynamic("currencySymbolAlign")(currencySymbolAlign)
    if (decimalPlaces != null) __obj.updateDynamic("decimalPlaces")(decimalPlaces.asInstanceOf[js.Any])
    if (decimalSeparator != null) __obj.updateDynamic("decimalSeparator")(decimalSeparator)
    if (divideByZeroValue != null) __obj.updateDynamic("divideByZeroValue")(divideByZeroValue)
    if (infinityValue != null) __obj.updateDynamic("infinityValue")(infinityValue)
    if (!js.isUndefined(isPercent)) __obj.updateDynamic("isPercent")(isPercent)
    if (maxDecimalPlaces != null) __obj.updateDynamic("maxDecimalPlaces")(maxDecimalPlaces.asInstanceOf[js.Any])
    if (maxSymbols != null) __obj.updateDynamic("maxSymbols")(maxSymbols.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (nullValue != null) __obj.updateDynamic("nullValue")(nullValue)
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign)
    if (thousandsSeparator != null) __obj.updateDynamic("thousandsSeparator")(thousandsSeparator)
    __obj.asInstanceOf[Format]
  }
}

