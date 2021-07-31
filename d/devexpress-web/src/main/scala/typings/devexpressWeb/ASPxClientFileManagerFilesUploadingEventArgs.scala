package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FilesUploading event.
  */
trait ASPxClientFileManagerFilesUploadingEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean
  
  /**
    * Gets the names of files selected for upload.
    */
  var fileNames: js.Array[String]
  
  /**
    * Gets the path to the folder where files are being uploaded.
    */
  var folder: String
}
object ASPxClientFileManagerFilesUploadingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, fileNames: js.Array[String], folder: String): ASPxClientFileManagerFilesUploadingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], fileNames = fileNames.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFilesUploadingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerFilesUploadingEventArgsMutableBuilder[Self <: ASPxClientFileManagerFilesUploadingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNames(value: js.Array[String]): Self = StObject.set(x, "fileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNamesVarargs(value: String*): Self = StObject.set(x, "fileNames", js.Array(value :_*))
    
    @scala.inline
    def setFolder(value: String): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
  }
}
