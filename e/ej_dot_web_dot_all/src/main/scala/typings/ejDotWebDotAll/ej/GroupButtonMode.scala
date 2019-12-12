package typings.ejDotWebDotAll.ej

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[GroupButtonMode with Double] = js.native
  /* 0 */ @js.native
  object CheckBox
    extends TopLevel[typings.ejDotWebDotAll.ej.GroupButtonMode.CheckBox with Double]
  
  /* 1 */ @js.native
  object RadioButton
    extends TopLevel[typings.ejDotWebDotAll.ej.GroupButtonMode.RadioButton with Double]
  
}

