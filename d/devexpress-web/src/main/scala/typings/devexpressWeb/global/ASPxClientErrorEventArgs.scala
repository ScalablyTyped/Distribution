package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.OnServerError, ASPxClientReportDesigner.OnServerError and ASPxClientQueryBuilder.OnServerError events.
  */
@JSGlobal("ASPxClientErrorEventArgs")
@js.native
open class ASPxClientErrorEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientErrorEventArgs {
  /**
    * Initializes a new instance of the ASPxClientErrorEventArgs class with the specified settings.
    * @param error An object that provides information about a server-side error. This value is assigned to the Error property.
    */
  def this(error: Any) = this()
  
  /**
    * Provides access to information about a server-side error.
    */
  /* CompleteClass */
  var Error: Any = js.native
}
