package typings.ejDotWebDotAll.ej.Tile

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
  sealed trait Bottomright extends BadgePosition
  
  ///To set the topright position of tile badge
  @js.native
  sealed trait Topright extends BadgePosition
  
  /* 1 */ val Bottomright: typings.ejDotWebDotAll.ej.Tile.BadgePosition.Bottomright with Double = js.native
  /* 0 */ val Topright: typings.ejDotWebDotAll.ej.Tile.BadgePosition.Topright with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BadgePosition with Double] = js.native
}

