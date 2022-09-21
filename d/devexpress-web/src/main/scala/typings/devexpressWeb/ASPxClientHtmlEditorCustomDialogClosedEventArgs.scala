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
  var data: Any
}
object ASPxClientHtmlEditorCustomDialogClosedEventArgs {
  
  inline def apply(data: Any, name: String, status: Any): ASPxClientHtmlEditorCustomDialogClosedEventArgs = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogClosedEventArgs]
  }
  
  extension [Self <: ASPxClientHtmlEditorCustomDialogClosedEventArgs](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
  }
}
