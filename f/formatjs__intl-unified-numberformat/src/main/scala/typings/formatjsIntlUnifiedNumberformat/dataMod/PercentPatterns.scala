package typings.formatjsIntlUnifiedNumberformat.dataMod

import typings.formatjsIntlUnifiedNumberformat.RecordDecimalFormatNumSig
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactLong
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactShort
import typings.formatjsIntlUtils.numberTypesMod.CompactSignPattern
import typings.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typings.formatjsIntlUtils.numberTypesMod.NotationPattern
import typings.formatjsIntlUtils.numberTypesMod.RawNumberData
import typings.formatjsIntlUtils.numberTypesMod.SignPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PercentPatterns extends DecimalPatterns {
  var generateStandardOrScientificPattern: js.Any
  @JSName("scientific")
  def scientific_MPercentPatterns(): SignPattern
  @JSName("standard")
  def standard_MPercentPatterns(): SignPattern
}

object PercentPatterns {
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
    exceptZero: () => NotationPattern,
    generateStandardOrScientificPattern: js.Any,
    never: () => NotationPattern,
    numberingSystem: String,
    numbers: RawNumberData,
    produceCompactSignPattern: DecimalFormatNum => SignPattern,
    scientific: () => SignPattern,
    standard: () => SignPattern,
    compactSignPattern: CompactSignPattern = null,
    decimalNum: DecimalFormatNum = null,
    notation: compactShort | compactLong = null,
    signDisplay: String = null,
    signPattern: SignPattern = null
  ): PercentPatterns = {
    val __obj = js.Dynamic.literal(always = js.Any.fromFunction0(always), auto = js.Any.fromFunction0(auto), compactLong = js.Any.fromFunction0(compactLong), compactShort = js.Any.fromFunction0(compactShort), exceptZero = js.Any.fromFunction0(exceptZero), generateStandardOrScientificPattern = generateStandardOrScientificPattern.asInstanceOf[js.Any], never = js.Any.fromFunction0(never), numberingSystem = numberingSystem.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], produceCompactSignPattern = js.Any.fromFunction1(produceCompactSignPattern), scientific = js.Any.fromFunction0(scientific), standard = js.Any.fromFunction0(standard))
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
    if (decimalNum != null) __obj.updateDynamic("decimalNum")(decimalNum.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    if (signDisplay != null) __obj.updateDynamic("signDisplay")(signDisplay.asInstanceOf[js.Any])
    if (signPattern != null) __obj.updateDynamic("signPattern")(signPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[PercentPatterns]
  }
}

