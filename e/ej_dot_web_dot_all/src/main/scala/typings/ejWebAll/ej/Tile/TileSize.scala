package typings.ejWebAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
