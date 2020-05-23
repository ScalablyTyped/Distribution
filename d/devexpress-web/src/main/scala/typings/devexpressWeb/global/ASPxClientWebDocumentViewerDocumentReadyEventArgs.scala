package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.DocumentReady  and ASPxClientReportDesigner.PreviewDocumentReady events.
  */
@JSGlobal("ASPxClientWebDocumentViewerDocumentReadyEventArgs")
@js.native
class ASPxClientWebDocumentViewerDocumentReadyEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientWebDocumentViewerDocumentReadyEventArgs {
  /**
    * Initializes a new instance of the ASPxClientWebDocumentViewerDocumentReadyEventArgs class with the specified settings.
    * @param documentId A string that specifies the report document ID. This value is assigned to the ASPxClientWebDocumentViewerDocumentReadyEventArgs.DocumentId field.
    * @param reportId A string that specifies the report ID. This value is assigned to the ASPxClientWebDocumentViewerDocumentReadyEventArgs.ReportId field.
    * @param pageCount An integer value that specifies the total number of pages in a report document. This value is assigned to the ASPxClientWebDocumentViewerDocumentReadyEventArgs.PageCount field.
    */
  def this(documentId: String, reportId: String, pageCount: Double) = this()
  /**
    * Specifies the report document ID.
    */
  /* CompleteClass */
  override var DocumentId: String = js.native
  /**
    * Specifies the total number of pages in a report document.
    */
  /* CompleteClass */
  override var PageCount: Double = js.native
  /**
    * Specifies the report ID.
    */
  /* CompleteClass */
  override var ReportId: String = js.native
}

