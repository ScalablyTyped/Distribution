package typings.devextreme.anon

import typings.devextreme.devextremeStrings.auto
import typings.devextreme.devextremeStrings.onClick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ApplyFilter extends js.Object {
  
  var applyFilter: js.UndefOr[auto | onClick] = js.native
  
  var applyFilterText: js.UndefOr[String] = js.native
  
  var betweenEndText: js.UndefOr[String] = js.native
  
  var betweenStartText: js.UndefOr[String] = js.native
  
  var operationDescriptions: js.UndefOr[Between] = js.native
  
  var resetOperationText: js.UndefOr[String] = js.native
  
  var showAllText: js.UndefOr[String] = js.native
  
  var showOperationChooser: js.UndefOr[Boolean] = js.native
  
  var visible: js.UndefOr[Boolean] = js.native
}
object ApplyFilter {
  
  @scala.inline
  def apply(): ApplyFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ApplyFilter]
  }
  
  @scala.inline
  implicit class ApplyFilterOps[Self <: ApplyFilter] (val x: Self) extends AnyVal {
    
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
    def setApplyFilter(value: auto | onClick): Self = this.set("applyFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyFilter: Self = this.set("applyFilter", js.undefined)
    
    @scala.inline
    def setApplyFilterText(value: String): Self = this.set("applyFilterText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplyFilterText: Self = this.set("applyFilterText", js.undefined)
    
    @scala.inline
    def setBetweenEndText(value: String): Self = this.set("betweenEndText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBetweenEndText: Self = this.set("betweenEndText", js.undefined)
    
    @scala.inline
    def setBetweenStartText(value: String): Self = this.set("betweenStartText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBetweenStartText: Self = this.set("betweenStartText", js.undefined)
    
    @scala.inline
    def setOperationDescriptions(value: Between): Self = this.set("operationDescriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOperationDescriptions: Self = this.set("operationDescriptions", js.undefined)
    
    @scala.inline
    def setResetOperationText(value: String): Self = this.set("resetOperationText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetOperationText: Self = this.set("resetOperationText", js.undefined)
    
    @scala.inline
    def setShowAllText(value: String): Self = this.set("showAllText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowAllText: Self = this.set("showAllText", js.undefined)
    
    @scala.inline
    def setShowOperationChooser(value: Boolean): Self = this.set("showOperationChooser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowOperationChooser: Self = this.set("showOperationChooser", js.undefined)
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
}
