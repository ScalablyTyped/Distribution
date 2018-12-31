package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryRow extends js.Object {
  /** Gets or sets a value that indicates whether to show the summary value within the group caption area for the corresponding summary column while grouping the column
    * @Default {false}
    */
  var showCaptionSummary: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to show the group summary value for the corresponding summary column while grouping a column
    * @Default {false}
    */
  var showGroupSummary: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to show the total summary value the for the corresponding summary column. The summary row is added after the grid content.
    * @Default {true}
    */
  var showTotalSummary: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets or sets a value that indicates whether to add summary columns into the summary rows.
    * @Default {[]}
    */
  var summaryColumns: js.UndefOr[js.Array[SummaryRowsSummaryColumn]] = js.undefined
  /** This specifies the grid to show the title for the summary rows.
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** This specifies the grid to show the title of summary row in the specified column.
    * @Default {null}
    */
  var titleColumn: js.UndefOr[java.lang.String] = js.undefined
}

