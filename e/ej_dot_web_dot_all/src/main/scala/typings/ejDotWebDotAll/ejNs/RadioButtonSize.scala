package typings.ejDotWebDotAll.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RadioButtonSize extends js.Object

@JSGlobal("ej.RadioButtonSize")
@js.native
object RadioButtonSize extends js.Object {
  //Shows medium size radio button
  @js.native
  sealed trait Medium extends RadioButtonSize
  
  //Shows small size radio button
  @js.native
  sealed trait Small extends RadioButtonSize
  
  /* 1 */ val Medium: typings.ejDotWebDotAll.ejNs.RadioButtonSize.Medium with Double = js.native
  /* 0 */ val Small: typings.ejDotWebDotAll.ejNs.RadioButtonSize.Small with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RadioButtonSize with Double] = js.native
}

