package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContextMenuClickEventArgs extends js.Object {
  /** parameter defines whether to execute the click event or not
    */
  var canExecute: js.UndefOr[Boolean] = js.native
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  /** parameter returns the element of the object that was clicked
    */
  var element: js.UndefOr[js.Any] = js.native
  /** parameter returns the model of the diagram
    */
  var events: js.UndefOr[js.Any] = js.native
  /** parameter returns the id of the selected context menu item
    */
  var id: js.UndefOr[String] = js.native
  /** parameter returns the parent id of the selected context menu item
    */
  var parentId: js.UndefOr[String] = js.native
  /** parameter returns the parent text of the selected context menu item
    */
  var parentText: js.UndefOr[String] = js.native
  /** parameter returns the object that is selected
    */
  var selectedItem: js.UndefOr[js.Any] = js.native
  /** parameter returns the object that was clicked
    */
  var target: js.UndefOr[js.Any] = js.native
  /** parameter returns the text of the selected context menu item
    */
  var text: js.UndefOr[String] = js.native
}

object ContextMenuClickEventArgs {
  @scala.inline
  def apply(): ContextMenuClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ContextMenuClickEventArgs]
  }
  @scala.inline
  implicit class ContextMenuClickEventArgsOps[Self <: ContextMenuClickEventArgs] (val x: Self) extends AnyVal {
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
    def setCanExecute(value: Boolean): Self = this.set("canExecute", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanExecute: Self = this.set("canExecute", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setDiagramId(value: String): Self = this.set("diagramId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagramId: Self = this.set("diagramId", js.undefined)
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setEvents(value: js.Any): Self = this.set("events", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvents: Self = this.set("events", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setParentId(value: String): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    @scala.inline
    def setParentText(value: String): Self = this.set("parentText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentText: Self = this.set("parentText", js.undefined)
    @scala.inline
    def setSelectedItem(value: js.Any): Self = this.set("selectedItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItem: Self = this.set("selectedItem", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

