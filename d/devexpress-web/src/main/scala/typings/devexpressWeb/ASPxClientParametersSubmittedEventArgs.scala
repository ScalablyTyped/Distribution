package typings.devexpressWeb

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.ParametersSubmitted and ASPxClientReportDesigner.PreviewParametersSubmitted events.
  */
trait ASPxClientParametersSubmittedEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  var Parameters: StringDictionary[js.Any]
  
  var ParametersViewModel: js.Any
}
object ASPxClientParametersSubmittedEventArgs {
  
  @scala.inline
  def apply(Parameters: StringDictionary[js.Any], ParametersViewModel: js.Any): ASPxClientParametersSubmittedEventArgs = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any], ParametersViewModel = ParametersViewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientParametersSubmittedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientParametersSubmittedEventArgsMutableBuilder[Self <: ASPxClientParametersSubmittedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: StringDictionary[js.Any]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersViewModel(value: js.Any): Self = StObject.set(x, "ParametersViewModel", value.asInstanceOf[js.Any])
  }
}
