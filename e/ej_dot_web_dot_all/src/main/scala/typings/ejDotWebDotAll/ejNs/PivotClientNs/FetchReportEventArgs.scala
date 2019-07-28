package typings.ejDotWebDotAll.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FetchReportEventArgs extends js.Object {
  /** returns the object which holds the necessary parameters required for fetching the report names stored in database.
    */
  var fetchReportSetting: js.UndefOr[js.Any] = js.undefined
  /** returns the current instance of PivotClient control.
    */
  var targetControl: js.UndefOr[js.Any] = js.undefined
}

object FetchReportEventArgs {
  @scala.inline
  def apply(fetchReportSetting: js.Any = null, targetControl: js.Any = null): FetchReportEventArgs = {
    val __obj = js.Dynamic.literal()
    if (fetchReportSetting != null) __obj.updateDynamic("fetchReportSetting")(fetchReportSetting)
    if (targetControl != null) __obj.updateDynamic("targetControl")(targetControl)
    __obj.asInstanceOf[FetchReportEventArgs]
  }
}

