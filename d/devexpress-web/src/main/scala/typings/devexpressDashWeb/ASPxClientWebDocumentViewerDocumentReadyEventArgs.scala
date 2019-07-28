package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the PreviewDocumentReady events.
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
    val __obj = js.Dynamic.literal(DocumentId = DocumentId, PageCount = PageCount, ReportId = ReportId)
  
    __obj.asInstanceOf[ASPxClientWebDocumentViewerDocumentReadyEventArgs]
  }
}

