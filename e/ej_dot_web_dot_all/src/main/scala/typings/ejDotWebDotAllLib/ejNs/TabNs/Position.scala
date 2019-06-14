package typings
package ejDotWebDotAllLib.ejNs.TabNs

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
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.TabNs.Position
  
  ///Tab headers display to left position.
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.TabNs.Position
  
  ///Tab headers display to right position.
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.TabNs.Position
  
  ///Tab headers display to top position
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.TabNs.Position
  
  /* 1 */ val Bottom: Bottom with scala.Double = js.native
  /* 2 */ val Left: Left with scala.Double = js.native
  /* 3 */ val Right: Right with scala.Double = js.native
  /* 0 */ val Top: Top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TabNs.Position with scala.Double] = js.native
}

