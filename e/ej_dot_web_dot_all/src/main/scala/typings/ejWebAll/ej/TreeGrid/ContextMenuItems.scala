package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ContextMenuItems extends js.Object

@JSGlobal("ej.TreeGrid.ContextMenuItems")
@js.native
object ContextMenuItems extends js.Object {
  ///Enables the add menu item in context menu
  @js.native
  sealed trait Add extends ContextMenuItems
  
  ///Enables the edit menu item in context menu
  @js.native
  sealed trait Delete extends ContextMenuItems
  
  ///Enables the edit menu item in context menu
  @js.native
  sealed trait Edit extends ContextMenuItems
  
}

