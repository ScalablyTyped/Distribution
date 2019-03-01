package typings
package ejDotWebDotAllLib.ejNs.UploadboxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Enables the file drag and drop support to the Uploadbox control.
    * @Default {false}
    */
  var allowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** Uploadbox supports both synchronous and asynchronous upload. This can be achieved by using the asyncUpload property.
    * @Default {true}
    */
  var asyncUpload: js.UndefOr[scala.Boolean] = js.undefined
  /** Uploadbox supports auto uploading of files after the file selection is done.
    * @Default {false}
    */
  var autoUpload: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when the upload progress beforeSend.
    */
  var beforeSend: js.UndefOr[js.Function1[/* e */ BeforeSendEventArgs, scala.Unit]] = js.undefined
  /** Fires when the upload progress begins.
    */
  var begin: js.UndefOr[js.Function1[/* e */ BeginEventArgs, scala.Unit]] = js.undefined
  /** Sets the text for each action button.
    * @Default {{browse: Browse, upload: Upload, cancel: Cancel, close: Close}}
    */
  var buttonText: js.UndefOr[ButtonText] = js.undefined
  /** Fires when the upload progress is cancelled.
    */
  var cancel: js.UndefOr[js.Function1[/* e */ CancelEventArgs, scala.Unit]] = js.undefined
  /** Fires when the file upload progress is completed.
    */
  var complete: js.UndefOr[js.Function1[/* e */ CompleteEventArgs, scala.Unit]] = js.undefined
  /** Fires when the Uploadbox control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, scala.Unit]] = js.undefined
  /** Sets the root class for the Uploadbox control theme. This cssClass API helps to use custom skinning option for the Uploadbox button and dialog content.
    */
  var cssClass: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the custom file details in the dialog popup on initialization.
    * @Default {{ title:true, name:true, size:true, status:true, action:true}}
    */
  var customFileDetails: js.UndefOr[CustomFileDetails] = js.undefined
  /** Fires when the Uploadbox control is destroyed.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
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
  var dropAreaHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** The dropAreaText is displayed when the drag and drop support is enabled in the Uploadbox control.
    * @Default {Drop files or click to upload}
    */
  var dropAreaText: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the dropAreaWidth when the drag and drop support is enabled in the Uploadbox control.
    * @Default {100%}
    */
  var dropAreaWidth: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /** Sets the right-to-left direction property for the Uploadbox control.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[scala.Boolean] = js.undefined
  /** Based on the property value, Uploadbox is enabled or disabled.
    * @Default {true}
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when the Upload process ends in Error.
    */
  var error: js.UndefOr[js.Function1[/* e */ ErrorEventArgs, scala.Unit]] = js.undefined
  /** Only the files with the specified extension is allowed to upload. This is mentioned in the string format.
    */
  var extensionsAllow: js.UndefOr[java.lang.String] = js.undefined
  /** Only the files with the specified extension is denied for upload. This is mentioned in the string format.
    */
  var extensionsDeny: js.UndefOr[java.lang.String] = js.undefined
  /** Fires when the file is selected for upload successfully.
    */
  var fileSelect: js.UndefOr[js.Function1[/* e */ FileSelectEventArgs, scala.Unit]] = js.undefined
  /** Sets the maximum size limit for uploading the file. This is mentioned in the number format.
    * @Default {31457280}
    */
  var fileSize: js.UndefOr[scala.Double] = js.undefined
  /** Sets the height of the browse button.
    * @Default {35px}
    */
  var height: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the list of HTML attributes to be added to uploadbox control.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.undefined
  /** Fires when the file is uploading.
    */
  var inProgress: js.UndefOr[js.Function1[/* e */ InProgressEventArgs, scala.Unit]] = js.undefined
  /** Configures the culture data and sets the culture to the Uploadbox.
    * @Default {en-US}
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Enables multiple file selection for upload.
    * @Default {true}
    */
  var multipleFilesSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** You can push the file to the Uploadbox in the client-side of the XHR supported browsers alone.
    * @Default {null}
    */
  var pushFile: js.UndefOr[js.Any] = js.undefined
  /** Fires when the uploaded file is removed successfully.
    */
  var remove: js.UndefOr[js.Function1[/* e */ RemoveEventArgs, scala.Unit]] = js.undefined
  /** Specifies the remove action to be performed after the file uploading is completed. Here, mention the server address for removal.
    */
  var removeUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Specifies the save action to be performed after the file is pushed for uploading. Here, mention the server address to be saved.
    */
  var saveUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Enables the browse button support to the Uploadbox control.
    * @Default {true}
    */
  var showBrowseButton: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the file details to be displayed when selected for uploading. This can be done when the showFileDetails is set to true.
    * @Default {true}
    */
  var showFileDetails: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the file details to be displayed when selected for uploading. This can be done when the showFileDetails is set to true.
    * @Default {true}
    */
  var showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires when the file upload progress is succeeded.
    */
  var success: js.UndefOr[js.Function1[/* e */ SuccessEventArgs, scala.Unit]] = js.undefined
  /** Sets the name for the Uploadbox control. This API helps to Map the action in code behind to retrieve the files.
    */
  var uploadName: js.UndefOr[java.lang.String] = js.undefined
  /** Sets the width of the browse button.
    * @Default {100px}
    */
  var width: js.UndefOr[java.lang.String] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    allowDragAndDrop: js.UndefOr[scala.Boolean] = js.undefined,
    asyncUpload: js.UndefOr[scala.Boolean] = js.undefined,
    autoUpload: js.UndefOr[scala.Boolean] = js.undefined,
    beforeSend: js.Function1[/* e */ BeforeSendEventArgs, scala.Unit] = null,
    begin: js.Function1[/* e */ BeginEventArgs, scala.Unit] = null,
    buttonText: ButtonText = null,
    cancel: js.Function1[/* e */ CancelEventArgs, scala.Unit] = null,
    complete: js.Function1[/* e */ CompleteEventArgs, scala.Unit] = null,
    create: js.Function1[/* e */ CreateEventArgs, scala.Unit] = null,
    cssClass: java.lang.String = null,
    customFileDetails: CustomFileDetails = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    dialogAction: DialogAction = null,
    dialogPosition: js.Any = null,
    dialogText: DialogText = null,
    dropAreaHeight: scala.Double | java.lang.String = null,
    dropAreaText: java.lang.String = null,
    dropAreaWidth: scala.Double | java.lang.String = null,
    enableRTL: js.UndefOr[scala.Boolean] = js.undefined,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    error: js.Function1[/* e */ ErrorEventArgs, scala.Unit] = null,
    extensionsAllow: java.lang.String = null,
    extensionsDeny: java.lang.String = null,
    fileSelect: js.Function1[/* e */ FileSelectEventArgs, scala.Unit] = null,
    fileSize: scala.Int | scala.Double = null,
    height: java.lang.String = null,
    htmlAttributes: js.Any = null,
    inProgress: js.Function1[/* e */ InProgressEventArgs, scala.Unit] = null,
    locale: java.lang.String = null,
    multipleFilesSelection: js.UndefOr[scala.Boolean] = js.undefined,
    pushFile: js.Any = null,
    remove: js.Function1[/* e */ RemoveEventArgs, scala.Unit] = null,
    removeUrl: java.lang.String = null,
    saveUrl: java.lang.String = null,
    showBrowseButton: js.UndefOr[scala.Boolean] = js.undefined,
    showFileDetails: js.UndefOr[scala.Boolean] = js.undefined,
    showRoundedCorner: js.UndefOr[scala.Boolean] = js.undefined,
    success: js.Function1[/* e */ SuccessEventArgs, scala.Unit] = null,
    uploadName: java.lang.String = null,
    width: java.lang.String = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDragAndDrop)) __obj.updateDynamic("allowDragAndDrop")(allowDragAndDrop)
    if (!js.isUndefined(asyncUpload)) __obj.updateDynamic("asyncUpload")(asyncUpload)
    if (!js.isUndefined(autoUpload)) __obj.updateDynamic("autoUpload")(autoUpload)
    if (beforeSend != null) __obj.updateDynamic("beforeSend")(beforeSend)
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (buttonText != null) __obj.updateDynamic("buttonText")(buttonText)
    if (cancel != null) __obj.updateDynamic("cancel")(cancel)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (create != null) __obj.updateDynamic("create")(create)
    if (cssClass != null) __obj.updateDynamic("cssClass")(cssClass)
    if (customFileDetails != null) __obj.updateDynamic("customFileDetails")(customFileDetails)
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (dialogAction != null) __obj.updateDynamic("dialogAction")(dialogAction)
    if (dialogPosition != null) __obj.updateDynamic("dialogPosition")(dialogPosition)
    if (dialogText != null) __obj.updateDynamic("dialogText")(dialogText)
    if (dropAreaHeight != null) __obj.updateDynamic("dropAreaHeight")(dropAreaHeight.asInstanceOf[js.Any])
    if (dropAreaText != null) __obj.updateDynamic("dropAreaText")(dropAreaText)
    if (dropAreaWidth != null) __obj.updateDynamic("dropAreaWidth")(dropAreaWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(enableRTL)) __obj.updateDynamic("enableRTL")(enableRTL)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (error != null) __obj.updateDynamic("error")(error)
    if (extensionsAllow != null) __obj.updateDynamic("extensionsAllow")(extensionsAllow)
    if (extensionsDeny != null) __obj.updateDynamic("extensionsDeny")(extensionsDeny)
    if (fileSelect != null) __obj.updateDynamic("fileSelect")(fileSelect)
    if (fileSize != null) __obj.updateDynamic("fileSize")(fileSize.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height)
    if (htmlAttributes != null) __obj.updateDynamic("htmlAttributes")(htmlAttributes)
    if (inProgress != null) __obj.updateDynamic("inProgress")(inProgress)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (!js.isUndefined(multipleFilesSelection)) __obj.updateDynamic("multipleFilesSelection")(multipleFilesSelection)
    if (pushFile != null) __obj.updateDynamic("pushFile")(pushFile)
    if (remove != null) __obj.updateDynamic("remove")(remove)
    if (removeUrl != null) __obj.updateDynamic("removeUrl")(removeUrl)
    if (saveUrl != null) __obj.updateDynamic("saveUrl")(saveUrl)
    if (!js.isUndefined(showBrowseButton)) __obj.updateDynamic("showBrowseButton")(showBrowseButton)
    if (!js.isUndefined(showFileDetails)) __obj.updateDynamic("showFileDetails")(showFileDetails)
    if (!js.isUndefined(showRoundedCorner)) __obj.updateDynamic("showRoundedCorner")(showRoundedCorner)
    if (success != null) __obj.updateDynamic("success")(success)
    if (uploadName != null) __obj.updateDynamic("uploadName")(uploadName)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Model]
  }
}

