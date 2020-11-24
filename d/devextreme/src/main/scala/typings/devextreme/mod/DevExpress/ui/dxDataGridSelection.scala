package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.allPages
import typings.devextreme.devextremeStrings.always
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.onClick
import typings.devextreme.devextremeStrings.onLongTap
import typings.devextreme.devextremeStrings.page
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDataGridSelection extends GridBaseSelection {
  
  /**
    * [descr:dxDataGrid.Options.selection.deferred]
    */
  var deferred: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:dxDataGrid.Options.selection.selectAllMode]
    */
  var selectAllMode: js.UndefOr[allPages | page] = js.native
  
  /**
    * [descr:dxDataGrid.Options.selection.showCheckBoxesMode]
    */
  var showCheckBoxesMode: js.UndefOr[always | none | onClick | onLongTap] = js.native
}
object dxDataGridSelection {
  
  @scala.inline
  def apply(): dxDataGridSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDataGridSelection]
  }
  
  @scala.inline
  implicit class dxDataGridSelectionOps[Self <: dxDataGridSelection] (val x: Self) extends AnyVal {
    
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
    def setDeferred(value: Boolean): Self = this.set("deferred", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeferred: Self = this.set("deferred", js.undefined)
    
    @scala.inline
    def setSelectAllMode(value: allPages | page): Self = this.set("selectAllMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectAllMode: Self = this.set("selectAllMode", js.undefined)
    
    @scala.inline
    def setShowCheckBoxesMode(value: always | none | onClick | onLongTap): Self = this.set("showCheckBoxesMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowCheckBoxesMode: Self = this.set("showCheckBoxesMode", js.undefined)
  }
}
