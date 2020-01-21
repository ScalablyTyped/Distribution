package typings.ejWebAll.ej.Tile

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CaptionAlignment with Double] = js.native
  /* 3 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 1 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

