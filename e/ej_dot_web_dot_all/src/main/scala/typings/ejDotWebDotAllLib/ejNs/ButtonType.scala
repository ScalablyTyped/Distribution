package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ButtonType extends js.Object

@JSGlobal("ej.ButtonType")
@js.native
object ButtonType extends js.Object {
  //Creates button with Built-in button type specified
  @js.native
  sealed trait Button
    extends ejDotWebDotAllLib.ejNs.ButtonType
  
  //Creates button with Built-in reset type specified
  @js.native
  sealed trait Reset
    extends ejDotWebDotAllLib.ejNs.ButtonType
  
  //Creates button with Built-in submit type specified
  @js.native
  sealed trait Submit
    extends ejDotWebDotAllLib.ejNs.ButtonType
  
  /* 0 */ val Button: Button with scala.Double = js.native
  /* 1 */ val Reset: Reset with scala.Double = js.native
  /* 2 */ val Submit: Submit with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.ButtonType with scala.Double] = js.native
}

