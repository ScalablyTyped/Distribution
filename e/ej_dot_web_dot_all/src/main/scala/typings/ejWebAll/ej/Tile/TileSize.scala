package typings.ejWebAll.ej.Tile

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TileSize extends js.Object

@JSGlobal("ej.Tile.TileSize")
@js.native
object TileSize extends js.Object {
  ///To set the large size for tile control
  @js.native
  sealed trait Large extends TileSize
  
  ///To set the medium size for tile control
  @js.native
  sealed trait Medium extends TileSize
  
  ///To set the small size for tile control
  @js.native
  sealed trait Small extends TileSize
  
  ///To set the wide size for tile control
  @js.native
  sealed trait Wide extends TileSize
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TileSize with Double] = js.native
  /* 2 */ @js.native
  object Large extends TopLevel[Large with Double]
  
  /* 0 */ @js.native
  object Medium extends TopLevel[Medium with Double]
  
  /* 1 */ @js.native
  object Small extends TopLevel[Small with Double]
  
  /* 3 */ @js.native
  object Wide extends TopLevel[Wide with Double]
  
}

