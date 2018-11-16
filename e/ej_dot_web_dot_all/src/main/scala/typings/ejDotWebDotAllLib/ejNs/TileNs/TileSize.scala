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
  
  val Large: Large with java.lang.String = js.native
  val Medium: Medium with java.lang.String = js.native
  val Small: Small with java.lang.String = js.native
  val Wide: Wide with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TileNs.TileSize with java.lang.String] = js.native
}

