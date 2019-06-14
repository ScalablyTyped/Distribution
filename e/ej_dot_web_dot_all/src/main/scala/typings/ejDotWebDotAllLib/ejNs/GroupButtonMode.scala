package typings
package ejDotWebDotAllLib.ejNs

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
  sealed trait CheckBox
    extends ejDotWebDotAllLib.ejNs.GroupButtonMode
  
  //Sets the RadioButton to work as radio button mode
  @js.native
  sealed trait RadioButton
    extends ejDotWebDotAllLib.ejNs.GroupButtonMode
  
  /* 0 */ val CheckBox: CheckBox with scala.Double = js.native
  /* 1 */ val RadioButton: RadioButton with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.GroupButtonMode with scala.Double] = js.native
}

