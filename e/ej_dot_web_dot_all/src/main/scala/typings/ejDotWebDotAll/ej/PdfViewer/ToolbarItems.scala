package typings.ejDotWebDotAll.ej.PdfViewer

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.All
import typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.DownloadTool
import typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.MagnificationTools
import typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.PageNavigationTools
import typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.PrintTools
import typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.SelectionTool
import typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.SignatureTool
import typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.TextMarkupAnnotationTools
import typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.TextSearchTool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolbarItems extends js.Object

@JSGlobal("ej.PdfViewer.ToolbarItems")
@js.native
object ToolbarItems extends js.Object {
  ///Shows all the toolbar items.
  @js.native
  sealed trait All extends ToolbarItems
  
  ///Shows only download tool in the toolbar.
  @js.native
  sealed trait DownloadTool extends ToolbarItems
  
  ///Shows only magnification tools in the toolbar.
  @js.native
  sealed trait MagnificationTools extends ToolbarItems
  
  ///Shows only page navigation tools in the toolbar.
  @js.native
  sealed trait PageNavigationTools extends ToolbarItems
  
  ///Shows only print tool in the toolbar.
  @js.native
  sealed trait PrintTools extends ToolbarItems
  
  ///Shows only selection tool in the toolbar.
  @js.native
  sealed trait SelectionTool extends ToolbarItems
  
  ///Shows only signature tool in the toolbar.
  @js.native
  sealed trait SignatureTool extends ToolbarItems
  
  ///Shows only text markup annotation tools in the toolbar.
  @js.native
  sealed trait TextMarkupAnnotationTools extends ToolbarItems
  
  ///Shows only text search tool in the toolbar.
  @js.native
  sealed trait TextSearchTool extends ToolbarItems
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToolbarItems with Double] = js.native
  /* 8 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 3 */ @js.native
  object DownloadTool extends TopLevel[DownloadTool with Double]
  
  /* 0 */ @js.native
  object MagnificationTools extends TopLevel[MagnificationTools with Double]
  
  /* 1 */ @js.native
  object PageNavigationTools extends TopLevel[PageNavigationTools with Double]
  
  /* 2 */ @js.native
  object PrintTools extends TopLevel[PrintTools with Double]
  
  /* 7 */ @js.native
  object SelectionTool extends TopLevel[SelectionTool with Double]
  
  /* 6 */ @js.native
  object SignatureTool extends TopLevel[SignatureTool with Double]
  
  /* 5 */ @js.native
  object TextMarkupAnnotationTools extends TopLevel[TextMarkupAnnotationTools with Double]
  
  /* 4 */ @js.native
  object TextSearchTool extends TopLevel[TextSearchTool with Double]
  
}

