package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the cancellable ASPxClientHtmlEditor.ActiveTabChanging event that concerns manipulations on tabs.
  */
trait ASPxClientHtmlEditorTabCancelEventArgs
  extends StObject
     with ASPxClientHtmlEditorTabEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event, should be canceled.
    */
  var cancel: Boolean
}
object ASPxClientHtmlEditorTabCancelEventArgs {
  
  inline def apply(cancel: Boolean, name: String): ASPxClientHtmlEditorTabCancelEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorTabCancelEventArgs]
  }
  
  extension [Self <: ASPxClientHtmlEditorTabCancelEventArgs](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
  }
}
