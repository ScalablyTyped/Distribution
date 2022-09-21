package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.CustomDialogClosing client event.
  */
@JSGlobal("ASPxClientHtmlEditorCustomDialogClosingEventArgs")
@js.native
open class ASPxClientHtmlEditorCustomDialogClosingEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHtmlEditorCustomDialogClosingEventArgs {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorCustomDialogClosingEventArgs class with the specified settings.
    * @param name A string value that specifies the custom dialog's name. This value is assigned to the ASPxClientHtmlEditorCustomDialogEventArgs.name property.
    * @param status An object that specifies a status that is returned to the parent control when the custom dialog is closed. This value is assigned to the ASPxClientHtmlEditorCustomDialogCloseEventArgsBase.status property.
    */
  def this(name: String, status: Any) = this()
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  /* CompleteClass */
  var handled: Boolean = js.native
  
  /**
    * Gets the name that uniquely identifies the processed custom dialog.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Gets the status of the closed custom dialog.
    */
  /* CompleteClass */
  var status: Any = js.native
}
