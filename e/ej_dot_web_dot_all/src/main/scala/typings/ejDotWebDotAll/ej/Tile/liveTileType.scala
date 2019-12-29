package typings.ejDotWebDotAll.ej.Tile

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[liveTileType with Double] = js.native
  /* 2 */ @js.native
  object Carousel extends TopLevel[Carousel with Double]
  
  /* 0 */ @js.native
  object Flip extends TopLevel[Flip with Double]
  
  /* 1 */ @js.native
  object Slide extends TopLevel[Slide with Double]
  
}

