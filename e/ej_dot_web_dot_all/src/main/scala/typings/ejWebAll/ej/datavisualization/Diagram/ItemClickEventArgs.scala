package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ItemClickEventArgs extends js.Object {
  /** parameter returns the object that was actually clicked
    */
  var actualObject: js.UndefOr[js.Any] = js.native
  /** parameter returns whether or not to cancel the drop event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  /** parameter returns the model of the diagram
    */
  var event: js.UndefOr[js.Any] = js.native
  /** parameter returns the object that is selected
    */
  var selectedObject: js.UndefOr[js.Any] = js.native
}

object ItemClickEventArgs {
  @scala.inline
  def apply(): ItemClickEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ItemClickEventArgs]
  }
  @scala.inline
  implicit class ItemClickEventArgsOps[Self <: ItemClickEventArgs] (val x: Self) extends AnyVal {
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
    def setActualObject(value: js.Any): Self = this.set("actualObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActualObject: Self = this.set("actualObject", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setDiagramId(value: String): Self = this.set("diagramId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagramId: Self = this.set("diagramId", js.undefined)
    @scala.inline
    def setEvent(value: js.Any): Self = this.set("event", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
    @scala.inline
    def setSelectedObject(value: js.Any): Self = this.set("selectedObject", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedObject: Self = this.set("selectedObject", js.undefined)
  }
  
}

