package typings
package ejDotWebDotAllLib.ejNs.TileNs

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
  sealed trait Carousel
    extends ejDotWebDotAllLib.ejNs.TileNs.liveTileType
  
  ///To set flip type of liveTile for tile control
  @js.native
  sealed trait Flip
    extends ejDotWebDotAllLib.ejNs.TileNs.liveTileType
  
  ///To set slide type of liveTile for tile control
  @js.native
  sealed trait Slide
    extends ejDotWebDotAllLib.ejNs.TileNs.liveTileType
  
  /* 2 */ val Carousel: Carousel with scala.Double = js.native
  /* 0 */ val Flip: Flip with scala.Double = js.native
  /* 1 */ val Slide: Slide with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TileNs.liveTileType with scala.Double] = js.native
}

