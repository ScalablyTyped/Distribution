package typings.ejWebAll.ej.FileExplorer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuClickEventArgs extends js.Object {
  /** returns the ID of clicked ContextMenu item.
    */
  var ID: js.UndefOr[String] = js.native
  /** set to true when the event has to be canceled, else false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns the name of ContextMenu items group.
    */
  var contextMenu: js.UndefOr[String] = js.native
  /** returns the element of clicked ContextMenu item.
    */
  var element: js.UndefOr[js.Any] = js.native
  /** returns the event of ContextMenu.
    */
  var event: js.UndefOr[js.Any] = js.native
  /** returns the FileExplorer model.
    */
  var model: js.UndefOr[Model] = js.native
  /** returns the parent element ID of clicked ContextMenu item.
    */
  var parentId: js.UndefOr[String] = js.native
  /** returns the parent element text of clicked ContextMenu item.
    */
  var parentText: js.UndefOr[String] = js.native
  /** returns the text of clicked ContextMenu item.
    */
  var text: js.UndefOr[String] = js.native
  /** returns the name of the event.
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
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteID: Self = this.set("ID", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setContextMenu(value: String): Self = this.set("contextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContextMenu: Self = this.set("contextMenu", js.undefined)
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
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

