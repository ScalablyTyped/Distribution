package typings.ejWebAll.ej.PdfViewer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Model extends js.Object {
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
    def setAfterPrint(value: /* e */ AfterPrintEventArgs => Unit): Self = this.set("afterPrint", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterPrint: Self = this.set("afterPrint", js.undefined)
    @scala.inline
    def setAjaxRequestFailure(value: /* e */ AjaxRequestFailureEventArgs => Unit): Self = this.set("ajaxRequestFailure", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAjaxRequestFailure: Self = this.set("ajaxRequestFailure", js.undefined)
    @scala.inline
    def setAjaxRequestSuccess(value: /* e */ AjaxRequestSuccessEventArgs => Unit): Self = this.set("ajaxRequestSuccess", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAjaxRequestSuccess: Self = this.set("ajaxRequestSuccess", js.undefined)
    @scala.inline
    def setAllowClientBuffering(value: Boolean): Self = this.set("allowClientBuffering", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowClientBuffering: Self = this.set("allowClientBuffering", js.undefined)
    @scala.inline
    def setAnnotationAdd(value: /* e */ AnnotationAddEventArgs => Unit): Self = this.set("annotationAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAnnotationAdd: Self = this.set("annotationAdd", js.undefined)
    @scala.inline
    def setAnnotationContextMenu(value: AnnotationContextMenu): Self = this.set("annotationContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotationContextMenu: Self = this.set("annotationContextMenu", js.undefined)
    @scala.inline
    def setAnnotationPropertiesChange(value: /* e */ AnnotationPropertiesChangeEventArgs => Unit): Self = this.set("annotationPropertiesChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAnnotationPropertiesChange: Self = this.set("annotationPropertiesChange", js.undefined)
    @scala.inline
    def setAnnotationRemove(value: /* e */ AnnotationRemoveEventArgs => Unit): Self = this.set("annotationRemove", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAnnotationRemove: Self = this.set("annotationRemove", js.undefined)
    @scala.inline
    def setAnnotationType(value: AnnotationType | String): Self = this.set("annotationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnnotationType: Self = this.set("annotationType", js.undefined)
    @scala.inline
    def setBeforePrint(value: /* e */ BeforePrintEventArgs => Unit): Self = this.set("beforePrint", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBeforePrint: Self = this.set("beforePrint", js.undefined)
    @scala.inline
    def setBufferEnd(value: /* e */ BufferEndEventArgs => Unit): Self = this.set("bufferEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBufferEnd: Self = this.set("bufferEnd", js.undefined)
    @scala.inline
    def setBufferStart(value: /* e */ BufferStartEventArgs => Unit): Self = this.set("bufferStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteBufferStart: Self = this.set("bufferStart", js.undefined)
    @scala.inline
    def setBufferingMode(value: BufferingMode | String): Self = this.set("bufferingMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBufferingMode: Self = this.set("bufferingMode", js.undefined)
    @scala.inline
    def setCurrentPageNumber(value: Double): Self = this.set("currentPageNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentPageNumber: Self = this.set("currentPageNumber", js.undefined)
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    @scala.inline
    def setDocumentLoad(value: /* e */ DocumentLoadEventArgs => Unit): Self = this.set("documentLoad", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDocumentLoad: Self = this.set("documentLoad", js.undefined)
    @scala.inline
    def setDocumentPath(value: String): Self = this.set("documentPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDocumentPath: Self = this.set("documentPath", js.undefined)
    @scala.inline
    def setDocumentUnload(value: /* e */ DocumentUnloadEventArgs => Unit): Self = this.set("documentUnload", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDocumentUnload: Self = this.set("documentUnload", js.undefined)
    @scala.inline
    def setDownloadEnd(value: /* e */ DownloadEndEventArgs => Unit): Self = this.set("downloadEnd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDownloadEnd: Self = this.set("downloadEnd", js.undefined)
    @scala.inline
    def setDownloadStart(value: /* e */ DownloadStartEventArgs => Unit): Self = this.set("downloadStart", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDownloadStart: Self = this.set("downloadStart", js.undefined)
    @scala.inline
    def setEnableHighlightAnnotation(value: Boolean): Self = this.set("enableHighlightAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHighlightAnnotation: Self = this.set("enableHighlightAnnotation", js.undefined)
    @scala.inline
    def setEnableHyperlink(value: Boolean): Self = this.set("enableHyperlink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableHyperlink: Self = this.set("enableHyperlink", js.undefined)
    @scala.inline
    def setEnableSignature(value: Boolean): Self = this.set("enableSignature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableSignature: Self = this.set("enableSignature", js.undefined)
    @scala.inline
    def setEnableStrikethroughAnnotation(value: Boolean): Self = this.set("enableStrikethroughAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableStrikethroughAnnotation: Self = this.set("enableStrikethroughAnnotation", js.undefined)
    @scala.inline
    def setEnableTextMarkupAnnotations(value: Boolean): Self = this.set("enableTextMarkupAnnotations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTextMarkupAnnotations: Self = this.set("enableTextMarkupAnnotations", js.undefined)
    @scala.inline
    def setEnableTextSelection(value: Boolean): Self = this.set("enableTextSelection", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableTextSelection: Self = this.set("enableTextSelection", js.undefined)
    @scala.inline
    def setEnableUnderlineAnnotation(value: Boolean): Self = this.set("enableUnderlineAnnotation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableUnderlineAnnotation: Self = this.set("enableUnderlineAnnotation", js.undefined)
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    @scala.inline
    def setHighlightSettings(value: HighlightSettings): Self = this.set("highlightSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHighlightSettings: Self = this.set("highlightSettings", js.undefined)
    @scala.inline
    def setHyperlinkClick(value: /* e */ HyperlinkClickEventArgs => Unit): Self = this.set("hyperlinkClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteHyperlinkClick: Self = this.set("hyperlinkClick", js.undefined)
    @scala.inline
    def setHyperlinkOpenState(value: LinkTarget | String): Self = this.set("hyperlinkOpenState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHyperlinkOpenState: Self = this.set("hyperlinkOpenState", js.undefined)
    @scala.inline
    def setInteractionMode(value: InteractionMode | String): Self = this.set("interactionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInteractionMode: Self = this.set("interactionMode", js.undefined)
    @scala.inline
    def setIsDocumentEdited(value: Boolean): Self = this.set("isDocumentEdited", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsDocumentEdited: Self = this.set("isDocumentEdited", js.undefined)
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setPageChange(value: /* e */ PageChangeEventArgs => Unit): Self = this.set("pageChange", js.Any.fromFunction1(value))
    @scala.inline
    def deletePageChange: Self = this.set("pageChange", js.undefined)
    @scala.inline
    def setPageClick(value: /* e */ PageClickEventArgs => Unit): Self = this.set("pageClick", js.Any.fromFunction1(value))
    @scala.inline
    def deletePageClick: Self = this.set("pageClick", js.undefined)
    @scala.inline
    def setPageCount(value: Double): Self = this.set("pageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePageCount: Self = this.set("pageCount", js.undefined)
    @scala.inline
    def setPdfService(value: PdfService | String): Self = this.set("pdfService", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePdfService: Self = this.set("pdfService", js.undefined)
    @scala.inline
    def setServerActionSettings(value: ServerActionSettings): Self = this.set("serverActionSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerActionSettings: Self = this.set("serverActionSettings", js.undefined)
    @scala.inline
    def setServiceUrl(value: String): Self = this.set("serviceUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceUrl: Self = this.set("serviceUrl", js.undefined)
    @scala.inline
    def setSignatureAdd(value: /* e */ SignatureAddEventArgs => Unit): Self = this.set("signatureAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSignatureAdd: Self = this.set("signatureAdd", js.undefined)
    @scala.inline
    def setSignatureDelete(value: /* e */ SignatureDeleteEventArgs => Unit): Self = this.set("signatureDelete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSignatureDelete: Self = this.set("signatureDelete", js.undefined)
    @scala.inline
    def setSignaturePropertiesChange(value: /* e */ SignaturePropertiesChangeEventArgs => Unit): Self = this.set("signaturePropertiesChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSignaturePropertiesChange: Self = this.set("signaturePropertiesChange", js.undefined)
    @scala.inline
    def setSignatureResize(value: /* e */ SignatureResizeEventArgs => Unit): Self = this.set("signatureResize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSignatureResize: Self = this.set("signatureResize", js.undefined)
    @scala.inline
    def setSignatureSettings(value: SignatureSettings): Self = this.set("signatureSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignatureSettings: Self = this.set("signatureSettings", js.undefined)
    @scala.inline
    def setStrikethroughSettings(value: StrikethroughSettings): Self = this.set("strikethroughSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrikethroughSettings: Self = this.set("strikethroughSettings", js.undefined)
    @scala.inline
    def setTextSelectionContextMenu(value: TextSelectionContextMenu): Self = this.set("textSelectionContextMenu", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTextSelectionContextMenu: Self = this.set("textSelectionContextMenu", js.undefined)
    @scala.inline
    def setToolbarSettings(value: ToolbarSettings): Self = this.set("toolbarSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToolbarSettings: Self = this.set("toolbarSettings", js.undefined)
    @scala.inline
    def setUnderlineSettings(value: UnderlineSettings): Self = this.set("underlineSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnderlineSettings: Self = this.set("underlineSettings", js.undefined)
    @scala.inline
    def setZoomChange(value: /* e */ ZoomChangeEventArgs => Unit): Self = this.set("zoomChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteZoomChange: Self = this.set("zoomChange", js.undefined)
    @scala.inline
    def setZoomPercentage(value: Double): Self = this.set("zoomPercentage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteZoomPercentage: Self = this.set("zoomPercentage", js.undefined)
  }
  
}

