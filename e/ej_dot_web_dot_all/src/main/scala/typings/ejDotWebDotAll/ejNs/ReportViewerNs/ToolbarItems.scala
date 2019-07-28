package typings.ejDotWebDotAll.ejNs.ReportViewerNs

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
  sealed trait Export extends ToolbarItems
  
  ///Specifies the FittoPage as value in ToolbarItems to get specified item.
  @js.native
  sealed trait FittoPage extends ToolbarItems
  
  ///Specifies the PageNavigation as value in ToolbarItems to get specified item.
  @js.native
  sealed trait PageNavigation extends ToolbarItems
  
  ///Specifies the PageSetup as value in ToolbarItems to get specified item.
  @js.native
  sealed trait PageSetup extends ToolbarItems
  
  ///Specifies the Parameters as value in ToolbarItems to get specified item.
  @js.native
  sealed trait Parameters extends ToolbarItems
  
  ///Specifies the Print as value in ToolbarItems to get specified item.
  @js.native
  sealed trait Print extends ToolbarItems
  
  ///Specifies the PrintLayout as value in ToolbarItems to get specified item.
  @js.native
  sealed trait PrintLayout extends ToolbarItems
  
  ///Specifies the Refresh as value in ToolbarItems to get specified item.
  @js.native
  sealed trait Refresh extends ToolbarItems
  
  ///Specifies the Zoom as value in ToolbarItems to get specified item.
  @js.native
  sealed trait Zoom extends ToolbarItems
  
  /* 4 */ val Export: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ToolbarItems.Export with Double = js.native
  /* 3 */ val FittoPage: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ToolbarItems.FittoPage with Double = js.native
  /* 5 */ val PageNavigation: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ToolbarItems.PageNavigation with Double = js.native
  /* 8 */ val PageSetup: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ToolbarItems.PageSetup with Double = js.native
  /* 6 */ val Parameters: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ToolbarItems.Parameters with Double = js.native
  /* 0 */ val Print: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ToolbarItems.Print with Double = js.native
  /* 7 */ val PrintLayout: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ToolbarItems.PrintLayout with Double = js.native
  /* 1 */ val Refresh: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ToolbarItems.Refresh with Double = js.native
  /* 2 */ val Zoom: typings.ejDotWebDotAll.ejNs.ReportViewerNs.ToolbarItems.Zoom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToolbarItems with Double] = js.native
}

