package typings.devexpressWeb.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides data for the ASPxClientReportViewer.PageLoad and ASPxClientDocumentViewer.PageLoad events on the client side.
  */
@JSGlobal("ASPxClientReportViewerPageLoadEventArgs")
@js.native
class ASPxClientReportViewerPageLoadEventArgs protected ()
  extends StObject
     with typings.devexpressWeb.ASPxClientReportViewerPageLoadEventArgs {
  /**
    * Initializes a new instance of the ASPxClientReportViewerPageLoadEventArgs class with the specified settings.
    * @param pageIndex An integer value which specifies a zero-based index of a page to be displayed in a report viewer. This value is assigned to the ASPxClientReportViewerPageLoadEventArgs.PageIndex field.
    * @param pageCount An integer value which specifies the total number of pages displayed in a report viewer. This value is assigned to the ASPxClientReportViewerPageLoadEventArgs.PageCount field.
    */
  def this(pageIndex: Double, pageCount: Double) = this()
  
  /**
    * Gets a value indicating whether a report page, which is currently loaded into the ASPxClientReportViewer, is the first page of a report.
    */
  /* CompleteClass */
  override def IsFirstPage(): Boolean = js.native
  
  /**
    * Gets a value indicating whether a report page, which is currently loaded into the ASPxClientReportViewer, is the last page of a report.
    */
  /* CompleteClass */
  override def IsLastPage(): Boolean = js.native
  
  /**
    * Gets a value specifying the total number of pages displayed in a report viewer.
    */
  /* CompleteClass */
  var PageCount: Double = js.native
  
  /**
    * Gets a value specifying a zero-based index of a page to be displayed in a report viewer.
    */
  /* CompleteClass */
  var PageIndex: Double = js.native
}
