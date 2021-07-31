package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the cancellable ASPxClientHtmlEditor.ActiveTabChanging event that concerns manipulations on tabs.
  */
@JSGlobal("ASPxClientHtmlEditorTabCancelEventArgs")
@js.native
class ASPxClientHtmlEditorTabCancelEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientHtmlEditorTabCancelEventArgs {
  /**
    * Initializes a new object of the ASPxClientHtmlEditorTabCancelEventArgs type with the specified setting.
    * @param name A string value that uniquely identifies the name of a tab related to the event.
    */
  def this(name: String) = this()
  
  /**
    * Gets or sets a value indicating whether the action which raised the event, should be canceled.
    */
  /* CompleteClass */
  var cancel: Boolean = js.native
  
  /**
    * Gets the name that uniquely identifies an editor tab.
    */
  /* CompleteClass */
  var name: String = js.native
}
