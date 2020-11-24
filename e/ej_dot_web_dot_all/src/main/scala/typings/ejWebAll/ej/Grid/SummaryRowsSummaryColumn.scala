package typings.ejWebAll.ej.Grid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SummaryRowsSummaryColumn extends js.Object {
  
  /** Gets or sets a value that indicates the text displayed in the summary column as a value
    * @Default {null}
    */
  var customSummaryValue: js.UndefOr[String] = js.native
  
  /** This specifies summary column used to perform the summary calculation
    * @Default {null}
    */
  var dataMember: js.UndefOr[String] = js.native
  
  /** Gets or sets a value that indicates to define the target column at which to display the summary.
    * @Default {null}
    */
  var displayColumn: js.UndefOr[String] = js.native
  
  /** Gets or sets a value that indicates the format for the text applied on the column
    * @Default {null}
    */
  var format: js.UndefOr[String] = js.native
  
  /** Gets or sets a value that indicates the text displayed before the summary column value
    * @Default {null}
    */
  var prefix: js.UndefOr[String] = js.native
  
  /** Gets or sets a value that indicates the text displayed after the summary column value
    * @Default {null}
    */
  var suffix: js.UndefOr[String] = js.native
  
  /** Gets or sets a value that indicates the type of calculations to be performed for the corresponding summary column. See summaryType.
    * @Default {[]}
    */
  var summaryType: js.UndefOr[SummaryType | String] = js.native
  
  /** Gets or sets a value that indicates to add the template for the summary value of dataMember given.
    * @Default {null}
    */
  var template: js.UndefOr[String] = js.native
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
    
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
  }
}
