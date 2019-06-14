package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ToolBarItems extends js.Object

@JSGlobal("ej.Grid.ToolBarItems")
@js.native
object ToolBarItems extends js.Object {
  ///Toolbar item is add.
  @js.native
  sealed trait Add
    extends ejDotWebDotAllLib.ejNs.GridNs.ToolBarItems
  
  ///Toolbar item is cancel.
  @js.native
  sealed trait Cancel
    extends ejDotWebDotAllLib.ejNs.GridNs.ToolBarItems
  
  ///Toolbar item is delete.
  @js.native
  sealed trait Delete
    extends ejDotWebDotAllLib.ejNs.GridNs.ToolBarItems
  
  ///Toolbar item is edit.
  @js.native
  sealed trait Edit
    extends ejDotWebDotAllLib.ejNs.GridNs.ToolBarItems
  
  ///Toolbar item is pdfExport.
  @js.native
  sealed trait PdfExport
    extends ejDotWebDotAllLib.ejNs.GridNs.ToolBarItems
  
  ///Toolbar item is printGrid.
  @js.native
  sealed trait PrintGrid
    extends ejDotWebDotAllLib.ejNs.GridNs.ToolBarItems
  
  ///Toolbar item is search.
  @js.native
  sealed trait Search
    extends ejDotWebDotAllLib.ejNs.GridNs.ToolBarItems
  
  ///Toolbar item is update.
  @js.native
  sealed trait Update
    extends ejDotWebDotAllLib.ejNs.GridNs.ToolBarItems
  
  ///Toolbar item is wordExport.
  @js.native
  sealed trait WordExport
    extends ejDotWebDotAllLib.ejNs.GridNs.ToolBarItems
  
  /* 0 */ val Add: Add with scala.Double = js.native
  /* 4 */ val Cancel: Cancel with scala.Double = js.native
  /* 2 */ val Delete: Delete with scala.Double = js.native
  /* 1 */ val Edit: Edit with scala.Double = js.native
  /* 6 */ val PdfExport: PdfExport with scala.Double = js.native
  /* 7 */ val PrintGrid: PrintGrid with scala.Double = js.native
  /* 5 */ val Search: Search with scala.Double = js.native
  /* 3 */ val Update: Update with scala.Double = js.native
  /* 8 */ val WordExport: WordExport with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.ToolBarItems with scala.Double] = js.native
}

