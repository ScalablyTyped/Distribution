package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ASPxClientParametersResetEventArgsOps[Self <: ASPxClientParametersResetEventArgs] (val x: Self) extends AnyVal {
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
    def setParametersVarargs(value: ASPxClientWebDocumentViewerParameter*): Self = this.set("Parameters", js.Array(value :_*))
    @scala.inline
    def setParameters(value: js.Array[ASPxClientWebDocumentViewerParameter]): Self = this.set("Parameters", value.asInstanceOf[js.Any])
    @scala.inline
    def setParametersViewModel(value: js.Any): Self = this.set("ParametersViewModel", value.asInstanceOf[js.Any])
  }
  
}

