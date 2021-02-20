package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.ParametersReset and ASPxClientReportDesigner.PreviewParametersReset events.
  */
@js.native
trait ASPxClientParametersResetEventArgs extends ASPxClientEventArgs {
  
  /**
    * Provides access to report parameters whose values have been reset.
    */
  var Parameters: js.Array[ASPxClientWebDocumentViewerParameter] = js.native
  
  /**
    * Provides access to a View Model for report parameters.
    */
  var ParametersViewModel: js.Any = js.native
}
object ASPxClientParametersResetEventArgs {
  
  @scala.inline
  def apply(Parameters: js.Array[ASPxClientWebDocumentViewerParameter], ParametersViewModel: js.Any): ASPxClientParametersResetEventArgs = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any], ParametersViewModel = ParametersViewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientParametersResetEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientParametersResetEventArgsMutableBuilder[Self <: ASPxClientParametersResetEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setParameters(value: js.Array[ASPxClientWebDocumentViewerParameter]): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersVarargs(value: ASPxClientWebDocumentViewerParameter*): Self = StObject.set(x, "Parameters", js.Array(value :_*))
    
    @scala.inline
    def setParametersViewModel(value: js.Any): Self = StObject.set(x, "ParametersViewModel", value.asInstanceOf[js.Any])
  }
}
