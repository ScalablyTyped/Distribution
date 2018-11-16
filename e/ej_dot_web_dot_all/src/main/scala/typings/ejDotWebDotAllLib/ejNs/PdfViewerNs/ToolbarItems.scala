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
  
  val All: All with java.lang.String = js.native
  val DownloadTool: DownloadTool with java.lang.String = js.native
  val MagnificationTools: MagnificationTools with java.lang.String = js.native
  val PageNavigationTools: PageNavigationTools with java.lang.String = js.native
  val PrintTools: PrintTools with java.lang.String = js.native
  val SelectionTool: SelectionTool with java.lang.String = js.native
  val SignatureTool: SignatureTool with java.lang.String = js.native
  val TextMarkupAnnotationTools: TextMarkupAnnotationTools with java.lang.String = js.native
  val TextSearchTool: TextSearchTool with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.PdfViewerNs.ToolbarItems with java.lang.String] = js.native
}

