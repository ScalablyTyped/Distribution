package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.CustomDialogClosing client event.
  */
trait ASPxClientHtmlEditorCustomDialogClosingEventArgs
  extends StObject
     with ASPxClientHtmlEditorCustomDialogCloseEventArgsBase {
  
  /**
    * Gets or sets a value specifying whether the event was handled.
    */
  var handled: Boolean
}
object ASPxClientHtmlEditorCustomDialogClosingEventArgs {
  
  inline def apply(handled: Boolean, name: String, status: Any): ASPxClientHtmlEditorCustomDialogClosingEventArgs = {
    val __obj = js.Dynamic.literal(handled = handled.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogClosingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientHtmlEditorCustomDialogClosingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setHandled(value: Boolean): Self = StObject.set(x, "handled", value.asInstanceOf[js.Any])
  }
}
