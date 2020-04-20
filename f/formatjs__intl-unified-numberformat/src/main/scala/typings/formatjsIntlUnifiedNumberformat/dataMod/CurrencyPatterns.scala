package typings.formatjsIntlUnifiedNumberformat.dataMod

import typings.formatjsIntlUtils.numberTypesMod.CurrencyPattern
import typings.formatjsIntlUtils.numberTypesMod.CurrencySignPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyPatterns
  extends CurrencyPattern
     with CurrencySignPattern {
  var currencies: js.Any
  var currency: js.Any
  var currencySign: js.Any
  var currencySlotToken: js.UndefOr[js.Any] = js.undefined
  var numberingSystem: js.Any
  var numbers: js.Any
  var resolvedCurrency: js.UndefOr[js.Any] = js.undefined
  var signDisplayPatterns: js.UndefOr[js.Any] = js.undefined
  @JSName("accounting")
  def accounting_MCurrencyPatterns: CurrencySignDisplayPatterns
  @JSName("code")
  def code_MCurrencyPatterns: this.type
  @JSName("name")
  def name_MCurrencyPatterns: this.type
  @JSName("narrowSymbol")
  def narrowSymbol_MCurrencyPatterns: this.type
  @JSName("standard")
  def standard_MCurrencyPatterns: CurrencySignDisplayPatterns
  @JSName("symbol")
  def symbol_MCurrencyPatterns: this.type
}

object CurrencyPatterns {
  @scala.inline
  def apply(
    accounting: () => CurrencySignDisplayPatterns,
    code: () => CurrencyPatterns,
    currencies: js.Any,
    currency: js.Any,
    currencySign: js.Any,
    name: () => CurrencyPatterns,
    narrowSymbol: () => CurrencyPatterns,
    numberingSystem: js.Any,
    numbers: js.Any,
    standard: () => CurrencySignDisplayPatterns,
    symbol: () => CurrencyPatterns,
    currencySlotToken: js.Any = null,
    resolvedCurrency: js.Any = null,
    signDisplayPatterns: js.Any = null
  ): CurrencyPatterns = {
    val __obj = js.Dynamic.literal(accounting = js.Any.fromFunction0(accounting), code = js.Any.fromFunction0(code), currencies = currencies.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], currencySign = currencySign.asInstanceOf[js.Any], name = js.Any.fromFunction0(name), narrowSymbol = js.Any.fromFunction0(narrowSymbol), numberingSystem = numberingSystem.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], standard = js.Any.fromFunction0(standard), symbol = js.Any.fromFunction0(symbol))
    if (currencySlotToken != null) __obj.updateDynamic("currencySlotToken")(currencySlotToken.asInstanceOf[js.Any])
    if (resolvedCurrency != null) __obj.updateDynamic("resolvedCurrency")(resolvedCurrency.asInstanceOf[js.Any])
    if (signDisplayPatterns != null) __obj.updateDynamic("signDisplayPatterns")(signDisplayPatterns.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyPatterns]
  }
}

