package typings
package ejDotWebDotAllLib.ejNs.TileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait BadgePosition extends js.Object

@JSGlobal("ej.Tile.BadgePosition")
@js.native
object BadgePosition extends js.Object {
  ///To set the bottomright of tile badge
  @js.native
  sealed trait Bottomright
    extends ejDotWebDotAllLib.ejNs.TileNs.BadgePosition
  
  ///To set the topright position of tile badge
  @js.native
  sealed trait Topright
    extends ejDotWebDotAllLib.ejNs.TileNs.BadgePosition
  
  /* 1 */ val Bottomright: Bottomright with scala.Double = js.native
  /* 0 */ val Topright: Topright with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TileNs.BadgePosition with scala.Double] = js.native
}

