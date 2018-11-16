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
  
  val Center: Center with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TileNs.CaptionAlignment with java.lang.String] = js.native
}

