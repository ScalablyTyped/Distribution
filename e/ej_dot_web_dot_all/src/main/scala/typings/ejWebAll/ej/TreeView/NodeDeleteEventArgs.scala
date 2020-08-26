package typings.ejWebAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeDeleteEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns the event object
    */
  var event: js.UndefOr[js.Any] = js.native
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.native
  /** returns the given parent node details
    */
  var parentDetails: js.UndefOr[js.Any] = js.native
  /** returns the current parent element of the deleted node
    */
  var parentElement: js.UndefOr[js.Any] = js.native
  /** returns the currently removed nodes
    */
  var removedNodes: js.UndefOr[js.Array[_]] = js.native
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}

object NodeDeleteEventArgs {
  @scala.inline
  def apply(): NodeDeleteEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeDeleteEventArgs]
  }
  @scala.inline
  implicit class NodeDeleteEventArgsOps[Self <: NodeDeleteEventArgs] (val x: Self) extends AnyVal {
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
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setParentDetails(value: js.Any): Self = this.set("parentDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentDetails: Self = this.set("parentDetails", js.undefined)
    @scala.inline
    def setParentElement(value: js.Any): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentElement: Self = this.set("parentElement", js.undefined)
    @scala.inline
    def setRemovedNodesVarargs(value: js.Any*): Self = this.set("removedNodes", js.Array(value :_*))
    @scala.inline
    def setRemovedNodes(value: js.Array[_]): Self = this.set("removedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemovedNodes: Self = this.set("removedNodes", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

