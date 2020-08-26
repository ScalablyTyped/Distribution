package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadReportEventArgs extends js.Object {
  /** returns whether the control is bound with OLAP or Relational data source.
    */
  var dataModel: js.UndefOr[String] = js.native
  /** returns the PivotGrid object.
    */
  var targetControl: js.UndefOr[js.Any] = js.native
}

object LoadReportEventArgs {
  @scala.inline
  def apply(): LoadReportEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadReportEventArgs]
  }
  @scala.inline
  implicit class LoadReportEventArgsOps[Self <: LoadReportEventArgs] (val x: Self) extends AnyVal {
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
    def setDataModel(value: String): Self = this.set("dataModel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataModel: Self = this.set("dataModel", js.undefined)
    @scala.inline
    def setTargetControl(value: js.Any): Self = this.set("targetControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetControl: Self = this.set("targetControl", js.undefined)
  }
  
}

