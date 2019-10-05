package typings.ejDotWebDotAll.ej

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
  sealed trait ContextMenu extends MenuType
  
  //string
  @js.native
  sealed trait NormalMenu extends MenuType
  
  /* 0 */ val ContextMenu: typings.ejDotWebDotAll.ej.MenuType.ContextMenu with Double = js.native
  /* 1 */ val NormalMenu: typings.ejDotWebDotAll.ej.MenuType.NormalMenu with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MenuType with Double] = js.native
}

