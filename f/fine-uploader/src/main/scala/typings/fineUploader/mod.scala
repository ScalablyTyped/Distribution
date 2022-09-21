package typings.fineUploader

import typings.fineUploader.coreMod.CoreOptions
import typings.fineUploader.coreMod.CustomResizerCallBack
import typings.fineUploader.coreMod.DeleteFileOptions
import typings.fineUploader.coreMod.FineUploaderBasic
import typings.fineUploader.coreMod.Messages
import typings.fineUploader.coreMod.PasteOptions
import typings.fineUploader.coreMod.PromiseOptions
import typings.fineUploader.coreMod.ResizeInfo
import typings.fineUploader.coreMod.RetryOptions
import typings.fineUploader.coreMod.ScalingOptions
import typings.fineUploader.coreMod.TextOptions
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fine-uploader", "FineUploader")
  @js.native
  /**
    * The FineUploader Core + UI constructor
    */
  open class FineUploader () extends FineUploaderBasic {
    def this(fineuploaderOptions: UIOptions) = this()
    
    /**
      * Mark `element` as a drop zone
      *
      * @param HTMLElement element : The element to mark as a drop zone
      */
    def addExtraDropzone(element: HTMLElement): Unit = js.native
    
    /**
      * Returns the (drop zone) element where the file was dropped. Undefined if drop event was not involved
      *
      * @param number id : The file id
      * @returns HTMLElement : The drop zone element where the file was dropped
      */
    def getDropTarget(id: Double): HTMLElement = js.native
    
    /**
      * Returns the file `id` associated with an `HTMLElement`
      *
      * @param HTMLElement element : Returns the ID of the associated file, given a file container element or a child of a file container element
      * @returns number : the id of the file
      */
    def getId(element: HTMLElement): Double = js.native
    
    /**
      * Returns the `HTMLElement` associated with the file id
      *
      * @param number id : The file id
      * @returns HTMLElement : The `HTMLElement` that is associated with the file id
      */
    def getItemByFileId(id: Double): HTMLElement = js.native
    
    /**
      * Used to un-mark an `element` as a drop zone
      *
      * @param HTMLElement element : The element to un-mark as a drop zone
      */
    def removeExtraDropzone(element: HTMLElement): Unit = js.native
  }
  
  type ShowConfirmFunction = js.Function1[/* message */ String, PromiseOptions | Unit]
  
  type ShowMessageFunction = js.Function1[/* message */ String, PromiseOptions | Unit]
  
  type ShowPromptFunction = js.Function2[/* message */ String, /* defaultValue */ String, PromiseOptions | Unit]
  
  trait UIDeleteFileOptions
    extends StObject
       with DeleteFileOptions {
    
    /**
      * The message displayed in the confirm delete dialog
      *
      * @default `'Are you sure you want to delete {filename}?'`
      */
    var confirmMessage: js.UndefOr[String] = js.undefined
    
    /**
      * The status message to appear next to a file that has failed to delete
      *
      * @default `'Delete failed'`
      */
    var deletingFailedText: js.UndefOr[String] = js.undefined
    
    /**
      * The status message to appear next to a file that is pending deletion
      *
      * @default `'Deleting...'`
      */
    var deletingStatusText: js.UndefOr[String] = js.undefined
    
    /**
      * If this value is set to `true`, the user will be required to confirm the file delete request via a confirmation dialog
      *
      * @default `false`
      */
    var forceConfirm: js.UndefOr[Boolean] = js.undefined
  }
  object UIDeleteFileOptions {
    
    inline def apply(): UIDeleteFileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIDeleteFileOptions]
    }
    
    extension [Self <: UIDeleteFileOptions](x: Self) {
      
      inline def setConfirmMessage(value: String): Self = StObject.set(x, "confirmMessage", value.asInstanceOf[js.Any])
      
      inline def setConfirmMessageUndefined: Self = StObject.set(x, "confirmMessage", js.undefined)
      
      inline def setDeletingFailedText(value: String): Self = StObject.set(x, "deletingFailedText", value.asInstanceOf[js.Any])
      
      inline def setDeletingFailedTextUndefined: Self = StObject.set(x, "deletingFailedText", js.undefined)
      
      inline def setDeletingStatusText(value: String): Self = StObject.set(x, "deletingStatusText", value.asInstanceOf[js.Any])
      
      inline def setDeletingStatusTextUndefined: Self = StObject.set(x, "deletingStatusText", js.undefined)
      
      inline def setForceConfirm(value: Boolean): Self = StObject.set(x, "forceConfirm", value.asInstanceOf[js.Any])
      
      inline def setForceConfirmUndefined: Self = StObject.set(x, "forceConfirm", js.undefined)
    }
  }
  
  trait UIDisplayOptions extends StObject {
    
    /**
      * Enable or disable the display of the file size next to the file after it has been submitted
      *
      * @default `false`
      */
    var fileSizeOnSubmit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * When `true` batches of files are added to the top of the UI's file list. The default is to append file(s) to the bottom of the list
      *
      * @default `false`
      */
    var prependFiles: js.UndefOr[Boolean] = js.undefined
  }
  object UIDisplayOptions {
    
    inline def apply(): UIDisplayOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIDisplayOptions]
    }
    
    extension [Self <: UIDisplayOptions](x: Self) {
      
      inline def setFileSizeOnSubmit(value: Boolean): Self = StObject.set(x, "fileSizeOnSubmit", value.asInstanceOf[js.Any])
      
      inline def setFileSizeOnSubmitUndefined: Self = StObject.set(x, "fileSizeOnSubmit", js.undefined)
      
      inline def setPrependFiles(value: Boolean): Self = StObject.set(x, "prependFiles", value.asInstanceOf[js.Any])
      
      inline def setPrependFilesUndefined: Self = StObject.set(x, "prependFiles", js.undefined)
    }
  }
  
  trait UIDragAndDropOptions extends StObject {
    
    /**
      * Designate additional drop zones for file input
      *
      * @default `[]`
      */
    var extraDropzones: js.UndefOr[js.Array[Any]] = js.undefined
    
    /**
      * Include the path of dropped files (starting with the top-level dropped directory). This value will be sent along with the request as a qqpath parameter
      *
      * @default `false`
      */
    var reportDirectoryPaths: js.UndefOr[Boolean] = js.undefined
  }
  object UIDragAndDropOptions {
    
    inline def apply(): UIDragAndDropOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIDragAndDropOptions]
    }
    
    extension [Self <: UIDragAndDropOptions](x: Self) {
      
      inline def setExtraDropzones(value: js.Array[Any]): Self = StObject.set(x, "extraDropzones", value.asInstanceOf[js.Any])
      
      inline def setExtraDropzonesUndefined: Self = StObject.set(x, "extraDropzones", js.undefined)
      
      inline def setExtraDropzonesVarargs(value: Any*): Self = StObject.set(x, "extraDropzones", js.Array(value*))
      
      inline def setReportDirectoryPaths(value: Boolean): Self = StObject.set(x, "reportDirectoryPaths", value.asInstanceOf[js.Any])
      
      inline def setReportDirectoryPathsUndefined: Self = StObject.set(x, "reportDirectoryPaths", js.undefined)
    }
  }
  
  trait UIFailedUploadTextDisplay extends StObject {
    
    /**
      * Enable or disable a tooltip that will display the full contents of the error message when the mouse pointer hovers over the failed item.
      *
      * @default `true`
      */
    var enableTooltip: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set the message to display next to each failed file.
      *
      * One of: 'default' which displays the failedUploadText, 'custom' which displays the error response from the server, or 'none' which displays no text
      *
      * @default `'default'`
      */
    var mode: js.UndefOr[String] = js.undefined
    
    /**
      * The property from the server response that contains the error text to display next to a failed item. Ignored unless `mode` is `'custom'`
      *
      * @default `'error'`
      */
    var responseProperty: js.UndefOr[String] = js.undefined
  }
  object UIFailedUploadTextDisplay {
    
    inline def apply(): UIFailedUploadTextDisplay = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIFailedUploadTextDisplay]
    }
    
    extension [Self <: UIFailedUploadTextDisplay](x: Self) {
      
      inline def setEnableTooltip(value: Boolean): Self = StObject.set(x, "enableTooltip", value.asInstanceOf[js.Any])
      
      inline def setEnableTooltipUndefined: Self = StObject.set(x, "enableTooltip", js.undefined)
      
      inline def setMode(value: String): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setResponseProperty(value: String): Self = StObject.set(x, "responseProperty", value.asInstanceOf[js.Any])
      
      inline def setResponsePropertyUndefined: Self = StObject.set(x, "responseProperty", js.undefined)
    }
  }
  
  trait UIMessages
    extends StObject
       with Messages {
    
    /**
      * Text sent to `showMessage` when `multiple` is `false` and more than one file is dropped at once
      *
      * @default `'You may only drop one file.'`
      */
    var tooManyFilesError: js.UndefOr[String] = js.undefined
    
    /**
      * Text displayed to users who have ancient browsers
      *
      * @default `'Unrecoverable error - the browser does not permit uploading of any kind.'`
      */
    var unsupportedBrowser: js.UndefOr[String] = js.undefined
  }
  object UIMessages {
    
    inline def apply(): UIMessages = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIMessages]
    }
    
    extension [Self <: UIMessages](x: Self) {
      
      inline def setTooManyFilesError(value: String): Self = StObject.set(x, "tooManyFilesError", value.asInstanceOf[js.Any])
      
      inline def setTooManyFilesErrorUndefined: Self = StObject.set(x, "tooManyFilesError", js.undefined)
      
      inline def setUnsupportedBrowser(value: String): Self = StObject.set(x, "unsupportedBrowser", value.asInstanceOf[js.Any])
      
      inline def setUnsupportedBrowserUndefined: Self = StObject.set(x, "unsupportedBrowser", js.undefined)
    }
  }
  
  trait UIOptions
    extends StObject
       with CoreOptions {
    
    /**
      * UIDeleteFileOptions
      */
    @JSName("deleteFile")
    var deleteFile_UIOptions: js.UndefOr[UIDeleteFileOptions] = js.undefined
    
    /**
      * display options
      */
    var display: js.UndefOr[UIDisplayOptions] = js.undefined
    
    /**
      * dragAndDrop options
      */
    var dragAndDrop: js.UndefOr[UIDragAndDropOptions] = js.undefined
    
    /**
      * Container element for the default drop zone
      *
      * @default `null`
      */
    var element: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * failedUploadTextDisplay options
      */
    var failedUploadTextDisplay: js.UndefOr[UIFailedUploadTextDisplay] = js.undefined
    
    /**
      * Container element for the item list
      *
      * @default `null`
      */
    var listElement: js.UndefOr[HTMLElement] = js.undefined
    
    /**
      * messages
      */
    @JSName("messages")
    var messages_UIOptions: js.UndefOr[UIMessages] = js.undefined
    
    /**
      * paste UI options
      */
    @JSName("paste")
    var paste_UIOptions: js.UndefOr[UIPasteOptions] = js.undefined
    
    /**
      * retry options
      */
    var retry: js.UndefOr[UIRetryOptions] = js.undefined
    
    /**
      * UI scaling options
      */
    @JSName("scaling")
    var scaling_UIOptions: js.UndefOr[UIScalingOptions] = js.undefined
    
    /**
      * Provide a function here to prompt the user to confirm deletion of a file.
      *
      * The provided function may return a promise if one wishes to do asynchronous work whilst waiting for user input
      *
      * @default `function(message) { window.confirm(message); }`
      */
    var showConfirm: js.UndefOr[ShowConfirmFunction] = js.undefined
    
    /**
      * Provide a function here to display a message to the user when the uploader receives an error or the user attempts to leave the page.
      *
      * The provided function may return a promise if one wishes to do asynchronous work whilst waiting for user input
      *
      * @default `function(message) { window.alert(message); }`
      */
    var showMessage: js.UndefOr[ShowMessageFunction] = js.undefined
    
    /**
      * Provide a function here to prompt the user for a filename when pasting file(s).
      *
      * The provided function may return a promise if one wishes to do asynchronous work whilst waiting for user input
      *
      * @default `function(message, defaultValue) { window.prompt(message, defaultValue); }`
      */
    var showPrompt: js.UndefOr[ShowPromptFunction] = js.undefined
    
    /**
      * This points to the container element that contains the template to use for one or more Fine Uploader UI instances.
      *
      * You can either specify a string, which is the element ID (the ID of the container element on the page) or an `Element` that points to the container element
      *
      * @default `'qq-template'`
      */
    var template: js.UndefOr[String | HTMLElement] = js.undefined
    
    /**
      * UI text options
      */
    @JSName("text")
    var text_UIOptions: js.UndefOr[UITextOptions] = js.undefined
    
    /**
      * thumbnail options
      */
    var thumbnails: js.UndefOr[UIThumbnailsOptions] = js.undefined
  }
  object UIOptions {
    
    inline def apply(): UIOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIOptions]
    }
    
    extension [Self <: UIOptions](x: Self) {
      
      inline def setDeleteFile(value: UIDeleteFileOptions): Self = StObject.set(x, "deleteFile", value.asInstanceOf[js.Any])
      
      inline def setDeleteFileUndefined: Self = StObject.set(x, "deleteFile", js.undefined)
      
      inline def setDisplay(value: UIDisplayOptions): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setDragAndDrop(value: UIDragAndDropOptions): Self = StObject.set(x, "dragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setDragAndDropUndefined: Self = StObject.set(x, "dragAndDrop", js.undefined)
      
      inline def setElement(value: HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setFailedUploadTextDisplay(value: UIFailedUploadTextDisplay): Self = StObject.set(x, "failedUploadTextDisplay", value.asInstanceOf[js.Any])
      
      inline def setFailedUploadTextDisplayUndefined: Self = StObject.set(x, "failedUploadTextDisplay", js.undefined)
      
      inline def setListElement(value: HTMLElement): Self = StObject.set(x, "listElement", value.asInstanceOf[js.Any])
      
      inline def setListElementUndefined: Self = StObject.set(x, "listElement", js.undefined)
      
      inline def setMessages(value: UIMessages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
      
      inline def setPaste(value: UIPasteOptions): Self = StObject.set(x, "paste", value.asInstanceOf[js.Any])
      
      inline def setPasteUndefined: Self = StObject.set(x, "paste", js.undefined)
      
      inline def setRetry(value: UIRetryOptions): Self = StObject.set(x, "retry", value.asInstanceOf[js.Any])
      
      inline def setRetryUndefined: Self = StObject.set(x, "retry", js.undefined)
      
      inline def setScaling(value: UIScalingOptions): Self = StObject.set(x, "scaling", value.asInstanceOf[js.Any])
      
      inline def setScalingUndefined: Self = StObject.set(x, "scaling", js.undefined)
      
      inline def setShowConfirm(value: /* message */ String => PromiseOptions | Unit): Self = StObject.set(x, "showConfirm", js.Any.fromFunction1(value))
      
      inline def setShowConfirmUndefined: Self = StObject.set(x, "showConfirm", js.undefined)
      
      inline def setShowMessage(value: /* message */ String => PromiseOptions | Unit): Self = StObject.set(x, "showMessage", js.Any.fromFunction1(value))
      
      inline def setShowMessageUndefined: Self = StObject.set(x, "showMessage", js.undefined)
      
      inline def setShowPrompt(value: (/* message */ String, /* defaultValue */ String) => PromiseOptions | Unit): Self = StObject.set(x, "showPrompt", js.Any.fromFunction2(value))
      
      inline def setShowPromptUndefined: Self = StObject.set(x, "showPrompt", js.undefined)
      
      inline def setTemplate(value: String | HTMLElement): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setText(value: UITextOptions): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setThumbnails(value: UIThumbnailsOptions): Self = StObject.set(x, "thumbnails", value.asInstanceOf[js.Any])
      
      inline def setThumbnailsUndefined: Self = StObject.set(x, "thumbnails", js.undefined)
    }
  }
  
  trait UIPasteOptions
    extends StObject
       with PasteOptions {
    
    /**
      * Text that will appear in the `showPrompt` dialog.
      *
      * @default `Please name this image`
      */
    var namePromptMessage: js.UndefOr[String] = js.undefined
    
    /**
      * Enable or disable the usage of `showPrompt` by Fine Uploader to prompt the user for a filename for a pasted file
      *
      * @default `false`
      */
    var promptForName: js.UndefOr[Boolean] = js.undefined
  }
  object UIPasteOptions {
    
    inline def apply(): UIPasteOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIPasteOptions]
    }
    
    extension [Self <: UIPasteOptions](x: Self) {
      
      inline def setNamePromptMessage(value: String): Self = StObject.set(x, "namePromptMessage", value.asInstanceOf[js.Any])
      
      inline def setNamePromptMessageUndefined: Self = StObject.set(x, "namePromptMessage", js.undefined)
      
      inline def setPromptForName(value: Boolean): Self = StObject.set(x, "promptForName", value.asInstanceOf[js.Any])
      
      inline def setPromptForNameUndefined: Self = StObject.set(x, "promptForName", js.undefined)
    }
  }
  
  trait UIRetryOptions
    extends StObject
       with RetryOptions {
    
    /**
      * The text of the note that will optionally appear next to the item during automatic retry attempts.
      *
      * Ignored if `showAutoRetryNote` is false.
      *
      * @default `'Retrying {retryNum}/{maxAuto} ...'`
      */
    var autoRetryNote: js.UndefOr[String] = js.undefined
    
    /**
      * Enable or disable a status message appearing next to the item during auto retry attempts
      *
      * @default `true`
      */
    var showAutoRetryNote: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable or disable the showing of a button/link next to the failed item after all retry attempts have been exhausted.
      *
      * Clicking the button/link will force the uploader to make another attempt
      *
      * @default `false`
      */
    var showButton: js.UndefOr[Boolean] = js.undefined
  }
  object UIRetryOptions {
    
    inline def apply(): UIRetryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIRetryOptions]
    }
    
    extension [Self <: UIRetryOptions](x: Self) {
      
      inline def setAutoRetryNote(value: String): Self = StObject.set(x, "autoRetryNote", value.asInstanceOf[js.Any])
      
      inline def setAutoRetryNoteUndefined: Self = StObject.set(x, "autoRetryNote", js.undefined)
      
      inline def setShowAutoRetryNote(value: Boolean): Self = StObject.set(x, "showAutoRetryNote", value.asInstanceOf[js.Any])
      
      inline def setShowAutoRetryNoteUndefined: Self = StObject.set(x, "showAutoRetryNote", js.undefined)
      
      inline def setShowButton(value: Boolean): Self = StObject.set(x, "showButton", value.asInstanceOf[js.Any])
      
      inline def setShowButtonUndefined: Self = StObject.set(x, "showButton", js.undefined)
    }
  }
  
  trait UIScalingOptions
    extends StObject
       with ScalingOptions {
    
    /**
      * Set this to true if you do not want any scaled images to be displayed in the file list
      *
      * @default `false`
      */
    var hideScaled: js.UndefOr[Boolean] = js.undefined
  }
  object UIScalingOptions {
    
    inline def apply(): UIScalingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIScalingOptions]
    }
    
    extension [Self <: UIScalingOptions](x: Self) {
      
      inline def setHideScaled(value: Boolean): Self = StObject.set(x, "hideScaled", value.asInstanceOf[js.Any])
      
      inline def setHideScaledUndefined: Self = StObject.set(x, "hideScaled", js.undefined)
    }
  }
  
  trait UITextOptions
    extends StObject
       with TextOptions {
    
    /**
      * Text that appears next to a failed item
      *
      * @default `'Upload failed'`
      */
    var failUpload: js.UndefOr[String] = js.undefined
    
    /**
      * Appears next to a currently uploading item
      *
      * @default `'{percent}% of {total_size}'`
      */
    var formatProgress: js.UndefOr[String] = js.undefined
    
    /**
      * Appears next to a paused item
      *
      * @default `'paused'`
      */
    var paused: js.UndefOr[String] = js.undefined
    
    /**
      * Appears next to item once the last bytes have been sent (differs on the user-agent)
      *
      * @default `'Processing...'`
      */
    var waitingForResponse: js.UndefOr[String] = js.undefined
  }
  object UITextOptions {
    
    inline def apply(): UITextOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UITextOptions]
    }
    
    extension [Self <: UITextOptions](x: Self) {
      
      inline def setFailUpload(value: String): Self = StObject.set(x, "failUpload", value.asInstanceOf[js.Any])
      
      inline def setFailUploadUndefined: Self = StObject.set(x, "failUpload", js.undefined)
      
      inline def setFormatProgress(value: String): Self = StObject.set(x, "formatProgress", value.asInstanceOf[js.Any])
      
      inline def setFormatProgressUndefined: Self = StObject.set(x, "formatProgress", js.undefined)
      
      inline def setPaused(value: String): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPausedUndefined: Self = StObject.set(x, "paused", js.undefined)
      
      inline def setWaitingForResponse(value: String): Self = StObject.set(x, "waitingForResponse", value.asInstanceOf[js.Any])
      
      inline def setWaitingForResponseUndefined: Self = StObject.set(x, "waitingForResponse", js.undefined)
    }
  }
  
  trait UIThumbnailsOptions extends StObject {
    
    /**
      * Ignored if the current browser does not support image previews.
      *
      * If you want to use an alternate library to resize the image, you must contribute a function for this option that returns a Promise.
      * Once the resize is complete, your promise must be fulfilled.
      *
      * You may, of course, reject your returned Promise is the resize fails in some way
      *
      * @default `undefined`
      */
    var customResizer: js.UndefOr[CustomResizerCallBack] = js.undefined
    
    /**
      * Maximum number of previews to render per Fine Uploader instance.
      *
      * A call to the reset method resets this value as well
      *
      * @default `0`
      */
    var maxCount: js.UndefOr[Double] = js.undefined
    
    /**
      *
      */
    var placeholders: js.UndefOr[UIThumbnailsPlaceholderOptions] = js.undefined
    
    /**
      * The amount of time, in milliseconds, to pause between each preview generation process.
      *
      * This is in place to prevent the UI thread from locking up for a continuously long period of time, as preview generation can be a resource-intensive process
      *
      * @default `750`
      */
    var timeBetweenThumbs: js.UndefOr[Double] = js.undefined
  }
  object UIThumbnailsOptions {
    
    inline def apply(): UIThumbnailsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIThumbnailsOptions]
    }
    
    extension [Self <: UIThumbnailsOptions](x: Self) {
      
      inline def setCustomResizer(value: /* resizeInfo */ ResizeInfo => PromiseOptions): Self = StObject.set(x, "customResizer", js.Any.fromFunction1(value))
      
      inline def setCustomResizerUndefined: Self = StObject.set(x, "customResizer", js.undefined)
      
      inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setPlaceholders(value: UIThumbnailsPlaceholderOptions): Self = StObject.set(x, "placeholders", value.asInstanceOf[js.Any])
      
      inline def setPlaceholdersUndefined: Self = StObject.set(x, "placeholders", js.undefined)
      
      inline def setTimeBetweenThumbs(value: Double): Self = StObject.set(x, "timeBetweenThumbs", value.asInstanceOf[js.Any])
      
      inline def setTimeBetweenThumbsUndefined: Self = StObject.set(x, "timeBetweenThumbs", js.undefined)
    }
  }
  
  trait UIThumbnailsPlaceholderOptions extends StObject {
    
    /**
      * Absolute URL or relative path to the image to display if the preview/thumbnail could not be generated/displayed
      *
      * @default `null`
      */
    var notAvailablePath: js.UndefOr[String] = js.undefined
    
    /**
      * Set this to true if you want the 'waiting' placeholder image to remain in place until the server response has been parsed.
      *
      * This is useful if you expect to return thumbnail URLs in your upload responses for files types that cannot be previewed.
      * This option is ignored in older browsers where client-side previews cannot be generated
      *
      * @default `false`
      */
    var waitUntilResponse: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Absolute URL or relative path to the image to display during preview generation (modern browsers) or until the server response has been parsed (older browsers)
      *
      * @default `null`
      */
    var waitingPath: js.UndefOr[String] = js.undefined
  }
  object UIThumbnailsPlaceholderOptions {
    
    inline def apply(): UIThumbnailsPlaceholderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UIThumbnailsPlaceholderOptions]
    }
    
    extension [Self <: UIThumbnailsPlaceholderOptions](x: Self) {
      
      inline def setNotAvailablePath(value: String): Self = StObject.set(x, "notAvailablePath", value.asInstanceOf[js.Any])
      
      inline def setNotAvailablePathUndefined: Self = StObject.set(x, "notAvailablePath", js.undefined)
      
      inline def setWaitUntilResponse(value: Boolean): Self = StObject.set(x, "waitUntilResponse", value.asInstanceOf[js.Any])
      
      inline def setWaitUntilResponseUndefined: Self = StObject.set(x, "waitUntilResponse", js.undefined)
      
      inline def setWaitingPath(value: String): Self = StObject.set(x, "waitingPath", value.asInstanceOf[js.Any])
      
      inline def setWaitingPathUndefined: Self = StObject.set(x, "waitingPath", js.undefined)
    }
  }
}
