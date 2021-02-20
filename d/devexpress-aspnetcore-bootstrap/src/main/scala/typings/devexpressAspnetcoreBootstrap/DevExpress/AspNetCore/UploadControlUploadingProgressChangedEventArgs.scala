package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
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
  implicit class UploadControlUploadingProgressChangedEventArgsMutableBuilder[Self <: UploadControlUploadingProgressChangedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCurrentFileContentLength(value: Double): Self = StObject.set(x, "currentFileContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFileName(value: String): Self = StObject.set(x, "currentFileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFileProgress(value: Double): Self = StObject.set(x, "currentFileProgress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentFileUploadedContentLength(value: Double): Self = StObject.set(x, "currentFileUploadedContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileCount(value: Double): Self = StObject.set(x, "fileCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalContentLength(value: Double): Self = StObject.set(x, "totalContentLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadedContentLength(value: Double): Self = StObject.set(x, "uploadedContentLength", value.asInstanceOf[js.Any])
  }
}
