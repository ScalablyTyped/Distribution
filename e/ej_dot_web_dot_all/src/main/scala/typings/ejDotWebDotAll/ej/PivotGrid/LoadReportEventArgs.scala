package typings.ejDotWebDotAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadReportEventArgs extends js.Object {
  /** returns whether the control is bound with OLAP or Relational data source.
    */
  var dataModel: js.UndefOr[String] = js.undefined
  /** returns the PivotGrid object.
    */
  var targetControl: js.UndefOr[js.Any] = js.undefined
}

object LoadReportEventArgs {
  @scala.inline
  def apply(dataModel: String = null, targetControl: js.Any = null): LoadReportEventArgs = {
    val __obj = js.Dynamic.literal()
    if (dataModel != null) __obj.updateDynamic("dataModel")(dataModel.asInstanceOf[js.Any])
    if (targetControl != null) __obj.updateDynamic("targetControl")(targetControl.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadReportEventArgs]
  }
}

