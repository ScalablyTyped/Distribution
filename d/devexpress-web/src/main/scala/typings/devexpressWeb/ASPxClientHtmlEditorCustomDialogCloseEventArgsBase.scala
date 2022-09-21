package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for client events that relate to closing a custom dialog.
  */
trait ASPxClientHtmlEditorCustomDialogCloseEventArgsBase
  extends StObject
     with ASPxClientHtmlEditorCustomDialogEventArgs {
  
  /**
    * Gets the status of the closed custom dialog.
    */
  var status: Any
}
object ASPxClientHtmlEditorCustomDialogCloseEventArgsBase {
  
  inline def apply(name: String, status: Any): ASPxClientHtmlEditorCustomDialogCloseEventArgsBase = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientHtmlEditorCustomDialogCloseEventArgsBase]
  }
  
  extension [Self <: ASPxClientHtmlEditorCustomDialogCloseEventArgsBase](x: Self) {
    
    inline def setStatus(value: Any): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
