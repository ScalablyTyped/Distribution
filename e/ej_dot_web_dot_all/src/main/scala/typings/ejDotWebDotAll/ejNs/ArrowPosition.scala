package typings.ejDotWebDotAll.ejNs

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
  sealed trait Bottom extends ArrowPosition
  
  //To set Left arrowPosition of the split button
  @js.native
  sealed trait Left extends ArrowPosition
  
  //To set Right arrowPosition of the split button
  @js.native
  sealed trait Right extends ArrowPosition
  
  //To set Top arrowPosition of the split button
  @js.native
  sealed trait Top extends ArrowPosition
  
  /* 3 */ val Bottom: typings.ejDotWebDotAll.ejNs.ArrowPosition.Bottom with Double = js.native
  /* 0 */ val Left: typings.ejDotWebDotAll.ejNs.ArrowPosition.Left with Double = js.native
  /* 1 */ val Right: typings.ejDotWebDotAll.ejNs.ArrowPosition.Right with Double = js.native
  /* 2 */ val Top: typings.ejDotWebDotAll.ejNs.ArrowPosition.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ArrowPosition with Double] = js.native
}

