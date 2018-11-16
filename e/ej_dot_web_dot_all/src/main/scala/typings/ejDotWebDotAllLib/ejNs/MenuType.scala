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
  
  val ContextMenu: ContextMenu with java.lang.String = js.native
  val NormalMenu: NormalMenu with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.MenuType with java.lang.String] = js.native
}

