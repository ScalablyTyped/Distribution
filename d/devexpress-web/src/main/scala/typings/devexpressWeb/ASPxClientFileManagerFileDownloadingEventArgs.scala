package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FileDownloading event.
  */
trait ASPxClientFileManagerFileDownloadingEventArgs
  extends StObject
     with ASPxClientFileManagerFileEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event, should be canceled.
    */
  var cancel: Boolean
}
object ASPxClientFileManagerFileDownloadingEventArgs {
  
  inline def apply(cancel: Boolean, file: ASPxClientFileManagerFile): ASPxClientFileManagerFileDownloadingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileDownloadingEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientFileManagerFileDownloadingEventArgs] (val x: Self) extends AnyVal {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
  }
}
