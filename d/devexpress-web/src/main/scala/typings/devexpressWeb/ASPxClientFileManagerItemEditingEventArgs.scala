package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the item editing event.
  */
@js.native
trait ASPxClientFileManagerItemEditingEventArgs extends ASPxClientFileManagerActionEventArgsBase {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean = js.native
}
object ASPxClientFileManagerItemEditingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, fullName: String, isFolder: Boolean, name: String): ASPxClientFileManagerItemEditingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], fullName = fullName.asInstanceOf[js.Any], isFolder = isFolder.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerItemEditingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerItemEditingEventArgsMutableBuilder[Self <: ASPxClientFileManagerItemEditingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
  }
}
