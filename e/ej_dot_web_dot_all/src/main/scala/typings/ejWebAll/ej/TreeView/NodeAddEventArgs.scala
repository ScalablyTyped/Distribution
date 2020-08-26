package typings.ejWebAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeAddEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns the added data, that are given initially
    */
  var data: js.UndefOr[js.Any] = js.native
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.native
  /** returns the newly added elements
    */
  var nodes: js.UndefOr[js.Any] = js.native
  /** returns the given parent node details
    */
  var parentDetails: js.UndefOr[js.Any] = js.native
  /** returns the target parent element of the added element
    */
  var parentElement: js.UndefOr[js.Any] = js.native
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
}

object NodeAddEventArgs {
  @scala.inline
  def apply(): NodeAddEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeAddEventArgs]
  }
  @scala.inline
  implicit class NodeAddEventArgsOps[Self <: NodeAddEventArgs] (val x: Self) extends AnyVal {
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
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setNodes(value: js.Any): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodes: Self = this.set("nodes", js.undefined)
    @scala.inline
    def setParentDetails(value: js.Any): Self = this.set("parentDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentDetails: Self = this.set("parentDetails", js.undefined)
    @scala.inline
    def setParentElement(value: js.Any): Self = this.set("parentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentElement: Self = this.set("parentElement", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

