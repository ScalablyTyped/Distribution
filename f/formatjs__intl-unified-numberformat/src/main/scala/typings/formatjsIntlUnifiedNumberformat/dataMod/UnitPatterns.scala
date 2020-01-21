package typings.formatjsIntlUnifiedNumberformat.dataMod

import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactLong
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compactShort
import typings.formatjsIntlUtils.numberTypesMod.DecimalFormatNum
import typings.formatjsIntlUtils.numberTypesMod.NotationPattern
import typings.formatjsIntlUtils.numberTypesMod.SignDisplayPattern
import typings.formatjsIntlUtils.numberTypesMod.SignPattern
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.formatjsIntlUtils.numberTypesMod.NotationPattern because var conflicts: compactLong, compactShort. Inlined scientific, standard */ trait UnitPatterns
  extends NotationPatterns
     with SignDisplayPattern {
  var compactSignPattern: js.UndefOr[js.Any] = js.undefined
  var generateStandardOrScientificPattern: js.Any
  var numberingSystem: js.Any
  var numbers: js.Any
  var pattern: js.UndefOr[js.Any] = js.undefined
  @JSName("scientific")
  var scientific_FUnitPatterns: SignPattern
  var signDisplay: js.UndefOr[js.Any] = js.undefined
  var signPattern: js.UndefOr[js.Any] = js.undefined
  @JSName("standard")
  var standard_FUnitPatterns: SignPattern
  var unit: js.Any
  var units: js.Any
  @JSName("always")
  def always_MUnitPatterns(): NotationPattern
  @JSName("auto")
  def auto_MUnitPatterns(): NotationPattern
  @JSName("exceptZero")
  def exceptZero_MUnitPatterns(): NotationPattern
  def long(): this.type
  def narrow(): this.type
  @JSName("never")
  def never_MUnitPatterns(): NotationPattern
  def scientific(): SignPattern
  def short(): this.type
  def standard(): SignPattern
}

object UnitPatterns {
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
    compactLong: () => Record[DecimalFormatNum, SignPattern],
    compactShort: () => Record[DecimalFormatNum, SignPattern],
    exceptZero: () => NotationPattern,
    generateStandardOrScientificPattern: js.Any,
    long: () => UnitPatterns,
    narrow: () => UnitPatterns,
    never: () => NotationPattern,
    numberingSystem: js.Any,
    numbers: js.Any,
    produceCompactSignPattern: DecimalFormatNum => SignPattern,
    scientific: () => SignPattern,
    short: () => UnitPatterns,
    standard: () => SignPattern,
    unit: js.Any,
    units: js.Any,
    compactSignPattern: js.Any = null,
    decimalNum: DecimalFormatNum = null,
    notation: compactShort | compactLong = null,
    pattern: js.Any = null,
    signDisplay: js.Any = null,
    signPattern: js.Any = null
  ): UnitPatterns = {
    val __obj = js.Dynamic.literal(always = js.Any.fromFunction0(always), auto = js.Any.fromFunction0(auto), compactLong = js.Any.fromFunction0(compactLong), compactShort = js.Any.fromFunction0(compactShort), exceptZero = js.Any.fromFunction0(exceptZero), generateStandardOrScientificPattern = generateStandardOrScientificPattern.asInstanceOf[js.Any], long = js.Any.fromFunction0(long), narrow = js.Any.fromFunction0(narrow), never = js.Any.fromFunction0(never), numberingSystem = numberingSystem.asInstanceOf[js.Any], numbers = numbers.asInstanceOf[js.Any], produceCompactSignPattern = js.Any.fromFunction1(produceCompactSignPattern), scientific = js.Any.fromFunction0(scientific), short = js.Any.fromFunction0(short), standard = js.Any.fromFunction0(standard), unit = unit.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
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
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    if (signDisplay != null) __obj.updateDynamic("signDisplay")(signDisplay.asInstanceOf[js.Any])
    if (signPattern != null) __obj.updateDynamic("signPattern")(signPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnitPatterns]
  }
}

