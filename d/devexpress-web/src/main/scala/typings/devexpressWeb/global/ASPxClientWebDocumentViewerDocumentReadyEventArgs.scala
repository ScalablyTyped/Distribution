package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
