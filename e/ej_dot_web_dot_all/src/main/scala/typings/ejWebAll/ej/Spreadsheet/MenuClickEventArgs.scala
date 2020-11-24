package typings.ejWebAll.ej.Spreadsheet

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuClickEventArgs extends js.Object {
  
  /** Returns the cancel option value.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  
  /** Returns menu click element.
    */
  var element: js.UndefOr[HTMLElement] = js.native
  
  /** Returns the event information.
    */
  var event: js.UndefOr[js.Any] = js.native
  
  /** Returns the Spreadsheet model.
    */
  var model: js.UndefOr[Model] = js.native
  
  /** Returns target element parent Id.
    */
  var parentId: js.UndefOr[String] = js.native
  
  /** Returns target element parent text.
    */
  var parentText: js.UndefOr[String] = js.native
  
  /** Returns target element text.
    */
  var text: js.UndefOr[String] = js.native
  
  /** Returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}
object MenuClickEventArgs {
  
  @scala.inline
  def apply(): MenuClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuClickEventArgs]
  }
  
  @scala.inline
  implicit class MenuClickEventArgsOps[Self <: MenuClickEventArgs] (val x: Self) extends AnyVal {
    
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
    def setElement(value: HTMLElement): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    
    @scala.inline
    def setParentText(value: String): Self = this.set("parentText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentText: Self = this.set("parentText", js.undefined)
    
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
