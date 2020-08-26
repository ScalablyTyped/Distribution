package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupChangeEventArgs extends js.Object {
  /** parameter returns the cause of group change("group", unGroup")
    */
  var cause: js.UndefOr[String] = js.native
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  /** parameter returns the object that is added to/removed from a group
    */
  var element: js.UndefOr[js.Any] = js.native
  /** parameter returns the new parent group(if any) of the object
    */
  var newParent: js.UndefOr[js.Any] = js.native
  /** parameter returns the old parent group(if any) of the object
    */
  var oldParent: js.UndefOr[js.Any] = js.native
}

object GroupChangeEventArgs {
  @scala.inline
  def apply(): GroupChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupChangeEventArgs]
  }
  @scala.inline
  implicit class GroupChangeEventArgsOps[Self <: GroupChangeEventArgs] (val x: Self) extends AnyVal {
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
    def setCause(value: String): Self = this.set("cause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCause: Self = this.set("cause", js.undefined)
    @scala.inline
    def setDiagramId(value: String): Self = this.set("diagramId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagramId: Self = this.set("diagramId", js.undefined)
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setNewParent(value: js.Any): Self = this.set("newParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewParent: Self = this.set("newParent", js.undefined)
    @scala.inline
    def setOldParent(value: js.Any): Self = this.set("oldParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOldParent: Self = this.set("oldParent", js.undefined)
  }
  
}

