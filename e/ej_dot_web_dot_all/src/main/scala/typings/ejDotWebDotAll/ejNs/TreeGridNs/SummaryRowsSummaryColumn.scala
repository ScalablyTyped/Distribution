package typings.ejDotWebDotAll.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryRowsSummaryColumn extends js.Object {
  /** Specifies the custom summary calculate function or text.
    */
  var customSummaryValue: js.UndefOr[String] = js.undefined
  /** Specifies summary column used to perform the summary calculation.
    */
  var dataMember: js.UndefOr[String] = js.undefined
  /** Specifies the required column to display the summary.
    */
  var displayColumn: js.UndefOr[String] = js.undefined
  /** Specifies the format to be applied on the summary column value.
    */
  var format: js.UndefOr[String] = js.undefined
  /** Specifies the text to be displayed before the summary column value.
    */
  var prefix: js.UndefOr[String] = js.undefined
  /** Specifies the text to be displayed after the summary column value.
    */
  var suffix: js.UndefOr[String] = js.undefined
  /** Specifies the summary type to perform calculations in a corresponding summary column. See summaryType.
    */
  var summaryType: js.UndefOr[SummaryType | String] = js.undefined
}

object SummaryRowsSummaryColumn {
  @scala.inline
  def apply(
    customSummaryValue: String = null,
    dataMember: String = null,
    displayColumn: String = null,
    format: String = null,
    prefix: String = null,
    suffix: String = null,
    summaryType: SummaryType | String = null
  ): SummaryRowsSummaryColumn = {
    val __obj = js.Dynamic.literal()
    if (customSummaryValue != null) __obj.updateDynamic("customSummaryValue")(customSummaryValue)
    if (dataMember != null) __obj.updateDynamic("dataMember")(dataMember)
    if (displayColumn != null) __obj.updateDynamic("displayColumn")(displayColumn)
    if (format != null) __obj.updateDynamic("format")(format)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (summaryType != null) __obj.updateDynamic("summaryType")(summaryType.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryRowsSummaryColumn]
  }
}

