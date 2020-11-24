package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadControlUploadingProgressChangedEventArgs extends EventArgs {
  
  val currentFileContentLength: Double = js.native
  
  val currentFileName: String = js.native
  
  val currentFileProgress: Double = js.native
  
  val currentFileUploadedContentLength: Double = js.native
  
  val fileCount: Double = js.native
  
  val progress: Double = js.native
  
  val totalContentLength: Double = js.native
  
  val uploadedContentLength: Double = js.native
}
object UploadControlUploadingProgressChangedEventArgs {
  
  @scala.inline
  def apply(
    currentFileContentLength: Double,
    currentFileName: String,
    currentFileProgress: Double,
    currentFileUploadedContentLength: Double,
    fileCount: Double,
    progress: Double,
    sender: Control,
    totalContentLength: Double,
    uploadedContentLength: Double
  ): UploadControlUploadingProgressChangedEventArgs = {
    val __obj = js.Dynamic.literal(currentFileContentLength = currentFileContentLength.asInstanceOf[js.Any], currentFileName = currentFileName.asInstanceOf[js.Any], currentFileProgress = currentFileProgress.asInstanceOf[js.Any], currentFileUploadedContentLength = currentFileUploadedContentLength.asInstanceOf[js.Any], fileCount = fileCount.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], sender = sender.asInstanceOf[js.Any], totalContentLength = totalContentLength.asInstanceOf[js.Any], uploadedContentLength = uploadedContentLength.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadControlUploadingProgressChangedEventArgs]
  }
  
  @scala.inline
  implicit class UploadControlUploadingProgressChangedEventArgsOps[Self <: UploadControlUploadingProgressChangedEventArgs] (val x: Self) extends AnyVal {
    
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
    def setCurrentFileContentLength(value: Double): Self = this.set("currentFileContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFileName(value: String): Self = this.set("currentFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFileProgress(value: Double): Self = this.set("currentFileProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFileUploadedContentLength(value: Double): Self = this.set("currentFileUploadedContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileCount(value: Double): Self = this.set("fileCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalContentLength(value: Double): Self = this.set("totalContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadedContentLength(value: Double): Self = this.set("uploadedContentLength", value.asInstanceOf[js.Any])
  }
}
