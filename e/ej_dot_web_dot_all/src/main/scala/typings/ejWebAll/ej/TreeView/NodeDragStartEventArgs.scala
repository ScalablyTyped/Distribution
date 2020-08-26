package typings.ejWebAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeDragStartEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns the original drag target
    */
  var dragTarget: js.UndefOr[js.Any] = js.native
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.native
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.native
  /** returns the current dragging parent TreeView node
    */
  var parentElement: js.UndefOr[js.Any] = js.native
  /** returns the current dragging parent TreeView node details
    */
  var parentElementData: js.UndefOr[js.Any] = js.native
  /** returns the current parent element of the dragging node
    */
  var target: js.UndefOr[js.Any] = js.native
  /** returns the given parent node details
    */
  var targetElementData: js.UndefOr[js.Any] = js.native
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}

object NodeDragStartEventArgs {
  @scala.inline
  def apply(): NodeDragStartEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeDragStartEventArgs]
  }
  @scala.inline
  implicit class NodeDragStartEventArgsOps[Self <: NodeDragStartEventArgs] (val x: Self) extends AnyVal {
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
    def setDragTarget(value: js.Any): Self = this.set("dragTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragTarget: Self = this.set("dragTarget", js.undefined)
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setParentElement(value: js.Any): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentElement: Self = this.set("parentElement", js.undefined)
    @scala.inline
    def setParentElementData(value: js.Any): Self = this.set("parentElementData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentElementData: Self = this.set("parentElementData", js.undefined)
    @scala.inline
    def setTarget(value: js.Any): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTargetElementData(value: js.Any): Self = this.set("targetElementData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetElementData: Self = this.set("targetElementData", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

