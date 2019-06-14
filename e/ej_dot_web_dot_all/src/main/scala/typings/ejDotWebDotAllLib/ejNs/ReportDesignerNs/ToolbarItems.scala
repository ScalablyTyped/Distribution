package typings
package ejDotWebDotAllLib.ejNs.ReportDesignerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolbarItems extends js.Object

@JSGlobal("ej.ReportDesigner.ToolbarItems")
@js.native
object ToolbarItems extends js.Object {
  ///Shows all the toolbar items.
  @js.native
  sealed trait All
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  ///Copies selected text or object to the clipboard.
  @js.native
  sealed trait Copy
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  ///Removes the selected item from the active report.
  @js.native
  sealed trait Cut
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  ///Deletes the selected item or text from the report.
  @js.native
  sealed trait Delete
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  ///Switches from preview to design view of the report.
  @js.native
  sealed trait EditDesign
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  ///Enables footer area in the report.
  @js.native
  sealed trait Footer
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  ///Enables/Disables the gridline in active report.
  @js.native
  sealed trait GridLine
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  ///Enables header area in the report.
  @js.native
  sealed trait Header
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  ///Creates a new, blank report.
  @js.native
  sealed trait New
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  ///Displays the Open dialog box to retrieve an existing report.
  @js.native
  sealed trait Open
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  ///Pastes the item that cut or copied into (the position of the insertion point) the report from the clipboard.
  @js.native
  sealed trait Paste
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  ///Previews the active report in report viewer.
  @js.native
  sealed trait Preview
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  ///Reverses the action of the last Undo command.
  @js.native
  sealed trait Redo
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  ///Saves the active report to a specified location.
  @js.native
  sealed trait Save
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  ///Reverses the last action or deletes the last entry that is typed.
  @js.native
  sealed trait Undo
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  ///Used to "zoom in" to get a close-up view of a report or "zoom out" to see more of the page at a reduced size.
  @js.native
  sealed trait Zoom
    extends ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems
  
  /* 15 */ val All: All with scala.Double = js.native
  /* 4 */ val Copy: Copy with scala.Double = js.native
  /* 3 */ val Cut: Cut with scala.Double = js.native
  /* 6 */ val Delete: Delete with scala.Double = js.native
  /* 14 */ val EditDesign: EditDesign with scala.Double = js.native
  /* 13 */ val Footer: Footer with scala.Double = js.native
  /* 11 */ val GridLine: GridLine with scala.Double = js.native
  /* 12 */ val Header: Header with scala.Double = js.native
  /* 0 */ val New: New with scala.Double = js.native
  /* 1 */ val Open: Open with scala.Double = js.native
  /* 5 */ val Paste: Paste with scala.Double = js.native
  /* 10 */ val Preview: Preview with scala.Double = js.native
  /* 8 */ val Redo: Redo with scala.Double = js.native
  /* 2 */ val Save: Save with scala.Double = js.native
  /* 7 */ val Undo: Undo with scala.Double = js.native
  /* 9 */ val Zoom: Zoom with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems with scala.Double] = js.native
}

