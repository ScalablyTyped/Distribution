package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MenuType with Double] = js.native
  /* 0 */ @js.native
  object ContextMenu extends TopLevel[ContextMenu with Double]
  
  /* 1 */ @js.native
  object NormalMenu extends TopLevel[NormalMenu with Double]
  
}

