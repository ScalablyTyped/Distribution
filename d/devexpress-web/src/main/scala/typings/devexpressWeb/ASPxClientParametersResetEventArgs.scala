package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.ParametersReset and ASPxClientReportDesigner.PreviewParametersReset events.
  */
trait ASPxClientParametersResetEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Provides access to report parameters whose values have been reset.
    */
  var Parameters: js.Array[ASPxClientWebDocumentViewerParameter]
  
  /**
    * Provides access to a View Model for report parameters.
    */
  var ParametersViewModel: Any
}
object ASPxClientParametersResetEventArgs {
  
  inline def apply(Parameters: js.Array[ASPxClientWebDocumentViewerParameter], ParametersViewModel: Any): ASPxClientParametersResetEventArgs = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any], ParametersViewModel = ParametersViewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientParametersResetEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientParametersResetEventArgs] (val x: Self) extends AnyVal {
    
    inline def setParameters(value: js.Array[ASPxClientWebDocumentViewerParameter]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersVarargs(value: ASPxClientWebDocumentViewerParameter*): Self = StObject.set(x, "Parameters", js.Array(value*))
    
    inline def setParametersViewModel(value: Any): Self = StObject.set(x, "ParametersViewModel", value.asInstanceOf[js.Any])
  }
}
