package typings.formatjsIntlUnifiedNumberformat.dataMod

import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactLong
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactShort
import typings.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typings.formatjsIntlUtils.numberTypesMod.SignPattern
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in @formatjs/intl-utils.@formatjs/intl-utils/dist/number-types.DecimalFormatNum ]: @formatjs/intl-utils.@formatjs/intl-utils/dist/number-types.SignPattern} */ trait NotationPatterns extends js.Object {
  var decimalNum: js.UndefOr[DecimalFormatNum] = js.undefined
  var notation: js.UndefOr[compactShort | compactLong] = js.undefined
  def `1000`(): SignPattern
  def `10000`(): SignPattern
  def `100000`(): SignPattern
  def `1000000`(): SignPattern
  def `10000000`(): SignPattern
  def `100000000`(): SignPattern
  def `1000000000`(): SignPattern
  def `10000000000`(): SignPattern
  def `100000000000`(): SignPattern
  def `1000000000000`(): SignPattern
  def `10000000000000`(): SignPattern
  def `100000000000000`(): SignPattern
  def compactLong(): Record[DecimalFormatNum, SignPattern]
  def compactShort(): Record[DecimalFormatNum, SignPattern]
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
    compactLong: () => Record[DecimalFormatNum, SignPattern],
    compactShort: () => Record[DecimalFormatNum, SignPattern],
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

