package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BootstrapChartExportEventArgs extends BootstrapChartEventArgsBase {
  
  var cancel: Boolean = js.native
  
  val data: js.Any = js.native
  
  val fileName: String = js.native
  
  val format: String = js.native
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
  
  @scala.inline
  implicit class BootstrapChartExportEventArgsMutableBuilder[Self <: BootstrapChartExportEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
  }
}
