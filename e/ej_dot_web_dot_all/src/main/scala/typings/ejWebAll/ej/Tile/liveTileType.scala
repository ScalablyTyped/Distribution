package typings.ejWebAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait liveTileType extends js.Object

@JSGlobal("ej.Tile.liveTileType")
@js.native
object liveTileType extends js.Object {
  ///To set carousel type of liveTile for tile control
  @js.native
  sealed trait Carousel extends liveTileType
  
  ///To set flip type of liveTile for tile control
  @js.native
  sealed trait Flip extends liveTileType
  
  ///To set slide type of liveTile for tile control
  @js.native
  sealed trait Slide extends liveTileType
  
}

