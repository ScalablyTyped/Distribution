package typings.formatjsIntlUnifiedNumberformat.dataMod

import typings.formatjsIntlUnifiedNumberformat.anon.RecordDecimalFormatNumSig
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactLong
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactShort
import typings.formatjsIntlUtils.numberTypesMod.CompactSignPattern
import typings.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typings.formatjsIntlUtils.numberTypesMod.SignPattern
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotationPatterns extends CompactSignPattern {
  var decimalNum: js.UndefOr[DecimalFormatNum] = js.undefined
  var notation: js.UndefOr[compactShort | compactLong] = js.undefined
  @JSName("100000000000000")
  def `100000000000000_MNotationPatterns`: SignPattern
  @JSName("10000000000000")
  def `10000000000000_MNotationPatterns`: SignPattern
  @JSName("1000000000000")
  def `1000000000000_MNotationPatterns`: SignPattern
  @JSName("100000000000")
  def `100000000000_MNotationPatterns`: SignPattern
  @JSName("10000000000")
  def `10000000000_MNotationPatterns`: SignPattern
  @JSName("1000000000")
  def `1000000000_MNotationPatterns`: SignPattern
  @JSName("100000000")
  def `100000000_MNotationPatterns`: SignPattern
  @JSName("10000000")
  def `10000000_MNotationPatterns`: SignPattern
  @JSName("1000000")
  def `1000000_MNotationPatterns`: SignPattern
  @JSName("100000")
  def `100000_MNotationPatterns`: SignPattern
  @JSName("10000")
  def `10000_MNotationPatterns`: SignPattern
  @JSName("1000")
  def `1000_MNotationPatterns`: SignPattern
  def compactLong: RecordDecimalFormatNumSig
  def compactShort: RecordDecimalFormatNumSig
  def produceCompactSignPattern(decimalNum: DecimalFormatNum): SignPattern
}

object NotationPatterns {
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
    compactLong: () => RecordDecimalFormatNumSig,
    compactShort: () => RecordDecimalFormatNumSig,
    produceCompactSignPattern: DecimalFormatNum => SignPattern,
    decimalNum: DecimalFormatNum = null,
    notation: compactShort | compactLong = null
  ): NotationPatterns = {
    val __obj = js.Dynamic.literal(compactLong = js.Any.fromFunction0(compactLong), compactShort = js.Any.fromFunction0(compactShort), produceCompactSignPattern = js.Any.fromFunction1(produceCompactSignPattern))
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
    if (decimalNum != null) __obj.updateDynamic("decimalNum")(decimalNum.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotationPatterns]
  }
}

