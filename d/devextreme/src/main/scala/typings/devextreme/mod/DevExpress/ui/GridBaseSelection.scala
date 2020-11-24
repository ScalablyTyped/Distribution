package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.multiple
import typings.devextreme.devextremeStrings.none
import typings.devextreme.devextremeStrings.single_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridBaseSelection extends js.Object {
  
  /**
    * [descr:GridBase.Options.selection.allowSelectAll]
    */
  var allowSelectAll: js.UndefOr[Boolean] = js.native
  
  /**
    * [descr:GridBase.Options.selection.mode]
    */
  var mode: js.UndefOr[multiple | none | single_] = js.native
}
object GridBaseSelection {
  
  @scala.inline
  def apply(): GridBaseSelection = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridBaseSelection]
  }
  
  @scala.inline
  implicit class GridBaseSelectionOps[Self <: GridBaseSelection] (val x: Self) extends AnyVal {
    
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
    def setAllowSelectAll(value: Boolean): Self = this.set("allowSelectAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowSelectAll: Self = this.set("allowSelectAll", js.undefined)
    
    @scala.inline
    def setMode(value: multiple | none | single_): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
