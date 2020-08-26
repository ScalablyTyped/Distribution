package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the ASPxClientReportViewer.PageLoad and ASPxClientDocumentViewer.PageLoad events on the client side.
  */
@js.native
trait ASPxClientReportViewerPageLoadEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a value specifying the total number of pages displayed in a report viewer.
    */
  var PageCount: Double = js.native
  /**
    * Gets a value specifying a zero-based index of a page to be displayed in a report viewer.
    */
  var PageIndex: Double = js.native
  /**
    * Gets a value indicating whether a report page, which is currently loaded into the ASPxClientReportViewer, is the first page of a report.
    */
  def IsFirstPage(): Boolean = js.native
  /**
    * Gets a value indicating whether a report page, which is currently loaded into the ASPxClientReportViewer, is the last page of a report.
    */
  def IsLastPage(): Boolean = js.native
}

object ASPxClientReportViewerPageLoadEventArgs {
  @scala.inline
  def apply(IsFirstPage: () => Boolean, IsLastPage: () => Boolean, PageCount: Double, PageIndex: Double): ASPxClientReportViewerPageLoadEventArgs = {
    val __obj = js.Dynamic.literal(IsFirstPage = js.Any.fromFunction0(IsFirstPage), IsLastPage = js.Any.fromFunction0(IsLastPage), PageCount = PageCount.asInstanceOf[js.Any], PageIndex = PageIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportViewerPageLoadEventArgs]
  }
  @scala.inline
  implicit class ASPxClientReportViewerPageLoadEventArgsOps[Self <: ASPxClientReportViewerPageLoadEventArgs] (val x: Self) extends AnyVal {
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
    def setIsFirstPage(value: () => Boolean): Self = this.set("IsFirstPage", js.Any.fromFunction0(value))
    @scala.inline
    def setIsLastPage(value: () => Boolean): Self = this.set("IsLastPage", js.Any.fromFunction0(value))
    @scala.inline
    def setPageCount(value: Double): Self = this.set("PageCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageIndex(value: Double): Self = this.set("PageIndex", value.asInstanceOf[js.Any])
  }
  
}

