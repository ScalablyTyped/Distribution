package typings.devexpressDashWeb

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.ParametersSubmitted and ASPxClientReportDesigner.PreviewParametersSubmitted events.
  */
@JSGlobal("ASPxClientParametersSubmittedEventArgs")
@js.native
class ASPxClientParametersSubmittedEventArgs protected () extends ASPxClientEventArgs {
  def this(parameters: StringDictionary[js.Any]) = this()
  var Parameters: StringDictionary[js.Any] = js.native
  var ParametersViewModel: js.Any = js.native
}

