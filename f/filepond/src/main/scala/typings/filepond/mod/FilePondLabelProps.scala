package typings.filepond.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FilePondLabelProps extends js.Object {
  
  /**
    * Label used for abort load button.
    * @default 'Abort'
    */
  var labelButtonAbortItemLoad: js.UndefOr[String] = js.native
  
  /**
    * Label used for abort upload button.
    * @default 'Cancel'
    */
  var labelButtonAbortItemProcessing: js.UndefOr[String] = js.native
  
  /**
    * Label used for upload button.
    * @default 'Upload'
    */
  var labelButtonProcessItem: js.UndefOr[String] = js.native
  
  /**
    * Label used for remove button.
    * @default 'Remove'
    */
  var labelButtonRemoveItem: js.UndefOr[String] = js.native
  
  /**
    * Label used for retry load.
    * @default 'Retry'
    */
  var labelButtonRetryItemLoad: js.UndefOr[String] = js.native
  
  /**
    * Label used for retry upload button.
    * @default 'Retry'
    */
  var labelButtonRetryItemProcessing: js.UndefOr[String] = js.native
  
  /**
    * Label used for undo upload button.
    * @default 'Undo'
    */
  var labelButtonUndoItemProcessing: js.UndefOr[String] = js.native
  
  /**
    * The decimal separator used to render numbers.
    * By default this is determined automatically.
    * @default 'auto'
    */
  var labelDecimalSeparator: js.UndefOr[String] = js.native
  
  /**
    * Label used when file is added (assistive only).
    * @default 'Added'
    */
  var labelFileAdded: js.UndefOr[String] = js.native
  
  /**
    * Label used when showing the number of files and there is more than one.
    * @default 'files in list'
    */
  var labelFileCountPlural: js.UndefOr[String] = js.native
  
  /**
    * Label used when showing the number of files and there is only one.
    * @default 'file in list'
    */
  var labelFileCountSingular: js.UndefOr[String] = js.native
  
  /**
    * Label used when file load failed.
    * @default 'Error during load'
    */
  var labelFileLoadError: js.UndefOr[(js.Function1[/* error */ js.Any, String]) | String] = js.native
  
  /**
    * Label used while loading a file.
    * @default 'Loading'
    */
  var labelFileLoading: js.UndefOr[String] = js.native
  
  /**
    * Label used when uploading a file.
    * @default 'Uploading'
    */
  var labelFileProcessing: js.UndefOr[String] = js.native
  
  /**
    * Label used when upload was cancelled.
    * @default 'Upload cancelled'
    */
  var labelFileProcessingAborted: js.UndefOr[String] = js.native
  
  /**
    * Label used when file upload has completed.
    * @default 'Upload complete'
    */
  var labelFileProcessingComplete: js.UndefOr[String] = js.native
  
  /**
    * Label used when something went wrong during file upload.
    * @default 'Error during upload'
    */
  var labelFileProcessingError: js.UndefOr[(js.Function1[/* error */ js.Any, String]) | String] = js.native
  
  /**
    * Label used when something went wrong during reverting the file upload.
    * @default 'Error during revert'
    */
  var labelFileProcessingRevertError: js.UndefOr[(js.Function1[/* error */ js.Any, String]) | String] = js.native
  
  /**
    * Label used when something went during during removing the file upload.
    * @default 'Error during remove'
    */
  var labelFileRemoveError: js.UndefOr[(js.Function1[/* error */ js.Any, String]) | String] = js.native
  
  /**
    * Label used when file is removed (assistive only).
    * @default 'Removed'
    */
  var labelFileRemoved: js.UndefOr[String] = js.native
  
  /**
    * Label used when no file size information was received.
    * @default 'Size not available'
    */
  var labelFileSizeNotAvailable: js.UndefOr[String] = js.native
  
  /**
    * Label used while waiting for file size information.
    * @default 'Waiting for size'
    */
  var labelFileWaitingForSize: js.UndefOr[String] = js.native
  
  /**
    * Default label shown to indicate this is a drop area.
    * FilePond will automatically bind browse file events to
    * the element with CSS class .filepond--label-action.
    * @default 'Drag & Drop your files or <span class="filepond--label-action"> Browse </span>'
    */
  var labelIdle: js.UndefOr[String] = js.native
  
  /**
    * Label shown when the field contains invalid files and is validated by the parent form.
    * @default 'Field contains invalid files'
    */
  var labelInvalidField: js.UndefOr[String] = js.native
  
  /**
    * Label used to indicate to the user that an action can be cancelled.
    * @default 'tap to cancel'
    */
  var labelTapToCancel: js.UndefOr[String] = js.native
  
  /**
    * Label used to indicate to the user that an action can be retried.
    * @default 'tap to retry'
    */
  var labelTapToRetry: js.UndefOr[String] = js.native
  
  /**
    * Label used to indicate to the user that an action can be undone.
    * @default 'tap to undo'
    */
  var labelTapToUndo: js.UndefOr[String] = js.native
  
  /**
    * The thousands separator used to render numbers.
    * By default this is determined automatically.
    * @default 'auto'
    */
  var labelThousandsSeparator: js.UndefOr[String] = js.native
}
object FilePondLabelProps {
  
