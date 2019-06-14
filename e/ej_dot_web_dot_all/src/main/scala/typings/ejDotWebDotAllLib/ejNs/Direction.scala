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
  
  /* 0 */ val Left: Left with scala.Double = js.native
  /* 1 */ val None: None with scala.Double = js.native
  /* 2 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.Direction with scala.Double] = js.native
}

