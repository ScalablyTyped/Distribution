package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

@JSGlobal("ej.Direction")
@js.native
object Direction extends js.Object {
  //string
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.Direction
  
  //string
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.Direction
  
  //string
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.Direction
  
  val Left: Left with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.Direction with java.lang.String] = js.native
}

