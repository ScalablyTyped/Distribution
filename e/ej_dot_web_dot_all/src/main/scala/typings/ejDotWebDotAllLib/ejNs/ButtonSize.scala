package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonSize extends js.Object

@JSGlobal("ej.ButtonSize")
@js.native
object ButtonSize extends js.Object {
  //Creates button with Built-in large size height, width specified
  @js.native
  sealed trait Large
    extends ejDotWebDotAllLib.ejNs.ButtonSize
  
  //Creates button with Built-in medium size height, width specified
  @js.native
  sealed trait Medium
    extends ejDotWebDotAllLib.ejNs.ButtonSize
  
  //Creates button with Built-in mini size height, width specified
  @js.native
  sealed trait Mini
    extends ejDotWebDotAllLib.ejNs.ButtonSize
  
  //Creates button with Built-in default size height, width specified
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.ButtonSize
  
  //Creates button with Built-in small size height, width specified
  @js.native
  sealed trait Small
    extends ejDotWebDotAllLib.ejNs.ButtonSize
  
  val Large: Large with java.lang.String = js.native
  val Medium: Medium with java.lang.String = js.native
  val Mini: Mini with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  val Small: Small with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ButtonSize with java.lang.String] = js.native
}

