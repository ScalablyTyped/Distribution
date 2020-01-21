package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SaveReportEventArgs extends js.Object {
  /** returns the report to be stored in database.
    */
  var report: js.UndefOr[js.Any] = js.undefined
}

object SaveReportEventArgs {
  @scala.inline
  def apply(report: js.Any = null): SaveReportEventArgs = {
    val __obj = js.Dynamic.literal()
    if (report != null) __obj.updateDynamic("report")(report.asInstanceOf[js.Any])
    __obj.asInstanceOf[SaveReportEventArgs]
  }
}

