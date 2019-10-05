package typings.ejDotWebDotAll.ej.TreeGrid

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
  
  /* 0 */ val Add: typings.ejDotWebDotAll.ej.TreeGrid.ContextMenuItems.Add with Double = js.native
  /* 2 */ val Delete: typings.ejDotWebDotAll.ej.TreeGrid.ContextMenuItems.Delete with Double = js.native
  /* 1 */ val Edit: typings.ejDotWebDotAll.ej.TreeGrid.ContextMenuItems.Edit with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContextMenuItems with Double] = js.native
}

