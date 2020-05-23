package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.ParametersReset and ASPxClientReportDesigner.PreviewParametersReset events.
  */
trait ASPxClientParametersResetEventArgs extends ASPxClientEventArgs {
  /**
    * Provides access to report parameters whose values have been reset.
    */
  var Parameters: js.Array[ASPxClientWebDocumentViewerParameter]
  /**
    * Provides access to a View Model for report parameters.
    */
  var ParametersViewModel: js.Any
}

object ASPxClientParametersResetEventArgs {
  @scala.inline
  def apply(Parameters: js.Array[ASPxClientWebDocumentViewerParameter], ParametersViewModel: js.Any): ASPxClientParametersResetEventArgs = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any], ParametersViewModel = ParametersViewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientParametersResetEventArgs]
  }
}

