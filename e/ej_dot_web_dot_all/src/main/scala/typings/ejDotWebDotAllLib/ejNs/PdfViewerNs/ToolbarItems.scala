package typings
package ejDotWebDotAllLib.ejNs.PdfViewerNs

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
  sealed trait All
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.ToolbarItems
  
  ///Shows only download tool in the toolbar.
  @js.native
  sealed trait DownloadTool
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.ToolbarItems
  
  ///Shows only magnification tools in the toolbar.
  @js.native
  sealed trait MagnificationTools
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.ToolbarItems
  
  ///Shows only page navigation tools in the toolbar.
  @js.native
  sealed trait PageNavigationTools
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.ToolbarItems
  
  ///Shows only print tool in the toolbar.
  @js.native
  sealed trait PrintTools
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.ToolbarItems
  
  ///Shows only selection tool in the toolbar.
  @js.native
  sealed trait SelectionTool
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.ToolbarItems
  
  ///Shows only signature tool in the toolbar.
  @js.native
  sealed trait SignatureTool
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.ToolbarItems
  
  ///Shows only text markup annotation tools in the toolbar.
  @js.native
  sealed trait TextMarkupAnnotationTools
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.ToolbarItems
  
  ///Shows only text search tool in the toolbar.
  @js.native
  sealed trait TextSearchTool
    extends ejDotWebDotAllLib.ejNs.PdfViewerNs.ToolbarItems
  
  /* 8 */ val All: All with scala.Double = js.native
  /* 3 */ val DownloadTool: DownloadTool with scala.Double = js.native
  /* 0 */ val MagnificationTools: MagnificationTools with scala.Double = js.native
  /* 1 */ val PageNavigationTools: PageNavigationTools with scala.Double = js.native
  /* 2 */ val PrintTools: PrintTools with scala.Double = js.native
  /* 7 */ val SelectionTool: SelectionTool with scala.Double = js.native
  /* 6 */ val SignatureTool: SignatureTool with scala.Double = js.native
  /* 5 */ val TextMarkupAnnotationTools: TextMarkupAnnotationTools with scala.Double = js.native
  /* 4 */ val TextSearchTool: TextSearchTool with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.PdfViewerNs.ToolbarItems with scala.Double] = js.native
}

