package typings.dndCore.distInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait HandlerRole extends StObject
@JSImport("dnd-core/dist/interfaces", "HandlerRole")
@js.native
object HandlerRole extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[HandlerRole & String] = js.native
  
  @js.native
  sealed trait SOURCE
    extends StObject
       with HandlerRole
  /* "SOURCE" */ val SOURCE: typings.dndCore.distInterfacesMod.HandlerRole.SOURCE & String = js.native
  
  @js.native
  sealed trait TARGET
    extends StObject
       with HandlerRole
  /* "TARGET" */ val TARGET: typings.dndCore.distInterfacesMod.HandlerRole.TARGET & String = js.native
}
