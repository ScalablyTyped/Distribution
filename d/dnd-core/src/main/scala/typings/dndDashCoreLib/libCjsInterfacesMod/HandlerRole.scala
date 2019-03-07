package typings
package dndDashCoreLib.libCjsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HandlerRole extends js.Object

@JSImport("dnd-core/lib/cjs/interfaces", "HandlerRole")
@js.native
object HandlerRole extends js.Object {
  @js.native
  sealed trait SOURCE
    extends dndDashCoreLib.libCjsInterfacesMod.HandlerRole
  
  @js.native
  sealed trait TARGET
    extends dndDashCoreLib.libCjsInterfacesMod.HandlerRole
  
  /* "SOURCE" */ val SOURCE: SOURCE with java.lang.String = js.native
  /* "TARGET" */ val TARGET: TARGET with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[dndDashCoreLib.libCjsInterfacesMod.HandlerRole with java.lang.String] = js.native
}

