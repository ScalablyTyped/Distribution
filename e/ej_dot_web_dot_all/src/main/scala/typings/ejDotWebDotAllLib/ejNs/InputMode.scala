package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait InputMode extends js.Object

@JSGlobal("ej.InputMode")
@js.native
object InputMode extends js.Object {
  //string
  @js.native
  sealed trait Password
    extends ejDotWebDotAllLib.ejNs.InputMode
  
  //string
  @js.native
  sealed trait Text
    extends ejDotWebDotAllLib.ejNs.InputMode
  
  /* 0 */ val Password: Password with scala.Double = js.native
  /* 1 */ val Text: Text with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.InputMode with scala.Double] = js.native
}

