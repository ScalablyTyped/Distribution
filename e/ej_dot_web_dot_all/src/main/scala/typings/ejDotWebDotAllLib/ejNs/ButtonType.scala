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
  
  val Button: Button with java.lang.String = js.native
  val Reset: Reset with java.lang.String = js.native
  val Submit: Submit with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.ButtonType with java.lang.String] = js.native
}

