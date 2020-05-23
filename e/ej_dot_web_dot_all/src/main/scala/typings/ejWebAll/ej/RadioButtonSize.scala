package typings.ejWebAll.ej

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
  
}

