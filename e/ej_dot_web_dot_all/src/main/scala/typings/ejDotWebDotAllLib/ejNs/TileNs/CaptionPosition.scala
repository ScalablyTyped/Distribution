package typings
package ejDotWebDotAllLib.ejNs.TileNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CaptionPosition extends js.Object

@JSGlobal("ej.Tile.CaptionPosition")
@js.native
object CaptionPosition extends js.Object {
  ///To set the inner bottom position of the tile text
  @js.native
  sealed trait Innerbottom
    extends ejDotWebDotAllLib.ejNs.TileNs.CaptionPosition
  
  ///To set the inner top position of the tile text
  @js.native
  sealed trait Innertop
    extends ejDotWebDotAllLib.ejNs.TileNs.CaptionPosition
  
  ///To set the outer position of the tile text
  @js.native
  sealed trait Outer
    extends ejDotWebDotAllLib.ejNs.TileNs.CaptionPosition
  
  val Innerbottom: Innerbottom with java.lang.String = js.native
  val Innertop: Innertop with java.lang.String = js.native
  val Outer: Outer with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TileNs.CaptionPosition with java.lang.String] = js.native
}

