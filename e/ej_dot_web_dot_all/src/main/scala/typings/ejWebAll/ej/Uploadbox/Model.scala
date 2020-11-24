package typings.ejWebAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Enables the file drag and drop support to the Uploadbox control.
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.native
  
  /** Uploadbox supports both synchronous and asynchronous upload. This can be achieved by using the asyncUpload property.
    * @Default {true}
    */
  var asyncUpload: js.UndefOr[Boolean] = js.native
  
  /** Uploadbox supports auto uploading of files after the file selection is done.
    * @Default {false}
    */
  var autoUpload: js.UndefOr[Boolean] = js.native
  
  /** Fires when the upload progress beforeSend.
    */
  var beforeSend: js.UndefOr[js.Function1[/* e */ BeforeSendEventArgs, Unit]] = js.native
  
  /** Fires when the upload progress begins.
    */
  var begin: js.UndefOr[js.Function1[/* e */ BeginEventArgs, Unit]] = js.native
  
  /** Sets the text for each action button.
    * @Default {{browse: Browse, upload: Upload, cancel: Cancel, close: Close}}
    */
  var buttonText: js.UndefOr[ButtonText] = js.native
  
  /** Fires when the upload progress is cancelled.
    */
  var cancel: js.UndefOr[js.Function1[/* e */ CancelEventArgs, Unit]] = js.native
  
  /** Fires when the file upload progress is completed.
    */
  var complete: js.UndefOr[js.Function1[/* e */ CompleteEventArgs, Unit]] = js.native
  
  /** Fires when the Uploadbox control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Sets the root class for the Uploadbox control theme. This cssClass API helps to use custom skinning option for the Uploadbox button and dialog content.
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Specifies the custom file details in the dialog popup on initialization.
    * @Default {{ title:true, name:true, size:true, status:true, action:true}}
    */
  var customFileDetails: js.UndefOr[CustomFileDetails] = js.native
  
  /** Fires when the Uploadbox control is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** Specifies the actions for dialog popup while initialization.
    * @Default {{ modal:false, closeOnComplete:false, content:null, drag:true}}
    */
  var dialogAction: js.UndefOr[DialogAction] = js.native
  
  /** Displays the Uploadbox dialog at the given X and Y positions. X: Dialog sets the left position value. Y: Dialog sets the top position value.
    * @Default {null}
    */
  var dialogPosition: js.UndefOr[js.Any] = js.native
  
  /** Property for applying the text to the Dialog title and content headers.
    * @Default {{ title: Upload Box, name: Name, size: Size, status: Status}}
    */
  var dialogText: js.UndefOr[DialogText] = js.native
  
  /** Specifies the dropAreaHeight when the drag and drop support is enabled in the Uploadbox control.
    * @Default {100%}
    */
  var dropAreaHeight: js.UndefOr[Double | String] = js.native
  
  /** The dropAreaText is displayed when the drag and drop support is enabled in the Uploadbox control.
    * @Default {Drop files or click to upload}
    */
  var dropAreaText: js.UndefOr[String] = js.native
  
  /** Specifies the dropAreaWidth when the drag and drop support is enabled in the Uploadbox control.
    * @Default {100%}
    */
  var dropAreaWidth: js.UndefOr[Double | String] = js.native
  
  /** Sets the right-to-left direction property for the Uploadbox control.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** Based on the property value, Uploadbox is enabled or disabled.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Fires when the Upload process ends in Error.
    */
  var error: js.UndefOr[js.Function1[/* e */ ErrorEventArgs, Unit]] = js.native
  
  /** Only the files with the specified extension is allowed to upload. This is mentioned in the string format.
    */
  var extensionsAllow: js.UndefOr[String] = js.native
  
  /** Only the files with the specified extension is denied for upload. This is mentioned in the string format.
    */
  var extensionsDeny: js.UndefOr[String] = js.native
  
  /** Fires when the file is selected for upload successfully.
    */
  var fileSelect: js.UndefOr[js.Function1[/* e */ FileSelectEventArgs, Unit]] = js.native
  
  /** Sets the maximum size limit for uploading the file. This is mentioned in the number format.
    * @Default {31457280}
    */
  var fileSize: js.UndefOr[Double] = js.native
  
  /** Sets the height of the browse button.
    * @Default {35px}
    */
  var height: js.UndefOr[String] = js.native
  
  /** Specifies the list of HTML attributes to be added to uploadbox control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  
  /** Fires when the file is uploading.
    */
  var inProgress: js.UndefOr[js.Function1[/* e */ InProgressEventArgs, Unit]] = js.native
  
  /** Configures the culture data and sets the culture to the Uploadbox.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.native
  
  /** Enables multiple file selection for upload.
    * @Default {true}
    */
  var multipleFilesSelection: js.UndefOr[Boolean] = js.native
  
  /** You can push the file to the Uploadbox in the client-side of the XHR supported browsers alone.
    * @Default {null}
    */
  var pushFile: js.UndefOr[js.Any] = js.native
  
  /** Fires when the uploaded file is removed successfully.
    */
  var remove: js.UndefOr[js.Function1[/* e */ RemoveEventArgs, Unit]] = js.native
  
  /** Specifies the remove action to be performed after the file uploading is completed. Here, mention the server address for removal.
    */
  var removeUrl: js.UndefOr[String] = js.native
  
  /** Specifies the save action to be performed after the file is pushed for uploading. Here, mention the server address to be saved.
    */
  var saveUrl: js.UndefOr[String] = js.native
  
  /** Enables the browse button support to the Uploadbox control.
    * @Default {true}
    */
  var showBrowseButton: js.UndefOr[Boolean] = js.native
  
  /** Specifies the file details to be displayed when selected for uploading. This can be done when the showFileDetails is set to true.
    * @Default {true}
    */
  var showFileDetails: js.UndefOr[Boolean] = js.native
  
  /** Specifies the file details to be displayed when selected for uploading. This can be done when the showFileDetails is set to true.
    * @Default {true}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  
  /** Fires when the file upload progress is succeeded.
    */
  var success: js.UndefOr[js.Function1[/* e */ SuccessEventArgs, Unit]] = js.native
  
  /** Sets the name for the Uploadbox control. This API helps to Map the action in code behind to retrieve the files.
    */
  var uploadName: js.UndefOr[String] = js.native
  
  /** Sets the width of the browse button.
    * @Default {100px}
    */
  var width: js.UndefOr[String] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setAllowDragAndDrop(value: Boolean): Self = this.set("allowDragAndDrop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowDragAndDrop: Self = this.set("allowDragAndDrop", js.undefined)
    
    @scala.inline
    def setAsyncUpload(value: Boolean): Self = this.set("asyncUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAsyncUpload: Self = this.set("asyncUpload", js.undefined)
    
    @scala.inline
    def setAutoUpload(value: Boolean): Self = this.set("autoUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoUpload: Self = this.set("autoUpload", js.undefined)
    
    @scala.inline
    def setBeforeSend(value: /* e */ BeforeSendEventArgs => Unit): Self = this.set("beforeSend", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeSend: Self = this.set("beforeSend", js.undefined)
    
    @scala.inline
    def setBegin(value: /* e */ BeginEventArgs => Unit): Self = this.set("begin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    
    @scala.inline
    def setButtonText(value: ButtonText): Self = this.set("buttonText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonText: Self = this.set("buttonText", js.undefined)
    
    @scala.inline
    def setCancel(value: /* e */ CancelEventArgs => Unit): Self = this.set("cancel", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCancel: Self = this.set("cancel", js.undefined)
    
    @scala.inline
    def setComplete(value: /* e */ CompleteEventArgs => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setCustomFileDetails(value: CustomFileDetails): Self = this.set("customFileDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomFileDetails: Self = this.set("customFileDetails", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setDialogAction(value: DialogAction): Self = this.set("dialogAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogAction: Self = this.set("dialogAction", js.undefined)
    
    @scala.inline
    def setDialogPosition(value: js.Any): Self = this.set("dialogPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogPosition: Self = this.set("dialogPosition", js.undefined)
    
    @scala.inline
    def setDialogText(value: DialogText): Self = this.set("dialogText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDialogText: Self = this.set("dialogText", js.undefined)
    
    @scala.inline
    def setDropAreaHeight(value: Double | String): Self = this.set("dropAreaHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropAreaHeight: Self = this.set("dropAreaHeight", js.undefined)
    
    @scala.inline
    def setDropAreaText(value: String): Self = this.set("dropAreaText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropAreaText: Self = this.set("dropAreaText", js.undefined)
    
    @scala.inline
    def setDropAreaWidth(value: Double | String): Self = this.set("dropAreaWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropAreaWidth: Self = this.set("dropAreaWidth", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setError(value: /* e */ ErrorEventArgs => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setExtensionsAllow(value: String): Self = this.set("extensionsAllow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionsAllow: Self = this.set("extensionsAllow", js.undefined)
    
    @scala.inline
    def setExtensionsDeny(value: String): Self = this.set("extensionsDeny", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtensionsDeny: Self = this.set("extensionsDeny", js.undefined)
    
    @scala.inline
    def setFileSelect(value: /* e */ FileSelectEventArgs => Unit): Self = this.set("fileSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFileSelect: Self = this.set("fileSelect", js.undefined)
    
    @scala.inline
    def setFileSize(value: Double): Self = this.set("fileSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileSize: Self = this.set("fileSize", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    
    @scala.inline
    def setInProgress(value: /* e */ InProgressEventArgs => Unit): Self = this.set("inProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteInProgress: Self = this.set("inProgress", js.undefined)
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    
    @scala.inline
    def setMultipleFilesSelection(value: Boolean): Self = this.set("multipleFilesSelection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultipleFilesSelection: Self = this.set("multipleFilesSelection", js.undefined)
    
    @scala.inline
    def setPushFile(value: js.Any): Self = this.set("pushFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushFile: Self = this.set("pushFile", js.undefined)
    
    @scala.inline
    def setRemove(value: /* e */ RemoveEventArgs => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteRemove: Self = this.set("remove", js.undefined)
    
    @scala.inline
    def setRemoveUrl(value: String): Self = this.set("removeUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveUrl: Self = this.set("removeUrl", js.undefined)
    
    @scala.inline
    def setSaveUrl(value: String): Self = this.set("saveUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveUrl: Self = this.set("saveUrl", js.undefined)
    
    @scala.inline
    def setShowBrowseButton(value: Boolean): Self = this.set("showBrowseButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowBrowseButton: Self = this.set("showBrowseButton", js.undefined)
    
    @scala.inline
    def setShowFileDetails(value: Boolean): Self = this.set("showFileDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowFileDetails: Self = this.set("showFileDetails", js.undefined)
    
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* e */ SuccessEventArgs => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setUploadName(value: String): Self = this.set("uploadName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploadName: Self = this.set("uploadName", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
