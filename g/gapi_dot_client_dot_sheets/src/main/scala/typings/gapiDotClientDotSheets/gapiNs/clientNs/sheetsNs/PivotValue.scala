package typings.gapiDotClientDotSheets.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PivotValue extends js.Object {
  /**
    * If specified, indicates that pivot values should be displayed as
    * the result of a calculation with another pivot value. For example, if
    * calculated_display_type is specified as PERCENT_OF_GRAND_TOTAL, all the
    * pivot values are displayed as the percentage of the grand total. In
    * the Sheets UI, this is referred to as "Show As" in the value section of a
    * pivot table.
    */
  var calculatedDisplayType: js.UndefOr[String] = js.undefined
  /**
    * A custom formula to calculate the value.  The formula must start
    * with an `=` character.
    */
  var formula: js.UndefOr[String] = js.undefined
  /** A name to use for the value. */
  var name: js.UndefOr[String] = js.undefined
  /**
    * The column offset of the source range that this value reads from.
    *
    * For example, if the source was `C10:E15`, a `sourceColumnOffset` of `0`
    * means this value refers to column `C`, whereas the offset `1` would
    * refer to column `D`.
    */
  var sourceColumnOffset: js.UndefOr[Double] = js.undefined
  /**
    * A function to summarize the value.
    * If formula is set, the only supported values are
    * SUM and
    * CUSTOM.
    * If sourceColumnOffset is set, then `CUSTOM`
    * is not supported.
    */
  var summarizeFunction: js.UndefOr[String] = js.undefined
}

object PivotValue {
  @scala.inline
  def apply(
    calculatedDisplayType: String = null,
    formula: String = null,
    name: String = null,
    sourceColumnOffset: Int | Double = null,
    summarizeFunction: String = null
  ): PivotValue = {
    val __obj = js.Dynamic.literal()
    if (calculatedDisplayType != null) __obj.updateDynamic("calculatedDisplayType")(calculatedDisplayType)
    if (formula != null) __obj.updateDynamic("formula")(formula)
    if (name != null) __obj.updateDynamic("name")(name)
    if (sourceColumnOffset != null) __obj.updateDynamic("sourceColumnOffset")(sourceColumnOffset.asInstanceOf[js.Any])
    if (summarizeFunction != null) __obj.updateDynamic("summarizeFunction")(summarizeFunction)
    __obj.asInstanceOf[PivotValue]
  }
}

