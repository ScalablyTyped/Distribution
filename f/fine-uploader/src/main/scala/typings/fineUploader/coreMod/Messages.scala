package typings.fineUploader.coreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Messages extends js.Object {
  
  /**
    * Text passed to the error event handler if a submitted item is zero bits
    *
    * @default `'{file} is empty, please select files again without it.'`
    */
  var emptyError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if an image is too tall
    *
    * @default `'Image is too tall.'`
    */
  var maxHeightImageError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if an image is too wide
    *
    * @default `'Image is too wide.'`
    */
  var maxWidthImageError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if an image is not tall enough
    *
    * @default `'Image is not tall enough.'`
    */
  var minHeightImageError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if the item is too small
    *
    * @default `'{file} is too small, minimum file size is {minSizeLimit}.'`
    */
  var minSizeError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if an image is not wide enough
    *
    * @default `'Image is not wide enough.'`
    */
  var minWidthImageError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if any empty array of items is submitted
    *
    * @default `'No files to upload.'`
    */
  var noFilesError: js.UndefOr[String] = js.native
  
  /**
    * Text displayed to the user when they attempt to leave the page while uploads are still in progress
    *
    * @default `'The files are being uploaded, if you leave now the upload will be canceled.'`
    */
  var onLeave: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if a retry attempt is declared a failed due to a violation of the `validation.itemLimit` rule
    *
    * @default `'Retry failed - you have reached your file limit.'`
    */
  var retryFailTooManyItemsError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if a submitted item is too large.
    *
    * @default `'{file} is too large, maximum file size is {sizeLimit}.'`
    */
  var sizeError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if a submit is ignored due to a violation of the `validation.itemLimit` rules
    *
    * @default `'Too many items ({netItems}) would be uploaded. Item limit is {itemLimit}.'`
    */
  var tooManyItemsError: js.UndefOr[String] = js.native
  
  /**
    * Text passed to the error event handler if an invalid file type is detected
    *
    * @default `'{file} has an invalid extension. Valid extension(s): {extensions}.'`
    */
  var typeError: js.UndefOr[String] = js.native
  
  /**
    * Message displayed if the browser is iOS8 Safari and the corresponding workarounds option is not disabled
    *
    * @default `'Unrecoverable error - this browser does not permit file uploading of any kind due to serious bugs in iOS8 Safari. Please use iOS8 Chrome until Apple fixes these issues.'`
    */
  var unsupportedBrowserIos8Safari: js.UndefOr[String] = js.native
}
object Messages {
  
  @scala.inline
  def apply(): Messages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Messages]
  }
  
  @scala.inline
  implicit class MessagesOps[Self <: Messages] (val x: Self) extends AnyVal {
    
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
    def setEmptyError(value: String): Self = this.set("emptyError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyError: Self = this.set("emptyError", js.undefined)
    
    @scala.inline
    def setMaxHeightImageError(value: String): Self = this.set("maxHeightImageError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxHeightImageError: Self = this.set("maxHeightImageError", js.undefined)
    
    @scala.inline
    def setMaxWidthImageError(value: String): Self = this.set("maxWidthImageError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxWidthImageError: Self = this.set("maxWidthImageError", js.undefined)
    
    @scala.inline
    def setMinHeightImageError(value: String): Self = this.set("minHeightImageError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinHeightImageError: Self = this.set("minHeightImageError", js.undefined)
    
    @scala.inline
    def setMinSizeError(value: String): Self = this.set("minSizeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSizeError: Self = this.set("minSizeError", js.undefined)
    
    @scala.inline
    def setMinWidthImageError(value: String): Self = this.set("minWidthImageError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinWidthImageError: Self = this.set("minWidthImageError", js.undefined)
    
    @scala.inline
    def setNoFilesError(value: String): Self = this.set("noFilesError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoFilesError: Self = this.set("noFilesError", js.undefined)
    
    @scala.inline
    def setOnLeave(value: String): Self = this.set("onLeave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnLeave: Self = this.set("onLeave", js.undefined)
    
    @scala.inline
    def setRetryFailTooManyItemsError(value: String): Self = this.set("retryFailTooManyItemsError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRetryFailTooManyItemsError: Self = this.set("retryFailTooManyItemsError", js.undefined)
    
    @scala.inline
    def setSizeError(value: String): Self = this.set("sizeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSizeError: Self = this.set("sizeError", js.undefined)
    
    @scala.inline
    def setTooManyItemsError(value: String): Self = this.set("tooManyItemsError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTooManyItemsError: Self = this.set("tooManyItemsError", js.undefined)
    
    @scala.inline
    def setTypeError(value: String): Self = this.set("typeError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeError: Self = this.set("typeError", js.undefined)
    
    @scala.inline
    def setUnsupportedBrowserIos8Safari(value: String): Self = this.set("unsupportedBrowserIos8Safari", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsupportedBrowserIos8Safari: Self = this.set("unsupportedBrowserIos8Safari", js.undefined)
  }
}
