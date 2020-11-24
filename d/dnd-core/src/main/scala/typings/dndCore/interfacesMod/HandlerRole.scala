package typings.dndCore.interfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HandlerRole extends js.Object
@JSImport("dnd-core/lib/interfaces", "HandlerRole")
@js.native
object HandlerRole extends js.Object {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HandlerRole with String] = js.native
  
  @js.native
  sealed trait SOURCE extends HandlerRole
  /* "SOURCE" */ @js.native
  object SOURCE extends TopLevel[SOURCE with String]
  
  @js.native
  sealed trait TARGET extends HandlerRole
  /* "TARGET" */ @js.native
  object TARGET extends TopLevel[TARGET with String]
}
