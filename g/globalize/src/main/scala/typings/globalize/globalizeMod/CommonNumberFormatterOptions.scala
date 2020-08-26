package typings.globalize.globalizeMod

import typings.globalize.globalizeStrings.ceil
import typings.globalize.globalizeStrings.floor
import typings.globalize.globalizeStrings.long
import typings.globalize.globalizeStrings.round
import typings.globalize.globalizeStrings.short
import typings.globalize.globalizeStrings.truncate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonNumberFormatterOptions extends js.Object {
  /**
    * String `short` or `long` indicating which compact number format should be used to represent the number.
    */
  var compact: js.UndefOr[short | long] = js.native
  /**
    * Non-negative integer Number values indicating the minimum and maximum fraction digits to be used.
    * Numbers will be rounded or padded with trailing zeroes if necessary.
    * Either one or both of these properties must be present.
    * If they are, they will override minimum and maximum fraction digits derived from the CLDR patterns.
    */
  var maximumFractionDigits: js.UndefOr[Double] = js.native
  /**
    * Positive integer Number values indicating the minimum and maximum fraction digits to be shown.
    * Either none or both of these properties are present.
    * If they are, they override minimum and maximum integer and fraction digits.
    * The formatter uses however many integer and fraction digits are required to display the specified number of significant digits.
    */
  var maximumSignificantDigits: js.UndefOr[Double] = js.native
  /**
    * Non-negative integer Number values indicating the minimum and maximum fraction digits to be used.
    * Numbers will be rounded or padded with trailing zeroes if necessary.
    * Either one or both of these properties must be present.
    * If they are, they will override minimum and maximum fraction digits derived from the CLDR patterns.
    */
  var minimumFractionDigits: js.UndefOr[Double] = js.native
  /**
    * Non-negative integer Number value indicating the minimum integer digits to be used. Numbers will be padded with leading zeroes if necessary.
    */
  var minimumIntegerDigits: js.UndefOr[Double] = js.native
  /**
    * Positive integer Number values indicating the minimum and maximum fraction digits to be shown.
    * Either none or both of these properties are present
    * If they are, they override minimum and maximum integer and fraction digits.
    * The formatter uses however many integer and fraction digits are required to display the specified number of significant digits.
    */
  var minimumSignificantDigits: js.UndefOr[Double] = js.native
  /**
    * String with rounding method ceil, floor, round (default), or truncate.
    */
  var round: js.UndefOr[ceil | floor | typings.globalize.globalizeStrings.round | truncate] = js.native
  /**
    * Boolean (default is true) value indicating whether a grouping separator should be used.
    */
  var useGrouping: js.UndefOr[Boolean] = js.native
}

object CommonNumberFormatterOptions {
  @scala.inline
  def apply(): CommonNumberFormatterOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonNumberFormatterOptions]
  }
  @scala.inline
  implicit class CommonNumberFormatterOptionsOps[Self <: CommonNumberFormatterOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompact(value: short | long): Self = this.set("compact", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCompact: Self = this.set("compact", js.undefined)
    @scala.inline
    def setMaximumFractionDigits(value: Double): Self = this.set("maximumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumFractionDigits: Self = this.set("maximumFractionDigits", js.undefined)
    @scala.inline
    def setMaximumSignificantDigits(value: Double): Self = this.set("maximumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaximumSignificantDigits: Self = this.set("maximumSignificantDigits", js.undefined)
    @scala.inline
    def setMinimumFractionDigits(value: Double): Self = this.set("minimumFractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumFractionDigits: Self = this.set("minimumFractionDigits", js.undefined)
    @scala.inline
    def setMinimumIntegerDigits(value: Double): Self = this.set("minimumIntegerDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumIntegerDigits: Self = this.set("minimumIntegerDigits", js.undefined)
    @scala.inline
    def setMinimumSignificantDigits(value: Double): Self = this.set("minimumSignificantDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinimumSignificantDigits: Self = this.set("minimumSignificantDigits", js.undefined)
    @scala.inline
    def setRound(value: ceil | floor | round | truncate): Self = this.set("round", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRound: Self = this.set("round", js.undefined)
    @scala.inline
    def setUseGrouping(value: Boolean): Self = this.set("useGrouping", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseGrouping: Self = this.set("useGrouping", js.undefined)
  }
  
}

