package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectorTargetChangeEventArgs extends js.Object {
  /** parameter defines whether to cancel the change or not
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  /** returns the state of connection end point dragging(starting, dragging, completed)
    */
  var dragState: js.UndefOr[String] = js.native
  /** parameter returns the connector, the target point of which is being dragged
    */
  var element: js.UndefOr[js.Any] = js.native
  /** returns the target node of the element
    */
  var node: js.UndefOr[js.Any] = js.native
  /** returns the target point of the element
    */
  var point: js.UndefOr[js.Any] = js.native
  /** returns the target port of the element
    */
  var port: js.UndefOr[js.Any] = js.native
}

object ConnectorTargetChangeEventArgs {
  @scala.inline
  def apply(): ConnectorTargetChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectorTargetChangeEventArgs]
  }
  @scala.inline
  implicit class ConnectorTargetChangeEventArgsOps[Self <: ConnectorTargetChangeEventArgs] (val x: Self) extends AnyVal {
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
    def setDiagramId(value: String): Self = this.set("diagramId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagramId: Self = this.set("diagramId", js.undefined)
    @scala.inline
    def setDragState(value: String): Self = this.set("dragState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDragState: Self = this.set("dragState", js.undefined)
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setNode(value: js.Any): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNode: Self = this.set("node", js.undefined)
    @scala.inline
    def setPoint(value: js.Any): Self = this.set("point", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePoint: Self = this.set("point", js.undefined)
    @scala.inline
    def setPort(value: js.Any): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

