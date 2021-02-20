package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FileDownloading event.
  */
@js.native
trait ASPxClientFileManagerFileDownloadingEventArgs extends ASPxClientFileManagerFileEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event, should be canceled.
    */
  var cancel: Boolean = js.native
}
object ASPxClientFileManagerFileDownloadingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, file: ASPxClientFileManagerFile): ASPxClientFileManagerFileDownloadingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileDownloadingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerFileDownloadingEventArgsMutableBuilder[Self <: ASPxClientFileManagerFileDownloadingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
  }
}
