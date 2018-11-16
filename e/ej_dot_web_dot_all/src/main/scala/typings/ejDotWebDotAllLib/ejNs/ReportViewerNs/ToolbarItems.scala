package typings
package ejDotWebDotAllLib.ejNs.ReportViewerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolbarItems extends js.Object

@JSGlobal("ej.ReportViewer.ToolbarItems")
@js.native
object ToolbarItems extends js.Object {
  ///Specifies the Export as value in ToolbarItems to get specified item.
  @js.native
  sealed trait Export
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ToolbarItems
  
  ///Specifies the FittoPage as value in ToolbarItems to get specified item.
  @js.native
  sealed trait FittoPage
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ToolbarItems
  
  ///Specifies the PageNavigation as value in ToolbarItems to get specified item.
  @js.native
  sealed trait PageNavigation
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ToolbarItems
  
  ///Specifies the PageSetup as value in ToolbarItems to get specified item.
  @js.native
  sealed trait PageSetup
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ToolbarItems
  
  ///Specifies the Parameters as value in ToolbarItems to get specified item.
  @js.native
  sealed trait Parameters
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ToolbarItems
  
  ///Specifies the Print as value in ToolbarItems to get specified item.
  @js.native
  sealed trait Print
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ToolbarItems
  
  ///Specifies the PrintLayout as value in ToolbarItems to get specified item.
  @js.native
  sealed trait PrintLayout
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ToolbarItems
  
  ///Specifies the Refresh as value in ToolbarItems to get specified item.
  @js.native
  sealed trait Refresh
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ToolbarItems
  
  ///Specifies the Zoom as value in ToolbarItems to get specified item.
  @js.native
  sealed trait Zoom
    extends ejDotWebDotAllLib.ejNs.ReportViewerNs.ToolbarItems
  
  val Export: Export with java.lang.String = js.native
  val FittoPage: FittoPage with java.lang.String = js.native
  val PageNavigation: PageNavigation with java.lang.String = js.native
  val PageSetup: PageSetup with java.lang.String = js.native
  val Parameters: Parameters with java.lang.String = js.native
  val Print: Print with java.lang.String = js.native
  val PrintLayout: PrintLayout with java.lang.String = js.native
  val Refresh: Refresh with java.lang.String = js.native
  val Zoom: Zoom with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ReportViewerNs.ToolbarItems with java.lang.String] = js.native
}

