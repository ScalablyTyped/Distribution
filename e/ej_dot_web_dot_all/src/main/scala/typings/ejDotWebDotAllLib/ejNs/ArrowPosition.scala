package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ArrowPosition extends js.Object

@JSGlobal("ej.ArrowPosition")
@js.native
object ArrowPosition extends js.Object {
  //To set Bottom arrowPosition of the split button
  @js.native
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.ArrowPosition
  
  //To set Left arrowPosition of the split button
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.ArrowPosition
  
  //To set Right arrowPosition of the split button
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.ArrowPosition
  
  //To set Top arrowPosition of the split button
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.ArrowPosition
  
  val Bottom: Bottom with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ArrowPosition with java.lang.String] = js.native
}

