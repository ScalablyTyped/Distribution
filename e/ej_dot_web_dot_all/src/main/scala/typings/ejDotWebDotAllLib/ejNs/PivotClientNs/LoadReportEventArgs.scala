package typings
package ejDotWebDotAllLib.ejNs.PivotClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadReportEventArgs extends js.Object {
  /** returns the object which holds the necessary parameters required for loading a report collection from database.
    */
  var loadReportSetting: js.UndefOr[js.Any] = js.undefined
  /** returns the current instance of PivotClient control.
    */
  var targetControl: js.UndefOr[js.Any] = js.undefined
}

object LoadReportEventArgs {
  @scala.inline
  def apply(loadReportSetting: js.Any = null, targetControl: js.Any = null): LoadReportEventArgs = {
    val __obj = js.Dynamic.literal()
    if (loadReportSetting != null) __obj.updateDynamic("loadReportSetting")(loadReportSetting)
    if (targetControl != null) __obj.updateDynamic("targetControl")(targetControl)
    __obj.asInstanceOf[LoadReportEventArgs]
  }
}

