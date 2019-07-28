package typings.devexpressDashAspnetcoreDashBootstrap.DevExpressNs.AspNetCoreNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapChartExportEventArgs extends BootstrapChartEventArgsBase {
  var cancel: Boolean
  val data: js.Any
  val fileName: String
  val format: String
}

object BootstrapChartExportEventArgs {
  @scala.inline
  def apply(
    cancel: Boolean,
    component: js.Any,
    data: js.Any,
    element: js.Any,
    fileName: String,
    format: String,
    sender: Control
  ): BootstrapChartExportEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel, component = component, data = data, element = element, fileName = fileName, format = format, sender = sender)
  
    __obj.asInstanceOf[BootstrapChartExportEventArgs]
  }
}