  @scala.inline
  def apply(): FilePondLabelProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilePondLabelProps]
  }
  
  @scala.inline
  implicit class FilePondLabelPropsOps[Self <: FilePondLabelProps] (val x: Self) extends AnyVal {
    
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
    def setLabelButtonAbortItemLoad(value: String): Self = this.set("labelButtonAbortItemLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelButtonAbortItemLoad: Self = this.set("labelButtonAbortItemLoad", js.undefined)
    
    @scala.inline
    def setLabelButtonAbortItemProcessing(value: String): Self = this.set("labelButtonAbortItemProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelButtonAbortItemProcessing: Self = this.set("labelButtonAbortItemProcessing", js.undefined)
    
    @scala.inline
    def setLabelButtonProcessItem(value: String): Self = this.set("labelButtonProcessItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelButtonProcessItem: Self = this.set("labelButtonProcessItem", js.undefined)
    
    @scala.inline
    def setLabelButtonRemoveItem(value: String): Self = this.set("labelButtonRemoveItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelButtonRemoveItem: Self = this.set("labelButtonRemoveItem", js.undefined)
    
    @scala.inline
    def setLabelButtonRetryItemLoad(value: String): Self = this.set("labelButtonRetryItemLoad", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelButtonRetryItemLoad: Self = this.set("labelButtonRetryItemLoad", js.undefined)
    
    @scala.inline
    def setLabelButtonRetryItemProcessing(value: String): Self = this.set("labelButtonRetryItemProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelButtonRetryItemProcessing: Self = this.set("labelButtonRetryItemProcessing", js.undefined)
    
    @scala.inline
    def setLabelButtonUndoItemProcessing(value: String): Self = this.set("labelButtonUndoItemProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelButtonUndoItemProcessing: Self = this.set("labelButtonUndoItemProcessing", js.undefined)
    
    @scala.inline
    def setLabelDecimalSeparator(value: String): Self = this.set("labelDecimalSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelDecimalSeparator: Self = this.set("labelDecimalSeparator", js.undefined)
    
    @scala.inline
    def setLabelFileAdded(value: String): Self = this.set("labelFileAdded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFileAdded: Self = this.set("labelFileAdded", js.undefined)
    
    @scala.inline
    def setLabelFileCountPlural(value: String): Self = this.set("labelFileCountPlural", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFileCountPlural: Self = this.set("labelFileCountPlural", js.undefined)
    
    @scala.inline
    def setLabelFileCountSingular(value: String): Self = this.set("labelFileCountSingular", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFileCountSingular: Self = this.set("labelFileCountSingular", js.undefined)
    
    @scala.inline
    def setLabelFileLoadErrorFunction1(value: /* error */ js.Any => String): Self = this.set("labelFileLoadError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelFileLoadError(value: (js.Function1[/* error */ js.Any, String]) | String): Self = this.set("labelFileLoadError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFileLoadError: Self = this.set("labelFileLoadError", js.undefined)
    
    @scala.inline
    def setLabelFileLoading(value: String): Self = this.set("labelFileLoading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFileLoading: Self = this.set("labelFileLoading", js.undefined)
    
    @scala.inline
    def setLabelFileProcessing(value: String): Self = this.set("labelFileProcessing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFileProcessing: Self = this.set("labelFileProcessing", js.undefined)
    
    @scala.inline
    def setLabelFileProcessingAborted(value: String): Self = this.set("labelFileProcessingAborted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFileProcessingAborted: Self = this.set("labelFileProcessingAborted", js.undefined)
    
    @scala.inline
    def setLabelFileProcessingComplete(value: String): Self = this.set("labelFileProcessingComplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFileProcessingComplete: Self = this.set("labelFileProcessingComplete", js.undefined)
    
    @scala.inline
    def setLabelFileProcessingErrorFunction1(value: /* error */ js.Any => String): Self = this.set("labelFileProcessingError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelFileProcessingError(value: (js.Function1[/* error */ js.Any, String]) | String): Self = this.set("labelFileProcessingError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFileProcessingError: Self = this.set("labelFileProcessingError", js.undefined)
    
    @scala.inline
    def setLabelFileProcessingRevertErrorFunction1(value: /* error */ js.Any => String): Self = this.set("labelFileProcessingRevertError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelFileProcessingRevertError(value: (js.Function1[/* error */ js.Any, String]) | String): Self = this.set("labelFileProcessingRevertError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFileProcessingRevertError: Self = this.set("labelFileProcessingRevertError", js.undefined)
    
    @scala.inline
    def setLabelFileRemoveErrorFunction1(value: /* error */ js.Any => String): Self = this.set("labelFileRemoveError", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLabelFileRemoveError(value: (js.Function1[/* error */ js.Any, String]) | String): Self = this.set("labelFileRemoveError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFileRemoveError: Self = this.set("labelFileRemoveError", js.undefined)
    
    @scala.inline
    def setLabelFileRemoved(value: String): Self = this.set("labelFileRemoved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFileRemoved: Self = this.set("labelFileRemoved", js.undefined)
    
    @scala.inline
    def setLabelFileSizeNotAvailable(value: String): Self = this.set("labelFileSizeNotAvailable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFileSizeNotAvailable: Self = this.set("labelFileSizeNotAvailable", js.undefined)
    
    @scala.inline
    def setLabelFileWaitingForSize(value: String): Self = this.set("labelFileWaitingForSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelFileWaitingForSize: Self = this.set("labelFileWaitingForSize", js.undefined)
    
    @scala.inline
    def setLabelIdle(value: String): Self = this.set("labelIdle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelIdle: Self = this.set("labelIdle", js.undefined)
    
    @scala.inline
    def setLabelInvalidField(value: String): Self = this.set("labelInvalidField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelInvalidField: Self = this.set("labelInvalidField", js.undefined)
    
    @scala.inline
    def setLabelTapToCancel(value: String): Self = this.set("labelTapToCancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelTapToCancel: Self = this.set("labelTapToCancel", js.undefined)
    
    @scala.inline
    def setLabelTapToRetry(value: String): Self = this.set("labelTapToRetry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelTapToRetry: Self = this.set("labelTapToRetry", js.undefined)
    
    @scala.inline
    def setLabelTapToUndo(value: String): Self = this.set("labelTapToUndo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelTapToUndo: Self = this.set("labelTapToUndo", js.undefined)
    
    @scala.inline
    def setLabelThousandsSeparator(value: String): Self = this.set("labelThousandsSeparator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabelThousandsSeparator: Self = this.set("labelThousandsSeparator", js.undefined)
  }
}
