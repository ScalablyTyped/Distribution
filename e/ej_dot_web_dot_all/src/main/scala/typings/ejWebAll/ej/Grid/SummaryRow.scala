package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryRow extends js.Object {
  /** Gets or sets a value that indicates whether to show the summary value within the group caption area for the corresponding summary column while grouping the column
    * @Default {false}
    */
  var showCaptionSummary: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to show the group summary value for the corresponding summary column while grouping a column
    * @Default {false}
    */
  var showGroupSummary: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to show the total summary value the for the corresponding summary column. The summary row is added after the grid content.
    * @Default {true}
    */
  var showTotalSummary: js.UndefOr[Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to add summary columns into the summary rows.
    * @Default {[]}
    */
  var summaryColumns: js.UndefOr[js.Array[SummaryRowsSummaryColumn]] = js.undefined
  /** This specifies the grid to show the title for the summary rows.
    */
  var title: js.UndefOr[String] = js.undefined
  /** This specifies the grid to show the title of summary row in the specified column.
    * @Default {null}
    */
  var titleColumn: js.UndefOr[String] = js.undefined
}

object SummaryRow {
  @scala.inline
  def apply(
    showCaptionSummary: js.UndefOr[Boolean] = js.undefined,
    showGroupSummary: js.UndefOr[Boolean] = js.undefined,
    showTotalSummary: js.UndefOr[Boolean] = js.undefined,
    summaryColumns: js.Array[SummaryRowsSummaryColumn] = null,
    title: String = null,
    titleColumn: String = null
  ): SummaryRow = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showCaptionSummary)) __obj.updateDynamic("showCaptionSummary")(showCaptionSummary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showGroupSummary)) __obj.updateDynamic("showGroupSummary")(showGroupSummary.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showTotalSummary)) __obj.updateDynamic("showTotalSummary")(showTotalSummary.get.asInstanceOf[js.Any])
    if (summaryColumns != null) __obj.updateDynamic("summaryColumns")(summaryColumns.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (titleColumn != null) __obj.updateDynamic("titleColumn")(titleColumn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SummaryRow]
  }
}

