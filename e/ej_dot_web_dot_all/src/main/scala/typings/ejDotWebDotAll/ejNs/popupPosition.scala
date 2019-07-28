package typings.ejDotWebDotAll.ejNs

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
  sealed trait Bottom extends popupPosition
  
  //Opens the DateTimePicker popup above to the DateTimePicker input box
  @js.native
  sealed trait Top extends popupPosition
  
  /* 0 */ val Bottom: typings.ejDotWebDotAll.ejNs.popupPosition.Bottom with Double = js.native
  /* 1 */ val Top: typings.ejDotWebDotAll.ejNs.popupPosition.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[popupPosition with Double] = js.native
}

