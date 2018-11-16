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
  
  val Medium: Medium with java.lang.String = js.native
  val Small: Small with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.RadioButtonSize with java.lang.String] = js.native
}

