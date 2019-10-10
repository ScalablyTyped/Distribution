package typings.ejDotWebDotAll.ej.ReportDesigner

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolbarItems extends js.Object

@JSGlobal("ej.ReportDesigner.ToolbarItems")
@js.native
object ToolbarItems extends js.Object {
  ///Snaps the selected report items to the closest gridline.
  @js.native
  sealed trait AlignGrid extends ToolbarItems
  
  ///Aligns the selected report item in the design surface.
  @js.native
  sealed trait Alignment extends ToolbarItems
  
  ///Shows all the toolbar items.
  @js.native
  sealed trait All extends ToolbarItems
  
  ///Aligns all report items to the center position of design surface in horizontal or vertical direction.
  @js.native
  sealed trait Center extends ToolbarItems
  
  ///Copies selected text or object to the clipboard.
  @js.native
  sealed trait Copy extends ToolbarItems
  
  ///Removes the selected item from the active report.
  @js.native
  sealed trait Cut extends ToolbarItems
  
  ///Deletes the selected item or text from the report.
  @js.native
  sealed trait Delete extends ToolbarItems
  
  ///Distributes selected report items at equal intervals from each other.
  @js.native
  sealed trait Distribute extends ToolbarItems
  
  ///Switches from preview to design view of the report.
  @js.native
  sealed trait EditDesign extends ToolbarItems
  
  ///Creates a new, blank report.
  @js.native
  sealed trait New extends ToolbarItems
  
  ///Displays the Open dialog box to retrieve an existing report.
  @js.native
  sealed trait Open extends ToolbarItems
  
  ///Used to change the layout order of report items in design area surface.
  @js.native
  sealed trait Order extends ToolbarItems
  
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
  
  ///Equally size the selected report items in the design surface.
  @js.native
  sealed trait Sizing extends ToolbarItems
  
  ///Reverses the last action or deletes the last entry that is typed.
  @js.native
  sealed trait Undo extends ToolbarItems
  
  ///Contains options to show or hide `Header`, `Footer`, `Grid Lines`, `Snap To Shape` in the report design.
  @js.native
  sealed trait View extends ToolbarItems
  
  ///Used to "zoom in" to get a close-up view of a report or "zoom out" to see more of the page at a reduced size.
  @js.native
  sealed trait Zoom extends ToolbarItems
  
  /* 15 */ val AlignGrid: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.AlignGrid with Double = js.native
  /* 12 */ val Alignment: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.Alignment with Double = js.native
  /* 19 */ val All: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.All with Double = js.native
  /* 11 */ val Center: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.Center with Double = js.native
  /* 4 */ val Copy: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.Copy with Double = js.native
  /* 3 */ val Cut: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.Cut with Double = js.native
  /* 6 */ val Delete: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.Delete with Double = js.native
  /* 13 */ val Distribute: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.Distribute with Double = js.native
  /* 16 */ val EditDesign: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.EditDesign with Double = js.native
  /* 0 */ val New: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.New with Double = js.native
  /* 1 */ val Open: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.Open with Double = js.native
  /* 10 */ val Order: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.Order with Double = js.native
  /* 5 */ val Paste: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.Paste with Double = js.native
  /* 18 */ val Preview: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.Preview with Double = js.native
  /* 8 */ val Redo: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.Redo with Double = js.native
  /* 2 */ val Save: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.Save with Double = js.native
  /* 14 */ val Sizing: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.Sizing with Double = js.native
  /* 7 */ val Undo: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.Undo with Double = js.native
  /* 17 */ val View: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.View with Double = js.native
  /* 9 */ val Zoom: typings.ejDotWebDotAll.ej.ReportDesigner.ToolbarItems.Zoom with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToolbarItems with Double] = js.native
}

