package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientWebDocumentViewer.DocumentReady  and ASPxClientReportDesigner.PreviewDocumentReady events.
  */
trait ASPxClientWebDocumentViewerDocumentReadyEventArgs extends ASPxClientEventArgs {
  /**
    * Specifies the report document ID.
    */
  var DocumentId: String
  /**
    * Specifies the total number of pages in a report document.
    */
  var PageCount: Double
  /**
    * Specifies the report ID.
    */
  var ReportId: String
}

object ASPxClientWebDocumentViewerDocumentReadyEventArgs {
  @scala.inline
  def apply(DocumentId: String, PageCount: Double, ReportId: String): ASPxClientWebDocumentViewerDocumentReadyEventArgs = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], PageCount = PageCount.asInstanceOf[js.Any], ReportId = ReportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerDocumentReadyEventArgs]
  }
}

