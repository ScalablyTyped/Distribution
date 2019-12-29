package typings.atFormatjsIntlDashUnifiedDashNumberformat

import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.accounting
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.always
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.auto
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.code
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.compact
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.currency
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.decimal
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.engineering
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.exceptZero
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.long
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.name
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.narrow
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.narrowSymbol
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.never
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.percent
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.scientific
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.short
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.standard
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.symbol
import typings.atFormatjsIntlDashUnifiedDashNumberformat.atFormatjsIntlDashUnifiedDashNumberformatStrings.unit
import typings.atFormatjsIntlDashUnifiedDashNumberformat.libUnitsDashConstantsMod.Unit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Accounting extends js.Object {
  var compactDisplay: js.UndefOr[short | long] = js.undefined
  var currencyDisplay: js.UndefOr[symbol | code | name | narrowSymbol] = js.undefined
  var currencySign: js.UndefOr[standard | accounting] = js.undefined
  var notation: js.UndefOr[standard | scientific | engineering | compact] = js.undefined
  var signDisplay: js.UndefOr[auto | always | never | exceptZero] = js.undefined
  var style: js.UndefOr[decimal | percent | currency | unit] = js.undefined
  var unit: js.UndefOr[Unit] = js.undefined
  var unitDisplay: js.UndefOr[long | short | narrow] = js.undefined
}

object Anon_Accounting {
  @scala.inline
  def apply(
    compactDisplay: short | long = null,
    currencyDisplay: symbol | code | name | narrowSymbol = null,
    currencySign: standard | accounting = null,
    notation: standard | scientific | engineering | compact = null,
    signDisplay: auto | always | never | exceptZero = null,
    style: decimal | percent | currency | unit = null,
    unit: Unit = null,
    unitDisplay: long | short | narrow = null
  ): Anon_Accounting = {
    val __obj = js.Dynamic.literal()
    if (compactDisplay != null) __obj.updateDynamic("compactDisplay")(compactDisplay.asInstanceOf[js.Any])
    if (currencyDisplay != null) __obj.updateDynamic("currencyDisplay")(currencyDisplay.asInstanceOf[js.Any])
    if (currencySign != null) __obj.updateDynamic("currencySign")(currencySign.asInstanceOf[js.Any])
    if (notation != null) __obj.updateDynamic("notation")(notation.asInstanceOf[js.Any])
    if (signDisplay != null) __obj.updateDynamic("signDisplay")(signDisplay.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (unitDisplay != null) __obj.updateDynamic("unitDisplay")(unitDisplay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Accounting]
  }
}

