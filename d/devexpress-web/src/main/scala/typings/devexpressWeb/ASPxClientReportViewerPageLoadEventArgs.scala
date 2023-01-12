package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportViewer.PageLoad and ASPxClientDocumentViewer.PageLoad events on the client side.
  */
trait ASPxClientReportViewerPageLoadEventArgs
  extends StObject
     with ASPxClientEventArgs {
  
  /**
    * Gets a value indicating whether a report page, which is currently loaded into the ASPxClientReportViewer, is the first page of a report.
    */
  def IsFirstPage(): Boolean
  
  /**
    * Gets a value indicating whether a report page, which is currently loaded into the ASPxClientReportViewer, is the last page of a report.
    */
  def IsLastPage(): Boolean
  
  /**
    * Gets a value specifying the total number of pages displayed in a report viewer.
    */
  var PageCount: Double
  
  /**
    * Gets a value specifying a zero-based index of a page to be displayed in a report viewer.
    */
  var PageIndex: Double
}
object ASPxClientReportViewerPageLoadEventArgs {
  
  inline def apply(IsFirstPage: () => Boolean, IsLastPage: () => Boolean, PageCount: Double, PageIndex: Double): ASPxClientReportViewerPageLoadEventArgs = {
    val __obj = js.Dynamic.literal(IsFirstPage = js.Any.fromFunction0(IsFirstPage), IsLastPage = js.Any.fromFunction0(IsLastPage), PageCount = PageCount.asInstanceOf[js.Any], PageIndex = PageIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientReportViewerPageLoadEventArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ASPxClientReportViewerPageLoadEventArgs] (val x: Self) extends AnyVal {
    
    inline def setIsFirstPage(value: () => Boolean): Self = StObject.set(x, "IsFirstPage", js.Any.fromFunction0(value))
    
    inline def setIsLastPage(value: () => Boolean): Self = StObject.set(x, "IsLastPage", js.Any.fromFunction0(value))
    
    inline def setPageCount(value: Double): Self = StObject.set(x, "PageCount", value.asInstanceOf[js.Any])
    
    inline def setPageIndex(value: Double): Self = StObject.set(x, "PageIndex", value.asInstanceOf[js.Any])
  }
}
