package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MenuType extends js.Object

@JSGlobal("ej.MenuType")
@js.native
object MenuType extends js.Object {
  //string
  @js.native
  sealed trait ContextMenu
    extends ejDotWebDotAllLib.ejNs.MenuType
  
  //string
  @js.native
  sealed trait NormalMenu
    extends ejDotWebDotAllLib.ejNs.MenuType
  
  /* 0 */ val ContextMenu: ContextMenu with scala.Double = js.native
  /* 1 */ val NormalMenu: NormalMenu with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.MenuType with scala.Double] = js.native
}

