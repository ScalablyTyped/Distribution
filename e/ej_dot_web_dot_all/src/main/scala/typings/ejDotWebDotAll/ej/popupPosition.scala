package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[popupPosition with Double] = js.native
  /* 0 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 1 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

