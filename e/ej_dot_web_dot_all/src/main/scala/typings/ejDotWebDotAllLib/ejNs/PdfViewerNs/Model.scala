package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Model extends js.Object {
  /** Triggers after the printing is completed.
    */
  var afterPrint: js.UndefOr[js.Function1[/* e */ AfterPrintEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the AJAX request is failed.
    */
  var ajaxRequestFailure: js.UndefOr[js.Function1[/* e */ AjaxRequestFailureEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the ajax request is Success.
    */
  var ajaxRequestSuccess: js.UndefOr[js.Function1[/* e */ AjaxRequestSuccessEventArgs, scala.Unit]] = js.undefined
  /** Enables or disables the buffering of the PDF pages in the client side.
    */
  var allowClientBuffering: js.UndefOr[scala.Boolean] = js.undefined
  /** Triggers when an annotation is added over the page of the PDF document.
    */
  var annotationAdd: js.UndefOr[js.Function1[/* e */ AnnotationAddEventArgs, scala.Unit]] = js.undefined
  /** Enables/disables the annotation context menu.
    */
  var annotationContextMenu: js.UndefOr[AnnotationContextMenu] = js.undefined
  /** Triggers when the property of the annotation is changed in the page of the PDF document.
    */
  var annotationPropertiesChange: js.UndefOr[js.Function1[/* e */ AnnotationPropertiesChangeEventArgs, scala.Unit]] = js.undefined
  /** Triggers when an annotation is removed from the page of the PDF document.
    */
  var annotationRemove: js.UndefOr[js.Function1[/* e */ AnnotationRemoveEventArgs, scala.Unit]] = js.undefined
  /** Specifies the type of the annotations.
    */
  var annotationType: js.UndefOr[AnnotationType | java.lang.String] = js.undefined
  /** Triggers before the printing starts.
    */
  var beforePrint: js.UndefOr[js.Function1[/* e */ BeforePrintEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the client buffering process ends.
    */
  var bufferEnd: js.UndefOr[js.Function1[/* e */ BufferEndEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the client buffering process starts.
    */
  var bufferStart: js.UndefOr[js.Function1[/* e */ BufferStartEventArgs, scala.Unit]] = js.undefined
  /** Gets or sets the buffering mode of the PDF viewer control when allowClientBuffering is set to true.
    */
  var bufferingMode: js.UndefOr[BufferingMode | java.lang.String] = js.undefined
  /** Gets the number of the page being displayed in the PDF viewer.
    */
  var currentPageNumber: js.UndefOr[scala.Double] = js.undefined
  /** Triggers when PDF viewer control is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the PDF document gets loaded and is ready to view in the Control.
    */
  var documentLoad: js.UndefOr[js.Function1[/* e */ DocumentLoadEventArgs, scala.Unit]] = js.undefined
  /** Sets the PDF document path for initial loading.
    */
  var documentPath: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers when the PDF document gets unloaded from the PDF viewer.
    */
  var documentUnload: js.UndefOr[js.Function1[/* e */ DocumentUnloadEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the download is completed or aborted.
    */
  var downloadEnd: js.UndefOr[js.Function1[/* e */ DownloadEndEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the download is started.
    */
  var downloadStart: js.UndefOr[js.Function1[/* e */ DownloadStartEventArgs, scala.Unit]] = js.undefined
  /** Enables or disables the highlight annotation.
    */
  var enableHighlightAnnotation: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the hyperlinks in PDF document.
    */
  var enableHyperlink: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the adding of handwritten signature over the PDF document.
    */
  var enableSignature: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the strikethrough annotation.
    */
  var enableStrikethroughAnnotation: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the text markup annotations.
    */
  var enableTextMarkupAnnotations: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the text selection in PDF document.
    */
  var enableTextSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the underline annotation.
    */
  var enableUnderlineAnnotation: js.UndefOr[scala.Boolean] = js.undefined
  /** Gets the name of the PDF document which loaded in the ejPdfViewer control for downloading.
    */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  /** Gets/sets the settings of the highlight annotation.
    */
  var highlightSettings: js.UndefOr[HighlightSettings] = js.undefined
  /** Triggers when hyperlink in the PDF Document is clicked
    */
  var hyperlinkClick: js.UndefOr[js.Function1[/* e */ HyperlinkClickEventArgs, scala.Unit]] = js.undefined
  /** Specifies the open state of the hyperlink in the PDF document.
    */
  var hyperlinkOpenState: js.UndefOr[LinkTarget | java.lang.String] = js.undefined
  /** Specifies the viewer interaction mode.
    */
  var interactionMode: js.UndefOr[InteractionMode | java.lang.String] = js.undefined
  /** Checks whether the PDF document is edited.
    */
  var isDocumentEdited: js.UndefOr[scala.Boolean] = js.undefined
  /** Enables or disables the responsiveness of the PDF viewer control during the window resize.
    */
  var isResponsive: js.UndefOr[scala.Boolean] = js.undefined
  /** Specifies the locale information of the PDF viewer.
    */
  var locale: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers when there is change in current page number.
    */
  var pageChange: js.UndefOr[js.Function1[/* e */ PageChangeEventArgs, scala.Unit]] = js.undefined
  /** Triggers when the mouse click is performed over the page of the PDF document.
    */
  var pageClick: js.UndefOr[js.Function1[/* e */ PageClickEventArgs, scala.Unit]] = js.undefined
  /** Gets the total number of pages in PDF document.
    */
  var pageCount: js.UndefOr[scala.Double] = js.undefined
  /** Specifies the location of the supporting PDF service
    */
  var pdfService: js.UndefOr[PdfService | java.lang.String] = js.undefined
  /** Specifies the name of the action method in the server.
    */
  var serverActionSettings: js.UndefOr[ServerActionSettings] = js.undefined
  /** Sets the PDF Web API service URL
    */
  var serviceUrl: js.UndefOr[java.lang.String] = js.undefined
  /** Triggers when a handwritten signature is added over the page of the PDF document.
    */
  var signatureAdd: js.UndefOr[js.Function1[/* e */ SignatureAddEventArgs, scala.Unit]] = js.undefined
  /** Triggers when a handwritten signature is removed from the page of the PDF document.
    */
  var signatureDelete: js.UndefOr[js.Function1[/* e */ SignatureDeleteEventArgs, scala.Unit]] = js.undefined
  /** Triggers when a handwritten signature properties is changed in the PDF document.
    */
  var signaturePropertiesChange: js.UndefOr[js.Function1[/* e */ SignaturePropertiesChangeEventArgs, scala.Unit]] = js.undefined
  /** Triggers when a handwritten signature is resized in the PDF document.
    */
  var signatureResize: js.UndefOr[js.Function1[/* e */ SignatureResizeEventArgs, scala.Unit]] = js.undefined
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
  var zoomChange: js.UndefOr[js.Function1[/* e */ ZoomChangeEventArgs, scala.Unit]] = js.undefined
  /** Gets the current zoom percentage of the PDF document in viewer.
    */
  var zoomPercentage: js.UndefOr[scala.Double] = js.undefined
}

object Model {
  @scala.inline
  def apply(
    afterPrint: js.Function1[/* e */ AfterPrintEventArgs, scala.Unit] = null,
    ajaxRequestFailure: js.Function1[/* e */ AjaxRequestFailureEventArgs, scala.Unit] = null,
    ajaxRequestSuccess: js.Function1[/* e */ AjaxRequestSuccessEventArgs, scala.Unit] = null,
    allowClientBuffering: js.UndefOr[scala.Boolean] = js.undefined,
    annotationAdd: js.Function1[/* e */ AnnotationAddEventArgs, scala.Unit] = null,
    annotationContextMenu: AnnotationContextMenu = null,
    annotationPropertiesChange: js.Function1[/* e */ AnnotationPropertiesChangeEventArgs, scala.Unit] = null,
    annotationRemove: js.Function1[/* e */ AnnotationRemoveEventArgs, scala.Unit] = null,
    annotationType: AnnotationType | java.lang.String = null,
    beforePrint: js.Function1[/* e */ BeforePrintEventArgs, scala.Unit] = null,
    bufferEnd: js.Function1[/* e */ BufferEndEventArgs, scala.Unit] = null,
    bufferStart: js.Function1[/* e */ BufferStartEventArgs, scala.Unit] = null,
    bufferingMode: BufferingMode | java.lang.String = null,
    currentPageNumber: scala.Int | scala.Double = null,
    destroy: js.Function1[/* e */ DestroyEventArgs, scala.Unit] = null,
    documentLoad: js.Function1[/* e */ DocumentLoadEventArgs, scala.Unit] = null,
    documentPath: java.lang.String = null,
    documentUnload: js.Function1[/* e */ DocumentUnloadEventArgs, scala.Unit] = null,
    downloadEnd: js.Function1[/* e */ DownloadEndEventArgs, scala.Unit] = null,
    downloadStart: js.Function1[/* e */ DownloadStartEventArgs, scala.Unit] = null,
    enableHighlightAnnotation: js.UndefOr[scala.Boolean] = js.undefined,
    enableHyperlink: js.UndefOr[scala.Boolean] = js.undefined,
    enableSignature: js.UndefOr[scala.Boolean] = js.undefined,
    enableStrikethroughAnnotation: js.UndefOr[scala.Boolean] = js.undefined,
    enableTextMarkupAnnotations: js.UndefOr[scala.Boolean] = js.undefined,
    enableTextSelection: js.UndefOr[scala.Boolean] = js.undefined,
    enableUnderlineAnnotation: js.UndefOr[scala.Boolean] = js.undefined,
    fileName: java.lang.String = null,
    highlightSettings: HighlightSettings = null,
    hyperlinkClick: js.Function1[/* e */ HyperlinkClickEventArgs, scala.Unit] = null,
    hyperlinkOpenState: LinkTarget | java.lang.String = null,
    interactionMode: InteractionMode | java.lang.String = null,
    isDocumentEdited: js.UndefOr[scala.Boolean] = js.undefined,
    isResponsive: js.UndefOr[scala.Boolean] = js.undefined,
    locale: java.lang.String = null,
    pageChange: js.Function1[/* e */ PageChangeEventArgs, scala.Unit] = null,
    pageClick: js.Function1[/* e */ PageClickEventArgs, scala.Unit] = null,
    pageCount: scala.Int | scala.Double = null,
    pdfService: PdfService | java.lang.String = null,
    serverActionSettings: ServerActionSettings = null,
    serviceUrl: java.lang.String = null,
    signatureAdd: js.Function1[/* e */ SignatureAddEventArgs, scala.Unit] = null,
    signatureDelete: js.Function1[/* e */ SignatureDeleteEventArgs, scala.Unit] = null,
    signaturePropertiesChange: js.Function1[/* e */ SignaturePropertiesChangeEventArgs, scala.Unit] = null,
    signatureResize: js.Function1[/* e */ SignatureResizeEventArgs, scala.Unit] = null,
    signatureSettings: SignatureSettings = null,
    strikethroughSettings: StrikethroughSettings = null,
    textSelectionContextMenu: TextSelectionContextMenu = null,
    toolbarSettings: ToolbarSettings = null,
    underlineSettings: UnderlineSettings = null,
    zoomChange: js.Function1[/* e */ ZoomChangeEventArgs, scala.Unit] = null,
    zoomPercentage: scala.Int | scala.Double = null
  ): Model = {
    val __obj = js.Dynamic.literal()
    if (afterPrint != null) __obj.updateDynamic("afterPrint")(afterPrint)
    if (ajaxRequestFailure != null) __obj.updateDynamic("ajaxRequestFailure")(ajaxRequestFailure)
    if (ajaxRequestSuccess != null) __obj.updateDynamic("ajaxRequestSuccess")(ajaxRequestSuccess)
    if (!js.isUndefined(allowClientBuffering)) __obj.updateDynamic("allowClientBuffering")(allowClientBuffering)
    if (annotationAdd != null) __obj.updateDynamic("annotationAdd")(annotationAdd)
    if (annotationContextMenu != null) __obj.updateDynamic("annotationContextMenu")(annotationContextMenu)
    if (annotationPropertiesChange != null) __obj.updateDynamic("annotationPropertiesChange")(annotationPropertiesChange)
    if (annotationRemove != null) __obj.updateDynamic("annotationRemove")(annotationRemove)
    if (annotationType != null) __obj.updateDynamic("annotationType")(annotationType.asInstanceOf[js.Any])
    if (beforePrint != null) __obj.updateDynamic("beforePrint")(beforePrint)
    if (bufferEnd != null) __obj.updateDynamic("bufferEnd")(bufferEnd)
    if (bufferStart != null) __obj.updateDynamic("bufferStart")(bufferStart)
    if (bufferingMode != null) __obj.updateDynamic("bufferingMode")(bufferingMode.asInstanceOf[js.Any])
    if (currentPageNumber != null) __obj.updateDynamic("currentPageNumber")(currentPageNumber.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(destroy)
    if (documentLoad != null) __obj.updateDynamic("documentLoad")(documentLoad)
    if (documentPath != null) __obj.updateDynamic("documentPath")(documentPath)
    if (documentUnload != null) __obj.updateDynamic("documentUnload")(documentUnload)
    if (downloadEnd != null) __obj.updateDynamic("downloadEnd")(downloadEnd)
    if (downloadStart != null) __obj.updateDynamic("downloadStart")(downloadStart)
    if (!js.isUndefined(enableHighlightAnnotation)) __obj.updateDynamic("enableHighlightAnnotation")(enableHighlightAnnotation)
    if (!js.isUndefined(enableHyperlink)) __obj.updateDynamic("enableHyperlink")(enableHyperlink)
    if (!js.isUndefined(enableSignature)) __obj.updateDynamic("enableSignature")(enableSignature)
    if (!js.isUndefined(enableStrikethroughAnnotation)) __obj.updateDynamic("enableStrikethroughAnnotation")(enableStrikethroughAnnotation)
    if (!js.isUndefined(enableTextMarkupAnnotations)) __obj.updateDynamic("enableTextMarkupAnnotations")(enableTextMarkupAnnotations)
    if (!js.isUndefined(enableTextSelection)) __obj.updateDynamic("enableTextSelection")(enableTextSelection)
    if (!js.isUndefined(enableUnderlineAnnotation)) __obj.updateDynamic("enableUnderlineAnnotation")(enableUnderlineAnnotation)
    if (fileName != null) __obj.updateDynamic("fileName")(fileName)
    if (highlightSettings != null) __obj.updateDynamic("highlightSettings")(highlightSettings)
    if (hyperlinkClick != null) __obj.updateDynamic("hyperlinkClick")(hyperlinkClick)
    if (hyperlinkOpenState != null) __obj.updateDynamic("hyperlinkOpenState")(hyperlinkOpenState.asInstanceOf[js.Any])
    if (interactionMode != null) __obj.updateDynamic("interactionMode")(interactionMode.asInstanceOf[js.Any])
    if (!js.isUndefined(isDocumentEdited)) __obj.updateDynamic("isDocumentEdited")(isDocumentEdited)
    if (!js.isUndefined(isResponsive)) __obj.updateDynamic("isResponsive")(isResponsive)
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (pageChange != null) __obj.updateDynamic("pageChange")(pageChange)
    if (pageClick != null) __obj.updateDynamic("pageClick")(pageClick)
    if (pageCount != null) __obj.updateDynamic("pageCount")(pageCount.asInstanceOf[js.Any])
    if (pdfService != null) __obj.updateDynamic("pdfService")(pdfService.asInstanceOf[js.Any])
    if (serverActionSettings != null) __obj.updateDynamic("serverActionSettings")(serverActionSettings)
    if (serviceUrl != null) __obj.updateDynamic("serviceUrl")(serviceUrl)
    if (signatureAdd != null) __obj.updateDynamic("signatureAdd")(signatureAdd)
    if (signatureDelete != null) __obj.updateDynamic("signatureDelete")(signatureDelete)
    if (signaturePropertiesChange != null) __obj.updateDynamic("signaturePropertiesChange")(signaturePropertiesChange)
    if (signatureResize != null) __obj.updateDynamic("signatureResize")(signatureResize)
    if (signatureSettings != null) __obj.updateDynamic("signatureSettings")(signatureSettings)
    if (strikethroughSettings != null) __obj.updateDynamic("strikethroughSettings")(strikethroughSettings)
    if (textSelectionContextMenu != null) __obj.updateDynamic("textSelectionContextMenu")(textSelectionContextMenu)
    if (toolbarSettings != null) __obj.updateDynamic("toolbarSettings")(toolbarSettings)
    if (underlineSettings != null) __obj.updateDynamic("underlineSettings")(underlineSettings)
    if (zoomChange != null) __obj.updateDynamic("zoomChange")(zoomChange)
    if (zoomPercentage != null) __obj.updateDynamic("zoomPercentage")(zoomPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[Model]
  }
}

