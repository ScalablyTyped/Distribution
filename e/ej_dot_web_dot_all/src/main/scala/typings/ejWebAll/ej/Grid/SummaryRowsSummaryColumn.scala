package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryRowsSummaryColumn extends js.Object {
  /** Gets or sets a value that indicates the text displayed in the summary column as a value
    * @Default {null}
    */
  var customSummaryValue: js.UndefOr[String] = js.undefined
  /** This specifies summary column used to perform the summary calculation
    * @Default {null}
    */
  var dataMember: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates to define the target column at which to display the summary.
    * @Default {null}
    */
  var displayColumn: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates the format for the text applied on the column
    * @Default {null}
    */
  var format: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates the text displayed before the summary column value
    * @Default {null}
    */
  var prefix: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates the text displayed after the summary column value
    * @Default {null}
    */
  var suffix: js.UndefOr[String] = js.undefined
  /** Gets or sets a value that indicates the type of calculations to be performed for the corresponding summary column. See summaryType.
    * @Default {[]}
    */
  var summaryType: js.UndefOr[SummaryType | String] = js.undefined
  /** Gets or sets a value that indicates to add the template for the summary value of dataMember given.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.undefined
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
    summaryType: SummaryType | String = null,
    template: String = null
  ): SummaryRowsSummaryColumn = {
    val __obj = js.Dynamic.literal()
    if (customSummaryValue != null) __obj.updateDynamic("customSummaryValue")(customSummaryValue.asInstanceOf[js.Any])
    if (dataMember != null) __obj.updateDynamic("dataMember")(dataMember.asInstanceOf[js.Any])
    if (displayColumn != null) __obj.updateDynamic("displayColumn")(displayColumn.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (prefix != null) __obj.updateDynamic("prefix")(prefix.asInstanceOf[js.Any])
    if (suffix != null) __obj.updateDynamic("suffix")(suffix.asInstanceOf[js.Any])
    if (summaryType != null) __obj.updateDynamic("summaryType")(summaryType.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryRowsSummaryColumn]
  }
}

