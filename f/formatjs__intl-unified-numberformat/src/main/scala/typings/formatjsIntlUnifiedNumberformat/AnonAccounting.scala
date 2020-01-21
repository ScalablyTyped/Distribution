package typings.formatjsIntlUnifiedNumberformat

import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.`best fit`
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.accounting
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.always
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.auto
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.code
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.compact
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.currency
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.decimal
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.engineering
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.exceptZero
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.long
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.lookup
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.name
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.narrow
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.narrowSymbol
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.never
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.percent
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.scientific
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.short
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.standard
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.symbol
import typings.formatjsIntlUnifiedNumberformat.formatjsIntlUnifiedNumberformatStrings.unit
import typings.formatjsIntlUnifiedNumberformat.unitsConstantsMod.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAccounting extends js.Object {
  var compactDisplay: js.UndefOr[short | long] = js.undefined
  var currencyDisplay: js.UndefOr[symbol | code | name | narrowSymbol] = js.undefined
  var currencySign: js.UndefOr[standard | accounting] = js.undefined
  var localeMatcher: js.UndefOr[lookup | (`best fit`)] = js.undefined
  var notation: js.UndefOr[standard | scientific | engineering | compact] = js.undefined
  var signDisplay: js.UndefOr[auto | always | never | exceptZero] = js.undefined
  var style: js.UndefOr[decimal | percent | currency | unit] = js.undefined
  var unit: js.UndefOr[Unit] = js.undefined
  var unitDisplay: js.UndefOr[long | short | narrow] = js.undefined
}

object AnonAccounting {
  @scala.inline
  def apply(
    compactDisplay: short | long = null,
    currencyDisplay: symbol | code | name | narrowSymbol = null,
    currencySign: standard | accounting = null,
    localeMatcher: lookup | (`best fit`) = null,
    notation: standard | scientific | engineering | compact = null,
    signDisplay: auto | always | never | exceptZero = null,
    style: decimal | percent | currency | unit = null,
    unit: Unit = null,
    unitDisplay: long | short | narrow = null
  ): AnonAccounting = {
    val __obj = js.Dynamic.literal()
    if (compactDisplay != null) __obj.updateDynamic("compactDisplay")(compactDisplay.asInstanceOf[js.Any])
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay.asInstanceOf[js.Any])
    if (currencySign != null) __obj.updateDynamic("currencySign")(currencySign.asInstanceOf[js.Any])
    if (localeMatcher != null) __obj.updateDynamic("localeMatcher")(localeMatcher.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    if (signDisplay != null) __obj.updateDynamic("signDisplay")(signDisplay.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (unitDisplay != null) __obj.updateDynamic("unitDisplay")(unitDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAccounting]
  }
}

