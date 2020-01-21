package typings.ejWebAll.ej.Uploadbox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Enables the file drag and drop support to the Uploadbox control.
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[Boolean] = js.undefined
  /** Uploadbox supports both synchronous and asynchronous upload. This can be achieved by using the asyncUpload property.
    * @Default {true}
    */
  var asyncUpload: js.UndefOr[Boolean] = js.undefined
  /** Uploadbox supports auto uploading of files after the file selection is done.
    * @Default {false}
    */
  var autoUpload: js.UndefOr[Boolean] = js.undefined
  /** Fires when the upload progress beforeSend.
    */
  var beforeSend: js.UndefOr[js.Function1[/* e */ BeforeSendEventArgs, Unit]] = js.undefined
  /** Fires when the upload progress begins.
    */
  var begin: js.UndefOr[js.Function1[/* e */ BeginEventArgs, Unit]] = js.undefined
  /** Sets the text for each action button.
    * @Default {{browse: Browse, upload: Upload, cancel: Cancel, close: Close}}
    */
  var buttonText: js.UndefOr[ButtonText] = js.undefined
  /** Fires when the upload progress is cancelled.
    */
  var cancel: js.UndefOr[js.Function1[/* e */ CancelEventArgs, Unit]] = js.undefined
  /** Fires when the file upload progress is completed.
    */
  var complete: js.UndefOr[js.Function1[/* e */ CompleteEventArgs, Unit]] = js.undefined
  /** Fires when the Uploadbox control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
  /** Sets the root class for the Uploadbox control theme. This cssClass API helps to use custom skinning option for the Uploadbox button and dialog content.
    */
  var cssClass: js.UndefOr[String] = js.undefined
  /** Specifies the custom file details in the dialog popup on initialization.
    * @Default {{ title:true, name:true, size:true, status:true, action:true}}
    */
  var customFileDetails: js.UndefOr[CustomFileDetails] = js.undefined
  /** Fires when the Uploadbox control is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
  /** Specifies the actions for dialog popup while initialization.
    * @Default {{ modal:false, closeOnComplete:false, content:null, drag:true}}
    */
  var dialogAction: js.UndefOr[DialogAction] = js.undefined
  /** Displays the Uploadbox dialog at the given X and Y positions. X: Dialog sets the left position value. Y: Dialog sets the top position value.
    * @Default {null}
    */
  var dialogPosition: js.UndefOr[js.Any] = js.undefined
  /** Property for applying the text to the Dialog title and content headers.
    * @Default {{ title: Upload Box, name: Name, size: Size, status: Status}}
    */
  var dialogText: js.UndefOr[DialogText] = js.undefined
  /** Specifies the dropAreaHeight when the drag and drop support is enabled in the Uploadbox control.
    * @Default {100%}
    */
  var dropAreaHeight: js.UndefOr[Double | String] = js.undefined
  /** The dropAreaText is displayed when the drag and drop support is enabled in the Uploadbox control.
    * @Default {Drop files or click to upload}
    */
  var dropAreaText: js.UndefOr[String] = js.undefined
  /** Specifies the dropAreaWidth when the drag and drop support is enabled in the Uploadbox control.
    * @Default {100%}
    */
  var dropAreaWidth: js.UndefOr[Double | String] = js.undefined
  /** Sets the right-to-left direction property for the Uploadbox control.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.undefined
  /** Based on the property value, Uploadbox is enabled or disabled.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /** Fires when the Upload process ends in Error.
    */
  var error: js.UndefOr[js.Function1[/* e */ ErrorEventArgs, Unit]] = js.undefined
  /** Only the files with the specified extension is allowed to upload. This is mentioned in the string format.
    */
  var extensionsAllow: js.UndefOr[String] = js.undefined
  /** Only the files with the specified extension is denied for upload. This is mentioned in the string format.
    */
  var extensionsDeny: js.UndefOr[String] = js.undefined
  /** Fires when the file is selected for upload successfully.
    */
  var fileSelect: js.UndefOr[js.Function1[/* e */ FileSelectEventArgs, Unit]] = js.undefined
  /** Sets the maximum size limit for uploading the file. This is mentioned in the number format.
    * @Default {31457280}
    */
  var fileSize: js.UndefOr[Double] = js.undefined
  /** Sets the height of the browse button.
    * @Default {35px}
    */
  var height: js.UndefOr[String] = js.undefined
  /** Specifies the list of HTML attributes to be added to uploadbox control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Fires when the file is uploading.
    */
  var inProgress: js.UndefOr[js.Function1[/* e */ InProgressEventArgs, Unit]] = js.undefined
  /** Configures the culture data and sets the culture to the Uploadbox.
    * @Default {en-US}
    */
  var locale: js.UndefOr[String] = js.undefined
  /** Enables multiple file selection for upload.
    * @Default {true}
    */
  var multipleFilesSelection: js.UndefOr[Boolean] = js.undefined
  /** You can push the file to the Uploadbox in the client-side of the XHR supported browsers alone.
    * @Default {null}
    */
  var pushFile: js.UndefOr[js.Any] = js.undefined
  /** Fires when the uploaded file is removed successfully.
    */
  var remove: js.UndefOr[js.Function1[/* e */ RemoveEventArgs, Unit]] = js.undefined
  /** Specifies the remove action to be performed after the file uploading is completed. Here, mention the server address for removal.
    */
  var removeUrl: js.UndefOr[String] = js.undefined
  /** Specifies the save action to be performed after the file is pushed for uploading. Here, mention the server address to be saved.
    */
  var saveUrl: js.UndefOr[String] = js.undefined
  /** Enables the browse button support to the Uploadbox control.
    * @Default {true}
    */
  var showBrowseButton: js.UndefOr[Boolean] = js.undefined
  /** Specifies the file details to be displayed when selected for uploading. This can be done when the showFileDetails is set to true.
    * @Default {true}
    */
  var showFileDetails: js.UndefOr[Boolean] = js.undefined
  /** Specifies the file details to be displayed when selected for uploading. This can be done when the showFileDetails is set to true.
    * @Default {true}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
  /** Fires when the file upload progress is succeeded.
    */
  var success: js.UndefOr[js.Function1[/* e */ SuccessEventArgs, Unit]] = js.undefined
  /** Sets the name for the Uploadbox control. This API helps to Map the action in code behind to retrieve the files.
    */
  var uploadName: js.UndefOr[String] = js.undefined
  /** Sets the width of the browse button.
    * @Default {100px}
    */
  var width: js.UndefOr[String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowDragAndDrop: js.UndefOr[Boolean] = js.undefined,
    asyncUpload: js.UndefOr[Boolean] = js.undefined,
    autoUpload: js.UndefOr[Boolean] = js.undefined,
    beforeSend: /* e */ BeforeSendEventArgs => Unit = null,
    begin: /* e */ BeginEventArgs => Unit = null,
    buttonText: ButtonText = null,
    cancel: /* e */ CancelEventArgs => Unit = null,
    complete: /* e */ CompleteEventArgs => Unit = null,
    create: /* e */ CreateEventArgs => Unit = null,
    cssClass: String = null,
    customFileDetails: CustomFileDetails = null,
    destroy: /* e */ DestroyEventArgs => Unit = null,
    dialogAction: DialogAction = null,
    dialogPosition: js.Any = null,
    dialogText: DialogText = null,
    dropAreaHeight: Double | String = null,
    dropAreaText: String = null,
    dropAreaWidth: Double | String = null,
    enableRTL: js.UndefOr[Boolean] = js.undefined,
    enabled: js.UndefOr[Boolean] = js.undefined,
    error: /* e */ ErrorEventArgs => Unit = null,
    extensionsAllow: String = null,
    extensionsDeny: String = null,
    fileSelect: /* e */ FileSelectEventArgs => Unit = null,
    fileSize: Int | Double = null,
    height: String = null,
    htmlAttributes: js.Any = null,
    inProgress: /* e */ InProgressEventArgs => Unit = null,
    locale: String = null,
    multipleFilesSelection: js.UndefOr[Boolean] = js.undefined,
    pushFile: js.Any = null,
    remove: /* e */ RemoveEventArgs => Unit = null,
    removeUrl: String = null,
    saveUrl: String = null,
    showBrowseButton: js.UndefOr[Boolean] = js.undefined,
    showFileDetails: js.UndefOr[Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[Boolean] = js.undefined,
    success: /* e */ SuccessEventArgs => Unit = null,
    uploadName: String = null,
    width: String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop.asInstanceOf[js.Any])
    if (!js.isUndefined(asyncUpload)) __obj.updateDynamic("asyncUpload")(asyncUpload.asInstanceOf[js.Any])
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload.asInstanceOf[js.Any])
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(js.Any.fromFunction1(beforeSend))
    if (begin != null) __obj.updateDynamic("begin")(js.Any.fromFunction1(begin))
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText.asInstanceOf[js.Any])
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction1(cancel))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (create != null) __obj.updateDynamic("create")(js.Any.fromFunction1(create))
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass.asInstanceOf[js.Any])
    if (customFileDetails != null) __obj.updateDynamic("customFileDetails")(customFileDetails.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (dialogAction != null) __obj.updateDynamic("dialogAction")(dialogAction.asInstanceOf[js.Any])
    if (dialogPosition != null) __obj.updateDynamic("dialogPosition")(dialogPosition.asInstanceOf[js.Any])
    if (dialogText != null) __obj.updateDynamic("dialogText")(dialogText.asInstanceOf[js.Any])
    if (dropAreaHeight != null) __obj.updateDynamic("dropAreaHeight")(dropAreaHeight.asInstanceOf[js.Any])
    if (dropAreaText != null) __obj.updateDynamic("dropAreaText")(dropAreaText.asInstanceOf[js.Any])
    if (dropAreaWidth != null) __obj.updateDynamic("dropAreaWidth")(dropAreaWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (extensionsAllow != null) __obj.updateDynamic("extensionsAllow")(extensionsAllow.asInstanceOf[js.Any])
    if (extensionsDeny != null) __obj.updateDynamic("extensionsDeny")(extensionsDeny.asInstanceOf[js.Any])
    if (fileSelect != null) __obj.updateDynamic("fileSelect")(js.Any.fromFunction1(fileSelect))
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes.asInstanceOf[js.Any])
    if (inProgress != null) __obj.updateDynamic("inProgress")(js.Any.fromFunction1(inProgress))
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(multipleFilesSelection)) __obj.updateDynamic("multipleFilesSelection")(multipleFilesSelection.asInstanceOf[js.Any])
    if (pushFile != null) __obj.updateDynamic("pushFile")(pushFile.asInstanceOf[js.Any])
    if (remove != null) __obj.updateDynamic("remove")(js.Any.fromFunction1(remove))
    if (removeUrl != null) __obj.updateDynamic("removeUrl")(removeUrl.asInstanceOf[js.Any])
    if (saveUrl != null) __obj.updateDynamic("saveUrl")(saveUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(showBrowseButton)) __obj.updateDynamic("showBrowseButton")(showBrowseButton.asInstanceOf[js.Any])
    if (!js.isUndefined(showFileDetails)) __obj.updateDynamic("showFileDetails")(showFileDetails.asInstanceOf[js.Any])
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner.asInstanceOf[js.Any])
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    if (uploadName != null) __obj.updateDynamic("uploadName")(uploadName.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

