package typings.ejWebAll.ej.TreeView

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NodeSelectEventArgs extends js.Object {
  /** if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns the current element of the node clicked
    */
  var currentElement: js.UndefOr[js.Any] = js.native
  /** returns the id of the current element of the node clicked
    */
  var id: js.UndefOr[js.Any] = js.native
  /** returns the TreeView model
    */
  var model: js.UndefOr[Model] = js.native
  /** returns the id of the parent element of current element of the node clicked
    */
  var parentId: js.UndefOr[js.Any] = js.native
  /** returns the current selected nodes index of TreeView
    */
  var selectedNodes: js.UndefOr[js.Array[_]] = js.native
  /** returns the name of the event
    */
  var `type`: js.UndefOr[String] = js.native
  /** returns the value of the node
    */
  var value: js.UndefOr[String] = js.native
}

object NodeSelectEventArgs {
  @scala.inline
  def apply(): NodeSelectEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NodeSelectEventArgs]
  }
  @scala.inline
  implicit class NodeSelectEventArgsOps[Self <: NodeSelectEventArgs] (val x: Self) extends AnyVal {
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
    def setCurrentElement(value: js.Any): Self = this.set("currentElement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentElement: Self = this.set("currentElement", js.undefined)
    @scala.inline
    def setId(value: js.Any): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setModel(value: Model): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setParentId(value: js.Any): Self = this.set("parentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentId: Self = this.set("parentId", js.undefined)
    @scala.inline
    def setSelectedNodesVarargs(value: js.Any*): Self = this.set("selectedNodes", js.Array(value :_*))
    @scala.inline
    def setSelectedNodes(value: js.Array[_]): Self = this.set("selectedNodes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedNodes: Self = this.set("selectedNodes", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

