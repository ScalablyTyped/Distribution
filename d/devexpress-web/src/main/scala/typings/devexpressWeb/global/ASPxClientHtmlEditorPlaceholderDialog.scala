package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides client functionality for the Placeholder dialog within the ASPxHtmlEditor.
  */
@JSGlobal("ASPxClientHtmlEditorPlaceholderDialog")
@js.native
open class ASPxClientHtmlEditorPlaceholderDialog ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHtmlEditorPlaceholderDialog {
  
  /**
    * Provides access to the client object of the "Cancel" button in the Html Editor's dialogs.
    */
  /* CompleteClass */
  override def GetCancelButton(): typings.devexpressWeb.ASPxClientButton = js.native
  
  /**
    * Provides access to the client ASPxFormLayout object that arranges all editors in the Html Editor's dialogs.
    */
  /* CompleteClass */
  override def GetFormLayout(): typings.devexpressWeb.ASPxClientFormLayout = js.native
  
  /**
    * Provides access to the client object of the "OK" button in the Html Editor's dialogs.
    */
  /* CompleteClass */
  override def GetOkButton(): typings.devexpressWeb.ASPxClientButton = js.native
  
  /**
    * Provides access to the ASPxListBox client object that lists placeholder names in the Html Editor's Placeholder dialog.
    */
  /* CompleteClass */
  override def GetPlaceholderNameListBox(): typings.devexpressWeb.ASPxClientListBox = js.native
}
