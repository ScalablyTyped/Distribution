package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.FilesUploadStart event.
  */
trait ASPxClientUploadControlFilesUploadStartEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean
}
object ASPxClientUploadControlFilesUploadStartEventArgs {
  
  inline def apply(cancel: Boolean): ASPxClientUploadControlFilesUploadStartEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientUploadControlFilesUploadStartEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientUploadControlFilesUploadStartEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
  }
}
