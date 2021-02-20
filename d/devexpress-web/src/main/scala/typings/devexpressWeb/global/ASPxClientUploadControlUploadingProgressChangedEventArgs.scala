package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientUploadControl.UploadingProgressChanged event.
  */
@JSGlobal("ASPxClientUploadControlUploadingProgressChangedEventArgs")
@js.native
class ASPxClientUploadControlUploadingProgressChangedEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientUploadControlUploadingProgressChangedEventArgs {
  /**
    * Initializes a new instance of the ASPxClientUploadControlUploadingProgressChangedEventArgs class.
    * @param fileCount Gets the number of the files selected for upload.
    * @param currentFileName Gets the name of the file currently being uploaded.
    * @param currentFileContentLength Gets the content length of the currently uploaded file.
    * @param currentFileUploadedContentLength Gets the content length of the current file already uploaded to the server.
    * @param currentFileProgress Gets the position of the current file upload progress.
    * @param totalContentLength Gets the content length of the files selected for upload.
    * @param uploadedContentLength Gets the content length of the files already uploaded to the server.
    * @param progress Gets the current position of total upload progress.
    */
  def this(
    fileCount: Double,
    currentFileName: String,
    currentFileContentLength: Double,
    currentFileUploadedContentLength: Double,
    currentFileProgress: Double,
    totalContentLength: Double,
    uploadedContentLength: Double,
    progress: Double
  ) = this()
}
