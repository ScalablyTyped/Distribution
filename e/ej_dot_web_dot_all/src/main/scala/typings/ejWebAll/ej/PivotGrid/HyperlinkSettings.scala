package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HyperlinkSettings extends js.Object {
  
  /** Allows you to enable/disable the hyperlink for the column header.
    * @Default {false}
    */
  var enableColumnHeaderHyperlink: js.UndefOr[Boolean] = js.native
  
  /** Allows you to enable/disable the hyperlink for the row header.
    * @Default {false}
    */
  var enableRowHeaderHyperlink: js.UndefOr[Boolean] = js.native
  
  /** Allows you to enable/disable the hyperlink for summary cells.
    * @Default {false}
    */
  var enableSummaryCellHyperlink: js.UndefOr[Boolean] = js.native
  
  /** Allows you to enable/disable the hyperlink for value cells.
    * @Default {false}
    */
  var enableValueCellHyperlink: js.UndefOr[Boolean] = js.native
}
object HyperlinkSettings {
  
  @scala.inline
  def apply(): HyperlinkSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HyperlinkSettings]
  }
  
  @scala.inline
  implicit class HyperlinkSettingsOps[Self <: HyperlinkSettings] (val x: Self) extends AnyVal {
    
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
    def setEnableColumnHeaderHyperlink(value: Boolean): Self = this.set("enableColumnHeaderHyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableColumnHeaderHyperlink: Self = this.set("enableColumnHeaderHyperlink", js.undefined)
    
    @scala.inline
    def setEnableRowHeaderHyperlink(value: Boolean): Self = this.set("enableRowHeaderHyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRowHeaderHyperlink: Self = this.set("enableRowHeaderHyperlink", js.undefined)
    
    @scala.inline
    def setEnableSummaryCellHyperlink(value: Boolean): Self = this.set("enableSummaryCellHyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSummaryCellHyperlink: Self = this.set("enableSummaryCellHyperlink", js.undefined)
    
    @scala.inline
    def setEnableValueCellHyperlink(value: Boolean): Self = this.set("enableValueCellHyperlink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableValueCellHyperlink: Self = this.set("enableValueCellHyperlink", js.undefined)
  }
}
