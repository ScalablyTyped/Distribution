package typings.ejWebAll.ej

import typings.ejWebAll.ej.PdfViewer.AnnotationType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PdfViewer extends Widget_ {
  
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
  def setJSONData(jsonData: js.Any): Unit = js.native
  
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
    sealed trait Highlight extends AnnotationType
    
    ///Specifies the strikethrough annotation.
    @js.native
    sealed trait Strikethrough extends AnnotationType
    
    ///Specifies the underline annotation.
    @js.native
    sealed trait Underline extends AnnotationType
  }
  
  @js.native
  sealed trait BufferingMode extends StObject
  @JSGlobal("ej.PdfViewer.BufferingMode")
  @js.native
  object BufferingMode extends StObject {
    
    ///Retrieves complete details to render all the pages in a single request.
    @js.native
    sealed trait Complete extends BufferingMode
    
    ///Retrieves details to render first two pages in a request and rest of the pages in other request.
    @js.native
    sealed trait Default extends BufferingMode
  }
  
  @js.native
  sealed trait InteractionMode extends StObject
  @JSGlobal("ej.PdfViewer.InteractionMode")
  @js.native
  object InteractionMode extends StObject {
    
    ///To set the panning mode to the PDF viewer control.
    @js.native
    sealed trait Pan extends InteractionMode
    
    ///To set the text selection mode to the PDF viewer control.
    @js.native
    sealed trait TextSelection extends InteractionMode
  }
  
  @js.native
  sealed trait LinkTarget extends StObject
  @JSGlobal("ej.PdfViewer.LinkTarget")
  @js.native
  object LinkTarget extends StObject {
    
    ///Opens the hyperlink in the same tab of the browser.
    @js.native
    sealed trait Default extends LinkTarget
    
    ///Opens the hyperlink in a new tab of the browser.
    @js.native
    sealed trait NewTab extends LinkTarget
    
    ///Opens the hyperlink in a new window of the browser.
    @js.native
    sealed trait NewWindow extends LinkTarget
  }
  
  @js.native
  sealed trait PdfService extends StObject
  @JSGlobal("ej.PdfViewer.PdfService")
  @js.native
  object PdfService extends StObject {
    
    ///Denotes that the service is located in the local project
    @js.native
    sealed trait Local extends PdfService
    
    ///Denotes that the service is hosted in the remote server
    @js.native
    sealed trait Remote extends PdfService
  }
  
  @js.native
  sealed trait ToolbarItems extends StObject
  @JSGlobal("ej.PdfViewer.ToolbarItems")
  @js.native
  object ToolbarItems extends StObject {
    
    ///Shows all the toolbar items.
    @js.native
    sealed trait All extends ToolbarItems
    
    ///Shows only download tool in the toolbar.
    @js.native
    sealed trait DownloadTool extends ToolbarItems
    
    ///Shows only magnification tools in the toolbar.
    @js.native
    sealed trait MagnificationTools extends ToolbarItems
    
    ///Shows only page navigation tools in the toolbar.
    @js.native
    sealed trait PageNavigationTools extends ToolbarItems
    
    ///Shows only print tool in the toolbar.
    @js.native
    sealed trait PrintTools extends ToolbarItems
    
    ///Shows only selection tool in the toolbar.
    @js.native
    sealed trait SelectionTool extends ToolbarItems
    
    ///Shows only signature tool in the toolbar.
    @js.native
    sealed trait SignatureTool extends ToolbarItems
    
    ///Shows only text markup annotation tools in the toolbar.
    @js.native
    sealed trait TextMarkupAnnotationTools extends ToolbarItems
    
    ///Shows only text search tool in the toolbar.
    @js.native
    sealed trait TextSearchTool extends ToolbarItems
  }
  
  @js.native
  trait AfterPrintEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AfterPrintEventArgs {
    
    @scala.inline
    def apply(): AfterPrintEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AfterPrintEventArgs]
    }
    
    @scala.inline
    implicit class AfterPrintEventArgsMutableBuilder[Self <: AfterPrintEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AjaxRequestFailureEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the exception details.
      */
    var message: js.UndefOr[String] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxRequestFailureEventArgs {
    
    @scala.inline
    def apply(): AjaxRequestFailureEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxRequestFailureEventArgs]
    }
    
    @scala.inline
    implicit class AjaxRequestFailureEventArgsMutableBuilder[Self <: AjaxRequestFailureEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AjaxRequestSuccessEventArgs extends StObject {
    
    /** true, if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the response data on ajax success.
      */
    var responseData: js.UndefOr[String] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AjaxRequestSuccessEventArgs {
    
    @scala.inline
    def apply(): AjaxRequestSuccessEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AjaxRequestSuccessEventArgs]
    }
    
    @scala.inline
    implicit class AjaxRequestSuccessEventArgsMutableBuilder[Self <: AjaxRequestSuccessEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setResponseData(value: String): Self = StObject.set(x, "responseData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponseDataUndefined: Self = StObject.set(x, "responseData", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AnnotationAddEventArgs extends StObject {
    
    /** Returns the bounds of the annotation added in the page of the PDF document.
      */
    var annotationBound: js.UndefOr[js.Array[_]] = js.native
    
    /** Returns the id of the annotation added in the page of the PDF document.
      */
    var annotationID: js.UndefOr[Double] = js.native
    
    /** Returns the settings of the annotation added to the PDF document.
      */
    var annotationSettings: js.UndefOr[js.Any] = js.native
    
    /** Returns the type of the annotation added in the page of the PDF document.
      */
    var annotationType: js.UndefOr[String] = js.native
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the page number in which the annotation is added.
      */
    var pageID: js.UndefOr[Double] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AnnotationAddEventArgs {
    
    @scala.inline
    def apply(): AnnotationAddEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationAddEventArgs]
    }
    
    @scala.inline
    implicit class AnnotationAddEventArgsMutableBuilder[Self <: AnnotationAddEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotationBound(value: js.Array[_]): Self = StObject.set(x, "annotationBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationBoundUndefined: Self = StObject.set(x, "annotationBound", js.undefined)
      
      @scala.inline
      def setAnnotationBoundVarargs(value: js.Any*): Self = StObject.set(x, "annotationBound", js.Array(value :_*))
      
      @scala.inline
      def setAnnotationID(value: Double): Self = StObject.set(x, "annotationID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationIDUndefined: Self = StObject.set(x, "annotationID", js.undefined)
      
      @scala.inline
      def setAnnotationSettings(value: js.Any): Self = StObject.set(x, "annotationSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationSettingsUndefined: Self = StObject.set(x, "annotationSettings", js.undefined)
      
      @scala.inline
      def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPageID(value: Double): Self = StObject.set(x, "pageID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageIDUndefined: Self = StObject.set(x, "pageID", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AnnotationContextMenu extends StObject {
    
    /** Enables/disables the delete menu in the annotation context menu.
      */
    var isDeleteEnable: js.UndefOr[Boolean] = js.native
    
    /** Enables/disables the annotation context menu.
      */
    var isEnable: js.UndefOr[Boolean] = js.native
    
    /** Enables/disables the popup menu in the annotation context menu.
      */
    var isPopupEnable: js.UndefOr[Boolean] = js.native
    
    /** Enables/disables the properties menu in the annotation context menu.
      */
    var isPropertiesEnable: js.UndefOr[Boolean] = js.native
  }
  object AnnotationContextMenu {
    
    @scala.inline
    def apply(): AnnotationContextMenu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationContextMenu]
    }
    
    @scala.inline
    implicit class AnnotationContextMenuMutableBuilder[Self <: AnnotationContextMenu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDeleteEnable(value: Boolean): Self = StObject.set(x, "isDeleteEnable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDeleteEnableUndefined: Self = StObject.set(x, "isDeleteEnable", js.undefined)
      
      @scala.inline
      def setIsEnable(value: Boolean): Self = StObject.set(x, "isEnable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnableUndefined: Self = StObject.set(x, "isEnable", js.undefined)
      
      @scala.inline
      def setIsPopupEnable(value: Boolean): Self = StObject.set(x, "isPopupEnable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPopupEnableUndefined: Self = StObject.set(x, "isPopupEnable", js.undefined)
      
      @scala.inline
      def setIsPropertiesEnable(value: Boolean): Self = StObject.set(x, "isPropertiesEnable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsPropertiesEnableUndefined: Self = StObject.set(x, "isPropertiesEnable", js.undefined)
    }
  }
  
  @js.native
  trait AnnotationPropertiesChangeEventArgs extends StObject {
    
    /** Returns the id of the annotation added in the page of the PDF document.
      */
    var annotationID: js.UndefOr[Double] = js.native
    
    /** Returns the type of the annotation added in the page of the PDF document.
      */
    var annotationType: js.UndefOr[String] = js.native
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Specifies that the color of the annotation is changed.
      */
    var isColorChanged: js.UndefOr[Boolean] = js.native
    
    /** Specifies that the opacity of the annotation is changed.
      */
    var isOpacityChanged: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the page number in which the annotation is added.
      */
    var pageID: js.UndefOr[Double] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AnnotationPropertiesChangeEventArgs {
    
    @scala.inline
    def apply(): AnnotationPropertiesChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationPropertiesChangeEventArgs]
    }
    
    @scala.inline
    implicit class AnnotationPropertiesChangeEventArgsMutableBuilder[Self <: AnnotationPropertiesChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotationID(value: Double): Self = StObject.set(x, "annotationID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationIDUndefined: Self = StObject.set(x, "annotationID", js.undefined)
      
      @scala.inline
      def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setIsColorChanged(value: Boolean): Self = StObject.set(x, "isColorChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsColorChangedUndefined: Self = StObject.set(x, "isColorChanged", js.undefined)
      
      @scala.inline
      def setIsOpacityChanged(value: Boolean): Self = StObject.set(x, "isOpacityChanged", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpacityChangedUndefined: Self = StObject.set(x, "isOpacityChanged", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPageID(value: Double): Self = StObject.set(x, "pageID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageIDUndefined: Self = StObject.set(x, "pageID", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait AnnotationRemoveEventArgs extends StObject {
    
    /** Returns the id of the annotation removed from the page of the PDF document.
      */
    var annotationID: js.UndefOr[Double] = js.native
    
    /** Returns the type of the annotation removed from the page of the PDF document.
      */
    var annotationType: js.UndefOr[String] = js.native
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the page number in which the annotation is removed.
      */
    var pageID: js.UndefOr[Double] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object AnnotationRemoveEventArgs {
    
    @scala.inline
    def apply(): AnnotationRemoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnnotationRemoveEventArgs]
    }
    
    @scala.inline
    implicit class AnnotationRemoveEventArgsMutableBuilder[Self <: AnnotationRemoveEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnnotationID(value: Double): Self = StObject.set(x, "annotationID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationIDUndefined: Self = StObject.set(x, "annotationID", js.undefined)
      
      @scala.inline
      def setAnnotationType(value: String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPageID(value: Double): Self = StObject.set(x, "pageID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageIDUndefined: Self = StObject.set(x, "pageID", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforePrintEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforePrintEventArgs {
    
    @scala.inline
    def apply(): BeforePrintEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforePrintEventArgs]
    }
    
    @scala.inline
    implicit class BeforePrintEventArgsMutableBuilder[Self <: BeforePrintEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BufferEndEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Specifies the state of the buffering
      */
    var isBuffering: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BufferEndEventArgs {
    
    @scala.inline
    def apply(): BufferEndEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferEndEventArgs]
    }
    
    @scala.inline
    implicit class BufferEndEventArgsMutableBuilder[Self <: BufferEndEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setIsBuffering(value: Boolean): Self = StObject.set(x, "isBuffering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBufferingUndefined: Self = StObject.set(x, "isBuffering", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BufferStartEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Specifies the state of the buffering
      */
    var isBuffering: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BufferStartEventArgs {
    
    @scala.inline
    def apply(): BufferStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BufferStartEventArgs]
    }
    
    @scala.inline
    implicit class BufferStartEventArgsMutableBuilder[Self <: BufferStartEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setIsBuffering(value: Boolean): Self = StObject.set(x, "isBuffering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBufferingUndefined: Self = StObject.set(x, "isBuffering", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DocumentLoadEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF document name displaying in the PDF viewer.
      */
    var fileName: js.UndefOr[String] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DocumentLoadEventArgs {
    
    @scala.inline
    def apply(): DocumentLoadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentLoadEventArgs]
    }
    
    @scala.inline
    implicit class DocumentLoadEventArgsMutableBuilder[Self <: DocumentLoadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DocumentUnloadEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DocumentUnloadEventArgs {
    
    @scala.inline
    def apply(): DocumentUnloadEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DocumentUnloadEventArgs]
    }
    
    @scala.inline
    implicit class DocumentUnloadEventArgsMutableBuilder[Self <: DocumentUnloadEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DownloadEndEventArgs extends StObject {
    
    /** true, if the event should be canceled; otherwise, false
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the name of the file being displayed in the PDF viewer.
      */
    var fileName: js.UndefOr[String] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the status about the download is completed or aborted.
      */
    var status: js.UndefOr[String] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DownloadEndEventArgs {
    
    @scala.inline
    def apply(): DownloadEndEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadEndEventArgs]
    }
    
    @scala.inline
    implicit class DownloadEndEventArgsMutableBuilder[Self <: DownloadEndEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DownloadStartEventArgs extends StObject {
    
    /** true, if the event should be canceled; otherwise, false
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the name of the file being displayed in the PDF viewer.
      */
    var fileName: js.UndefOr[String] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the status about the download is started.
      */
    var status: js.UndefOr[String] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DownloadStartEventArgs {
    
    @scala.inline
    def apply(): DownloadStartEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadStartEventArgs]
    }
    
    @scala.inline
    implicit class DownloadStartEventArgsMutableBuilder[Self <: DownloadStartEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait HighlightSettings extends StObject {
    
    /** Gets/sets the author of the highlight annotation.
      */
    var author: js.UndefOr[String] = js.native
    
    /** Gets/sets the color of the highlight  annotation.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Gets/sets the locked property of the highlight annotation.
      */
    var isLocked: js.UndefOr[Boolean] = js.native
    
    /** Gets/sets the modified Date of the highlight annotation.
      */
    var modifiedDate: js.UndefOr[String] = js.native
    
    /** Gets/sets the opacity of the highlight annotation.
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Gets/sets the subject of the highlight annotation.
      */
    var subject: js.UndefOr[String] = js.native
  }
  object HighlightSettings {
    
    @scala.inline
    def apply(): HighlightSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HighlightSettings]
    }
    
    @scala.inline
    implicit class HighlightSettingsMutableBuilder[Self <: HighlightSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
      
      @scala.inline
      def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  @js.native
  trait HyperlinkClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the clicked hyperlink
      */
    var hyperlink: js.UndefOr[String] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object HyperlinkClickEventArgs {
    
    @scala.inline
    def apply(): HyperlinkClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HyperlinkClickEventArgs]
    }
    
    @scala.inline
    implicit class HyperlinkClickEventArgsMutableBuilder[Self <: HyperlinkClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setHyperlink(value: String): Self = StObject.set(x, "hyperlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHyperlinkUndefined: Self = StObject.set(x, "hyperlink", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Triggers after the printing is completed.
      */
    var afterPrint: js.UndefOr[js.Function1[/* e */ AfterPrintEventArgs, Unit]] = js.native
    
    /** Triggers when the AJAX request is failed.
      */
    var ajaxRequestFailure: js.UndefOr[js.Function1[/* e */ AjaxRequestFailureEventArgs, Unit]] = js.native
    
    /** Triggers when the ajax request is Success.
      */
    var ajaxRequestSuccess: js.UndefOr[js.Function1[/* e */ AjaxRequestSuccessEventArgs, Unit]] = js.native
    
    /** Enables or disables the buffering of the PDF pages in the client side.
      */
    var allowClientBuffering: js.UndefOr[Boolean] = js.native
    
    /** Triggers when an annotation is added over the page of the PDF document.
      */
    var annotationAdd: js.UndefOr[js.Function1[/* e */ AnnotationAddEventArgs, Unit]] = js.native
    
    /** Enables/disables the annotation context menu.
      */
    var annotationContextMenu: js.UndefOr[AnnotationContextMenu] = js.native
    
    /** Triggers when the property of the annotation is changed in the page of the PDF document.
      */
    var annotationPropertiesChange: js.UndefOr[js.Function1[/* e */ AnnotationPropertiesChangeEventArgs, Unit]] = js.native
    
    /** Triggers when an annotation is removed from the page of the PDF document.
      */
    var annotationRemove: js.UndefOr[js.Function1[/* e */ AnnotationRemoveEventArgs, Unit]] = js.native
    
    /** Specifies the type of the annotations.
      */
    var annotationType: js.UndefOr[AnnotationType | String] = js.native
    
    /** Triggers before the printing starts.
      */
    var beforePrint: js.UndefOr[js.Function1[/* e */ BeforePrintEventArgs, Unit]] = js.native
    
    /** Triggers when the client buffering process ends.
      */
    var bufferEnd: js.UndefOr[js.Function1[/* e */ BufferEndEventArgs, Unit]] = js.native
    
    /** Triggers when the client buffering process starts.
      */
    var bufferStart: js.UndefOr[js.Function1[/* e */ BufferStartEventArgs, Unit]] = js.native
    
    /** Gets or sets the buffering mode of the PDF viewer control when allowClientBuffering is set to true.
      */
    var bufferingMode: js.UndefOr[BufferingMode | String] = js.native
    
    /** Gets the number of the page being displayed in the PDF viewer.
      */
    var currentPageNumber: js.UndefOr[Double] = js.native
    
    /** Triggers when PDF viewer control is destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
    
    /** Triggers when the PDF document gets loaded and is ready to view in the Control.
      */
    var documentLoad: js.UndefOr[js.Function1[/* e */ DocumentLoadEventArgs, Unit]] = js.native
    
    /** Sets the PDF document path for initial loading.
      */
    var documentPath: js.UndefOr[String] = js.native
    
    /** Triggers when the PDF document gets unloaded from the PDF viewer.
      */
    var documentUnload: js.UndefOr[js.Function1[/* e */ DocumentUnloadEventArgs, Unit]] = js.native
    
    /** Triggers when the download is completed or aborted.
      */
    var downloadEnd: js.UndefOr[js.Function1[/* e */ DownloadEndEventArgs, Unit]] = js.native
    
    /** Triggers when the download is started.
      */
    var downloadStart: js.UndefOr[js.Function1[/* e */ DownloadStartEventArgs, Unit]] = js.native
    
    /** Enables or disables the highlight annotation.
      */
    var enableHighlightAnnotation: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the hyperlinks in PDF document.
      */
    var enableHyperlink: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the adding of handwritten signature over the PDF document.
      */
    var enableSignature: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the strikethrough annotation.
      */
    var enableStrikethroughAnnotation: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the text markup annotations.
      */
    var enableTextMarkupAnnotations: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the text selection in PDF document.
      */
    var enableTextSelection: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the underline annotation.
      */
    var enableUnderlineAnnotation: js.UndefOr[Boolean] = js.native
    
    /** Gets the name of the PDF document which loaded in the ejPdfViewer control for downloading.
      */
    var fileName: js.UndefOr[String] = js.native
    
    /** Gets/sets the settings of the highlight annotation.
      */
    var highlightSettings: js.UndefOr[HighlightSettings] = js.native
    
    /** Triggers when hyperlink in the PDF Document is clicked
      */
    var hyperlinkClick: js.UndefOr[js.Function1[/* e */ HyperlinkClickEventArgs, Unit]] = js.native
    
    /** Specifies the open state of the hyperlink in the PDF document.
      */
    var hyperlinkOpenState: js.UndefOr[LinkTarget | String] = js.native
    
    /** Specifies the viewer interaction mode.
      */
    var interactionMode: js.UndefOr[InteractionMode | String] = js.native
    
    /** Checks whether the PDF document is edited.
      */
    var isDocumentEdited: js.UndefOr[Boolean] = js.native
    
    /** Enables or disables the responsiveness of the PDF viewer control during the window resize.
      */
    var isResponsive: js.UndefOr[Boolean] = js.native
    
    /** Specifies the locale information of the PDF viewer.
      */
    var locale: js.UndefOr[String] = js.native
    
    /** Triggers when there is change in current page number.
      */
    var pageChange: js.UndefOr[js.Function1[/* e */ PageChangeEventArgs, Unit]] = js.native
    
    /** Triggers when the mouse click is performed over the page of the PDF document.
      */
    var pageClick: js.UndefOr[js.Function1[/* e */ PageClickEventArgs, Unit]] = js.native
    
    /** Gets the total number of pages in PDF document.
      */
    var pageCount: js.UndefOr[Double] = js.native
    
    /** Specifies the location of the supporting PDF service
      */
    var pdfService: js.UndefOr[PdfService | String] = js.native
    
    /** Specifies the name of the action method in the server.
      */
    var serverActionSettings: js.UndefOr[ServerActionSettings] = js.native
    
    /** Sets the PDF Web API service URL
      */
    var serviceUrl: js.UndefOr[String] = js.native
    
    /** Triggers when a handwritten signature is added over the page of the PDF document.
      */
    var signatureAdd: js.UndefOr[js.Function1[/* e */ SignatureAddEventArgs, Unit]] = js.native
    
    /** Triggers when a handwritten signature is removed from the page of the PDF document.
      */
    var signatureDelete: js.UndefOr[js.Function1[/* e */ SignatureDeleteEventArgs, Unit]] = js.native
    
    /** Triggers when a handwritten signature properties is changed in the PDF document.
      */
    var signaturePropertiesChange: js.UndefOr[js.Function1[/* e */ SignaturePropertiesChangeEventArgs, Unit]] = js.native
    
    /** Triggers when a handwritten signature is resized in the PDF document.
      */
    var signatureResize: js.UndefOr[js.Function1[/* e */ SignatureResizeEventArgs, Unit]] = js.native
    
    /** Gets/sets the settings of the handwritten signature.
      */
    var signatureSettings: js.UndefOr[SignatureSettings] = js.native
    
    /** Gets/sets the settings of the strikethrough annotation.
      */
    var strikethroughSettings: js.UndefOr[StrikethroughSettings] = js.native
    
    /** Enables/ disables the text selection context menu.
      */
    var textSelectionContextMenu: js.UndefOr[TextSelectionContextMenu] = js.native
    
    /** Specifies the toolbar settings.
      */
    var toolbarSettings: js.UndefOr[ToolbarSettings] = js.native
    
    /** Gets/sets the settings of the underline annotation.
      */
    var underlineSettings: js.UndefOr[UnderlineSettings] = js.native
    
    /** Triggers when there is change in the magnification value.
      */
    var zoomChange: js.UndefOr[js.Function1[/* e */ ZoomChangeEventArgs, Unit]] = js.native
    
    /** Gets the current zoom percentage of the PDF document in viewer.
      */
    var zoomPercentage: js.UndefOr[Double] = js.native
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.PdfViewer.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.PdfViewer.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.PdfViewer.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterPrint(value: /* e */ AfterPrintEventArgs => Unit): Self = StObject.set(x, "afterPrint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterPrintUndefined: Self = StObject.set(x, "afterPrint", js.undefined)
      
      @scala.inline
      def setAjaxRequestFailure(value: /* e */ AjaxRequestFailureEventArgs => Unit): Self = StObject.set(x, "ajaxRequestFailure", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxRequestFailureUndefined: Self = StObject.set(x, "ajaxRequestFailure", js.undefined)
      
      @scala.inline
      def setAjaxRequestSuccess(value: /* e */ AjaxRequestSuccessEventArgs => Unit): Self = StObject.set(x, "ajaxRequestSuccess", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAjaxRequestSuccessUndefined: Self = StObject.set(x, "ajaxRequestSuccess", js.undefined)
      
      @scala.inline
      def setAllowClientBuffering(value: Boolean): Self = StObject.set(x, "allowClientBuffering", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClientBufferingUndefined: Self = StObject.set(x, "allowClientBuffering", js.undefined)
      
      @scala.inline
      def setAnnotationAdd(value: /* e */ AnnotationAddEventArgs => Unit): Self = StObject.set(x, "annotationAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAnnotationAddUndefined: Self = StObject.set(x, "annotationAdd", js.undefined)
      
      @scala.inline
      def setAnnotationContextMenu(value: AnnotationContextMenu): Self = StObject.set(x, "annotationContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationContextMenuUndefined: Self = StObject.set(x, "annotationContextMenu", js.undefined)
      
      @scala.inline
      def setAnnotationPropertiesChange(value: /* e */ AnnotationPropertiesChangeEventArgs => Unit): Self = StObject.set(x, "annotationPropertiesChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAnnotationPropertiesChangeUndefined: Self = StObject.set(x, "annotationPropertiesChange", js.undefined)
      
      @scala.inline
      def setAnnotationRemove(value: /* e */ AnnotationRemoveEventArgs => Unit): Self = StObject.set(x, "annotationRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAnnotationRemoveUndefined: Self = StObject.set(x, "annotationRemove", js.undefined)
      
      @scala.inline
      def setAnnotationType(value: AnnotationType | String): Self = StObject.set(x, "annotationType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnnotationTypeUndefined: Self = StObject.set(x, "annotationType", js.undefined)
      
      @scala.inline
      def setBeforePrint(value: /* e */ BeforePrintEventArgs => Unit): Self = StObject.set(x, "beforePrint", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforePrintUndefined: Self = StObject.set(x, "beforePrint", js.undefined)
      
      @scala.inline
      def setBufferEnd(value: /* e */ BufferEndEventArgs => Unit): Self = StObject.set(x, "bufferEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBufferEndUndefined: Self = StObject.set(x, "bufferEnd", js.undefined)
      
      @scala.inline
      def setBufferStart(value: /* e */ BufferStartEventArgs => Unit): Self = StObject.set(x, "bufferStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBufferStartUndefined: Self = StObject.set(x, "bufferStart", js.undefined)
      
      @scala.inline
      def setBufferingMode(value: BufferingMode | String): Self = StObject.set(x, "bufferingMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBufferingModeUndefined: Self = StObject.set(x, "bufferingMode", js.undefined)
      
      @scala.inline
      def setCurrentPageNumber(value: Double): Self = StObject.set(x, "currentPageNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageNumberUndefined: Self = StObject.set(x, "currentPageNumber", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setDocumentLoad(value: /* e */ DocumentLoadEventArgs => Unit): Self = StObject.set(x, "documentLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDocumentLoadUndefined: Self = StObject.set(x, "documentLoad", js.undefined)
      
      @scala.inline
      def setDocumentPath(value: String): Self = StObject.set(x, "documentPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDocumentPathUndefined: Self = StObject.set(x, "documentPath", js.undefined)
      
      @scala.inline
      def setDocumentUnload(value: /* e */ DocumentUnloadEventArgs => Unit): Self = StObject.set(x, "documentUnload", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDocumentUnloadUndefined: Self = StObject.set(x, "documentUnload", js.undefined)
      
      @scala.inline
      def setDownloadEnd(value: /* e */ DownloadEndEventArgs => Unit): Self = StObject.set(x, "downloadEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownloadEndUndefined: Self = StObject.set(x, "downloadEnd", js.undefined)
      
      @scala.inline
      def setDownloadStart(value: /* e */ DownloadStartEventArgs => Unit): Self = StObject.set(x, "downloadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownloadStartUndefined: Self = StObject.set(x, "downloadStart", js.undefined)
      
      @scala.inline
      def setEnableHighlightAnnotation(value: Boolean): Self = StObject.set(x, "enableHighlightAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableHighlightAnnotationUndefined: Self = StObject.set(x, "enableHighlightAnnotation", js.undefined)
      
      @scala.inline
      def setEnableHyperlink(value: Boolean): Self = StObject.set(x, "enableHyperlink", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableHyperlinkUndefined: Self = StObject.set(x, "enableHyperlink", js.undefined)
      
      @scala.inline
      def setEnableSignature(value: Boolean): Self = StObject.set(x, "enableSignature", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableSignatureUndefined: Self = StObject.set(x, "enableSignature", js.undefined)
      
      @scala.inline
      def setEnableStrikethroughAnnotation(value: Boolean): Self = StObject.set(x, "enableStrikethroughAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableStrikethroughAnnotationUndefined: Self = StObject.set(x, "enableStrikethroughAnnotation", js.undefined)
      
      @scala.inline
      def setEnableTextMarkupAnnotations(value: Boolean): Self = StObject.set(x, "enableTextMarkupAnnotations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTextMarkupAnnotationsUndefined: Self = StObject.set(x, "enableTextMarkupAnnotations", js.undefined)
      
      @scala.inline
      def setEnableTextSelection(value: Boolean): Self = StObject.set(x, "enableTextSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableTextSelectionUndefined: Self = StObject.set(x, "enableTextSelection", js.undefined)
      
      @scala.inline
      def setEnableUnderlineAnnotation(value: Boolean): Self = StObject.set(x, "enableUnderlineAnnotation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableUnderlineAnnotationUndefined: Self = StObject.set(x, "enableUnderlineAnnotation", js.undefined)
      
      @scala.inline
      def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
      
      @scala.inline
      def setHighlightSettings(value: HighlightSettings): Self = StObject.set(x, "highlightSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightSettingsUndefined: Self = StObject.set(x, "highlightSettings", js.undefined)
      
      @scala.inline
      def setHyperlinkClick(value: /* e */ HyperlinkClickEventArgs => Unit): Self = StObject.set(x, "hyperlinkClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHyperlinkClickUndefined: Self = StObject.set(x, "hyperlinkClick", js.undefined)
      
      @scala.inline
      def setHyperlinkOpenState(value: LinkTarget | String): Self = StObject.set(x, "hyperlinkOpenState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHyperlinkOpenStateUndefined: Self = StObject.set(x, "hyperlinkOpenState", js.undefined)
      
      @scala.inline
      def setInteractionMode(value: InteractionMode | String): Self = StObject.set(x, "interactionMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInteractionModeUndefined: Self = StObject.set(x, "interactionMode", js.undefined)
      
      @scala.inline
      def setIsDocumentEdited(value: Boolean): Self = StObject.set(x, "isDocumentEdited", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsDocumentEditedUndefined: Self = StObject.set(x, "isDocumentEdited", js.undefined)
      
      @scala.inline
      def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      @scala.inline
      def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      @scala.inline
      def setPageChange(value: /* e */ PageChangeEventArgs => Unit): Self = StObject.set(x, "pageChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageChangeUndefined: Self = StObject.set(x, "pageChange", js.undefined)
      
      @scala.inline
      def setPageClick(value: /* e */ PageClickEventArgs => Unit): Self = StObject.set(x, "pageClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPageClickUndefined: Self = StObject.set(x, "pageClick", js.undefined)
      
      @scala.inline
      def setPageCount(value: Double): Self = StObject.set(x, "pageCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageCountUndefined: Self = StObject.set(x, "pageCount", js.undefined)
      
      @scala.inline
      def setPdfService(value: PdfService | String): Self = StObject.set(x, "pdfService", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPdfServiceUndefined: Self = StObject.set(x, "pdfService", js.undefined)
      
      @scala.inline
      def setServerActionSettings(value: ServerActionSettings): Self = StObject.set(x, "serverActionSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerActionSettingsUndefined: Self = StObject.set(x, "serverActionSettings", js.undefined)
      
      @scala.inline
      def setServiceUrl(value: String): Self = StObject.set(x, "serviceUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUrlUndefined: Self = StObject.set(x, "serviceUrl", js.undefined)
      
      @scala.inline
      def setSignatureAdd(value: /* e */ SignatureAddEventArgs => Unit): Self = StObject.set(x, "signatureAdd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSignatureAddUndefined: Self = StObject.set(x, "signatureAdd", js.undefined)
      
      @scala.inline
      def setSignatureDelete(value: /* e */ SignatureDeleteEventArgs => Unit): Self = StObject.set(x, "signatureDelete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSignatureDeleteUndefined: Self = StObject.set(x, "signatureDelete", js.undefined)
      
      @scala.inline
      def setSignaturePropertiesChange(value: /* e */ SignaturePropertiesChangeEventArgs => Unit): Self = StObject.set(x, "signaturePropertiesChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSignaturePropertiesChangeUndefined: Self = StObject.set(x, "signaturePropertiesChange", js.undefined)
      
      @scala.inline
      def setSignatureResize(value: /* e */ SignatureResizeEventArgs => Unit): Self = StObject.set(x, "signatureResize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSignatureResizeUndefined: Self = StObject.set(x, "signatureResize", js.undefined)
      
      @scala.inline
      def setSignatureSettings(value: SignatureSettings): Self = StObject.set(x, "signatureSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureSettingsUndefined: Self = StObject.set(x, "signatureSettings", js.undefined)
      
      @scala.inline
      def setStrikethroughSettings(value: StrikethroughSettings): Self = StObject.set(x, "strikethroughSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrikethroughSettingsUndefined: Self = StObject.set(x, "strikethroughSettings", js.undefined)
      
      @scala.inline
      def setTextSelectionContextMenu(value: TextSelectionContextMenu): Self = StObject.set(x, "textSelectionContextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextSelectionContextMenuUndefined: Self = StObject.set(x, "textSelectionContextMenu", js.undefined)
      
      @scala.inline
      def setToolbarSettings(value: ToolbarSettings): Self = StObject.set(x, "toolbarSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarSettingsUndefined: Self = StObject.set(x, "toolbarSettings", js.undefined)
      
      @scala.inline
      def setUnderlineSettings(value: UnderlineSettings): Self = StObject.set(x, "underlineSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnderlineSettingsUndefined: Self = StObject.set(x, "underlineSettings", js.undefined)
      
      @scala.inline
      def setZoomChange(value: /* e */ ZoomChangeEventArgs => Unit): Self = StObject.set(x, "zoomChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setZoomChangeUndefined: Self = StObject.set(x, "zoomChange", js.undefined)
      
      @scala.inline
      def setZoomPercentage(value: Double): Self = StObject.set(x, "zoomPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomPercentageUndefined: Self = StObject.set(x, "zoomPercentage", js.undefined)
    }
  }
  
  @js.native
  trait PageChangeEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the current page number in view.
      */
    var currentPageNumber: js.UndefOr[Double] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object PageChangeEventArgs {
    
    @scala.inline
    def apply(): PageChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageChangeEventArgs]
    }
    
    @scala.inline
    implicit class PageChangeEventArgsMutableBuilder[Self <: PageChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentPageNumber(value: Double): Self = StObject.set(x, "currentPageNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentPageNumberUndefined: Self = StObject.set(x, "currentPageNumber", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait PageClickEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the current X position
      */
    var offsetX: js.UndefOr[Double] = js.native
    
    /** Returns the current Y position
      */
    var offsetY: js.UndefOr[Double] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object PageClickEventArgs {
    
    @scala.inline
    def apply(): PageClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PageClickEventArgs]
    }
    
    @scala.inline
    implicit class PageClickEventArgsMutableBuilder[Self <: PageClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      @scala.inline
      def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ServerActionSettings extends StObject {
    
    /** Specifies the name of the action method used for downloading the PDF document from the PDF viewer control.
      */
    var download: js.UndefOr[String] = js.native
    
    /** Specifies the name of the action method used for uploading the PDF document to the PDF viewer control.
      */
    var fileUpload: js.UndefOr[String] = js.native
    
    /** Specifies the name of the action method used for loading the PDF document.
      */
    var load: js.UndefOr[String] = js.native
    
    /** Specifies the name of the action method used for printing the PDF document in the PDF viewer control.
      */
    var print: js.UndefOr[String] = js.native
  }
  object ServerActionSettings {
    
    @scala.inline
    def apply(): ServerActionSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerActionSettings]
    }
    
    @scala.inline
    implicit class ServerActionSettingsMutableBuilder[Self <: ServerActionSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDownload(value: String): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setFileUpload(value: String): Self = StObject.set(x, "fileUpload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFileUploadUndefined: Self = StObject.set(x, "fileUpload", js.undefined)
      
      @scala.inline
      def setLoad(value: String): Self = StObject.set(x, "load", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadUndefined: Self = StObject.set(x, "load", js.undefined)
      
      @scala.inline
      def setPrint(value: String): Self = StObject.set(x, "print", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrintUndefined: Self = StObject.set(x, "print", js.undefined)
    }
  }
  
  @js.native
  trait SignatureAddEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the page number in which the signature is added.
      */
    var pageNumber: js.UndefOr[Double] = js.native
    
    /** Returns the bounds of the signature added in the page of the PDF document.
      */
    var signatureBound: js.UndefOr[js.Array[_]] = js.native
    
    /** Returns the settings of the signature added to the PDF document.
      */
    var signatureSettings: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SignatureAddEventArgs {
    
    @scala.inline
    def apply(): SignatureAddEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignatureAddEventArgs]
    }
    
    @scala.inline
    implicit class SignatureAddEventArgsMutableBuilder[Self <: SignatureAddEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      @scala.inline
      def setSignatureBound(value: js.Array[_]): Self = StObject.set(x, "signatureBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureBoundUndefined: Self = StObject.set(x, "signatureBound", js.undefined)
      
      @scala.inline
      def setSignatureBoundVarargs(value: js.Any*): Self = StObject.set(x, "signatureBound", js.Array(value :_*))
      
      @scala.inline
      def setSignatureSettings(value: js.Any): Self = StObject.set(x, "signatureSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureSettingsUndefined: Self = StObject.set(x, "signatureSettings", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SignatureDeleteEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the page number in which the signature is removed.
      */
    var pageNumber: js.UndefOr[Double] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SignatureDeleteEventArgs {
    
    @scala.inline
    def apply(): SignatureDeleteEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignatureDeleteEventArgs]
    }
    
    @scala.inline
    implicit class SignatureDeleteEventArgsMutableBuilder[Self <: SignatureDeleteEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SignaturePropertiesChangeEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the current color of the signature.
      */
    var currentColor: js.UndefOr[String] = js.native
    
    /** Returns the current opacity of the signature.
      */
    var currentOpacity: js.UndefOr[Double] = js.native
    
    /** Specifies that the color of the signature is changed.
      */
    var isColorChange: js.UndefOr[Boolean] = js.native
    
    /** Specifies that the opacity of the signature is changed.
      */
    var isOpacityChange: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the page number in which the signature properties is changed.
      */
    var pageID: js.UndefOr[Double] = js.native
    
    /** Returns the previous color of the signature.
      */
    var previousColor: js.UndefOr[String] = js.native
    
    /** Returns the previous opacity of the signature.
      */
    var previousOpacity: js.UndefOr[Double] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SignaturePropertiesChangeEventArgs {
    
    @scala.inline
    def apply(): SignaturePropertiesChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignaturePropertiesChangeEventArgs]
    }
    
    @scala.inline
    implicit class SignaturePropertiesChangeEventArgsMutableBuilder[Self <: SignaturePropertiesChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentColor(value: String): Self = StObject.set(x, "currentColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentColorUndefined: Self = StObject.set(x, "currentColor", js.undefined)
      
      @scala.inline
      def setCurrentOpacity(value: Double): Self = StObject.set(x, "currentOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentOpacityUndefined: Self = StObject.set(x, "currentOpacity", js.undefined)
      
      @scala.inline
      def setIsColorChange(value: Boolean): Self = StObject.set(x, "isColorChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsColorChangeUndefined: Self = StObject.set(x, "isColorChange", js.undefined)
      
      @scala.inline
      def setIsOpacityChange(value: Boolean): Self = StObject.set(x, "isOpacityChange", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpacityChangeUndefined: Self = StObject.set(x, "isOpacityChange", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPageID(value: Double): Self = StObject.set(x, "pageID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageIDUndefined: Self = StObject.set(x, "pageID", js.undefined)
      
      @scala.inline
      def setPreviousColor(value: String): Self = StObject.set(x, "previousColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousColorUndefined: Self = StObject.set(x, "previousColor", js.undefined)
      
      @scala.inline
      def setPreviousOpacity(value: Double): Self = StObject.set(x, "previousOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousOpacityUndefined: Self = StObject.set(x, "previousOpacity", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SignatureResizeEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the page number in which the signature is added.
      */
    var pageNumber: js.UndefOr[Double] = js.native
    
    /** Returns the current bounds of the signature resized in the page of the PDF document.
      */
    var signatureCurrentBound: js.UndefOr[js.Array[_]] = js.native
    
    /** Returns the previous bounds of the signature resized in the page of the PDF document.
      */
    var signaturePreviousBound: js.UndefOr[js.Array[_]] = js.native
    
    /** Returns the settings of the signature added to the PDF document.
      */
    var signatureSettings: js.UndefOr[js.Any] = js.native
    
    /** Returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object SignatureResizeEventArgs {
    
    @scala.inline
    def apply(): SignatureResizeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignatureResizeEventArgs]
    }
    
    @scala.inline
    implicit class SignatureResizeEventArgsMutableBuilder[Self <: SignatureResizeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPageNumber(value: Double): Self = StObject.set(x, "pageNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageNumberUndefined: Self = StObject.set(x, "pageNumber", js.undefined)
      
      @scala.inline
      def setSignatureCurrentBound(value: js.Array[_]): Self = StObject.set(x, "signatureCurrentBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureCurrentBoundUndefined: Self = StObject.set(x, "signatureCurrentBound", js.undefined)
      
      @scala.inline
      def setSignatureCurrentBoundVarargs(value: js.Any*): Self = StObject.set(x, "signatureCurrentBound", js.Array(value :_*))
      
      @scala.inline
      def setSignaturePreviousBound(value: js.Array[_]): Self = StObject.set(x, "signaturePreviousBound", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignaturePreviousBoundUndefined: Self = StObject.set(x, "signaturePreviousBound", js.undefined)
      
      @scala.inline
      def setSignaturePreviousBoundVarargs(value: js.Any*): Self = StObject.set(x, "signaturePreviousBound", js.Array(value :_*))
      
      @scala.inline
      def setSignatureSettings(value: js.Any): Self = StObject.set(x, "signatureSettings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignatureSettingsUndefined: Self = StObject.set(x, "signatureSettings", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait SignatureSettings extends StObject {
    
    /** Gets/sets the color of the handwritten signature.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Gets/sets the opacity of the handwritten signature.
      */
    var opacity: js.UndefOr[Double] = js.native
  }
  object SignatureSettings {
    
    @scala.inline
    def apply(): SignatureSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SignatureSettings]
    }
    
    @scala.inline
    implicit class SignatureSettingsMutableBuilder[Self <: SignatureSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    }
  }
  
  @js.native
  trait StrikethroughSettings extends StObject {
    
    /** Gets/sets the author of the strikethrough annotation.
      */
    var author: js.UndefOr[String] = js.native
    
    /** Gets/sets the color of the strikethrough annotation.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Gets/sets the locked property of the strikethrough annotation.
      */
    var isLocked: js.UndefOr[Boolean] = js.native
    
    /** Gets/sets the modified Date of the strikethrough annotation.
      */
    var modifiedDate: js.UndefOr[String] = js.native
    
    /** Gets/sets the opacity of the strikethrough annotation.
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Gets/sets the subject of the strikethrough annotation.
      */
    var subject: js.UndefOr[String] = js.native
  }
  object StrikethroughSettings {
    
    @scala.inline
    def apply(): StrikethroughSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrikethroughSettings]
    }
    
    @scala.inline
    implicit class StrikethroughSettingsMutableBuilder[Self <: StrikethroughSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
      
      @scala.inline
      def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  @js.native
  trait TextSelectionContextMenu extends StObject {
    
    /** Enables/disables the copy menu in the text selection context menu.
      */
    var isCopyEnable: js.UndefOr[Boolean] = js.native
    
    /** Enables/ disables the text selection context menu.
      */
    var isEnable: js.UndefOr[Boolean] = js.native
    
    /** Enables/disables the highlight annotation menu in the text selection context menu.
      */
    var isHighlightEnable: js.UndefOr[Boolean] = js.native
    
    /** Enables/disables the search menu in the text selection context menu.
      */
    var isSearchEnable: js.UndefOr[Boolean] = js.native
    
    /** Enables/disables the strikeout annotation menu in the text selection context menu.
      */
    var isStrikeoutEnable: js.UndefOr[Boolean] = js.native
  }
  object TextSelectionContextMenu {
    
    @scala.inline
    def apply(): TextSelectionContextMenu = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextSelectionContextMenu]
    }
    
    @scala.inline
    implicit class TextSelectionContextMenuMutableBuilder[Self <: TextSelectionContextMenu] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsCopyEnable(value: Boolean): Self = StObject.set(x, "isCopyEnable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCopyEnableUndefined: Self = StObject.set(x, "isCopyEnable", js.undefined)
      
      @scala.inline
      def setIsEnable(value: Boolean): Self = StObject.set(x, "isEnable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsEnableUndefined: Self = StObject.set(x, "isEnable", js.undefined)
      
      @scala.inline
      def setIsHighlightEnable(value: Boolean): Self = StObject.set(x, "isHighlightEnable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsHighlightEnableUndefined: Self = StObject.set(x, "isHighlightEnable", js.undefined)
      
      @scala.inline
      def setIsSearchEnable(value: Boolean): Self = StObject.set(x, "isSearchEnable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSearchEnableUndefined: Self = StObject.set(x, "isSearchEnable", js.undefined)
      
      @scala.inline
      def setIsStrikeoutEnable(value: Boolean): Self = StObject.set(x, "isStrikeoutEnable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsStrikeoutEnableUndefined: Self = StObject.set(x, "isStrikeoutEnable", js.undefined)
    }
  }
  
  @js.native
  trait ToolbarSettings extends StObject {
    
    /** Shows or hides the tooltip of the toolbar items.
      */
    var showToolTip: js.UndefOr[Boolean] = js.native
    
    /** Shows or hides the grouped items in the toolbar with the help of enum ej.PdfViewer.ToolbarItems
      */
    var toolbarItem: js.UndefOr[ToolbarItems | String] = js.native
  }
  object ToolbarSettings {
    
    @scala.inline
    def apply(): ToolbarSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToolbarSettings]
    }
    
    @scala.inline
    implicit class ToolbarSettingsMutableBuilder[Self <: ToolbarSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setShowToolTip(value: Boolean): Self = StObject.set(x, "showToolTip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowToolTipUndefined: Self = StObject.set(x, "showToolTip", js.undefined)
      
      @scala.inline
      def setToolbarItem(value: ToolbarItems | String): Self = StObject.set(x, "toolbarItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToolbarItemUndefined: Self = StObject.set(x, "toolbarItem", js.undefined)
    }
  }
  
  @js.native
  trait UnderlineSettings extends StObject {
    
    /** Gets/sets the author of the underline annotation.
      */
    var author: js.UndefOr[String] = js.native
    
    /** Gets/sets the color of the underline annotation.
      */
    var color: js.UndefOr[String] = js.native
    
    /** Gets/sets the locked property of the underline annotation.
      */
    var isLocked: js.UndefOr[Boolean] = js.native
    
    /** Gets/sets the modified Date of the underline annotation.
      */
    var modifiedDate: js.UndefOr[String] = js.native
    
    /** Gets/sets the opacity of the underline annotation.
      */
    var opacity: js.UndefOr[Double] = js.native
    
    /** Gets/sets the subject of the underline annotation.
      */
    var subject: js.UndefOr[String] = js.native
  }
  object UnderlineSettings {
    
    @scala.inline
    def apply(): UnderlineSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnderlineSettings]
    }
    
    @scala.inline
    implicit class UnderlineSettingsMutableBuilder[Self <: UnderlineSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setIsLocked(value: Boolean): Self = StObject.set(x, "isLocked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsLockedUndefined: Self = StObject.set(x, "isLocked", js.undefined)
      
      @scala.inline
      def setModifiedDate(value: String): Self = StObject.set(x, "modifiedDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModifiedDateUndefined: Self = StObject.set(x, "modifiedDate", js.undefined)
      
      @scala.inline
      def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    }
  }
  
  @js.native
  trait ZoomChangeEventArgs extends StObject {
    
    /** Returns the cancel option value.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** Returns the current zoom percentage of the PDF viewer control
      */
    var currentZoomPercentage: js.UndefOr[Double] = js.native
    
    /** Returns the PDF viewer model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** Returns the previous zoom percentage of the PDF viewer control
      */
    var previousZoomPercentage: js.UndefOr[Double] = js.native
    
    /** Returns the name of the event.
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ZoomChangeEventArgs {
    
    @scala.inline
    def apply(): ZoomChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ZoomChangeEventArgs]
    }
    
    @scala.inline
    implicit class ZoomChangeEventArgsMutableBuilder[Self <: ZoomChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setCurrentZoomPercentage(value: Double): Self = StObject.set(x, "currentZoomPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentZoomPercentageUndefined: Self = StObject.set(x, "currentZoomPercentage", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setPreviousZoomPercentage(value: Double): Self = StObject.set(x, "previousZoomPercentage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviousZoomPercentageUndefined: Self = StObject.set(x, "previousZoomPercentage", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
