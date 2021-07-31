package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientHtmlEditor.CustomDialogClosed client event.
  */
trait ASPxClientHtmlEditorCustomDialogClosedEventArgs
  extends StObject
     with ASPxClientHtmlEditorCustomDialogCloseEventArgsBase {
  
  /**
    * Gets an object associated with the closed dialog.
    */
  var data: js.Any
}
object ASPxClientHtmlEditorCustomDialogClosedEventArgs {
  
  @scala.inline
  def apply(data: js.Any, name: String, status: js.Any): ASPxClientHtmlEditorCustomDialogClosedEventArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogClosedEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientHtmlEditorCustomDialogClosedEventArgsMutableBuilder[Self <: ASPxClientHtmlEditorCustomDialogClosedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
