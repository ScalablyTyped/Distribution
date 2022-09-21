package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the event that fires when the HTML Editor dialogs are closed or are going to be closed.
  */
@JSGlobal("ASPxClientHtmlEditorDialogCloseEventArgs")
@js.native
open class ASPxClientHtmlEditorDialogCloseEventArgs ()
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
