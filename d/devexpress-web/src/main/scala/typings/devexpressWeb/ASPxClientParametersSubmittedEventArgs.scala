package typings.devexpressWeb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.ParametersSubmitted and ASPxClientReportDesigner.PreviewParametersSubmitted events.
  */
trait ASPxClientParametersSubmittedEventArgs extends ASPxClientEventArgs {
  var Parameters: StringDictionary[js.Any]
  var ParametersViewModel: js.Any
}

object ASPxClientParametersSubmittedEventArgs {
  @scala.inline
  def apply(Parameters: StringDictionary[js.Any], ParametersViewModel: js.Any): ASPxClientParametersSubmittedEventArgs = {
    val __obj = js.Dynamic.literal(Parameters = Parameters.asInstanceOf[js.Any], ParametersViewModel = ParametersViewModel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientParametersSubmittedEventArgs]
  }
}

