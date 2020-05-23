package typings.ejWebAll.ej

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait GroupButtonMode extends js.Object

@JSGlobal("ej.GroupButtonMode")
@js.native
object GroupButtonMode extends js.Object {
  //Sets the GroupButton to work as checkbox mode
  @js.native
  sealed trait CheckBox extends GroupButtonMode
  
  //Sets the RadioButton to work as radio button mode
  @js.native
  sealed trait RadioButton extends GroupButtonMode
  
}

