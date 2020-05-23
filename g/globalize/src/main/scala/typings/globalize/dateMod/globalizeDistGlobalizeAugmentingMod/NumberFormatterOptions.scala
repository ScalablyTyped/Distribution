package typings.globalize.dateMod.globalizeDistGlobalizeAugmentingMod

import typings.globalize.globalizeMod.CommonNumberFormatterOptions
import typings.globalize.globalizeStrings.ceil
import typings.globalize.globalizeStrings.decimal
import typings.globalize.globalizeStrings.floor
import typings.globalize.globalizeStrings.long
import typings.globalize.globalizeStrings.percent
import typings.globalize.globalizeStrings.round
import typings.globalize.globalizeStrings.short
import typings.globalize.globalizeStrings.truncate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormatterOptions
  extends CommonNumberFormatterOptions
     with typings.globalize.numberMod.globalizeDistGlobalizeAugmentingMod.NumberParserOptions

object NumberFormatterOptions {
  @scala.inline
  def apply(
    compact: short | long = null,
    maximumFractionDigits: js.UndefOr[Double] = js.undefined,
    maximumSignificantDigits: js.UndefOr[Double] = js.undefined,
    minimumFractionDigits: js.UndefOr[Double] = js.undefined,
    minimumIntegerDigits: js.UndefOr[Double] = js.undefined,
    minimumSignificantDigits: js.UndefOr[Double] = js.undefined,
    round: ceil | floor | round | truncate = null,
    style: decimal | percent = null,
    useGrouping: js.UndefOr[Boolean] = js.undefined
  ): NumberFormatterOptions = {
    val __obj = js.Dynamic.literal()
    if (compact != null) __obj.updateDynamic("compact")(compact.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumFractionDigits)) __obj.updateDynamic("maximumFractionDigits")(maximumFractionDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maximumSignificantDigits)) __obj.updateDynamic("maximumSignificantDigits")(maximumSignificantDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumFractionDigits)) __obj.updateDynamic("minimumFractionDigits")(minimumFractionDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumIntegerDigits)) __obj.updateDynamic("minimumIntegerDigits")(minimumIntegerDigits.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minimumSignificantDigits)) __obj.updateDynamic("minimumSignificantDigits")(minimumSignificantDigits.get.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(useGrouping)) __obj.updateDynamic("useGrouping")(useGrouping.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormatterOptions]
  }
}

