package typings.devexpressWeb.global

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.ParametersSubmitted and ASPxClientReportDesigner.PreviewParametersSubmitted events.
  */
@JSGlobal("ASPxClientParametersSubmittedEventArgs")
@js.native
class ASPxClientParametersSubmittedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientParametersSubmittedEventArgs {
  def this(parameters: StringDictionary[js.Any]) = this()
  
  /* CompleteClass */
  var Parameters: StringDictionary[js.Any] = js.native
  
  /* CompleteClass */
  var ParametersViewModel: js.Any = js.native
}
