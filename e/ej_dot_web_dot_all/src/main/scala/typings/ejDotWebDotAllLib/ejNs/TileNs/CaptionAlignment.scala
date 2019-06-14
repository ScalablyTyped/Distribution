package typings
package ejDotWebDotAllLib.ejNs.TileNs

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
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.TileNs.CaptionAlignment
  
  ///To set the left alignment of text in tile control
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.TileNs.CaptionAlignment
  
  ///To set the normal alignment of text in tile control
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.TileNs.CaptionAlignment
  
  ///To set the right alignment of text in tile control
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.TileNs.CaptionAlignment
  
  /* 3 */ val Center: Center with scala.Double = js.native
  /* 1 */ val Left: Left with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  /* 2 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TileNs.CaptionAlignment with scala.Double] = js.native
}

