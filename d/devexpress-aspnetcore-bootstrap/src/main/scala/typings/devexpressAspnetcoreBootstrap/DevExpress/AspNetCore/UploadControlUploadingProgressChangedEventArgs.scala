package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadControlUploadingProgressChangedEventArgs
  extends StObject
     with EventArgs {
  
  val currentFileContentLength: Double
  
  val currentFileName: String
  
  val currentFileProgress: Double
  
  val currentFileUploadedContentLength: Double
  
  val fileCount: Double
  
  val progress: Double
  
  val totalContentLength: Double
  
  val uploadedContentLength: Double
}
object UploadControlUploadingProgressChangedEventArgs {
  
  inline def apply(
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
  
  extension [Self <: UploadControlUploadingProgressChangedEventArgs](x: Self) {
    
    inline def setCurrentFileContentLength(value: Double): Self = StObject.set(x, "currentFileContentLength", value.asInstanceOf[js.Any])
    
    inline def setCurrentFileName(value: String): Self = StObject.set(x, "currentFileName", value.asInstanceOf[js.Any])
    
    inline def setCurrentFileProgress(value: Double): Self = StObject.set(x, "currentFileProgress", value.asInstanceOf[js.Any])
    
    inline def setCurrentFileUploadedContentLength(value: Double): Self = StObject.set(x, "currentFileUploadedContentLength", value.asInstanceOf[js.Any])
    
    inline def setFileCount(value: Double): Self = StObject.set(x, "fileCount", value.asInstanceOf[js.Any])
    
    inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
    
    inline def setTotalContentLength(value: Double): Self = StObject.set(x, "totalContentLength", value.asInstanceOf[js.Any])
    
    inline def setUploadedContentLength(value: Double): Self = StObject.set(x, "uploadedContentLength", value.asInstanceOf[js.Any])
  }
}
