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
  
  /* 4 */ val Large: Large with scala.Double = js.native
  /* 3 */ val Medium: Medium with scala.Double = js.native
  /* 1 */ val Mini: Mini with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  /* 2 */ val Small: Small with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ButtonSize with scala.Double] = js.native
}

