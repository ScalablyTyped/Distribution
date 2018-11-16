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
  
  val Password: Password with java.lang.String = js.native
  val Text: Text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.InputMode with java.lang.String] = js.native
}

