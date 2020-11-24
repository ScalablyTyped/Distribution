package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.devextremeStrings.standard
import typings.devextreme.devextremeStrings.virtual
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxTreeListScrolling extends GridBaseScrolling {
  
  /**
    * [descr:dxTreeList.Options.scrolling.mode]
    */
  var mode: js.UndefOr[standard | virtual] = js.native
}
object dxTreeListScrolling {
  
  @scala.inline
  def apply(): dxTreeListScrolling = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxTreeListScrolling]
  }
  
  @scala.inline
  implicit class dxTreeListScrollingOps[Self <: dxTreeListScrolling] (val x: Self) extends AnyVal {
    
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
    def setMode(value: standard | virtual): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
  }
}
