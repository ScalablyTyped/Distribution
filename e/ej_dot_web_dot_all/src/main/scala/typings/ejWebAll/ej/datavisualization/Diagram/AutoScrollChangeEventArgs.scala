package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AutoScrollChangeEventArgs extends js.Object {
  /** Returns the delay between subsequent auto scrolls
    */
  var delay: js.UndefOr[String] = js.native
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
}

object AutoScrollChangeEventArgs {
  @scala.inline
  def apply(): AutoScrollChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoScrollChangeEventArgs]
  }
  @scala.inline
  implicit class AutoScrollChangeEventArgsOps[Self <: AutoScrollChangeEventArgs] (val x: Self) extends AnyVal {
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
    def setDelay(value: String): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setDiagramId(value: String): Self = this.set("diagramId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagramId: Self = this.set("diagramId", js.undefined)
  }
  
}

