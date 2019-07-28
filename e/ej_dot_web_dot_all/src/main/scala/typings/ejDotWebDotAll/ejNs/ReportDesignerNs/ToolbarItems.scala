package typings.ejDotWebDotAll.ejNs.ReportDesignerNs

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
  sealed trait All extends ToolbarItems
  
  ///Copies selected text or object to the clipboard.
  @js.native
  sealed trait Copy extends ToolbarItems
  
  ///Removes the selected item from the active report.
  @js.native
  sealed trait Cut extends ToolbarItems
  
  ///Deletes the selected item or text from the report.
  @js.native
  sealed trait Delete extends ToolbarItems
  
  ///Switches from preview to design view of the report.
  @js.native
  sealed trait EditDesign extends ToolbarItems
  
  ///Enables footer area in the report.
  @js.native
  sealed trait Footer extends ToolbarItems
  
  ///Enables/Disables the gridline in active report.
  @js.native
  sealed trait GridLine extends ToolbarItems
  
  ///Enables header area in the report.
  @js.native
  sealed trait Header extends ToolbarItems
  
  ///Creates a new, blank report.
  @js.native
  sealed trait New extends ToolbarItems
  
  ///Displays the Open dialog box to retrieve an existing report.
  @js.native
  sealed trait Open extends ToolbarItems
  
  ///Pastes the item that cut or copied into (the position of the insertion point) the report from the clipboard.
  @js.native
  sealed trait Paste extends ToolbarItems
  
  ///Previews the active report in report viewer.
  @js.native
  sealed trait Preview extends ToolbarItems
  
  ///Reverses the action of the last Undo command.
  @js.native
  sealed trait Redo extends ToolbarItems
  
  ///Saves the active report to a specified location.
  @js.native
  sealed trait Save extends ToolbarItems
  
  ///Reverses the last action or deletes the last entry that is typed.
  @js.native
  sealed trait Undo extends ToolbarItems
  
  ///Used to "zoom in" to get a close-up view of a report or "zoom out" to see more of the page at a reduced size.
  @js.native
  sealed trait Zoom extends ToolbarItems
  
  /* 15 */ val All: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.All with Double = js.native
  /* 4 */ val Copy: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.Copy with Double = js.native
  /* 3 */ val Cut: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.Cut with Double = js.native
  /* 6 */ val Delete: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.Delete with Double = js.native
  /* 14 */ val EditDesign: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.EditDesign with Double = js.native
  /* 13 */ val Footer: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.Footer with Double = js.native
  /* 11 */ val GridLine: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.GridLine with Double = js.native
  /* 12 */ val Header: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.Header with Double = js.native
  /* 0 */ val New: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.New with Double = js.native
  /* 1 */ val Open: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.Open with Double = js.native
  /* 5 */ val Paste: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.Paste with Double = js.native
  /* 10 */ val Preview: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.Preview with Double = js.native
  /* 8 */ val Redo: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.Redo with Double = js.native
  /* 2 */ val Save: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.Save with Double = js.native
  /* 7 */ val Undo: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.Undo with Double = js.native
  /* 9 */ val Zoom: typings.ejDotWebDotAll.ejNs.ReportDesignerNs.ToolbarItems.Zoom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToolbarItems with Double] = js.native
}

