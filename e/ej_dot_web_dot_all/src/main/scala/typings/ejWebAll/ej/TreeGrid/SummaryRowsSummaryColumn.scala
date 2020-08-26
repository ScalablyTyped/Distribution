package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SummaryRowsSummaryColumn extends js.Object {
  /** Specifies the custom summary calculate function or text.
    */
  var customSummaryValue: js.UndefOr[String] = js.native
  /** Specifies summary column used to perform the summary calculation.
    */
  var dataMember: js.UndefOr[String] = js.native
  /** Specifies the required column to display the summary.
    */
  var displayColumn: js.UndefOr[String] = js.native
  /** Specifies the format to be applied on the summary column value.
    */
  var format: js.UndefOr[String] = js.native
  /** Specifies the text to be displayed before the summary column value.
    */
  var prefix: js.UndefOr[String] = js.native
  /** Specifies the text to be displayed after the summary column value.
    */
  var suffix: js.UndefOr[String] = js.native
  /** Specifies the summary type to perform calculations in a corresponding summary column. See summaryType.
    */
  var summaryType: js.UndefOr[SummaryType | String] = js.native
}

object SummaryRowsSummaryColumn {
  @scala.inline
  def apply(): SummaryRowsSummaryColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SummaryRowsSummaryColumn]
  }
  @scala.inline
  implicit class SummaryRowsSummaryColumnOps[Self <: SummaryRowsSummaryColumn] (val x: Self) extends AnyVal {
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
    def setCustomSummaryValue(value: String): Self = this.set("customSummaryValue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomSummaryValue: Self = this.set("customSummaryValue", js.undefined)
    @scala.inline
    def setDataMember(value: String): Self = this.set("dataMember", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataMember: Self = this.set("dataMember", js.undefined)
    @scala.inline
    def setDisplayColumn(value: String): Self = this.set("displayColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayColumn: Self = this.set("displayColumn", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSuffix(value: String): Self = this.set("suffix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuffix: Self = this.set("suffix", js.undefined)
    @scala.inline
    def setSummaryType(value: SummaryType | String): Self = this.set("summaryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSummaryType: Self = this.set("summaryType", js.undefined)
  }
  
}

