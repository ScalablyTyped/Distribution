package typings.formatjsIntlUnifiedNumberformat.dataMod

import typings.formatjsIntlUnifiedNumberformat.anon.RecordDecimalFormatNumSig
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactLong
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactShort
import typings.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typings.formatjsIntlUtils.numberTypesMod.NotationPattern
import typings.formatjsIntlUtils.numberTypesMod.SignDisplayPattern
import typings.formatjsIntlUtils.numberTypesMod.SignPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.formatjsIntlUtils.numberTypesMod.NotationPattern because var conflicts: compactLong, compactShort. Inlined scientific, standard */ trait CurrencySignDisplayPatterns
  extends NotationPatterns
     with SignDisplayPattern {
  var compactSignPattern: js.UndefOr[js.Any] = js.undefined
  var currency: js.Any
  var currencySign: js.UndefOr[js.Any] = js.undefined
  var currencySlotToken: js.Any
  var numberingSystem: js.Any
  var numbers: js.Any
  @JSName("scientific")
  var scientific_FCurrencySignDisplayPatterns: SignPattern
  var signDisplay: js.UndefOr[js.Any] = js.undefined
  var signPattern: js.UndefOr[js.Any] = js.undefined
  @JSName("standard")
  var standard_FCurrencySignDisplayPatterns: SignPattern
  @JSName("always")
  def always_MCurrencySignDisplayPatterns: NotationPattern
  @JSName("auto")
  def auto_MCurrencySignDisplayPatterns: NotationPattern
  @JSName("exceptZero")
  def exceptZero_MCurrencySignDisplayPatterns: NotationPattern
  @JSName("never")
  def never_MCurrencySignDisplayPatterns: NotationPattern
  def scientific: SignPattern
  def standard: SignPattern
}

object CurrencySignDisplayPatterns {
  @scala.inline
  def apply(
    `1000`: () => SignPattern,
    `10000`: () => SignPattern,
    `100000`: () => SignPattern,
    `1000000`: () => SignPattern,
    `10000000`: () => SignPattern,
    `100000000`: () => SignPattern,
    `1000000000`: () => SignPattern,
    `10000000000`: () => SignPattern,
    `100000000000`: () => SignPattern,
    `1000000000000`: () => SignPattern,
    `10000000000000`: () => SignPattern,
    `100000000000000`: () => SignPattern,
    always: () => NotationPattern,
    auto: () => NotationPattern,
    compactLong: () => RecordDecimalFormatNumSig,
    compactShort: () => RecordDecimalFormatNumSig,
    currency: js.Any,
    currencySlotToken: js.Any,
    exceptZero: () => NotationPattern,
    never: () => NotationPattern,
    numberingSystem: js.Any,
    numbers: js.Any,
    produceCompactSignPattern: DecimalFormatNum => SignPattern,
    scientific: () => SignPattern,
    standard: () => SignPattern,
    compactSignPattern: js.Any = null,
    currencySign: js.Any = null,
    decimalNum: DecimalFormatNum = null,
    notation: compactShort | compactLong = null,
    signDisplay: js.Any = null,
    signPattern: js.Any = null
  ): CurrencySignDisplayPatterns = {
    val __obj = js.Dynamic.literal(always = js.Any.fromFunction0(always), auto = js.Any.fromFunction0(auto), compactLong = js.Any.fromFunction0(compactLong), compactShort = js.Any.fromFunction0(compactShort), currency = currency.asInstanceOf[js.Any], currencySlotToken = currencySlotToken.asInstanceOf[js.Any], exceptZero = js.Any.fromFunction0(exceptZero), never = js.Any.fromFunction0(never), numberingSystem = numberingSystem.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], produceCompactSignPattern = js.Any.fromFunction1(produceCompactSignPattern), scientific = js.Any.fromFunction0(scientific), standard = js.Any.fromFunction0(standard))
    __obj.updateDynamic("1000")(js.Any.fromFunction0(`1000`))
    __obj.updateDynamic("10000")(js.Any.fromFunction0(`10000`))
    __obj.updateDynamic("100000")(js.Any.fromFunction0(`100000`))
    __obj.updateDynamic("1000000")(js.Any.fromFunction0(`1000000`))
    __obj.updateDynamic("10000000")(js.Any.fromFunction0(`10000000`))
    __obj.updateDynamic("100000000")(js.Any.fromFunction0(`100000000`))
    __obj.updateDynamic("1000000000")(js.Any.fromFunction0(`1000000000`))
    __obj.updateDynamic("10000000000")(js.Any.fromFunction0(`10000000000`))
    __obj.updateDynamic("100000000000")(js.Any.fromFunction0(`100000000000`))
    __obj.updateDynamic("1000000000000")(js.Any.fromFunction0(`1000000000000`))
    __obj.updateDynamic("10000000000000")(js.Any.fromFunction0(`10000000000000`))
    __obj.updateDynamic("100000000000000")(js.Any.fromFunction0(`100000000000000`))
    if (compactSignPattern != null) __obj.updateDynamic("compactSignPattern")(compactSignPattern.asInstanceOf[js.Any])
    if (currencySign != null) __obj.updateDynamic("currencySign")(currencySign.asInstanceOf[js.Any])
    if (decimalNum != null) __obj.updateDynamic("decimalNum")(decimalNum.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    if (signDisplay != null) __obj.updateDynamic("signDisplay")(signDisplay.asInstanceOf[js.Any])
    if (signPattern != null) __obj.updateDynamic("signPattern")(signPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencySignDisplayPatterns]
  }
}

