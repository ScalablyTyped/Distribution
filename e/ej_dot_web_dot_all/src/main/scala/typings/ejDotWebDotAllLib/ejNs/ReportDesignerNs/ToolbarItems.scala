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
  
  val All: All with java.lang.String = js.native
  val Copy: Copy with java.lang.String = js.native
  val Cut: Cut with java.lang.String = js.native
  val Delete: Delete with java.lang.String = js.native
  val EditDesign: EditDesign with java.lang.String = js.native
  val Footer: Footer with java.lang.String = js.native
  val GridLine: GridLine with java.lang.String = js.native
  val Header: Header with java.lang.String = js.native
  val New: New with java.lang.String = js.native
  val Open: Open with java.lang.String = js.native
  val Paste: Paste with java.lang.String = js.native
  val Preview: Preview with java.lang.String = js.native
  val Redo: Redo with java.lang.String = js.native
  val Save: Save with java.lang.String = js.native
  val Undo: Undo with java.lang.String = js.native
  val Zoom: Zoom with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ReportDesignerNs.ToolbarItems with java.lang.String] = js.native
}

