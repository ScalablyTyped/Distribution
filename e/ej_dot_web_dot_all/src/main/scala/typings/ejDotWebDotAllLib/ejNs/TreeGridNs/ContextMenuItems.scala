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
  
  val Add: Add with java.lang.String = js.native
  val Delete: Delete with java.lang.String = js.native
  val Edit: Edit with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.ContextMenuItems with java.lang.String] = js.native
}

