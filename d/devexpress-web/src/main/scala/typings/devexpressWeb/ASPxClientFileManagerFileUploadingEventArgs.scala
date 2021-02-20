package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FileUploading event.
  */
@js.native
trait ASPxClientFileManagerFileUploadingEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean = js.native
  
  /**
    * Gets the name of a file selected for upload.
    */
  var fileName: String = js.native
  
  /**
    * Gets the path to the folder where a file is being uploaded.
    */
  var folder: String = js.native
}
object ASPxClientFileManagerFileUploadingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, fileName: String, folder: String): ASPxClientFileManagerFileUploadingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileUploadingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerFileUploadingEventArgsMutableBuilder[Self <: ASPxClientFileManagerFileUploadingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
  }
}
