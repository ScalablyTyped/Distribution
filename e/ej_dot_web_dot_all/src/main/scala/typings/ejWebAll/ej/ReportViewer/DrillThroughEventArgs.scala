package typings.ejWebAll.ej.ReportViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrillThroughEventArgs extends js.Object {
  /** returns the actionInfo's parameters bookmarkLink, reportName, parameters.
    */
  var actionInfo: js.UndefOr[js.Any] = js.native
  /** true if the event should be canceled; otherwise, false.
    */
  var cancel: js.UndefOr[Boolean] = js.native
  /** returns the report model.
    */
  var model: js.UndefOr[js.Any] = js.native
  /** returns the name of the event.
    */
  var `type`: js.UndefOr[String] = js.native
}

object DrillThroughEventArgs {
  @scala.inline
  def apply(): DrillThroughEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DrillThroughEventArgs]
  }
  @scala.inline
  implicit class DrillThroughEventArgsOps[Self <: DrillThroughEventArgs] (val x: Self) extends AnyVal {
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
    def setActionInfo(value: js.Any): Self = this.set("actionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionInfo: Self = this.set("actionInfo", js.undefined)
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    @scala.inline
    def setModel(value: js.Any): Self = this.set("model", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModel: Self = this.set("model", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

