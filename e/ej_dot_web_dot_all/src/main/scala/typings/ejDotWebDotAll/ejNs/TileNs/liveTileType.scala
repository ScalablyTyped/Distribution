package typings.ejDotWebDotAll.ejNs.TileNs

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
  
  /* 2 */ val Carousel: typings.ejDotWebDotAll.ejNs.TileNs.liveTileType.Carousel with Double = js.native
  /* 0 */ val Flip: typings.ejDotWebDotAll.ejNs.TileNs.liveTileType.Flip with Double = js.native
  /* 1 */ val Slide: typings.ejDotWebDotAll.ejNs.TileNs.liveTileType.Slide with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[liveTileType with Double] = js.native
}

