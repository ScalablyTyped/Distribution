package typings.ejDotWebDotAll.ej.PivotClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveReportEventArgs extends js.Object {
  /** returns the object which holds the necessary parameters required for saving the report collection.
    */
  var saveReportSetting: js.UndefOr[js.Any] = js.undefined
  /** returns the current instance of PivotClient control.
    */
  var targetControl: js.UndefOr[js.Any] = js.undefined
}

object SaveReportEventArgs {
  @scala.inline
  def apply(saveReportSetting: js.Any = null, targetControl: js.Any = null): SaveReportEventArgs = {
    val __obj = js.Dynamic.literal()
    if (saveReportSetting != null) __obj.updateDynamic("saveReportSetting")(saveReportSetting)
    if (targetControl != null) __obj.updateDynamic("targetControl")(targetControl)
    __obj.asInstanceOf[SaveReportEventArgs]
  }
}

