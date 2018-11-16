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
  
  val Bottom: Bottom with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TabNs.Position with java.lang.String] = js.native
}

