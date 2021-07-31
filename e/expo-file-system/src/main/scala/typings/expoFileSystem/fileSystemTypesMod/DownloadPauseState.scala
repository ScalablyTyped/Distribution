package typings.expoFileSystem.fileSystemTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DownloadPauseState extends StObject {
  
  var fileUri: String
  
  var options: DownloadOptions
  
  var resumeData: js.UndefOr[String] = js.undefined
  
  var url: String
}
object DownloadPauseState {
  
  @scala.inline
  def apply(fileUri: String, options: DownloadOptions, url: String): DownloadPauseState = {
    val __obj = js.Dynamic.literal(fileUri = fileUri.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DownloadPauseState]
  }
  
  @scala.inline
  implicit class DownloadPauseStateMutableBuilder[Self <: DownloadPauseState] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileUri(value: String): Self = StObject.set(x, "fileUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: DownloadOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumeData(value: String): Self = StObject.set(x, "resumeData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResumeDataUndefined: Self = StObject.set(x, "resumeData", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
