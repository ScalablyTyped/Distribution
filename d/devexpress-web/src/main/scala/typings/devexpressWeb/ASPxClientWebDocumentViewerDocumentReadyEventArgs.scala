package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.DocumentReady  and ASPxClientReportDesigner.PreviewDocumentReady events.
  */
trait ASPxClientWebDocumentViewerDocumentReadyEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
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
  
  inline def apply(DocumentId: String, PageCount: Double, ReportId: String): ASPxClientWebDocumentViewerDocumentReadyEventArgs = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], PageCount = PageCount.asInstanceOf[js.Any], ReportId = ReportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerDocumentReadyEventArgs]
  }
  
  extension [Self <: ASPxClientWebDocumentViewerDocumentReadyEventArgs](x: Self) {
    
    inline def setDocumentId(value: String): Self = StObject.set(x, "DocumentId", value.asInstanceOf[js.Any])
    
    inline def setPageCount(value: Double): Self = StObject.set(x, "PageCount", value.asInstanceOf[js.Any])
    
    inline def setReportId(value: String): Self = StObject.set(x, "ReportId", value.asInstanceOf[js.Any])
  }
}
