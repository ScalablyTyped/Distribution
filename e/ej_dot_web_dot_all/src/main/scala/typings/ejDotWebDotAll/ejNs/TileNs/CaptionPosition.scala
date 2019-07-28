package typings.ejDotWebDotAll.ejNs.TileNs

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
  sealed trait Innerbottom extends CaptionPosition
  
  ///To set the inner top position of the tile text
  @js.native
  sealed trait Innertop extends CaptionPosition
  
  ///To set the outer position of the tile text
  @js.native
  sealed trait Outer extends CaptionPosition
  
  /* 1 */ val Innerbottom: typings.ejDotWebDotAll.ejNs.TileNs.CaptionPosition.Innerbottom with Double = js.native
  /* 0 */ val Innertop: typings.ejDotWebDotAll.ejNs.TileNs.CaptionPosition.Innertop with Double = js.native
  /* 2 */ val Outer: typings.ejDotWebDotAll.ejNs.TileNs.CaptionPosition.Outer with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CaptionPosition with Double] = js.native
}

