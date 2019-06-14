package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait popupPosition extends js.Object

@JSGlobal("ej.popupPosition")
@js.native
object popupPosition extends js.Object {
  //Opens the DateTimePicker popup below to the DateTimePicker input box
  @js.native
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.popupPosition
  
  //Opens the DateTimePicker popup above to the DateTimePicker input box
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.popupPosition
  
  /* 0 */ val Bottom: Bottom with scala.Double = js.native
  /* 1 */ val Top: Top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.popupPosition with scala.Double] = js.native
}

