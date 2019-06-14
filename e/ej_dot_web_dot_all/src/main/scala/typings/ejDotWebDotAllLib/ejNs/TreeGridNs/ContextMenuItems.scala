package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

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
  sealed trait Add
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.ContextMenuItems
  
  ///Enables the edit menu item in context menu
  @js.native
  sealed trait Delete
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.ContextMenuItems
  
  ///Enables the edit menu item in context menu
  @js.native
  sealed trait Edit
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.ContextMenuItems
  
  /* 0 */ val Add: Add with scala.Double = js.native
  /* 2 */ val Delete: Delete with scala.Double = js.native
  /* 1 */ val Edit: Edit with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.ContextMenuItems with scala.Double] = js.native
}

