package typings.dndDashCore.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HandlerRole extends js.Object

@JSImport("dnd-core/lib/interfaces", "HandlerRole")
@js.native
object HandlerRole extends js.Object {
  @js.native
  sealed trait SOURCE extends HandlerRole
  
  @js.native
  sealed trait TARGET extends HandlerRole
  
  /* "SOURCE" */ val SOURCE: typings.dndDashCore.libInterfacesMod.HandlerRole.SOURCE with String = js.native
  /* "TARGET" */ val TARGET: typings.dndDashCore.libInterfacesMod.HandlerRole.TARGET with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HandlerRole with String] = js.native
}

