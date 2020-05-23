package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportViewer.PageLoad and ASPxClientDocumentViewer.PageLoad events on the client side.
  */
trait ASPxClientReportViewerPageLoadEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a value specifying the total number of pages displayed in a report viewer.
    */
  var PageCount: Double
  /**
    * Gets a value specifying a zero-based index of a page to be displayed in a report viewer.
    */
  var PageIndex: Double
  /**
    * Gets a value indicating whether a report page, which is currently loaded into the ASPxClientReportViewer, is the first page of a report.
    */
  def IsFirstPage(): Boolean
  /**
    * Gets a value indicating whether a report page, which is currently loaded into the ASPxClientReportViewer, is the last page of a report.
    */
  def IsLastPage(): Boolean
}

object ASPxClientReportViewerPageLoadEventArgs {
  @scala.inline
  def apply(IsFirstPage: () => Boolean, IsLastPage: () => Boolean, PageCount: Double, PageIndex: Double): ASPxClientReportViewerPageLoadEventArgs = {
    val __obj = js.Dynamic.literal(IsFirstPage = js.Any.fromFunction0(IsFirstPage), IsLastPage = js.Any.fromFunction0(IsLastPage), PageCount = PageCount.asInstanceOf[js.Any], PageIndex = PageIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportViewerPageLoadEventArgs]
  }
}

