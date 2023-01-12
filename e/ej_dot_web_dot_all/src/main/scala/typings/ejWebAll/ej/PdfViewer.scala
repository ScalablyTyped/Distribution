package typings.ejWebAll.ej

import typings.ejWebAll.ej.PdfViewer.AnnotationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PdfViewer
  extends StObject
     with Widget_ {
  
  /** Aborts the download operation.
    * @returns {void}
    */
  def abortDownload(): Unit = js.native
  
  /** Abort the printing function and restores the PDF viewer.
    * @returns {void}
    */
  def abortPrint(): Unit = js.native
  
  /** Adds annotations to the PDF document.
    * @param {ej.PdfViewer.AnnotationType} type of the annotation to be added in the PDF document.
    * @returns {void}
    */
  def addAnnotation(annotationType: AnnotationType): Unit = js.native
  
  /** Cancels the text search and removes the highlighted occurrences from the PDF viewer.
    * @returns {void}
    */
  def cancelSearchText(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Downloads the PDF document being loaded in the ejPdfViewer control.
    * @returns {void}
    */
  def download(): Unit = js.native
  
  /** Scales the page to fit the page in the container in the control.
    * @returns {void}
    */
  def fitToPage(): Unit = js.native
  
  /** Scales the page to fit the page width to the width of the container in the control.
    * @returns {void}
    */
  def fitToWidth(): Unit = js.native
  
  /** Navigates to the first page of PDF document.
    * @returns {void}
    */
  def goToFirstPage(): Unit = js.native
  
  /** Navigates to the last page of the PDF document.
    * @returns {void}
    */
  def goToLastPage(): Unit = js.native
  
  /** Navigates to the next page of the PDF document.
    * @returns {void}
    */
  def goToNextPage(): Unit = js.native
  
  /** Navigates to the specific page in the PDF document. If the page is not available for the given pageNumber, PDF viewer retains the existing page in view.
    * @param {number} navigates to the page number in the PDF document
    * @returns {void}
    */
  def goToPage(pageNumber: Double): Unit = js.native
  
  /** Navigates to the previous page of the PDF document.
    * @returns {void}
    */
  def goToPreviousPage(): Unit = js.native
  
  /** Loads the document with the filename and displays it in PDF viewer.
    * @param {string} File name to be loaded
    * @returns {void}
    */
  def load(fileName: String): Unit = js.native
  
  /** Searches the target text with its casing.
    * @param {boolean} Specifies whether the text search must be performed with match case or not.
    * @returns {void}
    */
  def matchCase(enableMatchCase: Boolean): Unit = js.native
  
  @JSName("model")
  var model_PdfViewer: Model = js.native
  
  /** Prints the PDF document.
    * @returns {void}
    */
  def print(): Unit = js.native
  
  /** Performs redo function for the included annotations in the PDF document.
    * @returns {void}
    */
  def redo(): Unit = js.native
  
  /** Searches the next occurrence of the searched text from the current occurrence in the PDF viewer control.
    * @returns {void}
    */
  def searchNext(): Unit = js.native
  
  /** Searches the previous occurrence of the searched text from the current occurrence in the PDF viewer control.
    * @returns {void}
    */
  def searchPrevious(): Unit = js.native
  
  /** Searches the target text in the PDF document and highlights the occurrences in the pages.
    * @param {string} The text to be searched in the pages in the PDF viewer.
    * @returns {void}
    */
  def searchText(targetText: String): Unit = js.native
  
  /** Set the JSON data that are formed for rendering the document content in PDF viewer.
    * @param {any} Set the JSON data that are formed for rendering the document content.
    * @returns {void}
    */
  def setJSONData(jsonData: Any): Unit = js.native
  
  /** Shows/hides the download tool in the toolbar.
    * @param {boolean} shows/hides download button in the toolbar
    * @returns {void}
    */
  def showDownloadTool(show: Boolean): Unit = js.native
  
  /** Shows/hides the zoom tools in the toolbar.
    * @param {boolean} shows/hides zoom tools in the toolbar
    * @returns {void}
    */
  def showMagnificationTools(show: Boolean): Unit = js.native
  
  /** Shows/hides the page navigation tools in the toolbar
    * @param {boolean} shows/hides navigation tools in the toolbar
    * @returns {void}
    */
  def showPageNavigationTools(show: Boolean): Unit = js.native
  
  /** Shows/hides the print icon in the toolbar.
    * @param {boolean} shows/hides print button in the toolbar
    * @returns {void}
    */
  def showPrintTools(show: Boolean): Unit = js.native
  
  /** Shows/hides the selection tool in the toolbar.
    * @param {boolean} shows/hides selection tool in the toolbar
    * @returns {void}
    */
  def showSelectionTool(show: Boolean): Unit = js.native
  
  /** Shows/hides the signature tool in the toolbar.
    * @param {boolean} shows/hides signature tool in the toolbar
    * @returns {void}
    */
  def showSignatureTool(show: Boolean): Unit = js.native
  
  /** Shows/hides the text markup annotation tools in the toolbar.
    * @param {boolean} shows/hides text markup annotation tools in the toolbar
    * @returns {void}
    */
  def showTextMarkupAnnotationTools(show: Boolean): Unit = js.native
  
  /** Shows/hides the search tool in the toolbar.
    * @param {boolean} shows/hides search tool in the toolbar
    * @returns {void}
    */
  def showTextSearchTool(show: Boolean): Unit = js.native
  
  /** Shows/hides the toolbar in the PDF viewer.
    * @param {boolean} shows/hides the toolbar
    * @returns {void}
    */
  def showToolbar(show: Boolean): Unit = js.native
  
  /** Performs undo function for the included annotations in the PDF document.
    * @returns {void}
    */
  def undo(): Unit = js.native
  
  /** Unloads the PDF document being displayed in the PDF viewer.
    * @returns {void}
    */
  def unload(): Unit = js.native
  
  /** Resize the viewer based on the parent element height.
    * @returns {void}
    */
  def updateViewerSize(): Unit = js.native
  
  /** Magnifies the page to the next value in the zoom drop down list.
    * @returns {void}
    */
  def zoomIn(): Unit = js.native
  
  /** Shrinks the page to the previous value in the magnification in the drop down list.
    * @returns {void}
    */
  def zoomOut(): Unit = js.native
  
  /** Scales the page to the specified percentage ranging from 50 to 400. If the given zoomValue is less than 50 or greater than 400; the PDF viewer scales the page to 50 and 400
    * respectively.
    * @param {number} zoom value for scaling the pages in the PDF Viewer
    * @returns {void}
    */
  def zoomTo(zoomValue: Double): Unit = js.native
}
object PdfViewer {
  
  @js.native
  sealed trait AnnotationType extends StObject
  @JSGlobal("ej.PdfViewer.AnnotationType")
  @js.native
  object AnnotationType extends StObject {
    
    ///Specifies the highlight annotation.
    @js.native
    sealed trait Highlight
      extends StObject
         with AnnotationType
    
    ///Specifies the strikethrough annotation.
    @js.native
    sealed trait Strikethrough
      extends StObject
         with AnnotationType
    
    ///Specifies the underline annotation.
    @js.native
    sealed trait Underline
      extends StObject
         with AnnotationType
  }
  
  @js.native
  sealed trait BufferingMode extends StObject
  @JSGlobal("ej.PdfViewer.BufferingMode")
  @js.native
  object BufferingMode extends StObject {
    
    ///Retrieves complete details to render all the pages in a single request.
    @js.native
    sealed trait Complete
      extends StObject
         with BufferingMode
    
    ///Retrieves details to render first two pages in a request and rest of the pages in other request.
    @js.native
    sealed trait Default
      extends StObject
         with BufferingMode
  }
  
  @js.native
  sealed trait InteractionMode extends StObject
  @JSGlobal("ej.PdfViewer.InteractionMode")
  @js.native
  object InteractionMode extends StObject {
    
    ///To set the panning mode to the PDF viewer control.
    @js.native
    sealed trait Pan
      extends StObject
         with InteractionMode
    
    ///To set the text selection mode to the PDF viewer control.
    @js.native
    sealed trait TextSelection
      extends StObject
         with InteractionMode
  }
  
  @js.native
  sealed trait LinkTarget extends StObject
  @JSGlobal("ej.PdfViewer.LinkTarget")
  @js.native
  object LinkTarget extends StObject {
    
    ///Opens the hyperlink in the same tab of the browser.
    @js.native
    sealed trait Default
      extends StObject
         with LinkTarget
    
    ///Opens the hyperlink in a new tab of the browser.
    @js.native
    sealed trait NewTab
      extends StObject
         with LinkTarget
    
    ///Opens the hyperlink in a new window of the browser.
    @js.native
    sealed trait NewWindow
      extends StObject
         with LinkTarget
  }
  
  @js.native
  sealed trait PdfService extends StObject
  @JSGlobal("ej.PdfViewer.PdfService")
  @js.native
  object PdfService extends StObject {
    
    ///Denotes that the service is located in the local project
    @js.native
    sealed trait Local
      extends StObject
         with PdfService
    
    ///Denotes that the service is hosted in the remote server
    @js.native
    sealed trait Remote
      extends StObject
         with PdfService
  }
  
  @js.native
  sealed trait ToolbarItems extends StObject
  @JSGlobal("ej.PdfViewer.ToolbarItems")
  @js.native
  object ToolbarItems extends StObject {
    
    ///Shows all the toolbar items.
    @js.native
    sealed trait All
      extends StObject
         with ToolbarItems
    
    ///Shows only download tool in the toolbar.
    @js.native
    sealed trait DownloadTool
      extends StObject
         with ToolbarItems
    
    ///Shows only magnification tools in the toolbar.
    @js.native
    sealed trait MagnificationTools
      extends StObject
         with ToolbarItems
    
    ///Shows only page navigation tools in the toolbar.
    @js.native
    sealed trait PageNavigationTools
      extends StObject
         with ToolbarItems
    
    ///Shows only print tool in the toolbar.
    @js.native
    sealed trait PrintTools
      extends StObject
         with ToolbarItems
    
    ///Shows only selection tool in the toolbar.
    @js.native
    sealed trait SelectionTool
      extends StObject
         with ToolbarItems
    
    ///Shows only signature tool in the toolbar.
    @js.native
    sealed trait SignatureTool
      extends StObject
         with ToolbarItems
    
    ///Shows only text markup annotation tools in the toolbar.
    @js.native
    sealed trait TextMarkupAnnotationTools
      extends StObject
         with ToolbarItems
    
    ///Shows only text search tool in the toolbar.
    @js.native
    sealed trait TextSearchTool
      extends StObject
         with ToolbarItems
  }
  
  trait AfterPrintEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AfterPrintEventArgs {
    
    inline def apply(): AfterPrintEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AfterPrintEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AfterPrintEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AjaxRequestFailureEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the exception details.
      */
    var message: js.UndefOr[String] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AjaxRequestFailureEventArgs {
    
    inline def apply(): AjaxRequestFailureEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxRequestFailureEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AjaxRequestFailureEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AjaxRequestSuccessEventArgs extends StObject {
    
    /** true, if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the response data on ajax success.
      */
    var responseData: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AjaxRequestSuccessEventArgs {
    
    inline def apply(): AjaxRequestSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxRequestSuccessEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AjaxRequestSuccessEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setResponseData(value: String): Self = StObject.set(x, "responseData", value.asInstanceOf[js.Any])
      
      inline def setResponseDataUndefined: Self = StObject.set(x, "responseData", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AnnotationAddEventArgs extends StObject {
    
    /** Returns the bounds of the annotation added in the page of the PDF document.
      */
    var annotationBound: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns the id of the annotation added in the page of the PDF document.
      */
    var annotationID: js.UndefOr[Double] = js.undefined
    
    /** Returns the settings of the annotation added to the PDF document.
      */
    var annotationSettings: js.UndefOr[Any] = js.undefined
    
    /** Returns the type of the annotation added in the page of the PDF document.
      */
    var annotationType: js.UndefOr[String] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the page number in which the annotation is added.
      */
    var pageID: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AnnotationAddEventArgs {
    
    inline def apply(): AnnotationAddEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationAddEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnotationAddEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAnnotationBound(value: js.Array[Any]): Self = StObject.set(x, "annotationBound", value.asInstanceOf[js.Any])
      
      inline def setAnnotationBoundUndefined: Self = StObject.set(x, "annotationBound", js.undefined)
      
      inline def setAnnotationBoundVarargs(value: Any*): Self = StObject.set(x, "annotationBound", js.Array(value*))
      
      inline def setAnnotationID(value: Double): Self = StObject.set(x, "annotationID", value.asInstanceOf[js.Any])
      
      inline def setAnnotationIDUndefined: Self = StObject.set(x, "annotationID", js.undefined)
      
      inline def setAnnotationSettings(value: Any): Self = StObject.set(x, "annotationSettings", value.asInstanceOf[js.Any])
      
      inline def setAnnotationSettingsUndefined: Self = StObject.set(x, "annotationSettings", js.undefined)
      
      inline def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
      
      inline def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPageID(value: Double): Self = StObject.set(x, "pageID", value.asInstanceOf[js.Any])
      
      inline def setPageIDUndefined: Self = StObject.set(x, "pageID", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AnnotationContextMenu extends StObject {
    
    /** Enables/disables the delete menu in the annotation context menu.
      */
    var isDeleteEnable: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/disables the annotation context menu.
      */
    var isEnable: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/disables the popup menu in the annotation context menu.
      */
    var isPopupEnable: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/disables the properties menu in the annotation context menu.
      */
    var isPropertiesEnable: js.UndefOr[Boolean] = js.undefined
  }
  object AnnotationContextMenu {
    
    inline def apply(): AnnotationContextMenu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationContextMenu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnotationContextMenu] (val x: Self) extends AnyVal {
      
      inline def setIsDeleteEnable(value: Boolean): Self = StObject.set(x, "isDeleteEnable", value.asInstanceOf[js.Any])
      
      inline def setIsDeleteEnableUndefined: Self = StObject.set(x, "isDeleteEnable", js.undefined)
      
      inline def setIsEnable(value: Boolean): Self = StObject.set(x, "isEnable", value.asInstanceOf[js.Any])
      
      inline def setIsEnableUndefined: Self = StObject.set(x, "isEnable", js.undefined)
      
      inline def setIsPopupEnable(value: Boolean): Self = StObject.set(x, "isPopupEnable", value.asInstanceOf[js.Any])
      
      inline def setIsPopupEnableUndefined: Self = StObject.set(x, "isPopupEnable", js.undefined)
      
      inline def setIsPropertiesEnable(value: Boolean): Self = StObject.set(x, "isPropertiesEnable", value.asInstanceOf[js.Any])
      
      inline def setIsPropertiesEnableUndefined: Self = StObject.set(x, "isPropertiesEnable", js.undefined)
    }
  }
  
  trait AnnotationPropertiesChangeEventArgs extends StObject {
    
    /** Returns the id of the annotation added in the page of the PDF document.
      */
    var annotationID: js.UndefOr[Double] = js.undefined
    
    /** Returns the type of the annotation added in the page of the PDF document.
      */
    var annotationType: js.UndefOr[String] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies that the color of the annotation is changed.
      */
    var isColorChanged: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies that the opacity of the annotation is changed.
      */
    var isOpacityChanged: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the page number in which the annotation is added.
      */
    var pageID: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AnnotationPropertiesChangeEventArgs {
    
    inline def apply(): AnnotationPropertiesChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationPropertiesChangeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnotationPropertiesChangeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAnnotationID(value: Double): Self = StObject.set(x, "annotationID", value.asInstanceOf[js.Any])
      
      inline def setAnnotationIDUndefined: Self = StObject.set(x, "annotationID", js.undefined)
      
      inline def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
      
      inline def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsColorChanged(value: Boolean): Self = StObject.set(x, "isColorChanged", value.asInstanceOf[js.Any])
      
      inline def setIsColorChangedUndefined: Self = StObject.set(x, "isColorChanged", js.undefined)
      
      inline def setIsOpacityChanged(value: Boolean): Self = StObject.set(x, "isOpacityChanged", value.asInstanceOf[js.Any])
      
      inline def setIsOpacityChangedUndefined: Self = StObject.set(x, "isOpacityChanged", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPageID(value: Double): Self = StObject.set(x, "pageID", value.asInstanceOf[js.Any])
      
      inline def setPageIDUndefined: Self = StObject.set(x, "pageID", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait AnnotationRemoveEventArgs extends StObject {
    
    /** Returns the id of the annotation removed from the page of the PDF document.
      */
    var annotationID: js.UndefOr[Double] = js.undefined
    
    /** Returns the type of the annotation removed from the page of the PDF document.
      */
    var annotationType: js.UndefOr[String] = js.undefined
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the page number in which the annotation is removed.
      */
    var pageID: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object AnnotationRemoveEventArgs {
    
    inline def apply(): AnnotationRemoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationRemoveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnnotationRemoveEventArgs] (val x: Self) extends AnyVal {
      
      inline def setAnnotationID(value: Double): Self = StObject.set(x, "annotationID", value.asInstanceOf[js.Any])
      
      inline def setAnnotationIDUndefined: Self = StObject.set(x, "annotationID", js.undefined)
      
      inline def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
      
      inline def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPageID(value: Double): Self = StObject.set(x, "pageID", value.asInstanceOf[js.Any])
      
      inline def setPageIDUndefined: Self = StObject.set(x, "pageID", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BeforePrintEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BeforePrintEventArgs {
    
    inline def apply(): BeforePrintEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforePrintEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BeforePrintEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BufferEndEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the state of the buffering
      */
    var isBuffering: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BufferEndEventArgs {
    
    inline def apply(): BufferEndEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferEndEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferEndEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsBuffering(value: Boolean): Self = StObject.set(x, "isBuffering", value.asInstanceOf[js.Any])
      
      inline def setIsBufferingUndefined: Self = StObject.set(x, "isBuffering", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait BufferStartEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the state of the buffering
      */
    var isBuffering: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object BufferStartEventArgs {
    
    inline def apply(): BufferStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferStartEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BufferStartEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsBuffering(value: Boolean): Self = StObject.set(x, "isBuffering", value.asInstanceOf[js.Any])
      
      inline def setIsBufferingUndefined: Self = StObject.set(x, "isBuffering", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
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
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DocumentLoadEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF document name displaying in the PDF viewer.
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DocumentLoadEventArgs {
    
    inline def apply(): DocumentLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentLoadEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentLoadEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DocumentUnloadEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DocumentUnloadEventArgs {
    
    inline def apply(): DocumentUnloadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentUnloadEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DocumentUnloadEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DownloadEndEventArgs extends StObject {
    
    /** true, if the event should be canceled; otherwise, false
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the name of the file being displayed in the PDF viewer.
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the status about the download is completed or aborted.
      */
    var status: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DownloadEndEventArgs {
    
    inline def apply(): DownloadEndEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadEndEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownloadEndEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DownloadStartEventArgs extends StObject {
    
    /** true, if the event should be canceled; otherwise, false
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the name of the file being displayed in the PDF viewer.
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the status about the download is started.
      */
    var status: js.UndefOr[String] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object DownloadStartEventArgs {
    
    inline def apply(): DownloadStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadStartEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DownloadStartEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait HighlightSettings extends StObject {
    
    /** Gets/sets the author of the highlight annotation.
      */
    var author: js.UndefOr[String] = js.undefined
    
    /** Gets/sets the color of the highlight  annotation.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Gets/sets the locked property of the highlight annotation.
      */
    var isLocked: js.UndefOr[Boolean] = js.undefined
    
    /** Gets/sets the modified Date of the highlight annotation.
      */
    var modifiedDate: js.UndefOr[String] = js.undefined
    
    /** Gets/sets the opacity of the highlight annotation.
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Gets/sets the subject of the highlight annotation.
      */
    var subject: js.UndefOr[String] = js.undefined
  }
  object HighlightSettings {
    
    inline def apply(): HighlightSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighlightSettings] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
      
      inline def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
      
      inline def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
      
      inline def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  trait HyperlinkClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the clicked hyperlink
      */
    var hyperlink: js.UndefOr[String] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object HyperlinkClickEventArgs {
    
    inline def apply(): HyperlinkClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HyperlinkClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HyperlinkClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
      
      inline def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Triggers after the printing is completed.
      */
    var afterPrint: js.UndefOr[js.Function1[/* e */ AfterPrintEventArgs, Unit]] = js.undefined
    
    /** Triggers when the AJAX request is failed.
      */
    var ajaxRequestFailure: js.UndefOr[js.Function1[/* e */ AjaxRequestFailureEventArgs, Unit]] = js.undefined
    
    /** Triggers when the ajax request is Success.
      */
    var ajaxRequestSuccess: js.UndefOr[js.Function1[/* e */ AjaxRequestSuccessEventArgs, Unit]] = js.undefined
    
    /** Enables or disables the buffering of the PDF pages in the client side.
      */
    var allowClientBuffering: js.UndefOr[Boolean] = js.undefined
    
    /** Triggers when an annotation is added over the page of the PDF document.
      */
    var annotationAdd: js.UndefOr[js.Function1[/* e */ AnnotationAddEventArgs, Unit]] = js.undefined
    
    /** Enables/disables the annotation context menu.
      */
    var annotationContextMenu: js.UndefOr[AnnotationContextMenu] = js.undefined
    
    /** Triggers when the property of the annotation is changed in the page of the PDF document.
      */
    var annotationPropertiesChange: js.UndefOr[js.Function1[/* e */ AnnotationPropertiesChangeEventArgs, Unit]] = js.undefined
    
    /** Triggers when an annotation is removed from the page of the PDF document.
      */
    var annotationRemove: js.UndefOr[js.Function1[/* e */ AnnotationRemoveEventArgs, Unit]] = js.undefined
    
    /** Specifies the type of the annotations.
      */
    var annotationType: js.UndefOr[AnnotationType | String] = js.undefined
    
    /** Triggers before the printing starts.
      */
    var beforePrint: js.UndefOr[js.Function1[/* e */ BeforePrintEventArgs, Unit]] = js.undefined
    
    /** Triggers when the client buffering process ends.
      */
    var bufferEnd: js.UndefOr[js.Function1[/* e */ BufferEndEventArgs, Unit]] = js.undefined
    
    /** Triggers when the client buffering process starts.
      */
    var bufferStart: js.UndefOr[js.Function1[/* e */ BufferStartEventArgs, Unit]] = js.undefined
    
    /** Gets or sets the buffering mode of the PDF viewer control when allowClientBuffering is set to true.
      */
    var bufferingMode: js.UndefOr[BufferingMode | String] = js.undefined
    
    /** Gets the number of the page being displayed in the PDF viewer.
      */
    var currentPageNumber: js.UndefOr[Double] = js.undefined
    
    /** Triggers when PDF viewer control is destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Triggers when the PDF document gets loaded and is ready to view in the Control.
      */
    var documentLoad: js.UndefOr[js.Function1[/* e */ DocumentLoadEventArgs, Unit]] = js.undefined
    
    /** Sets the PDF document path for initial loading.
      */
    var documentPath: js.UndefOr[String] = js.undefined
    
    /** Triggers when the PDF document gets unloaded from the PDF viewer.
      */
    var documentUnload: js.UndefOr[js.Function1[/* e */ DocumentUnloadEventArgs, Unit]] = js.undefined
    
    /** Triggers when the download is completed or aborted.
      */
    var downloadEnd: js.UndefOr[js.Function1[/* e */ DownloadEndEventArgs, Unit]] = js.undefined
    
    /** Triggers when the download is started.
      */
    var downloadStart: js.UndefOr[js.Function1[/* e */ DownloadStartEventArgs, Unit]] = js.undefined
    
    /** Enables or disables the highlight annotation.
      */
    var enableHighlightAnnotation: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the hyperlinks in PDF document.
      */
    var enableHyperlink: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the adding of handwritten signature over the PDF document.
      */
    var enableSignature: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the strikethrough annotation.
      */
    var enableStrikethroughAnnotation: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the text markup annotations.
      */
    var enableTextMarkupAnnotations: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the text selection in PDF document.
      */
    var enableTextSelection: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the underline annotation.
      */
    var enableUnderlineAnnotation: js.UndefOr[Boolean] = js.undefined
    
    /** Gets the name of the PDF document which loaded in the ejPdfViewer control for downloading.
      */
    var fileName: js.UndefOr[String] = js.undefined
    
    /** Gets/sets the settings of the highlight annotation.
      */
    var highlightSettings: js.UndefOr[HighlightSettings] = js.undefined
    
    /** Triggers when hyperlink in the PDF Document is clicked
      */
    var hyperlinkClick: js.UndefOr[js.Function1[/* e */ HyperlinkClickEventArgs, Unit]] = js.undefined
    
    /** Specifies the open state of the hyperlink in the PDF document.
      */
    var hyperlinkOpenState: js.UndefOr[LinkTarget | String] = js.undefined
    
    /** Specifies the viewer interaction mode.
      */
    var interactionMode: js.UndefOr[InteractionMode | String] = js.undefined
    
    /** Checks whether the PDF document is edited.
      */
    var isDocumentEdited: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables the responsiveness of the PDF viewer control during the window resize.
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the locale information of the PDF viewer.
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /** Triggers when there is change in current page number.
      */
    var pageChange: js.UndefOr[js.Function1[/* e */ PageChangeEventArgs, Unit]] = js.undefined
    
    /** Triggers when the mouse click is performed over the page of the PDF document.
      */
    var pageClick: js.UndefOr[js.Function1[/* e */ PageClickEventArgs, Unit]] = js.undefined
    
    /** Gets the total number of pages in PDF document.
      */
    var pageCount: js.UndefOr[Double] = js.undefined
    
    /** Specifies the location of the supporting PDF service
      */
    var pdfService: js.UndefOr[PdfService | String] = js.undefined
    
    /** Specifies the name of the action method in the server.
      */
    var serverActionSettings: js.UndefOr[ServerActionSettings] = js.undefined
    
    /** Sets the PDF Web API service URL
      */
    var serviceUrl: js.UndefOr[String] = js.undefined
    
    /** Triggers when a handwritten signature is added over the page of the PDF document.
      */
    var signatureAdd: js.UndefOr[js.Function1[/* e */ SignatureAddEventArgs, Unit]] = js.undefined
    
    /** Triggers when a handwritten signature is removed from the page of the PDF document.
      */
    var signatureDelete: js.UndefOr[js.Function1[/* e */ SignatureDeleteEventArgs, Unit]] = js.undefined
    
    /** Triggers when a handwritten signature properties is changed in the PDF document.
      */
    var signaturePropertiesChange: js.UndefOr[js.Function1[/* e */ SignaturePropertiesChangeEventArgs, Unit]] = js.undefined
    
    /** Triggers when a handwritten signature is resized in the PDF document.
      */
    var signatureResize: js.UndefOr[js.Function1[/* e */ SignatureResizeEventArgs, Unit]] = js.undefined
    
    /** Gets/sets the settings of the handwritten signature.
      */
    var signatureSettings: js.UndefOr[SignatureSettings] = js.undefined
    
    /** Gets/sets the settings of the strikethrough annotation.
      */
    var strikethroughSettings: js.UndefOr[StrikethroughSettings] = js.undefined
    
    /** Enables/ disables the text selection context menu.
      */
    var textSelectionContextMenu: js.UndefOr[TextSelectionContextMenu] = js.undefined
    
    /** Specifies the toolbar settings.
      */
    var toolbarSettings: js.UndefOr[ToolbarSettings] = js.undefined
    
    /** Gets/sets the settings of the underline annotation.
      */
    var underlineSettings: js.UndefOr[UnderlineSettings] = js.undefined
    
    /** Triggers when there is change in the magnification value.
      */
    var zoomChange: js.UndefOr[js.Function1[/* e */ ZoomChangeEventArgs, Unit]] = js.undefined
    
    /** Gets the current zoom percentage of the PDF document in viewer.
      */
    var zoomPercentage: js.UndefOr[Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.PdfViewer.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.PdfViewer.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.PdfViewer.Model] (val x: Self) extends AnyVal {
      
      inline def setAfterPrint(value: /* e */ AfterPrintEventArgs => Unit): Self = StObject.set(x, "afterPrint", js.Any.fromFunction1(value))
      
      inline def setAfterPrintUndefined: Self = StObject.set(x, "afterPrint", js.undefined)
      
      inline def setAjaxRequestFailure(value: /* e */ AjaxRequestFailureEventArgs => Unit): Self = StObject.set(x, "ajaxRequestFailure", js.Any.fromFunction1(value))
      
      inline def setAjaxRequestFailureUndefined: Self = StObject.set(x, "ajaxRequestFailure", js.undefined)
      
      inline def setAjaxRequestSuccess(value: /* e */ AjaxRequestSuccessEventArgs => Unit): Self = StObject.set(x, "ajaxRequestSuccess", js.Any.fromFunction1(value))
      
      inline def setAjaxRequestSuccessUndefined: Self = StObject.set(x, "ajaxRequestSuccess", js.undefined)
      
      inline def setAllowClientBuffering(value: Boolean): Self = StObject.set(x, "allowClientBuffering", value.asInstanceOf[js.Any])
      
      inline def setAllowClientBufferingUndefined: Self = StObject.set(x, "allowClientBuffering", js.undefined)
      
      inline def setAnnotationAdd(value: /* e */ AnnotationAddEventArgs => Unit): Self = StObject.set(x, "annotationAdd", js.Any.fromFunction1(value))
      
      inline def setAnnotationAddUndefined: Self = StObject.set(x, "annotationAdd", js.undefined)
      
      inline def setAnnotationContextMenu(value: AnnotationContextMenu): Self = StObject.set(x, "annotationContextMenu", value.asInstanceOf[js.Any])
      
      inline def setAnnotationContextMenuUndefined: Self = StObject.set(x, "annotationContextMenu", js.undefined)
      
      inline def setAnnotationPropertiesChange(value: /* e */ AnnotationPropertiesChangeEventArgs => Unit): Self = StObject.set(x, "annotationPropertiesChange", js.Any.fromFunction1(value))
      
      inline def setAnnotationPropertiesChangeUndefined: Self = StObject.set(x, "annotationPropertiesChange", js.undefined)
      
      inline def setAnnotationRemove(value: /* e */ AnnotationRemoveEventArgs => Unit): Self = StObject.set(x, "annotationRemove", js.Any.fromFunction1(value))
      
      inline def setAnnotationRemoveUndefined: Self = StObject.set(x, "annotationRemove", js.undefined)
      
      inline def setAnnotationType(value: AnnotationType | String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
      
      inline def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
      
      inline def setBeforePrint(value: /* e */ BeforePrintEventArgs => Unit): Self = StObject.set(x, "beforePrint", js.Any.fromFunction1(value))
      
      inline def setBeforePrintUndefined: Self = StObject.set(x, "beforePrint", js.undefined)
      
      inline def setBufferEnd(value: /* e */ BufferEndEventArgs => Unit): Self = StObject.set(x, "bufferEnd", js.Any.fromFunction1(value))
      
      inline def setBufferEndUndefined: Self = StObject.set(x, "bufferEnd", js.undefined)
      
      inline def setBufferStart(value: /* e */ BufferStartEventArgs => Unit): Self = StObject.set(x, "bufferStart", js.Any.fromFunction1(value))
      
      inline def setBufferStartUndefined: Self = StObject.set(x, "bufferStart", js.undefined)
      
      inline def setBufferingMode(value: BufferingMode | String): Self = StObject.set(x, "bufferingMode", value.asInstanceOf[js.Any])
      
      inline def setBufferingModeUndefined: Self = StObject.set(x, "bufferingMode", js.undefined)
      
      inline def setCurrentPageNumber(value: Double): Self = StObject.set(x, "currentPageNumber", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageNumberUndefined: Self = StObject.set(x, "currentPageNumber", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setDocumentLoad(value: /* e */ DocumentLoadEventArgs => Unit): Self = StObject.set(x, "documentLoad", js.Any.fromFunction1(value))
      
      inline def setDocumentLoadUndefined: Self = StObject.set(x, "documentLoad", js.undefined)
      
      inline def setDocumentPath(value: String): Self = StObject.set(x, "documentPath", value.asInstanceOf[js.Any])
      
      inline def setDocumentPathUndefined: Self = StObject.set(x, "documentPath", js.undefined)
      
      inline def setDocumentUnload(value: /* e */ DocumentUnloadEventArgs => Unit): Self = StObject.set(x, "documentUnload", js.Any.fromFunction1(value))
      
      inline def setDocumentUnloadUndefined: Self = StObject.set(x, "documentUnload", js.undefined)
      
      inline def setDownloadEnd(value: /* e */ DownloadEndEventArgs => Unit): Self = StObject.set(x, "downloadEnd", js.Any.fromFunction1(value))
      
      inline def setDownloadEndUndefined: Self = StObject.set(x, "downloadEnd", js.undefined)
      
      inline def setDownloadStart(value: /* e */ DownloadStartEventArgs => Unit): Self = StObject.set(x, "downloadStart", js.Any.fromFunction1(value))
      
      inline def setDownloadStartUndefined: Self = StObject.set(x, "downloadStart", js.undefined)
      
      inline def setEnableHighlightAnnotation(value: Boolean): Self = StObject.set(x, "enableHighlightAnnotation", value.asInstanceOf[js.Any])
      
      inline def setEnableHighlightAnnotationUndefined: Self = StObject.set(x, "enableHighlightAnnotation", js.undefined)
      
      inline def setEnableHyperlink(value: Boolean): Self = StObject.set(x, "enableHyperlink", value.asInstanceOf[js.Any])
      
      inline def setEnableHyperlinkUndefined: Self = StObject.set(x, "enableHyperlink", js.undefined)
      
      inline def setEnableSignature(value: Boolean): Self = StObject.set(x, "enableSignature", value.asInstanceOf[js.Any])
      
      inline def setEnableSignatureUndefined: Self = StObject.set(x, "enableSignature", js.undefined)
      
      inline def setEnableStrikethroughAnnotation(value: Boolean): Self = StObject.set(x, "enableStrikethroughAnnotation", value.asInstanceOf[js.Any])
      
      inline def setEnableStrikethroughAnnotationUndefined: Self = StObject.set(x, "enableStrikethroughAnnotation", js.undefined)
      
      inline def setEnableTextMarkupAnnotations(value: Boolean): Self = StObject.set(x, "enableTextMarkupAnnotations", value.asInstanceOf[js.Any])
      
      inline def setEnableTextMarkupAnnotationsUndefined: Self = StObject.set(x, "enableTextMarkupAnnotations", js.undefined)
      
      inline def setEnableTextSelection(value: Boolean): Self = StObject.set(x, "enableTextSelection", value.asInstanceOf[js.Any])
      
      inline def setEnableTextSelectionUndefined: Self = StObject.set(x, "enableTextSelection", js.undefined)
      
      inline def setEnableUnderlineAnnotation(value: Boolean): Self = StObject.set(x, "enableUnderlineAnnotation", value.asInstanceOf[js.Any])
      
      inline def setEnableUnderlineAnnotationUndefined: Self = StObject.set(x, "enableUnderlineAnnotation", js.undefined)
      
      inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      inline def setHighlightSettings(value: HighlightSettings): Self = StObject.set(x, "highlightSettings", value.asInstanceOf[js.Any])
      
      inline def setHighlightSettingsUndefined: Self = StObject.set(x, "highlightSettings", js.undefined)
      
      inline def setHyperlinkClick(value: /* e */ HyperlinkClickEventArgs => Unit): Self = StObject.set(x, "hyperlinkClick", js.Any.fromFunction1(value))
      
      inline def setHyperlinkClickUndefined: Self = StObject.set(x, "hyperlinkClick", js.undefined)
      
      inline def setHyperlinkOpenState(value: LinkTarget | String): Self = StObject.set(x, "hyperlinkOpenState", value.asInstanceOf[js.Any])
      
      inline def setHyperlinkOpenStateUndefined: Self = StObject.set(x, "hyperlinkOpenState", js.undefined)
      
      inline def setInteractionMode(value: InteractionMode | String): Self = StObject.set(x, "interactionMode", value.asInstanceOf[js.Any])
      
      inline def setInteractionModeUndefined: Self = StObject.set(x, "interactionMode", js.undefined)
      
      inline def setIsDocumentEdited(value: Boolean): Self = StObject.set(x, "isDocumentEdited", value.asInstanceOf[js.Any])
      
      inline def setIsDocumentEditedUndefined: Self = StObject.set(x, "isDocumentEdited", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setPageChange(value: /* e */ PageChangeEventArgs => Unit): Self = StObject.set(x, "pageChange", js.Any.fromFunction1(value))
      
      inline def setPageChangeUndefined: Self = StObject.set(x, "pageChange", js.undefined)
      
      inline def setPageClick(value: /* e */ PageClickEventArgs => Unit): Self = StObject.set(x, "pageClick", js.Any.fromFunction1(value))
      
      inline def setPageClickUndefined: Self = StObject.set(x, "pageClick", js.undefined)
      
      inline def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
      
      inline def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
      
      inline def setPdfService(value: PdfService | String): Self = StObject.set(x, "pdfService", value.asInstanceOf[js.Any])
      
      inline def setPdfServiceUndefined: Self = StObject.set(x, "pdfService", js.undefined)
      
      inline def setServerActionSettings(value: ServerActionSettings): Self = StObject.set(x, "serverActionSettings", value.asInstanceOf[js.Any])
      
      inline def setServerActionSettingsUndefined: Self = StObject.set(x, "serverActionSettings", js.undefined)
      
      inline def setServiceUrl(value: String): Self = StObject.set(x, "serviceUrl", value.asInstanceOf[js.Any])
      
      inline def setServiceUrlUndefined: Self = StObject.set(x, "serviceUrl", js.undefined)
      
      inline def setSignatureAdd(value: /* e */ SignatureAddEventArgs => Unit): Self = StObject.set(x, "signatureAdd", js.Any.fromFunction1(value))
      
      inline def setSignatureAddUndefined: Self = StObject.set(x, "signatureAdd", js.undefined)
      
      inline def setSignatureDelete(value: /* e */ SignatureDeleteEventArgs => Unit): Self = StObject.set(x, "signatureDelete", js.Any.fromFunction1(value))
      
      inline def setSignatureDeleteUndefined: Self = StObject.set(x, "signatureDelete", js.undefined)
      
      inline def setSignaturePropertiesChange(value: /* e */ SignaturePropertiesChangeEventArgs => Unit): Self = StObject.set(x, "signaturePropertiesChange", js.Any.fromFunction1(value))
      
      inline def setSignaturePropertiesChangeUndefined: Self = StObject.set(x, "signaturePropertiesChange", js.undefined)
      
      inline def setSignatureResize(value: /* e */ SignatureResizeEventArgs => Unit): Self = StObject.set(x, "signatureResize", js.Any.fromFunction1(value))
      
      inline def setSignatureResizeUndefined: Self = StObject.set(x, "signatureResize", js.undefined)
      
      inline def setSignatureSettings(value: SignatureSettings): Self = StObject.set(x, "signatureSettings", value.asInstanceOf[js.Any])
      
      inline def setSignatureSettingsUndefined: Self = StObject.set(x, "signatureSettings", js.undefined)
      
      inline def setStrikethroughSettings(value: StrikethroughSettings): Self = StObject.set(x, "strikethroughSettings", value.asInstanceOf[js.Any])
      
      inline def setStrikethroughSettingsUndefined: Self = StObject.set(x, "strikethroughSettings", js.undefined)
      
      inline def setTextSelectionContextMenu(value: TextSelectionContextMenu): Self = StObject.set(x, "textSelectionContextMenu", value.asInstanceOf[js.Any])
      
      inline def setTextSelectionContextMenuUndefined: Self = StObject.set(x, "textSelectionContextMenu", js.undefined)
      
      inline def setToolbarSettings(value: ToolbarSettings): Self = StObject.set(x, "toolbarSettings", value.asInstanceOf[js.Any])
      
      inline def setToolbarSettingsUndefined: Self = StObject.set(x, "toolbarSettings", js.undefined)
      
      inline def setUnderlineSettings(value: UnderlineSettings): Self = StObject.set(x, "underlineSettings", value.asInstanceOf[js.Any])
      
      inline def setUnderlineSettingsUndefined: Self = StObject.set(x, "underlineSettings", js.undefined)
      
      inline def setZoomChange(value: /* e */ ZoomChangeEventArgs => Unit): Self = StObject.set(x, "zoomChange", js.Any.fromFunction1(value))
      
      inline def setZoomChangeUndefined: Self = StObject.set(x, "zoomChange", js.undefined)
      
      inline def setZoomPercentage(value: Double): Self = StObject.set(x, "zoomPercentage", value.asInstanceOf[js.Any])
      
      inline def setZoomPercentageUndefined: Self = StObject.set(x, "zoomPercentage", js.undefined)
    }
  }
  
  trait PageChangeEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current page number in view.
      */
    var currentPageNumber: js.UndefOr[Double] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PageChangeEventArgs {
    
    inline def apply(): PageChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageChangeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageChangeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentPageNumber(value: Double): Self = StObject.set(x, "currentPageNumber", value.asInstanceOf[js.Any])
      
      inline def setCurrentPageNumberUndefined: Self = StObject.set(x, "currentPageNumber", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait PageClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the current X position
      */
    var offsetX: js.UndefOr[Double] = js.undefined
    
    /** Returns the current Y position
      */
    var offsetY: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object PageClickEventArgs {
    
    inline def apply(): PageClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PageClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ServerActionSettings extends StObject {
    
    /** Specifies the name of the action method used for downloading the PDF document from the PDF viewer control.
      */
    var download: js.UndefOr[String] = js.undefined
    
    /** Specifies the name of the action method used for uploading the PDF document to the PDF viewer control.
      */
    var fileUpload: js.UndefOr[String] = js.undefined
    
    /** Specifies the name of the action method used for loading the PDF document.
      */
    var load: js.UndefOr[String] = js.undefined
    
    /** Specifies the name of the action method used for printing the PDF document in the PDF viewer control.
      */
    var print: js.UndefOr[String] = js.undefined
  }
  object ServerActionSettings {
    
    inline def apply(): ServerActionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerActionSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerActionSettings] (val x: Self) extends AnyVal {
      
      inline def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      inline def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      inline def setFileUpload(value: String): Self = StObject.set(x, "fileUpload", value.asInstanceOf[js.Any])
      
      inline def setFileUploadUndefined: Self = StObject.set(x, "fileUpload", js.undefined)
      
      inline def setLoad(value: String): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      inline def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      inline def setPrint(value: String): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      inline def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
    }
  }
  
  trait SignatureAddEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the page number in which the signature is added.
      */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** Returns the bounds of the signature added in the page of the PDF document.
      */
    var signatureBound: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns the settings of the signature added to the PDF document.
      */
    var signatureSettings: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SignatureAddEventArgs {
    
    inline def apply(): SignatureAddEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignatureAddEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignatureAddEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setSignatureBound(value: js.Array[Any]): Self = StObject.set(x, "signatureBound", value.asInstanceOf[js.Any])
      
      inline def setSignatureBoundUndefined: Self = StObject.set(x, "signatureBound", js.undefined)
      
      inline def setSignatureBoundVarargs(value: Any*): Self = StObject.set(x, "signatureBound", js.Array(value*))
      
      inline def setSignatureSettings(value: Any): Self = StObject.set(x, "signatureSettings", value.asInstanceOf[js.Any])
      
      inline def setSignatureSettingsUndefined: Self = StObject.set(x, "signatureSettings", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SignatureDeleteEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the page number in which the signature is removed.
      */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SignatureDeleteEventArgs {
    
    inline def apply(): SignatureDeleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignatureDeleteEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignatureDeleteEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SignaturePropertiesChangeEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current color of the signature.
      */
    var currentColor: js.UndefOr[String] = js.undefined
    
    /** Returns the current opacity of the signature.
      */
    var currentOpacity: js.UndefOr[Double] = js.undefined
    
    /** Specifies that the color of the signature is changed.
      */
    var isColorChange: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies that the opacity of the signature is changed.
      */
    var isOpacityChange: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the page number in which the signature properties is changed.
      */
    var pageID: js.UndefOr[Double] = js.undefined
    
    /** Returns the previous color of the signature.
      */
    var previousColor: js.UndefOr[String] = js.undefined
    
    /** Returns the previous opacity of the signature.
      */
    var previousOpacity: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SignaturePropertiesChangeEventArgs {
    
    inline def apply(): SignaturePropertiesChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignaturePropertiesChangeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignaturePropertiesChangeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentColor(value: String): Self = StObject.set(x, "currentColor", value.asInstanceOf[js.Any])
      
      inline def setCurrentColorUndefined: Self = StObject.set(x, "currentColor", js.undefined)
      
      inline def setCurrentOpacity(value: Double): Self = StObject.set(x, "currentOpacity", value.asInstanceOf[js.Any])
      
      inline def setCurrentOpacityUndefined: Self = StObject.set(x, "currentOpacity", js.undefined)
      
      inline def setIsColorChange(value: Boolean): Self = StObject.set(x, "isColorChange", value.asInstanceOf[js.Any])
      
      inline def setIsColorChangeUndefined: Self = StObject.set(x, "isColorChange", js.undefined)
      
      inline def setIsOpacityChange(value: Boolean): Self = StObject.set(x, "isOpacityChange", value.asInstanceOf[js.Any])
      
      inline def setIsOpacityChangeUndefined: Self = StObject.set(x, "isOpacityChange", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPageID(value: Double): Self = StObject.set(x, "pageID", value.asInstanceOf[js.Any])
      
      inline def setPageIDUndefined: Self = StObject.set(x, "pageID", js.undefined)
      
      inline def setPreviousColor(value: String): Self = StObject.set(x, "previousColor", value.asInstanceOf[js.Any])
      
      inline def setPreviousColorUndefined: Self = StObject.set(x, "previousColor", js.undefined)
      
      inline def setPreviousOpacity(value: Double): Self = StObject.set(x, "previousOpacity", value.asInstanceOf[js.Any])
      
      inline def setPreviousOpacityUndefined: Self = StObject.set(x, "previousOpacity", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SignatureResizeEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the page number in which the signature is added.
      */
    var pageNumber: js.UndefOr[Double] = js.undefined
    
    /** Returns the current bounds of the signature resized in the page of the PDF document.
      */
    var signatureCurrentBound: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns the previous bounds of the signature resized in the page of the PDF document.
      */
    var signaturePreviousBound: js.UndefOr[js.Array[Any]] = js.undefined
    
    /** Returns the settings of the signature added to the PDF document.
      */
    var signatureSettings: js.UndefOr[Any] = js.undefined
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object SignatureResizeEventArgs {
    
    inline def apply(): SignatureResizeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignatureResizeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignatureResizeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      inline def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      inline def setSignatureCurrentBound(value: js.Array[Any]): Self = StObject.set(x, "signatureCurrentBound", value.asInstanceOf[js.Any])
      
      inline def setSignatureCurrentBoundUndefined: Self = StObject.set(x, "signatureCurrentBound", js.undefined)
      
      inline def setSignatureCurrentBoundVarargs(value: Any*): Self = StObject.set(x, "signatureCurrentBound", js.Array(value*))
      
      inline def setSignaturePreviousBound(value: js.Array[Any]): Self = StObject.set(x, "signaturePreviousBound", value.asInstanceOf[js.Any])
      
      inline def setSignaturePreviousBoundUndefined: Self = StObject.set(x, "signaturePreviousBound", js.undefined)
      
      inline def setSignaturePreviousBoundVarargs(value: Any*): Self = StObject.set(x, "signaturePreviousBound", js.Array(value*))
      
      inline def setSignatureSettings(value: Any): Self = StObject.set(x, "signatureSettings", value.asInstanceOf[js.Any])
      
      inline def setSignatureSettingsUndefined: Self = StObject.set(x, "signatureSettings", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait SignatureSettings extends StObject {
    
    /** Gets/sets the color of the handwritten signature.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Gets/sets the opacity of the handwritten signature.
      */
    var opacity: js.UndefOr[Double] = js.undefined
  }
  object SignatureSettings {
    
    inline def apply(): SignatureSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignatureSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SignatureSettings] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  trait StrikethroughSettings extends StObject {
    
    /** Gets/sets the author of the strikethrough annotation.
      */
    var author: js.UndefOr[String] = js.undefined
    
    /** Gets/sets the color of the strikethrough annotation.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Gets/sets the locked property of the strikethrough annotation.
      */
    var isLocked: js.UndefOr[Boolean] = js.undefined
    
    /** Gets/sets the modified Date of the strikethrough annotation.
      */
    var modifiedDate: js.UndefOr[String] = js.undefined
    
    /** Gets/sets the opacity of the strikethrough annotation.
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Gets/sets the subject of the strikethrough annotation.
      */
    var subject: js.UndefOr[String] = js.undefined
  }
  object StrikethroughSettings {
    
    inline def apply(): StrikethroughSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrikethroughSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StrikethroughSettings] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
      
      inline def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
      
      inline def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
      
      inline def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  trait TextSelectionContextMenu extends StObject {
    
    /** Enables/disables the copy menu in the text selection context menu.
      */
    var isCopyEnable: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/ disables the text selection context menu.
      */
    var isEnable: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/disables the highlight annotation menu in the text selection context menu.
      */
    var isHighlightEnable: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/disables the search menu in the text selection context menu.
      */
    var isSearchEnable: js.UndefOr[Boolean] = js.undefined
    
    /** Enables/disables the strikeout annotation menu in the text selection context menu.
      */
    var isStrikeoutEnable: js.UndefOr[Boolean] = js.undefined
  }
  object TextSelectionContextMenu {
    
    inline def apply(): TextSelectionContextMenu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextSelectionContextMenu]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TextSelectionContextMenu] (val x: Self) extends AnyVal {
      
      inline def setIsCopyEnable(value: Boolean): Self = StObject.set(x, "isCopyEnable", value.asInstanceOf[js.Any])
      
      inline def setIsCopyEnableUndefined: Self = StObject.set(x, "isCopyEnable", js.undefined)
      
      inline def setIsEnable(value: Boolean): Self = StObject.set(x, "isEnable", value.asInstanceOf[js.Any])
      
      inline def setIsEnableUndefined: Self = StObject.set(x, "isEnable", js.undefined)
      
      inline def setIsHighlightEnable(value: Boolean): Self = StObject.set(x, "isHighlightEnable", value.asInstanceOf[js.Any])
      
      inline def setIsHighlightEnableUndefined: Self = StObject.set(x, "isHighlightEnable", js.undefined)
      
      inline def setIsSearchEnable(value: Boolean): Self = StObject.set(x, "isSearchEnable", value.asInstanceOf[js.Any])
      
      inline def setIsSearchEnableUndefined: Self = StObject.set(x, "isSearchEnable", js.undefined)
      
      inline def setIsStrikeoutEnable(value: Boolean): Self = StObject.set(x, "isStrikeoutEnable", value.asInstanceOf[js.Any])
      
      inline def setIsStrikeoutEnableUndefined: Self = StObject.set(x, "isStrikeoutEnable", js.undefined)
    }
  }
  
  trait ToolbarSettings extends StObject {
    
    /** Shows or hides the tooltip of the toolbar items.
      */
    var showToolTip: js.UndefOr[Boolean] = js.undefined
    
    /** Shows or hides the grouped items in the toolbar with the help of enum ej.PdfViewer.ToolbarItems
      */
    var toolbarItem: js.UndefOr[ToolbarItems | String] = js.undefined
  }
  object ToolbarSettings {
    
    inline def apply(): ToolbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ToolbarSettings] (val x: Self) extends AnyVal {
      
      inline def setShowToolTip(value: Boolean): Self = StObject.set(x, "showToolTip", value.asInstanceOf[js.Any])
      
      inline def setShowToolTipUndefined: Self = StObject.set(x, "showToolTip", js.undefined)
      
      inline def setToolbarItem(value: ToolbarItems | String): Self = StObject.set(x, "toolbarItem", value.asInstanceOf[js.Any])
      
      inline def setToolbarItemUndefined: Self = StObject.set(x, "toolbarItem", js.undefined)
    }
  }
  
  trait UnderlineSettings extends StObject {
    
    /** Gets/sets the author of the underline annotation.
      */
    var author: js.UndefOr[String] = js.undefined
    
    /** Gets/sets the color of the underline annotation.
      */
    var color: js.UndefOr[String] = js.undefined
    
    /** Gets/sets the locked property of the underline annotation.
      */
    var isLocked: js.UndefOr[Boolean] = js.undefined
    
    /** Gets/sets the modified Date of the underline annotation.
      */
    var modifiedDate: js.UndefOr[String] = js.undefined
    
    /** Gets/sets the opacity of the underline annotation.
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /** Gets/sets the subject of the underline annotation.
      */
    var subject: js.UndefOr[String] = js.undefined
  }
  object UnderlineSettings {
    
    inline def apply(): UnderlineSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnderlineSettings]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnderlineSettings] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
      
      inline def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
      
      inline def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
      
      inline def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  trait ZoomChangeEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Returns the current zoom percentage of the PDF viewer control
      */
    var currentZoomPercentage: js.UndefOr[Double] = js.undefined
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[Any] = js.undefined
    
    /** Returns the previous zoom percentage of the PDF viewer control
      */
    var previousZoomPercentage: js.UndefOr[Double] = js.undefined
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ZoomChangeEventArgs {
    
    inline def apply(): ZoomChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomChangeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ZoomChangeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setCurrentZoomPercentage(value: Double): Self = StObject.set(x, "currentZoomPercentage", value.asInstanceOf[js.Any])
      
      inline def setCurrentZoomPercentageUndefined: Self = StObject.set(x, "currentZoomPercentage", js.undefined)
      
      inline def setModel(value: Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPreviousZoomPercentage(value: Double): Self = StObject.set(x, "previousZoomPercentage", value.asInstanceOf[js.Any])
      
      inline def setPreviousZoomPercentageUndefined: Self = StObject.set(x, "previousZoomPercentage", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
