package typings.devexpressWeb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.ParametersSubmitted and ASPxClientReportDesigner.PreviewParametersSubmitted events.
  */
@js.native
trait ASPxClientParametersSubmittedEventArgs extends ASPxClientEventArgs {
  
  var Parameters: StringDictionary[js.Any] = js.native
  
  var ParametersViewModel: js.Any = js.native
}
object ASPxClientParametersSubmittedEventArgs {
  
  @scala.inline
  def apply(Parameters: StringDictionary[js.Any], ParametersViewModel: js.Any): ASPxClientParametersSubmittedEventArgs = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any], ParametersViewModel = ParametersViewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientParametersSubmittedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientParametersSubmittedEventArgsOps[Self <: ASPxClientParametersSubmittedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setParameters(value: StringDictionary[js.Any]): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersViewModel(value: js.Any): Self = this.set("ParametersViewModel", value.asInstanceOf[js.Any])
  }
}
