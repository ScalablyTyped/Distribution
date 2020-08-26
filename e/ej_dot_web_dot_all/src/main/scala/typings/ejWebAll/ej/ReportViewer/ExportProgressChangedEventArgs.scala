package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExportProgressChangedEventArgs extends js.Object {
  /** returns ReportViewer container Id.
    */
  var containerId: js.UndefOr[String] = js.native
  /** returns the export format
    */
  var format: js.UndefOr[String] = js.native
  /** true if the event should be handled; otherwise, false.
    */
  var handled: js.UndefOr[Boolean] = js.native
  /** returns the stage of export processing.
    */
  var stage: js.UndefOr[String] = js.native
}

object ExportProgressChangedEventArgs {
  @scala.inline
  def apply(): ExportProgressChangedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportProgressChangedEventArgs]
  }
  @scala.inline
  implicit class ExportProgressChangedEventArgsOps[Self <: ExportProgressChangedEventArgs] (val x: Self) extends AnyVal {
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
    def setContainerId(value: String): Self = this.set("containerId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContainerId: Self = this.set("containerId", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setHandled(value: Boolean): Self = this.set("handled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandled: Self = this.set("handled", js.undefined)
    @scala.inline
    def setStage(value: String): Self = this.set("stage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStage: Self = this.set("stage", js.undefined)
  }
  
}

