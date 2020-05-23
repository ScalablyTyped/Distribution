package typings.ejWebAll.ej.Grid

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
  
}

