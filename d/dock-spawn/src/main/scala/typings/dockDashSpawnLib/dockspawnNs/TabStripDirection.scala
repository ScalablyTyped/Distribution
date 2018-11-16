package typings
package dockDashSpawnLib.dockspawnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabStripDirection extends js.Object

@JSGlobal("dockspawn.TabStripDirection")
@js.native
object TabStripDirection extends js.Object {
  @js.native
  sealed trait DIRECTION_BOTTOM
    extends dockDashSpawnLib.dockspawnNs.TabStripDirection
  
  @js.native
  sealed trait DIRECTION_LEFT
    extends dockDashSpawnLib.dockspawnNs.TabStripDirection
  
  @js.native
  sealed trait DIRECTION_RIGHT
    extends dockDashSpawnLib.dockspawnNs.TabStripDirection
  
  @js.native
  sealed trait DIRECTION_TOP
    extends dockDashSpawnLib.dockspawnNs.TabStripDirection
  
  /* 1 */ val DIRECTION_BOTTOM: DIRECTION_BOTTOM with scala.Double = js.native
  /* 2 */ val DIRECTION_LEFT: DIRECTION_LEFT with scala.Double = js.native
  /* 3 */ val DIRECTION_RIGHT: DIRECTION_RIGHT with scala.Double = js.native
  /* 0 */ val DIRECTION_TOP: DIRECTION_TOP with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[dockDashSpawnLib.dockspawnNs.TabStripDirection with scala.Double] = js.native
}

