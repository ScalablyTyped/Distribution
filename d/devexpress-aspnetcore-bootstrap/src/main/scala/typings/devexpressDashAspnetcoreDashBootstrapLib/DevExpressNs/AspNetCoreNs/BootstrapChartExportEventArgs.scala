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
    val __obj = js.Dynamic.literal(cancel = cancel, component = component, data = data, element = element, fileName = fileName, format = format, sender = sender)
  
    __obj.asInstanceOf[BootstrapChartExportEventArgs]
  }
}

