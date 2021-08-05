package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the item editing event.
  */
trait ASPxClientFileManagerItemEditingEventArgs
  extends StObject
     with ASPxClientFileManagerActionEventArgsBase {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean
}
object ASPxClientFileManagerItemEditingEventArgs {
  
  inline def apply(cancel: Boolean, fullName: String, isFolder: Boolean, name: String): ASPxClientFileManagerItemEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemEditingEventArgs]
  }
  
  extension [Self <: ASPxClientFileManagerItemEditingEventArgs](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
  }
}
