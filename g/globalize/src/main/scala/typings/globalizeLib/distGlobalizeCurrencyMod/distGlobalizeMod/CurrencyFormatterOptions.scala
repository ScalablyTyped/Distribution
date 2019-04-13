package typings
package globalizeLib.distGlobalizeCurrencyMod.distGlobalizeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrencyFormatterOptions
  extends globalizeLib.distGlobalizeMod.CommonNumberFormatterOptions {
  /**
  		* symbol (default), accounting, code or name.
  		*/
  var style: js.UndefOr[
    globalizeLib.globalizeLibStrings.symbol | globalizeLib.globalizeLibStrings.accounting | globalizeLib.globalizeLibStrings.code | globalizeLib.globalizeLibStrings.name
  ] = js.undefined
}

object CurrencyFormatterOptions {
  @scala.inline
  def apply(
    maximumFractionDigits: scala.Int | scala.Double = null,
    maximumSignificantDigits: scala.Int | scala.Double = null,
    minimumFractionDigits: scala.Int | scala.Double = null,
    minimumIntegerDigits: scala.Int | scala.Double = null,
    minimumSignificantDigits: scala.Int | scala.Double = null,
    round: globalizeLib.globalizeLibStrings.ceil | globalizeLib.globalizeLibStrings.floor | globalizeLib.globalizeLibStrings.round | globalizeLib.globalizeLibStrings.truncate = null,
    style: globalizeLib.globalizeLibStrings.symbol | globalizeLib.globalizeLibStrings.accounting | globalizeLib.globalizeLibStrings.code | globalizeLib.globalizeLibStrings.name = null,
    useGrouping: js.UndefOr[scala.Boolean] = js.undefined
  ): CurrencyFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (maximumFractionDigits != null) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.asInstanceOf[js.Any])
    if (maximumSignificantDigits != null) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.asInstanceOf[js.Any])
    if (minimumFractionDigits != null) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.asInstanceOf[js.Any])
    if (minimumIntegerDigits != null) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.asInstanceOf[js.Any])
    if (minimumSignificantDigits != null) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping)
    __obj.asInstanceOf[CurrencyFormatterOptions]
  }
}

