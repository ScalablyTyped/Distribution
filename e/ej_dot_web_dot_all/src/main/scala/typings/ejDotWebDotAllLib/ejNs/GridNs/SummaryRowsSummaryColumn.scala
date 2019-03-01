package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryRowsSummaryColumn extends js.Object {
  /** Gets or sets a value that indicates the text displayed in the summary column as a value
    * @Default {null}
    */
  var customSummaryValue: js.UndefOr[java.lang.String] = js.undefined
  /** This specifies summary column used to perform the summary calculation
    * @Default {null}
    */
  var dataMember: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to define the target column at which to display the summary.
    * @Default {null}
    */
  var displayColumn: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates the format for the text applied on the column
    * @Default {null}
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates the text displayed before the summary column value
    * @Default {null}
    */
  var prefix: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates the text displayed after the summary column value
    * @Default {null}
    */
  var suffix: js.UndefOr[java.lang.String] = js.undefined
  /** Gets or sets a value that indicates the type of calculations to be performed for the corresponding summary column. See summaryType.
    * @Default {[]}
    */
  var summaryType: js.UndefOr[SummaryType | java.lang.String] = js.undefined
  /** Gets or sets a value that indicates to add the template for the summary value of dataMember given.
    * @Default {null}
    */
  var template: js.UndefOr[java.lang.String] = js.undefined
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
    summaryType: SummaryType | java.lang.String = null,
    template: java.lang.String = null
  ): SummaryRowsSummaryColumn = {
    val __obj = js.Dynamic.literal()
    if (customSummaryValue != null) __obj.updateDynamic("customSummaryValue")(customSummaryValue)
    if (dataMember != null) __obj.updateDynamic("dataMember")(dataMember)
    if (displayColumn != null) __obj.updateDynamic("displayColumn")(displayColumn)
    if (format != null) __obj.updateDynamic("format")(format)
    if (prefix != null) __obj.updateDynamic("prefix")(prefix)
    if (suffix != null) __obj.updateDynamic("suffix")(suffix)
    if (summaryType != null) __obj.updateDynamic("summaryType")(summaryType.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[SummaryRowsSummaryColumn]
  }
}

