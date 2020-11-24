package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientWebDocumentViewer.DocumentReady  and ASPxClientReportDesigner.PreviewDocumentReady events.
  */
@js.native
trait ASPxClientWebDocumentViewerDocumentReadyEventArgs extends ASPxClientEventArgs {
  
  /**
    * Specifies the report document ID.
    */
  var DocumentId: String = js.native
  
  /**
    * Specifies the total number of pages in a report document.
    */
  var PageCount: Double = js.native
  
  /**
    * Specifies the report ID.
    */
  var ReportId: String = js.native
}
object ASPxClientWebDocumentViewerDocumentReadyEventArgs {
  
  @scala.inline
  def apply(DocumentId: String, PageCount: Double, ReportId: String): ASPxClientWebDocumentViewerDocumentReadyEventArgs = {
    val __obj = js.Dynamic.literal(DocumentId = DocumentId.asInstanceOf[js.Any], PageCount = PageCount.asInstanceOf[js.Any], ReportId = ReportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientWebDocumentViewerDocumentReadyEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientWebDocumentViewerDocumentReadyEventArgsOps[Self <: ASPxClientWebDocumentViewerDocumentReadyEventArgs] (val x: Self) extends AnyVal {
    
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
    def setDocumentId(value: String): Self = this.set("DocumentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageCount(value: Double): Self = this.set("PageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReportId(value: String): Self = this.set("ReportId", value.asInstanceOf[js.Any])
  }
}
