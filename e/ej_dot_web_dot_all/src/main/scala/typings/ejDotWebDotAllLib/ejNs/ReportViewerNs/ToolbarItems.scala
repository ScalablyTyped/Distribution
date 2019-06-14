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
  
  /* 4 */ val Export: Export with scala.Double = js.native
  /* 3 */ val FittoPage: FittoPage with scala.Double = js.native
  /* 5 */ val PageNavigation: PageNavigation with scala.Double = js.native
  /* 8 */ val PageSetup: PageSetup with scala.Double = js.native
  /* 6 */ val Parameters: Parameters with scala.Double = js.native
  /* 0 */ val Print: Print with scala.Double = js.native
  /* 7 */ val PrintLayout: PrintLayout with scala.Double = js.native
  /* 1 */ val Refresh: Refresh with scala.Double = js.native
  /* 2 */ val Zoom: Zoom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ReportViewerNs.ToolbarItems with scala.Double] = js.native
}

