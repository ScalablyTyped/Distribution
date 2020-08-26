package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionChangeEventArgs extends js.Object {
  /** parameter defines whether to cancel the change or not
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** parameter returns the new source node or target node of the connector
    */
  var connection: js.UndefOr[String] = js.native
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
  /** parameter returns the connection that is changed between nodes, ports or points
    */
  var element: js.UndefOr[js.Any] = js.native
  /** parameter returns the new source port or target port of the connector
    */
  var port: js.UndefOr[js.Any] = js.native
}

object ConnectionChangeEventArgs {
  @scala.inline
  def apply(): ConnectionChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionChangeEventArgs]
  }
  @scala.inline
  implicit class ConnectionChangeEventArgsOps[Self <: ConnectionChangeEventArgs] (val x: Self) extends AnyVal {
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
    def setConnection(value: String): Self = this.set("connection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnection: Self = this.set("connection", js.undefined)
    @scala.inline
    def setDiagramId(value: String): Self = this.set("diagramId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagramId: Self = this.set("diagramId", js.undefined)
    @scala.inline
    def setElement(value: js.Any): Self = this.set("element", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElement: Self = this.set("element", js.undefined)
    @scala.inline
    def setPort(value: js.Any): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
  }
  
}

