package typings.devexpressDashAspnetcoreDashBootstrap.DevExpress.AspNetCore

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
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], format = format.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BootstrapChartExportEventArgs]
  }
}

