package typings.dndCore.interfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HandlerRole extends StObject
@JSImport("dnd-core/lib/interfaces", "HandlerRole")
@js.native
object HandlerRole extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HandlerRole with String] = js.native
  
  @js.native
  sealed trait SOURCE extends HandlerRole
  /* "SOURCE" */ val SOURCE: typings.dndCore.interfacesMod.HandlerRole.SOURCE with String = js.native
  
  @js.native
  sealed trait TARGET extends HandlerRole
  /* "TARGET" */ val TARGET: typings.dndCore.interfacesMod.HandlerRole.TARGET with String = js.native
}
