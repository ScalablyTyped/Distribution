package typings
package ejDotWebDotAllLib.ejNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextAlign extends js.Object

@JSGlobal("ej.TextAlign")
@js.native
object TextAlign extends js.Object {
  //string
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.TextAlign
  
  //string
  @js.native
  sealed trait Justify
    extends ejDotWebDotAllLib.ejNs.TextAlign
  
  //string
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.TextAlign
  
  //string
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.TextAlign
  
  /* 0 */ val Center: Center with scala.Double = js.native
  /* 1 */ val Justify: Justify with scala.Double = js.native
  /* 2 */ val Left: Left with scala.Double = js.native
  /* 3 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TextAlign with scala.Double] = js.native
}

