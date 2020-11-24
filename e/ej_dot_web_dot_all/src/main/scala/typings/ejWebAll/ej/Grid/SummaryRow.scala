package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SummaryRow extends js.Object {
  
  /** Gets or sets a value that indicates whether to show the summary value within the group caption area for the corresponding summary column while grouping the column
    * @Default {false}
    */
  var showCaptionSummary: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to show the group summary value for the corresponding summary column while grouping a column
    * @Default {false}
    */
  var showGroupSummary: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to show the total summary value the for the corresponding summary column. The summary row is added after the grid content.
    * @Default {true}
    */
  var showTotalSummary: js.UndefOr[Boolean] = js.native
  
  /** Gets or sets a value that indicates whether to add summary columns into the summary rows.
    * @Default {[]}
    */
  var summaryColumns: js.UndefOr[js.Array[SummaryRowsSummaryColumn]] = js.native
  
  /** This specifies the grid to show the title for the summary rows.
    */
  var title: js.UndefOr[String] = js.native
  
  /** This specifies the grid to show the title of summary row in the specified column.
    * @Default {null}
    */
  var titleColumn: js.UndefOr[String] = js.native
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
    def setShowCaptionSummary(value: Boolean): Self = this.set("showCaptionSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCaptionSummary: Self = this.set("showCaptionSummary", js.undefined)
    
    @scala.inline
    def setShowGroupSummary(value: Boolean): Self = this.set("showGroupSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowGroupSummary: Self = this.set("showGroupSummary", js.undefined)
    
    @scala.inline
    def setShowTotalSummary(value: Boolean): Self = this.set("showTotalSummary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowTotalSummary: Self = this.set("showTotalSummary", js.undefined)
    
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
    
    @scala.inline
    def setTitleColumn(value: String): Self = this.set("titleColumn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitleColumn: Self = this.set("titleColumn", js.undefined)
  }
}
