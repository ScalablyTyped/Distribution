package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportViewer.PageLoad and ASPxClientDocumentViewer.PageLoad events on the client side.
  */
@js.native
trait ASPxClientReportViewerPageLoadEventArgs extends ASPxClientEventArgs {
  
  /**
    * Gets a value indicating whether a report page, which is currently loaded into the ASPxClientReportViewer, is the first page of a report.
    */
  def IsFirstPage(): Boolean = js.native
  
  /**
    * Gets a value indicating whether a report page, which is currently loaded into the ASPxClientReportViewer, is the last page of a report.
    */
  def IsLastPage(): Boolean = js.native
  
  /**
    * Gets a value specifying the total number of pages displayed in a report viewer.
    */
  var PageCount: Double = js.native
  
  /**
    * Gets a value specifying a zero-based index of a page to be displayed in a report viewer.
    */
  var PageIndex: Double = js.native
}
object ASPxClientReportViewerPageLoadEventArgs {
  
  @scala.inline
  def apply(IsFirstPage: () => Boolean, IsLastPage: () => Boolean, PageCount: Double, PageIndex: Double): ASPxClientReportViewerPageLoadEventArgs = {
    val __obj = js.Dynamic.literal(IsFirstPage = js.Any.fromFunction0(IsFirstPage), IsLastPage = js.Any.fromFunction0(IsLastPage), PageCount = PageCount.asInstanceOf[js.Any], PageIndex = PageIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportViewerPageLoadEventArgs]
  }
  
  @scala.inline
  implicit class ASPxClientReportViewerPageLoadEventArgsMutableBuilder[Self <: ASPxClientReportViewerPageLoadEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsFirstPage(value: () => Boolean): Self = StObject.set(x, "IsFirstPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsLastPage(value: () => Boolean): Self = StObject.set(x, "IsLastPage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPageCount(value: Double): Self = StObject.set(x, "PageCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageIndex(value: Double): Self = StObject.set(x, "PageIndex", value.asInstanceOf[js.Any])
  }
}
