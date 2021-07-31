package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.CustomDialogClosed client event.
  */
@JSGlobal("ASPxClientHtmlEditorCustomDialogClosedEventArgs")
@js.native
class ASPxClientHtmlEditorCustomDialogClosedEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHtmlEditorCustomDialogClosedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientHtmlEditorCustomDialogClosedEventArgs class with the specified settings.
    * @param name A string value that specifies the custom dialog's name. This value is assigned to the ASPxClientHtmlEditorCustomDialogEventArgs.name property.
    * @param status An object that specifies a status that is returned to the parent control when the custom dialog is closed. This value is assigned to the ASPxClientHtmlEditorCustomDialogCloseEventArgsBase.status property.
    * @param data An object that specifies the data that is returned to the parent control when the custom dialog is closed. This value is assigned to the ASPxClientHtmlEditorCustomDialogClosedEventArgs.data property.
    */
  def this(name: String, status: js.Any, data: js.Any) = this()
  
  /**
    * Gets an object associated with the closed dialog.
    */
  /* CompleteClass */
  var data: js.Any = js.native
  
  /**
    * Gets the name that uniquely identifies the processed custom dialog.
    */
  /* CompleteClass */
  var name: String = js.native
  
  /**
    * Gets the status of the closed custom dialog.
    */
  /* CompleteClass */
  var status: js.Any = js.native
}
