package typings.ejDotWebDotAll.ej.ReportViewer

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.ReportViewer.ToolbarItems.Export
import typings.ejDotWebDotAll.ej.ReportViewer.ToolbarItems.FittoPage
import typings.ejDotWebDotAll.ej.ReportViewer.ToolbarItems.PageNavigation
import typings.ejDotWebDotAll.ej.ReportViewer.ToolbarItems.PageSetup
import typings.ejDotWebDotAll.ej.ReportViewer.ToolbarItems.Parameters
import typings.ejDotWebDotAll.ej.ReportViewer.ToolbarItems.PrintLayout
import typings.ejDotWebDotAll.ej.ReportViewer.ToolbarItems.Refresh
import typings.ejDotWebDotAll.ej.ReportViewer.ToolbarItems.Zoom
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToolbarItems with Double] = js.native
  /* 4 */ @js.native
  object Export extends TopLevel[Export with Double]
  
  /* 3 */ @js.native
  object FittoPage extends TopLevel[FittoPage with Double]
  
  /* 5 */ @js.native
  object PageNavigation extends TopLevel[PageNavigation with Double]
  
  /* 8 */ @js.native
  object PageSetup extends TopLevel[PageSetup with Double]
  
  /* 6 */ @js.native
  object Parameters extends TopLevel[Parameters with Double]
  
  /* 0 */ @js.native
  object Print
    extends TopLevel[typings.ejDotWebDotAll.ej.ReportViewer.ToolbarItems.Print with Double]
  
  /* 7 */ @js.native
  object PrintLayout extends TopLevel[PrintLayout with Double]
  
  /* 1 */ @js.native
  object Refresh extends TopLevel[Refresh with Double]
  
  /* 2 */ @js.native
  object Zoom extends TopLevel[Zoom with Double]
  
}

