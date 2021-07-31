package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BootstrapUploadControlEventMap
  extends StObject
     with ControlEventMap {
  
  var dropZoneEnter: UploadControlDropZoneEnterEventArgs
  
  var dropZoneLeave: UploadControlDropZoneLeaveEventArgs
  
  var fileInputCountChanged: EventArgs
  
  var fileUploadComplete: UploadControlFileUploadCompleteEventArgs
  
  var filesUploadComplete: UploadControlFilesUploadCompleteEventArgs
  
  var filesUploadStart: UploadControlFilesUploadStartEventArgs
  
  var textChanged: UploadControlTextChangedEventArgs
  
  var uploadingProgressChanged: UploadControlUploadingProgressChangedEventArgs
  
  var validationErrorOccurred: UploadControlValidationErrorOccurredEventArgs
}
object BootstrapUploadControlEventMap {
  
  @scala.inline
  def apply(
    dropZoneEnter: UploadControlDropZoneEnterEventArgs,
    dropZoneLeave: UploadControlDropZoneLeaveEventArgs,
    fileInputCountChanged: EventArgs,
    fileUploadComplete: UploadControlFileUploadCompleteEventArgs,
    filesUploadComplete: UploadControlFilesUploadCompleteEventArgs,
    filesUploadStart: UploadControlFilesUploadStartEventArgs,
    init: EventArgs,
    textChanged: UploadControlTextChangedEventArgs,
    uploadingProgressChanged: UploadControlUploadingProgressChangedEventArgs,
    validationErrorOccurred: UploadControlValidationErrorOccurredEventArgs
  ): BootstrapUploadControlEventMap = {
    val __obj = js.Dynamic.literal(dropZoneEnter = dropZoneEnter.asInstanceOf[js.Any], dropZoneLeave = dropZoneLeave.asInstanceOf[js.Any], fileInputCountChanged = fileInputCountChanged.asInstanceOf[js.Any], fileUploadComplete = fileUploadComplete.asInstanceOf[js.Any], filesUploadComplete = filesUploadComplete.asInstanceOf[js.Any], filesUploadStart = filesUploadStart.asInstanceOf[js.Any], init = init.asInstanceOf[js.Any], textChanged = textChanged.asInstanceOf[js.Any], uploadingProgressChanged = uploadingProgressChanged.asInstanceOf[js.Any], validationErrorOccurred = validationErrorOccurred.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapUploadControlEventMap]
  }
  
  @scala.inline
  implicit class BootstrapUploadControlEventMapMutableBuilder[Self <: BootstrapUploadControlEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropZoneEnter(value: UploadControlDropZoneEnterEventArgs): Self = StObject.set(x, "dropZoneEnter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropZoneLeave(value: UploadControlDropZoneLeaveEventArgs): Self = StObject.set(x, "dropZoneLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileInputCountChanged(value: EventArgs): Self = StObject.set(x, "fileInputCountChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFileUploadComplete(value: UploadControlFileUploadCompleteEventArgs): Self = StObject.set(x, "fileUploadComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUploadComplete(value: UploadControlFilesUploadCompleteEventArgs): Self = StObject.set(x, "filesUploadComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesUploadStart(value: UploadControlFilesUploadStartEventArgs): Self = StObject.set(x, "filesUploadStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextChanged(value: UploadControlTextChangedEventArgs): Self = StObject.set(x, "textChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUploadingProgressChanged(value: UploadControlUploadingProgressChangedEventArgs): Self = StObject.set(x, "uploadingProgressChanged", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationErrorOccurred(value: UploadControlValidationErrorOccurredEventArgs): Self = StObject.set(x, "validationErrorOccurred", value.asInstanceOf[js.Any])
  }
}
