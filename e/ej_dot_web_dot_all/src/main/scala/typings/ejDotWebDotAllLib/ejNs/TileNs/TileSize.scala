package typings
package ejDotWebDotAllLib.ejNs.TileNs

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
  sealed trait Large
    extends ejDotWebDotAllLib.ejNs.TileNs.TileSize
  
  ///To set the medium size for tile control
  @js.native
  sealed trait Medium
    extends ejDotWebDotAllLib.ejNs.TileNs.TileSize
  
  ///To set the small size for tile control
  @js.native
  sealed trait Small
    extends ejDotWebDotAllLib.ejNs.TileNs.TileSize
  
  ///To set the wide size for tile control
  @js.native
  sealed trait Wide
    extends ejDotWebDotAllLib.ejNs.TileNs.TileSize
  
  /* 2 */ val Large: Large with scala.Double = js.native
  /* 0 */ val Medium: Medium with scala.Double = js.native
  /* 1 */ val Small: Small with scala.Double = js.native
  /* 3 */ val Wide: Wide with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TileNs.TileSize with scala.Double] = js.native
}

