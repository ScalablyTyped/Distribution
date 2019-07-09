package typings
package dndDashCoreLib.libInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HandlerRole extends js.Object

@JSImport("dnd-core/lib/interfaces", "HandlerRole")
@js.native
object HandlerRole extends js.Object {
  @js.native
  sealed trait SOURCE
    extends dndDashCoreLib.libInterfacesMod.HandlerRole
  
  @js.native
  sealed trait TARGET
    extends dndDashCoreLib.libInterfacesMod.HandlerRole
  
  /* "SOURCE" */ val SOURCE: SOURCE with java.lang.String = js.native
  /* "TARGET" */ val TARGET: TARGET with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[dndDashCoreLib.libInterfacesMod.HandlerRole with java.lang.String] = js.native
}

