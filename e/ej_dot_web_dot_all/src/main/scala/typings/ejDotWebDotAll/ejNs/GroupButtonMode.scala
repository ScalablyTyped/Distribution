package typings.ejDotWebDotAll.ejNs

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
  
  /* 0 */ val CheckBox: typings.ejDotWebDotAll.ejNs.GroupButtonMode.CheckBox with Double = js.native
  /* 1 */ val RadioButton: typings.ejDotWebDotAll.ejNs.GroupButtonMode.RadioButton with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupButtonMode with Double] = js.native
}

