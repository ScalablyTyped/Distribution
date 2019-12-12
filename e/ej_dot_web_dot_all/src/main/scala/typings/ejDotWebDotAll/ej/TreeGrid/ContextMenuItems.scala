package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.TreeGrid.ContextMenuItems.Add
import typings.ejDotWebDotAll.ej.TreeGrid.ContextMenuItems.Delete
import typings.ejDotWebDotAll.ej.TreeGrid.ContextMenuItems.Edit
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ContextMenuItems with Double] = js.native
  /* 0 */ @js.native
  object Add extends TopLevel[Add with Double]
  
  /* 2 */ @js.native
  object Delete extends TopLevel[Delete with Double]
  
  /* 1 */ @js.native
  object Edit extends TopLevel[Edit with Double]
  
}

