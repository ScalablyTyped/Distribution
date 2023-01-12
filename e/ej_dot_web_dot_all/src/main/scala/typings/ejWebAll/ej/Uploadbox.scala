package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Uploadbox
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** Disables the Uploadbox control
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Enables the Uploadbox control
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  @JSName("model")
  var model_Uploadbox: Model = js.native
  
  /** Refresh the Uploadbox control
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** Upload the selected files.
    * @returns {void}
    */
  def upload(): Unit = js.native
}
object Uploadbox {
  
  trait BeforeSendEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Selected FileList Object.
      */
    var files: js.UndefOr[Any] = js.undefined
    
    /** returns the Uploadbox model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** XHR-AJAX Object for reference.
      */
    var xhr: js.UndefOr[Any] = js.undefined
  }
  object BeforeSendEventArgs {
    
    inline def apply(): BeforeSendEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeSendEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforeSendEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXhr(value: Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  trait BeginEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** To pass additional information to the server.
      */
    var data: js.UndefOr[Any] = js.undefined
    
    /** Selected FileList Object.
      */
    var files: js.UndefOr[Any] = js.undefined
    
    /** returns the Uploadbox model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeginEventArgs {
    
    inline def apply(): BeginEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeginEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeginEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ButtonText extends StObject {
    
    /** Sets the text for the close button.
      */
    var Close: js.UndefOr[String] = js.undefined
    
    /** Sets the text for the browse button.
      */
    var browse: js.UndefOr[String] = js.undefined
    
    /** Sets the text for the cancel button.
      */
    var cancel: js.UndefOr[String] = js.undefined
    
    /** Sets the text for the Upload button inside the dialog popup.
      */
    var upload: js.UndefOr[String] = js.undefined
  }
  object ButtonText {
    
    inline def apply(): ButtonText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ButtonText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonText] (val x: Self) extends AnyVal {
      
      inline def setBrowse(value: String): Self = StObject.set(x, "browse", value.asInstanceOf[js.Any])
      
      inline def setBrowseUndefined: Self = StObject.set(x, "browse", js.undefined)
      
      inline def setCancel(value: String): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setClose(value: String): Self = StObject.set(x, "Close", value.asInstanceOf[js.Any])
      
      inline def setCloseUndefined: Self = StObject.set(x, "Close", js.undefined)
      
      inline def setUpload(value: String): Self = StObject.set(x, "upload", value.asInstanceOf[js.Any])
      
      inline def setUploadUndefined: Self = StObject.set(x, "upload", js.undefined)
    }
  }
  
  trait CancelEventArgs extends StObject {
    
    /** Canceled FileList Object.
      */
    var fileStatus: js.UndefOr[Any] = js.undefined
    
    /** returns the Uploadbox model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CancelEventArgs {
    
    inline def apply(): CancelEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CancelEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CancelEventArgs] (val x: Self) extends AnyVal {
      
      inline def setFileStatus(value: Any): Self = StObject.set(x, "fileStatus", value.asInstanceOf[js.Any])
      
      inline def setFileStatusUndefined: Self = StObject.set(x, "fileStatus", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CompleteEventArgs extends StObject {
    
    /** AJAX event argument for reference.
      */
    var e: js.UndefOr[Any] = js.undefined
    
    /** Uploaded file list.
      */
    var files: js.UndefOr[Any] = js.undefined
    
    /** returns the Uploadbox model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** response from the server.
      */
    var responseText: js.UndefOr[String] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** XHR-AJAX Object for reference.
      */
    var xhr: js.UndefOr[Any] = js.undefined
  }
  object CompleteEventArgs {
    
    inline def apply(): CompleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompleteEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompleteEventArgs] (val x: Self) extends AnyVal {
      
      inline def setE(value: Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      inline def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXhr(value: Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** returns the Uploadbox model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object CreateEventArgs {
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CustomFileDetails extends StObject {
    
    /** Enables the file upload interactions like remove/cancel in File details of the dialog popup.
      */
    var action: js.UndefOr[Boolean] = js.undefined
    
    /** Enables the name in the File details of the dialog popup.
      */
    var name: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the File size details of the dialog popup.
      */
    var size: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the file uploading status visibility in the dialog file details content.
      */
    var status: js.UndefOr[Boolean] = js.undefined
    
    /** Enables the title in File details for the dialog popup.
      */
    var title: js.UndefOr[Boolean] = js.undefined
  }
  object CustomFileDetails {
    
    inline def apply(): CustomFileDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CustomFileDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomFileDetails] (val x: Self) extends AnyVal {
      
      inline def setAction(value: Boolean): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setName(value: Boolean): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSize(value: Boolean): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTitle(value: Boolean): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** returns the Uploadbox model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DestroyEventArgs {
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DialogAction extends StObject {
    
    /** Once uploaded successfully, the dialog popup closes immediately.
      */
    var closeOnComplete: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the content container option to the Uploadbox dialog popup.
      */
    var content: js.UndefOr[String] = js.undefined
    
    /** Enables the drag option to the dialog popup.
      */
    var drag: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the Uploadbox dialogâ€™s modal property to the dialog popup.
      */
    var modal: js.UndefOr[Boolean] = js.undefined
  }
  object DialogAction {
    
    inline def apply(): DialogAction = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogAction] (val x: Self) extends AnyVal {
      
      inline def setCloseOnComplete(value: Boolean): Self = StObject.set(x, "closeOnComplete", value.asInstanceOf[js.Any])
      
      inline def setCloseOnCompleteUndefined: Self = StObject.set(x, "closeOnComplete", js.undefined)
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDrag(value: Boolean): Self = StObject.set(x, "drag", value.asInstanceOf[js.Any])
      
      inline def setDragUndefined: Self = StObject.set(x, "drag", js.undefined)
      
      inline def setModal(value: Boolean): Self = StObject.set(x, "modal", value.asInstanceOf[js.Any])
      
      inline def setModalUndefined: Self = StObject.set(x, "modal", js.undefined)
    }
  }
  
  trait DialogText extends StObject {
    
    /** Sets the uploaded fileâ€™s Name (header text) to the Dialog popup.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /** Sets the upload file Size (header text) to the dialog popup.
      */
    var size: js.UndefOr[String] = js.undefined
    
    /** Sets the upload file Status (header text) to the dialog popup.
      */
    var status: js.UndefOr[String] = js.undefined
    
    /** Sets the title text of the dialog popup.
      */
    var title: js.UndefOr[String] = js.undefined
  }
  object DialogText {
    
    inline def apply(): DialogText = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DialogText]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DialogText] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  trait ErrorEventArgs extends StObject {
    
    /** error event action details.
      */
    var action: js.UndefOr[String] = js.undefined
    
    /** details about the error information.
      */
    var error: js.UndefOr[String] = js.undefined
    
    /** returns the file details of the file uploaded
      */
    var files: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ErrorEventArgs {
    
    inline def apply(): ErrorEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ErrorEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setError(value: String): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait FileSelectEventArgs extends StObject {
    
    /** returns Selected FileList objects
      */
    var files: js.UndefOr[Any] = js.undefined
    
    /** returns the Uploadbox model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object FileSelectEventArgs {
    
    inline def apply(): FileSelectEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FileSelectEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FileSelectEventArgs] (val x: Self) extends AnyVal {
      
      inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait InProgressEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** AJAX event argument for reference.
      */
    var e: js.UndefOr[Any] = js.undefined
    
    /** returns Selected FileList objects
      */
    var files: js.UndefOr[Any] = js.undefined
    
    /** returns the Uploadbox model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the current progress percentage.
      */
    var percentage: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object InProgressEventArgs {
    
    inline def apply(): InProgressEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InProgressEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InProgressEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setE(value: Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPercentage(value: Any): Self = StObject.set(x, "percentage", value.asInstanceOf[js.Any])
      
      inline def setPercentageUndefined: Self = StObject.set(x, "percentage", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
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
    var dialogPosition: js.UndefOr[Any] = js.undefined
    
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
    var htmlAttributes: js.UndefOr[Any] = js.undefined
    
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
    var pushFile: js.UndefOr[Any] = js.undefined
    
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
    
    inline def apply(): typings.ejWebAll.ej.Uploadbox.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Uploadbox.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.Uploadbox.Model] (val x: Self) extends AnyVal {
      
      inline def setAllowDragAndDrop(value: Boolean): Self = StObject.set(x, "allowDragAndDrop", value.asInstanceOf[js.Any])
      
      inline def setAllowDragAndDropUndefined: Self = StObject.set(x, "allowDragAndDrop", js.undefined)
      
      inline def setAsyncUpload(value: Boolean): Self = StObject.set(x, "asyncUpload", value.asInstanceOf[js.Any])
      
      inline def setAsyncUploadUndefined: Self = StObject.set(x, "asyncUpload", js.undefined)
      
      inline def setAutoUpload(value: Boolean): Self = StObject.set(x, "autoUpload", value.asInstanceOf[js.Any])
      
      inline def setAutoUploadUndefined: Self = StObject.set(x, "autoUpload", js.undefined)
      
      inline def setBeforeSend(value: /* e */ BeforeSendEventArgs => Unit): Self = StObject.set(x, "beforeSend", js.Any.fromFunction1(value))
      
      inline def setBeforeSendUndefined: Self = StObject.set(x, "beforeSend", js.undefined)
      
      inline def setBegin(value: /* e */ BeginEventArgs => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction1(value))
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setButtonText(value: ButtonText): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
      
      inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
      
      inline def setCancel(value: /* e */ CancelEventArgs => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction1(value))
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setComplete(value: /* e */ CompleteEventArgs => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setCustomFileDetails(value: CustomFileDetails): Self = StObject.set(x, "customFileDetails", value.asInstanceOf[js.Any])
      
      inline def setCustomFileDetailsUndefined: Self = StObject.set(x, "customFileDetails", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDialogAction(value: DialogAction): Self = StObject.set(x, "dialogAction", value.asInstanceOf[js.Any])
      
      inline def setDialogActionUndefined: Self = StObject.set(x, "dialogAction", js.undefined)
      
      inline def setDialogPosition(value: Any): Self = StObject.set(x, "dialogPosition", value.asInstanceOf[js.Any])
      
      inline def setDialogPositionUndefined: Self = StObject.set(x, "dialogPosition", js.undefined)
      
      inline def setDialogText(value: DialogText): Self = StObject.set(x, "dialogText", value.asInstanceOf[js.Any])
      
      inline def setDialogTextUndefined: Self = StObject.set(x, "dialogText", js.undefined)
      
      inline def setDropAreaHeight(value: Double | String): Self = StObject.set(x, "dropAreaHeight", value.asInstanceOf[js.Any])
      
      inline def setDropAreaHeightUndefined: Self = StObject.set(x, "dropAreaHeight", js.undefined)
      
      inline def setDropAreaText(value: String): Self = StObject.set(x, "dropAreaText", value.asInstanceOf[js.Any])
      
      inline def setDropAreaTextUndefined: Self = StObject.set(x, "dropAreaText", js.undefined)
      
      inline def setDropAreaWidth(value: Double | String): Self = StObject.set(x, "dropAreaWidth", value.asInstanceOf[js.Any])
      
      inline def setDropAreaWidthUndefined: Self = StObject.set(x, "dropAreaWidth", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setError(value: /* e */ ErrorEventArgs => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setExtensionsAllow(value: String): Self = StObject.set(x, "extensionsAllow", value.asInstanceOf[js.Any])
      
      inline def setExtensionsAllowUndefined: Self = StObject.set(x, "extensionsAllow", js.undefined)
      
      inline def setExtensionsDeny(value: String): Self = StObject.set(x, "extensionsDeny", value.asInstanceOf[js.Any])
      
      inline def setExtensionsDenyUndefined: Self = StObject.set(x, "extensionsDeny", js.undefined)
      
      inline def setFileSelect(value: /* e */ FileSelectEventArgs => Unit): Self = StObject.set(x, "fileSelect", js.Any.fromFunction1(value))
      
      inline def setFileSelectUndefined: Self = StObject.set(x, "fileSelect", js.undefined)
      
      inline def setFileSize(value: Double): Self = StObject.set(x, "fileSize", value.asInstanceOf[js.Any])
      
      inline def setFileSizeUndefined: Self = StObject.set(x, "fileSize", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHtmlAttributes(value: Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setInProgress(value: /* e */ InProgressEventArgs => Unit): Self = StObject.set(x, "inProgress", js.Any.fromFunction1(value))
      
      inline def setInProgressUndefined: Self = StObject.set(x, "inProgress", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setMultipleFilesSelection(value: Boolean): Self = StObject.set(x, "multipleFilesSelection", value.asInstanceOf[js.Any])
      
      inline def setMultipleFilesSelectionUndefined: Self = StObject.set(x, "multipleFilesSelection", js.undefined)
      
      inline def setPushFile(value: Any): Self = StObject.set(x, "pushFile", value.asInstanceOf[js.Any])
      
      inline def setPushFileUndefined: Self = StObject.set(x, "pushFile", js.undefined)
      
      inline def setRemove(value: /* e */ RemoveEventArgs => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
      
      inline def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      inline def setRemoveUrl(value: String): Self = StObject.set(x, "removeUrl", value.asInstanceOf[js.Any])
      
      inline def setRemoveUrlUndefined: Self = StObject.set(x, "removeUrl", js.undefined)
      
      inline def setSaveUrl(value: String): Self = StObject.set(x, "saveUrl", value.asInstanceOf[js.Any])
      
      inline def setSaveUrlUndefined: Self = StObject.set(x, "saveUrl", js.undefined)
      
      inline def setShowBrowseButton(value: Boolean): Self = StObject.set(x, "showBrowseButton", value.asInstanceOf[js.Any])
      
      inline def setShowBrowseButtonUndefined: Self = StObject.set(x, "showBrowseButton", js.undefined)
      
      inline def setShowFileDetails(value: Boolean): Self = StObject.set(x, "showFileDetails", value.asInstanceOf[js.Any])
      
      inline def setShowFileDetailsUndefined: Self = StObject.set(x, "showFileDetails", js.undefined)
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setSuccess(value: /* e */ SuccessEventArgs => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setUploadName(value: String): Self = StObject.set(x, "uploadName", value.asInstanceOf[js.Any])
      
      inline def setUploadNameUndefined: Self = StObject.set(x, "uploadName", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait RemoveEventArgs extends StObject {
    
    /** returns the file details of the file object
      */
    var fileStatus: js.UndefOr[Any] = js.undefined
    
    /** returns the Uploadbox model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object RemoveEventArgs {
    
    inline def apply(): RemoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RemoveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RemoveEventArgs] (val x: Self) extends AnyVal {
      
      inline def setFileStatus(value: Any): Self = StObject.set(x, "fileStatus", value.asInstanceOf[js.Any])
      
      inline def setFileStatusUndefined: Self = StObject.set(x, "fileStatus", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SuccessEventArgs extends StObject {
    
    /** AJAX event argument for reference.
      */
    var e: js.UndefOr[Any] = js.undefined
    
    /** Uploaded file list.
      */
    var files: js.UndefOr[Any] = js.undefined
    
    /** returns the Uploadbox model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** response from the server.
      */
    var responseText: js.UndefOr[String] = js.undefined
    
    /** successfully uploaded files list.
      */
    var success: js.UndefOr[Any] = js.undefined
    
    /** returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** XHR-AJAX Object for reference.
      */
    var xhr: js.UndefOr[Any] = js.undefined
  }
  object SuccessEventArgs {
    
    inline def apply(): SuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SuccessEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuccessEventArgs] (val x: Self) extends AnyVal {
      
      inline def setE(value: Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
      inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      inline def setResponseTextUndefined: Self = StObject.set(x, "responseText", js.undefined)
      
      inline def setSuccess(value: Any): Self = StObject.set(x, "success", value.asInstanceOf[js.Any])
      
      inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXhr(value: Any): Self = StObject.set(x, "xhr", value.asInstanceOf[js.Any])
      
      inline def setXhrUndefined: Self = StObject.set(x, "xhr", js.undefined)
    }
  }
}
