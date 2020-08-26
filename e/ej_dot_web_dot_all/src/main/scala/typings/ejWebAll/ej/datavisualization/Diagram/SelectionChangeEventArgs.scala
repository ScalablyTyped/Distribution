package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionChangeEventArgs extends js.Object {
  /** parameter to specify whether or not to cancel the selection change event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** parameter returns the actual cause of the event
    */
  var cause: js.UndefOr[String] = js.native
  /** parameter returns whether the item is selected or removed selection
    */
  var changeType: js.UndefOr[String] = js.native
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  /** parameter returns the item which is selected or to be selected
    */
  var element: js.UndefOr[js.Any] = js.native
  /** parameter returns the collection of nodes and connectors that have to be added to selection list
    */
  var newItems: js.UndefOr[js.Array[_]] = js.native
  /** parameter returns the collection of nodes and connectors that have to be removed from selection list
    */
  var oldItems: js.UndefOr[js.Array[_]] = js.native
  /** parameter returns the collection of nodes and connectors that will be selected after selection change
    */
  var selectedItems: js.UndefOr[js.Array[_]] = js.native
  /** triggers before and after adding the selection to the object in the diagram which can be differentiated through `state` argument. We can cancel the event only before the selection
    * of the object.
    */
  var state: js.UndefOr[String] = js.native
}

object SelectionChangeEventArgs {
  @scala.inline
  def apply(): SelectionChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionChangeEventArgs]
  }
  @scala.inline
  implicit class SelectionChangeEventArgsOps[Self <: SelectionChangeEventArgs] (val x: Self) extends AnyVal {
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
    def setCause(value: String): Self = this.set("cause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCause: Self = this.set("cause", js.undefined)
    @scala.inline
    def setChangeType(value: String): Self = this.set("changeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChangeType: Self = this.set("changeType", js.undefined)
    @scala.inline
    def setDiagramId(value: String): Self = this.set("diagramId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagramId: Self = this.set("diagramId", js.undefined)
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setNewItemsVarargs(value: js.Any*): Self = this.set("newItems", js.Array(value :_*))
    @scala.inline
    def setNewItems(value: js.Array[_]): Self = this.set("newItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewItems: Self = this.set("newItems", js.undefined)
    @scala.inline
    def setOldItemsVarargs(value: js.Any*): Self = this.set("oldItems", js.Array(value :_*))
    @scala.inline
    def setOldItems(value: js.Array[_]): Self = this.set("oldItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldItems: Self = this.set("oldItems", js.undefined)
    @scala.inline
    def setSelectedItemsVarargs(value: js.Any*): Self = this.set("selectedItems", js.Array(value :_*))
    @scala.inline
    def setSelectedItems(value: js.Array[_]): Self = this.set("selectedItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedItems: Self = this.set("selectedItems", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

