package typings.ejDotWebDotAll.ej.Tile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CaptionAlignment extends js.Object

@JSGlobal("ej.Tile.CaptionAlignment")
@js.native
object CaptionAlignment extends js.Object {
  ///To set the center alignment of text in tile control
  @js.native
  sealed trait Center extends CaptionAlignment
  
  ///To set the left alignment of text in tile control
  @js.native
  sealed trait Left extends CaptionAlignment
  
  ///To set the normal alignment of text in tile control
  @js.native
  sealed trait Normal extends CaptionAlignment
  
  ///To set the right alignment of text in tile control
  @js.native
  sealed trait Right extends CaptionAlignment
  
  /* 3 */ val Center: typings.ejDotWebDotAll.ej.Tile.CaptionAlignment.Center with Double = js.native
  /* 1 */ val Left: typings.ejDotWebDotAll.ej.Tile.CaptionAlignment.Left with Double = js.native
  /* 0 */ val Normal: typings.ejDotWebDotAll.ej.Tile.CaptionAlignment.Normal with Double = js.native
  /* 2 */ val Right: typings.ejDotWebDotAll.ej.Tile.CaptionAlignment.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CaptionAlignment with Double] = js.native
}

