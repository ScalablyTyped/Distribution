package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.DialogClosed event.
  */
@JSGlobal("ASPxClientHtmlEditorDialogClosedEventArgs")
@js.native
open class ASPxClientHtmlEditorDialogClosedEventArgs ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHtmlEditorDialogCloseEventArgs {
  
  /**
    * Gets the dialog object related to the event.
    */
  /* CompleteClass */
  var dialog: typings.devexpressWeb.ASPxClientHtmlEditorDialogBase = js.native
  
  /**
    * Gets the dialog name related to the event.
    */
  /* CompleteClass */
  var dialogName: String = js.native
  
  /**
    * Gets a string that contains specific information (if any) passed from the client side for server-side processing.
    */
  /* CompleteClass */
  var parameter: Any = js.native
}
