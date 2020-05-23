package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A client-side equivalent of the ASPxUploadControl control.
  */
@js.native
trait ASPxClientUploadControl extends ASPxClientControl {
  /**
    * Fires when the mouse enters a <strong>drop zone</strong> or an external drop zone element while dragging a file.
    */
  var DropZoneEnter: ASPxClientEvent[ASPxClientUploadControlDropZoneEnterEventHandler[ASPxClientUploadControl]] = js.native
  /**
    * Fires when the mouse leaves a <strong>drop zone</strong> or an external drop zone element while dragging a file.
    */
  var DropZoneLeave: ASPxClientEvent[ASPxClientUploadControlDropZoneLeaveEventHandler[ASPxClientUploadControl]] = js.native
  /**
    * Occurs on the client side when the <strong>file input elements</strong> count is changed.
    */
  var FileInputCountChanged: ASPxClientEvent[ASPxClientEventHandler[ASPxClientUploadControl]] = js.native
  /**
    * Occurs on the client side after a file has been uploaded.
    */
  var FileUploadComplete: ASPxClientEvent[ASPxClientUploadControlFileUploadCompleteEventHandler[ASPxClientUploadControl]] = js.native
  /** @deprecated This event is now obsolete. Use the FilesUploadStart event instead. */
  /**
    * Occurs on the client side before upload of the specified files starts.
    */
  var FileUploadStart: ASPxClientEvent[ASPxClientUploadControlFilesUploadStartEventHandler[ASPxClientUploadControl]] = js.native
  /**
    * Occurs on the client after upload of all selected files has been completed.
    */
  var FilesUploadComplete: ASPxClientEvent[ASPxClientUploadControlFilesUploadCompleteEventHandler[ASPxClientUploadControl]] = js.native
  /**
    * Occurs on the client side before file upload is started.
    */
  var FilesUploadStart: ASPxClientEvent[ASPxClientUploadControlFilesUploadStartEventHandler[ASPxClientUploadControl]] = js.native
  /**
    * Fires on the client side when the text within the control's edit box is changed while the control has focus.
    */
  var TextChanged: ASPxClientEvent[ASPxClientUploadControlTextChangedEventHandler[ASPxClientUploadControl]] = js.native
  /**
    * Occurs on the client side when the <strong>progress bar indicator</strong> position is changed.
    */
  var UploadingProgressChanged: ASPxClientEvent[
    ASPxClientUploadControlUploadingProgressChangedEventHandler[ASPxClientUploadControl]
  ] = js.native
  /**
    * Enables you to specify whether the selected file(s) are valid and provide an error text.
    */
  var ValidationErrorOccurred: ASPxClientEvent[
    ASPxClientUploadControlValidationErrorOccurredEventHandler[ASPxClientUploadControl]
  ] = js.native
  /**
    * Adds a new <strong>file input</strong> element to the ASPxUploadControl.
    */
  def AddFileInput(): Unit = js.native
  /**
    * Cancels the initiated file uploading process.
    */
  def Cancel(): Unit = js.native
  /**
    * Clears the file selection in the upload control.
    */
  def ClearText(): Unit = js.native
  /**
    * Returns the <strong>add button</strong>'s text.
    */
  def GetAddButtonText(): String = js.native
  /**
    * Returns a value indicating whether the upload control is enabled.
    */
  def GetEnabled(): Boolean = js.native
  /**
    * Gets the number of <strong>file input elements</strong> contained within the ASPxUploadControl.
    */
  def GetFileInputCount(): Double = js.native
  /**
    * Returns files selected for uploading within the specified <strong>file input</strong>. An array of ASPxClientUploadControlFile objects that are files selected for uploading.
    * @param inputIndex An integer value that specifies the index of a <strong>file input</strong>. Default value is "0".
    */
  def GetSelectedFiles(inputIndex: Double): js.Array[ASPxClientUploadControlFile] = js.native
  /**
    * Gets the text displayed within the edit box of the specified file input element. A string value representing the displayed text.
    * @param index An integer value that specifies the required file input element's index.
    */
  def GetText(index: Double): String = js.native
  /**
    * Returns the text displayed within the <strong>upload button</strong>.
    */
  def GetUploadButtonText(): String = js.native
  /**
    * Specifies whether the upload control's Advanced mode is enabled.
    */
  def IsAdvancedModeEnabled(): Boolean = js.native
  /**
    * Removes a file with the specified index from the selected file list.
    * @param fileIndex An integer value that is the zero-based index of an item in the file list.
    */
  def RemoveFileFromSelection(fileIndex: Double): Unit = js.native
  def RemoveFileFromSelection(fileIndex: ASPxClientUploadControlFile): Unit = js.native
  /**
    * Removes a <strong>file input</strong> element from the ASPxUploadControl.
    * @param index An integer value that represents a file input element's index.
    */
  def RemoveFileInput(index: Double): Unit = js.native
  /**
    * Sets the text to be displayed within the <strong>add button</strong>.
    * @param text A string value specifying the text to be displayed within the button.
    */
  def SetAddButtonText(text: String): Unit = js.native
  /**
    * Sets the ID of a web control or HTML element (or a list of IDs), a click on which invokes file upload dialog.
    * @param ids A string value specifying the ID or a list of IDs separated by the semicolon (;).
    */
  def SetDialogTriggerID(ids: String): Unit = js.native
  /**
    * Specifies whether the upload control is enabled.
    * @param enabled true, to enable the upload control; otherwise, false.
    */
  def SetEnabled(enabled: Boolean): Unit = js.native
  /**
    * Specifies the count of the <strong>file input</strong> elements within the upload control.
    * @param count An integer value that specifies the file input elements count.
    */
  def SetFileInputCount(count: Double): Unit = js.native
  /**
    * Sets the text to be displayed within the <strong>upload button</strong>.
    * @param text A string value specifying the text to be displayed within the button.
    */
  def SetUploadButtonText(text: String): Unit = js.native
  /**
    * Initiates uploading of the specified file(s) to the web server's memory.
    */
  def Upload(): Unit = js.native
  /** @deprecated Use the Upload method instead. */
  /**
    * Initiates uploading of the specified file to the web server's memory.
    */
  def UploadFile(): Unit = js.native
}

