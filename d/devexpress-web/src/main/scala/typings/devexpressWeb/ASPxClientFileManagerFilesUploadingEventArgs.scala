package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientFileManager.FilesUploading event.
  */
@js.native
trait ASPxClientFileManagerFilesUploadingEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets or sets a value indicating whether the action which raised the event should be canceled.
    */
  var cancel: Boolean = js.native
  
  /**
    * Gets the names of files selected for upload.
    */
  var fileNames: js.Array[String] = js.native
  
  /**
    * Gets the path to the folder where files are being uploaded.
    */
  var folder: String = js.native
}
object ASPxClientFileManagerFilesUploadingEventArgs {
  
  @scala.inline
  def apply(cancel: Boolean, fileNames: js.Array[String], folder: String): ASPxClientFileManagerFilesUploadingEventArgs = {
    val __obj = js.Dynamic.literal(cancel = cancel.asInstanceOf[js.Any], fileNames = fileNames.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientFileManagerFilesUploadingEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientFileManagerFilesUploadingEventArgsOps[Self <: ASPxClientFileManagerFilesUploadingEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCancel(value: Boolean): Self = this.set("cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileNamesVarargs(value: String*): Self = this.set("fileNames", js.Array(value :_*))
    
    @scala.inline
    def setFileNames(value: js.Array[String]): Self = this.set("fileNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFolder(value: String): Self = this.set("folder", value.asInstanceOf[js.Any])
  }
}
