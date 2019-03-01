package typings
package devexpressDashAspnetcoreDashBootstrapLib.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapChartExportEventArgs extends BootstrapChartEventArgsBase {
  var cancel: scala.Boolean
  val data: js.Any
  val fileName: java.lang.String
  val format: java.lang.String
}

object BootstrapChartExportEventArgs {
  @scala.inline
  def apply(
    cancel: scala.Boolean,
    component: js.Any,
    data: js.Any,
    element: js.Any,
    fileName: java.lang.String,
    format: java.lang.String,
    sender: Control
  ): BootstrapChartExportEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancel")(cancel)
    __obj.updateDynamic("component")(component)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("element")(element)
    __obj.updateDynamic("fileName")(fileName)
    __obj.updateDynamic("format")(format)
    __obj.updateDynamic("sender")(sender)
    __obj.asInstanceOf[BootstrapChartExportEventArgs]
  }
}

