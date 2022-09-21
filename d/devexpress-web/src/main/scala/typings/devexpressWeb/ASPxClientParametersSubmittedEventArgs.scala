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
  
  var Parameters: StringDictionary[Any]
  
  var ParametersViewModel: Any
}
object ASPxClientParametersSubmittedEventArgs {
  
  inline def apply(Parameters: StringDictionary[Any], ParametersViewModel: Any): ASPxClientParametersSubmittedEventArgs = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any], ParametersViewModel = ParametersViewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientParametersSubmittedEventArgs]
  }
  
  extension [Self <: ASPxClientParametersSubmittedEventArgs](x: Self) {
    
    inline def setParameters(value: StringDictionary[Any]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersViewModel(value: Any): Self = StObject.set(x, "ParametersViewModel", value.asInstanceOf[js.Any])
  }
}
