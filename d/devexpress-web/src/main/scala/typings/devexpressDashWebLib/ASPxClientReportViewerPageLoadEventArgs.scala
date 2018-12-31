package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides data for the PageLoad events on the client side.
  */
trait ASPxClientReportViewerPageLoadEventArgs extends ASPxClientEventArgs {
  /**
    * Gets a value specifying the total number of pages displayed in a report viewer.
    * Returns: $
    */
  var PageCount: scala.Double
  /**
    * Gets a value specifying a zero-based index of a page to be displayed in a report viewer.
    * Returns: $
    */
  var PageIndex: scala.Double
  /**
    * Gets a value indicating whether a report page, which is currently loaded into the ASPxClientReportViewer, is the first page of a report.
    */
  def IsFirstPage(): scala.Boolean
  /**
    * Gets a value indicating whether a report page, which is currently loaded into the ASPxClientReportViewer, is the last page of a report.
    */
  def IsLastPage(): scala.Boolean
}

