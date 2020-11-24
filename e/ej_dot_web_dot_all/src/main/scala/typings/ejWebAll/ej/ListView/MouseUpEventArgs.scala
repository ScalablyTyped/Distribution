package typings.ejWebAll.ej.ListView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MouseUpEventArgs extends js.Object {
  
  /** returns true if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** returns the list of checked items.
    */
  var checkedItems: js.UndefOr[Double] = js.native
  
  /** returns the current checked item text.
    */
  var checkedItemsText: js.UndefOr[String] = js.native
  
  /** If the child element exist return true; otherwise, false.
    */
  var hasChild: js.UndefOr[Boolean] = js.native
  
  /** returns the current Index of the item.
    */
  var index: js.UndefOr[Double] = js.native
  
  /** If checked return true; otherwise, false.
    */
  var isChecked: js.UndefOr[Boolean] = js.native
  
  /** returns the current list item.
    */
  var item: js.UndefOr[String] = js.native
  
  /** returns the model value of the control.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** returns the current text of item.
    */
  var text: js.UndefOr[String] = js.native
  
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object MouseUpEventArgs {
  
  @scala.inline
  def apply(): MouseUpEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MouseUpEventArgs]
  }
  
  @scala.inline
  implicit class MouseUpEventArgsOps[Self <: MouseUpEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCheckedItems(value: Double): Self = this.set("checkedItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedItems: Self = this.set("checkedItems", js.undefined)
    
    @scala.inline
    def setCheckedItemsText(value: String): Self = this.set("checkedItemsText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCheckedItemsText: Self = this.set("checkedItemsText", js.undefined)
    
    @scala.inline
    def setHasChild(value: Boolean): Self = this.set("hasChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasChild: Self = this.set("hasChild", js.undefined)
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndex: Self = this.set("index", js.undefined)
    
    @scala.inline
    def setIsChecked(value: Boolean): Self = this.set("isChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsChecked: Self = this.set("isChecked", js.undefined)
    
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItem: Self = this.set("item", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
