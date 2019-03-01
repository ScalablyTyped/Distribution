package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryRowsSummaryColumn extends js.Object {
  /** Specifies the custom summary calculate function or text.
    */
  var customSummaryValue: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies summary column used to perform the summary calculation.
    */
  var dataMember: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the required column to display the summary.
    */
  var displayColumn: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the format to be applied on the summary column value.
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the text to be displayed before the summary column value.
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the text to be displayed after the summary column value.
    */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the summary type to perform calculations in a corresponding summary column. See summaryType.
    */
  var summaryType: js.UndefOr[SummaryType | java.lang.String] = js.undefined
}

object SummaryRowsSummaryColumn {
  @scala.inline
  def apply(
    customSummaryValue: java.lang.String = null,
    dataMember: java.lang.String = null,
    displayColumn: java.lang.String = null,
    format: java.lang.String = null,
    prefix: java.lang.String = null,
    suffix: java.lang.String = null,
    summaryType: SummaryType | java.lang.String = null
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

