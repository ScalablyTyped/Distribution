package typings.devexpressWeb.global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportViewer.PageLoad and ASPxClientDocumentViewer.PageLoad events on the client side.
  */
@JSGlobal("ASPxClientReportViewerPageLoadEventArgs")
@js.native
class ASPxClientReportViewerPageLoadEventArgs protected ()
  extends typings.devexpressWeb.ASPxClientReportViewerPageLoadEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportViewerPageLoadEventArgs class with the specified settings.
    * @param pageIndex An integer value which specifies a zero-based index of a page to be displayed in a report viewer. This value is assigned to the ASPxClientReportViewerPageLoadEventArgs.PageIndex field.
    * @param pageCount An integer value which specifies the total number of pages displayed in a report viewer. This value is assigned to the ASPxClientReportViewerPageLoadEventArgs.PageCount field.
    */
  def this(pageIndex: Double, pageCount: Double) = this()
}
