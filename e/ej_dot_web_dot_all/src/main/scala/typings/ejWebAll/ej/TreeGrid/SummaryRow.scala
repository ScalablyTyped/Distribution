package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummaryRow extends js.Object {
  /** Specifies the summary columns in the summary rows.
    */
  var summaryColumns: js.UndefOr[js.Array[SummaryRowsSummaryColumn]] = js.native
  /** Specifies the title for summary row collection in TreeGrid
    */
  var title: js.UndefOr[String] = js.native
}

object SummaryRow {
  @scala.inline
  def apply(): SummaryRow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummaryRow]
  }
  @scala.inline
  implicit class SummaryRowOps[Self <: SummaryRow] (val x: Self) extends AnyVal {
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
    def setSummaryColumnsVarargs(value: SummaryRowsSummaryColumn*): Self = this.set("summaryColumns", js.Array(value :_*))
    @scala.inline
    def setSummaryColumns(value: js.Array[SummaryRowsSummaryColumn]): Self = this.set("summaryColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryColumns: Self = this.set("summaryColumns", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

