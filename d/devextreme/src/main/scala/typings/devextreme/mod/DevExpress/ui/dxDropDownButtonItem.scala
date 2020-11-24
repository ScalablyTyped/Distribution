package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.anon.EventModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDropDownButtonItem extends dxListItem {
  
  /**
    * [descr:dxDropDownButtonItem.onClick]
    */
  var onClick: js.UndefOr[(js.Function1[/* e */ EventModel, _]) | String] = js.native
}
object dxDropDownButtonItem {
  
  @scala.inline
  def apply(): dxDropDownButtonItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[dxDropDownButtonItem]
  }
  
  @scala.inline
  implicit class dxDropDownButtonItemOps[Self <: dxDropDownButtonItem] (val x: Self) extends AnyVal {
    
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
    def setOnClickFunction1(value: /* e */ EventModel => _): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClick(value: (js.Function1[/* e */ EventModel, _]) | String): Self = this.set("onClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
  }
}
