package typings.globalize.distGlobalizeMod

import typings.globalize.globalizeStrings.accounting
import typings.globalize.globalizeStrings.ceil
import typings.globalize.globalizeStrings.code
import typings.globalize.globalizeStrings.floor
import typings.globalize.globalizeStrings.name
import typings.globalize.globalizeStrings.round
import typings.globalize.globalizeStrings.symbol
import typings.globalize.globalizeStrings.truncate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyFormatterOptions extends CommonNumberFormatterOptions {
  /**
  		* symbol (default), accounting, code or name.
  		*/
  var style: js.UndefOr[symbol | accounting | code | name] = js.undefined
}

object CurrencyFormatterOptions {
  @scala.inline
  def apply(
    maximumFractionDigits: Int | Double = null,
    maximumSignificantDigits: Int | Double = null,
    minimumFractionDigits: Int | Double = null,
    minimumIntegerDigits: Int | Double = null,
    minimumSignificantDigits: Int | Double = null,
    round: ceil | floor | round | truncate = null,
    style: symbol | accounting | code | name = null,
    useGrouping: js.UndefOr[Boolean] = js.undefined
  ): CurrencyFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (maximumFractionDigits != null) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.asInstanceOf[js.Any])
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumFractionDigits != null) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.asInstanceOf[js.Any])
    if (minimumIntegerDigits != null) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrencyFormatterOptions]
  }
}

