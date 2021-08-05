package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FileUploading event.
  */
trait ASPxClientFileManagerFileUploadingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean
  
  /**
    * Gets the name of a file selected for upload.
    */
  var fileName: String
  
  /**
    * Gets the path to the folder where a file is being uploaded.
    */
  var folder: String
}
object ASPxClientFileManagerFileUploadingEventArgs {
  
  inline def apply(cancel: Boolean, fileName: String, folder: String): ASPxClientFileManagerFileUploadingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], fileName = fileName.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFileUploadingEventArgs]
  }
  
  extension [Self <: ASPxClientFileManagerFileUploadingEventArgs](x: Self) {
    
    inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
  }
}
