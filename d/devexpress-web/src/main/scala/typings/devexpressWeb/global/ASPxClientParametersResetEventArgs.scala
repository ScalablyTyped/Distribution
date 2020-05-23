package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.ParametersReset and ASPxClientReportDesigner.PreviewParametersReset events.
  */
@JSGlobal("ASPxClientParametersResetEventArgs")
@js.native
class ASPxClientParametersResetEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientParametersResetEventArgs {
  /**
    * Initializes a new instance of the ASPxClientParametersResetEventArgs class with the specified settings.
    * @param parametersModel A View Model object for report parameters. This value is assigned to the ASPxClientParametersResetEventArgs.ParametersViewModel property.
    * @param parameters An array of IParameter objects. This value is assigned to the ASPxClientParametersResetEventArgs.Parameters property.
    */
  def this(
    parametersModel: js.Any,
    parameters: js.Array[typings.devexpressWeb.ASPxClientWebDocumentViewerParameter]
  ) = this()
  /**
    * Provides access to report parameters whose values have been reset.
    */
  /* CompleteClass */
  override var Parameters: js.Array[typings.devexpressWeb.ASPxClientWebDocumentViewerParameter] = js.native
  /**
    * Provides access to a View Model for report parameters.
    */
  /* CompleteClass */
  override var ParametersViewModel: js.Any = js.native
}

