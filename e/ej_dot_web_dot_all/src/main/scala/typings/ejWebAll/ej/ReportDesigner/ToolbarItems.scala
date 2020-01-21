package typings.ejWebAll.ej.ReportDesigner

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToolbarItems with Double] = js.native
  /* 15 */ @js.native
  object AlignGrid extends TopLevel[AlignGrid with Double]
  
  /* 12 */ @js.native
  object Alignment extends TopLevel[Alignment with Double]
  
  /* 19 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 11 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 4 */ @js.native
  object Copy extends TopLevel[Copy with Double]
  
  /* 3 */ @js.native
  object Cut extends TopLevel[Cut with Double]
  
  /* 6 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 13 */ @js.native
  object Distribute extends TopLevel[Distribute with Double]
  
  /* 16 */ @js.native
  object EditDesign extends TopLevel[EditDesign with Double]
  
  /* 0 */ @js.native
  object New extends TopLevel[New with Double]
  
  /* 1 */ @js.native
  object Open extends TopLevel[Open with Double]
  
  /* 10 */ @js.native
  object Order extends TopLevel[Order with Double]
  
  /* 5 */ @js.native
  object Paste extends TopLevel[Paste with Double]
  
  /* 18 */ @js.native
  object Preview extends TopLevel[Preview with Double]
  
  /* 8 */ @js.native
  object Redo extends TopLevel[Redo with Double]
  
  /* 2 */ @js.native
  object Save extends TopLevel[Save with Double]
  
  /* 14 */ @js.native
  object Sizing extends TopLevel[Sizing with Double]
  
  /* 7 */ @js.native
  object Undo extends TopLevel[Undo with Double]
  
  /* 17 */ @js.native
  object View extends TopLevel[View with Double]
  
  /* 9 */ @js.native
  object Zoom extends TopLevel[Zoom with Double]
  
}

