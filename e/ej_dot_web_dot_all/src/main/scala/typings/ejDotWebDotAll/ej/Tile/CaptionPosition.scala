package typings.ejDotWebDotAll.ej.Tile

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.Tile.CaptionPosition.Innerbottom
import typings.ejDotWebDotAll.ej.Tile.CaptionPosition.Innertop
import typings.ejDotWebDotAll.ej.Tile.CaptionPosition.Outer
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CaptionPosition with Double] = js.native
  /* 1 */ @js.native
  object Innerbottom extends TopLevel[Innerbottom with Double]
  
  /* 0 */ @js.native
  object Innertop extends TopLevel[Innertop with Double]
  
  /* 2 */ @js.native
  object Outer extends TopLevel[Outer with Double]
  
}

