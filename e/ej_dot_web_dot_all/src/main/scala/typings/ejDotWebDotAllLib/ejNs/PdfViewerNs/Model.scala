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

