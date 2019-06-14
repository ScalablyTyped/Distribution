package typings
package ejDotWebDotAllLib.ejNs

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
  sealed trait Medium
    extends ejDotWebDotAllLib.ejNs.RadioButtonSize
  
  //Shows small size radio button
  @js.native
  sealed trait Small
    extends ejDotWebDotAllLib.ejNs.RadioButtonSize
  
  /* 1 */ val Medium: Medium with scala.Double = js.native
  /* 0 */ val Small: Small with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.RadioButtonSize with scala.Double] = js.native
}

