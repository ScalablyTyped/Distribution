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
  
  val CheckBox: CheckBox with java.lang.String = js.native
  val RadioButton: RadioButton with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GroupButtonMode with java.lang.String] = js.native
}

