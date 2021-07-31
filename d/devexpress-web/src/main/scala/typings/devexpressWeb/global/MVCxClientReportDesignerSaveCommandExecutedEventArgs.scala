package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the MVCxClientReportDesigner.SaveCommandExecuted event.
  */
@JSGlobal("MVCxClientReportDesignerSaveCommandExecutedEventArgs")
@js.native
class MVCxClientReportDesignerSaveCommandExecutedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.MVCxClientReportDesignerSaveCommandExecutedEventArgs {
  /**
    * Initializes a new instance of the MVCxClientReportDesignerSaveCommandExecutedEventArgs class with the specified settings.
    * @param result A string value that represents the result of server-side processing.
    */
  def this(result: String) = this()
  
  /**
    * Returns the operation result.
    */
  /* CompleteClass */
  var Result: String = js.native
}
