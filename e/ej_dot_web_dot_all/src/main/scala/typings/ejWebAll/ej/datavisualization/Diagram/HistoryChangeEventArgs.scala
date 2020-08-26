package typings.ejWebAll.ej.datavisualization.Diagram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HistoryChangeEventArgs extends js.Object {
  /** A collection of objects that are changed in the last undo/redo
    */
  var Source: js.UndefOr[js.Array[_]] = js.native
  /** parameter to specify whether or not to cancel the event
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** parameter returns the model of the diagram
    */
  var cause: js.UndefOr[Boolean] = js.native
  /** An array of objects, where each object represents the changes made in last undo/redo. To explore how the changes are defined, refer [Undo Redo Changes](#undo-redo-changes)
    */
  var changes: js.UndefOr[js.Array[_]] = js.native
  /** parameter returns the id of the diagram
    */
  var diagramId: js.UndefOr[String] = js.native
}

object HistoryChangeEventArgs {
  @scala.inline
  def apply(): HistoryChangeEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HistoryChangeEventArgs]
  }
  @scala.inline
  implicit class HistoryChangeEventArgsOps[Self <: HistoryChangeEventArgs] (val x: Self) extends AnyVal {
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
    def setSourceVarargs(value: js.Any*): Self = this.set("Source", js.Array(value :_*))
    @scala.inline
    def setSource(value: js.Array[_]): Self = this.set("Source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("Source", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setCause(value: Boolean): Self = this.set("cause", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCause: Self = this.set("cause", js.undefined)
    @scala.inline
    def setChangesVarargs(value: js.Any*): Self = this.set("changes", js.Array(value :_*))
    @scala.inline
    def setChanges(value: js.Array[_]): Self = this.set("changes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChanges: Self = this.set("changes", js.undefined)
    @scala.inline
    def setDiagramId(value: String): Self = this.set("diagramId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDiagramId: Self = this.set("diagramId", js.undefined)
  }
  
}

