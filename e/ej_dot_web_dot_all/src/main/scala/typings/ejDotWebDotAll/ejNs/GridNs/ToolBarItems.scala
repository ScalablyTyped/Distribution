package typings.ejDotWebDotAll.ejNs.GridNs

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
  sealed trait Add extends ToolBarItems
  
  ///Toolbar item is cancel.
  @js.native
  sealed trait Cancel extends ToolBarItems
  
  ///Toolbar item is delete.
  @js.native
  sealed trait Delete extends ToolBarItems
  
  ///Toolbar item is edit.
  @js.native
  sealed trait Edit extends ToolBarItems
  
  ///Toolbar item is pdfExport.
  @js.native
  sealed trait PdfExport extends ToolBarItems
  
  ///Toolbar item is printGrid.
  @js.native
  sealed trait PrintGrid extends ToolBarItems
  
  ///Toolbar item is search.
  @js.native
  sealed trait Search extends ToolBarItems
  
  ///Toolbar item is update.
  @js.native
  sealed trait Update extends ToolBarItems
  
  ///Toolbar item is wordExport.
  @js.native
  sealed trait WordExport extends ToolBarItems
  
  /* 0 */ val Add: typings.ejDotWebDotAll.ejNs.GridNs.ToolBarItems.Add with Double = js.native
  /* 4 */ val Cancel: typings.ejDotWebDotAll.ejNs.GridNs.ToolBarItems.Cancel with Double = js.native
  /* 2 */ val Delete: typings.ejDotWebDotAll.ejNs.GridNs.ToolBarItems.Delete with Double = js.native
  /* 1 */ val Edit: typings.ejDotWebDotAll.ejNs.GridNs.ToolBarItems.Edit with Double = js.native
  /* 6 */ val PdfExport: typings.ejDotWebDotAll.ejNs.GridNs.ToolBarItems.PdfExport with Double = js.native
  /* 7 */ val PrintGrid: typings.ejDotWebDotAll.ejNs.GridNs.ToolBarItems.PrintGrid with Double = js.native
  /* 5 */ val Search: typings.ejDotWebDotAll.ejNs.GridNs.ToolBarItems.Search with Double = js.native
  /* 3 */ val Update: typings.ejDotWebDotAll.ejNs.GridNs.ToolBarItems.Update with Double = js.native
  /* 8 */ val WordExport: typings.ejDotWebDotAll.ejNs.GridNs.ToolBarItems.WordExport with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ToolBarItems with Double] = js.native
}

