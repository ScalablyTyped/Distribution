package typings.ejDotWebDotAll.ej.PdfViewer

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
  
  /* 8 */ val All: typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.All with Double = js.native
  /* 3 */ val DownloadTool: typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.DownloadTool with Double = js.native
  /* 0 */ val MagnificationTools: typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.MagnificationTools with Double = js.native
  /* 1 */ val PageNavigationTools: typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.PageNavigationTools with Double = js.native
  /* 2 */ val PrintTools: typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.PrintTools with Double = js.native
  /* 7 */ val SelectionTool: typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.SelectionTool with Double = js.native
  /* 6 */ val SignatureTool: typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.SignatureTool with Double = js.native
  /* 5 */ val TextMarkupAnnotationTools: typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.TextMarkupAnnotationTools with Double = js.native
  /* 4 */ val TextSearchTool: typings.ejDotWebDotAll.ej.PdfViewer.ToolbarItems.TextSearchTool with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToolbarItems with Double] = js.native
}

