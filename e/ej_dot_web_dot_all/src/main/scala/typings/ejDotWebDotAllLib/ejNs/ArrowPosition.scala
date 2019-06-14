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
  
  /* 3 */ val Bottom: Bottom with scala.Double = js.native
  /* 0 */ val Left: Left with scala.Double = js.native
  /* 1 */ val Right: Right with scala.Double = js.native
  /* 2 */ val Top: Top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ArrowPosition with scala.Double] = js.native
}

