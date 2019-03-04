package typings
package devexpressDashWebLib

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
  var DocumentId: java.lang.String
  /**
    * Specifies the total number of pages in a report document.
    */
  var PageCount: scala.Double
  /**
    * Specifies the report ID.
    */
  var ReportId: java.lang.String
}

object ASPxClientWebDocumentViewerDocumentReadyEventArgs {
  @scala.inline
  def apply(DocumentId: java.lang.String, PageCount: scala.Double, ReportId: java.lang.String): ASPxClientWebDocumentViewerDocumentReadyEventArgs = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId, PageCount = PageCount, ReportId = ReportId)
  
    __obj.asInstanceOf[ASPxClientWebDocumentViewerDocumentReadyEventArgs]
  }
}

