package typings.ejWebAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
