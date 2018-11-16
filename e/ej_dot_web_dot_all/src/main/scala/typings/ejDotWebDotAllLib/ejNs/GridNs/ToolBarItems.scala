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
  
  val Add: Add with java.lang.String = js.native
  val Cancel: Cancel with java.lang.String = js.native
  val Delete: Delete with java.lang.String = js.native
  val Edit: Edit with java.lang.String = js.native
  val PdfExport: PdfExport with java.lang.String = js.native
  val PrintGrid: PrintGrid with java.lang.String = js.native
  val Search: Search with java.lang.String = js.native
  val Update: Update with java.lang.String = js.native
  val WordExport: WordExport with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.ToolBarItems with java.lang.String] = js.native
}

