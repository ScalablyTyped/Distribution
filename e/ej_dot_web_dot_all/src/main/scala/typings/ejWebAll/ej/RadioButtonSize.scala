package typings.ejWebAll.ej

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RadioButtonSize with Double] = js.native
  /* 1 */ @js.native
  object Medium extends TopLevel[Medium with Double]
  
  /* 0 */ @js.native
  object Small extends TopLevel[Small with Double]
  
}

