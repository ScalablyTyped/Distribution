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
  
  val Center: Center with java.lang.String = js.native
  val Justify: Justify with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.TextAlign with java.lang.String] = js.native
}

