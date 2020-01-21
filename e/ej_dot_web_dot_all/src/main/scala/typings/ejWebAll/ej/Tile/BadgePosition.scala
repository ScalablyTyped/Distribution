package typings.ejWebAll.ej.Tile

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[BadgePosition with Double] = js.native
  /* 1 */ @js.native
  object Bottomright extends TopLevel[Bottomright with Double]
  
  /* 0 */ @js.native
  object Topright extends TopLevel[Topright with Double]
  
}

