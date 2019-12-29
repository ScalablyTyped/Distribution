package typings.dndDashCore.libInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HandlerRole with String] = js.native
  /* "SOURCE" */ @js.native
  object SOURCE extends TopLevel[SOURCE with String]
  
  /* "TARGET" */ @js.native
  object TARGET extends TopLevel[TARGET with String]
  
}

