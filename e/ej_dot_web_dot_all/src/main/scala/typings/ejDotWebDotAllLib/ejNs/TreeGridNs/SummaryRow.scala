package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SummaryRow extends js.Object {
  /** Specifies the summary columns in the summary rows.
    */
  var summaryColumns: js.UndefOr[js.Array[SummaryRowsSummaryColumn]] = js.undefined
  /** Specifies the title for summary row collection in TreeGrid
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object SummaryRow {
  @scala.inline
  def apply(summaryColumns: js.Array[SummaryRowsSummaryColumn] = null, title: java.lang.String = null): SummaryRow = {
    val __obj = js.Dynamic.literal()
    if (summaryColumns != null) __obj.updateDynamic("summaryColumns")(summaryColumns)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[SummaryRow]
  }
}

