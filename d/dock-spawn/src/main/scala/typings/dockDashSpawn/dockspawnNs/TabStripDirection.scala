package typings.dockDashSpawn.dockspawnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabStripDirection extends js.Object

@JSGlobal("dockspawn.TabStripDirection")
@js.native
object TabStripDirection extends js.Object {
  @js.native
  sealed trait DIRECTION_BOTTOM extends TabStripDirection
  
  @js.native
  sealed trait DIRECTION_LEFT extends TabStripDirection
  
  @js.native
  sealed trait DIRECTION_RIGHT extends TabStripDirection
  
  @js.native
  sealed trait DIRECTION_TOP extends TabStripDirection
  
  /* 1 */ val DIRECTION_BOTTOM: typings.dockDashSpawn.dockspawnNs.TabStripDirection.DIRECTION_BOTTOM with Double = js.native
  /* 2 */ val DIRECTION_LEFT: typings.dockDashSpawn.dockspawnNs.TabStripDirection.DIRECTION_LEFT with Double = js.native
  /* 3 */ val DIRECTION_RIGHT: typings.dockDashSpawn.dockspawnNs.TabStripDirection.DIRECTION_RIGHT with Double = js.native
  /* 0 */ val DIRECTION_TOP: typings.dockDashSpawn.dockspawnNs.TabStripDirection.DIRECTION_TOP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TabStripDirection with Double] = js.native
}

