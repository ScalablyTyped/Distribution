package typings.ejWebAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FetchReportEventArgs extends js.Object {
  /** returns the object which holds the necessary parameters required for fetching the report names stored in database.
    */
  var fetchReportSetting: js.UndefOr[js.Any] = js.native
  /** returns the current instance of PivotClient control.
    */
  var targetControl: js.UndefOr[js.Any] = js.native
}

object FetchReportEventArgs {
  @scala.inline
  def apply(): FetchReportEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FetchReportEventArgs]
  }
  @scala.inline
  implicit class FetchReportEventArgsOps[Self <: FetchReportEventArgs] (val x: Self) extends AnyVal {
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
    def setFetchReportSetting(value: js.Any): Self = this.set("fetchReportSetting", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFetchReportSetting: Self = this.set("fetchReportSetting", js.undefined)
    @scala.inline
    def setTargetControl(value: js.Any): Self = this.set("targetControl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetControl: Self = this.set("targetControl", js.undefined)
  }
  
}

