package typings.ejWebAll.ej.SplitButton

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemSelectedEventArgs extends js.Object {
  
  /** returns the cancel option value
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns the clicked menu item element
    */
  var element: js.UndefOr[js.Any] = js.native
  
  /** return the menu id
    */
  var menuId: js.UndefOr[String] = js.native
  
  /** return the clicked menu item text
    */
  var menuText: js.UndefOr[String] = js.native
  
  /** returns the split button model
    */
  var model: js.UndefOr[Model] = js.native
  
  /** returns the selected item
    */
  var selectedItem: js.UndefOr[js.Any] = js.native
  
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}
object ItemSelectedEventArgs {
  
  @scala.inline
  def apply(): ItemSelectedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemSelectedEventArgs]
  }
  
  @scala.inline
  implicit class ItemSelectedEventArgsOps[Self <: ItemSelectedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setMenuId(value: String): Self = this.set("menuId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuId: Self = this.set("menuId", js.undefined)
    
    @scala.inline
    def setMenuText(value: String): Self = this.set("menuText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuText: Self = this.set("menuText", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setSelectedItem(value: js.Any): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedItem: Self = this.set("selectedItem", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
