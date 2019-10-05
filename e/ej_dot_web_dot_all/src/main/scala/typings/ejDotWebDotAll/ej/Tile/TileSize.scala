package typings.ejDotWebDotAll.ej.Tile

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
  
  /* 2 */ val Large: typings.ejDotWebDotAll.ej.Tile.TileSize.Large with Double = js.native
  /* 0 */ val Medium: typings.ejDotWebDotAll.ej.Tile.TileSize.Medium with Double = js.native
  /* 1 */ val Small: typings.ejDotWebDotAll.ej.Tile.TileSize.Small with Double = js.native
  /* 3 */ val Wide: typings.ejDotWebDotAll.ej.Tile.TileSize.Wide with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TileSize with Double] = js.native
}

