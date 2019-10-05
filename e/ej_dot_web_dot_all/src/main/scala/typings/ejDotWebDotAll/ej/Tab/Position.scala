package typings.ejDotWebDotAll.ej.Tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSGlobal("ej.Tab.Position")
@js.native
object Position extends js.Object {
  ///Tab headers display to bottom position
  @js.native
  sealed trait Bottom extends Position
  
  ///Tab headers display to left position.
  @js.native
  sealed trait Left extends Position
  
  ///Tab headers display to right position.
  @js.native
  sealed trait Right extends Position
  
  ///Tab headers display to top position
  @js.native
  sealed trait Top extends Position
  
  /* 1 */ val Bottom: typings.ejDotWebDotAll.ej.Tab.Position.Bottom with Double = js.native
  /* 2 */ val Left: typings.ejDotWebDotAll.ej.Tab.Position.Left with Double = js.native
  /* 3 */ val Right: typings.ejDotWebDotAll.ej.Tab.Position.Right with Double = js.native
  /* 0 */ val Top: typings.ejDotWebDotAll.ej.Tab.Position.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Position with Double] = js.native
}

