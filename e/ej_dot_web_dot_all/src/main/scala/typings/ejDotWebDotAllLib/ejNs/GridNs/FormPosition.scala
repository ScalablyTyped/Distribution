package typings
package ejDotWebDotAllLib.ejNs.GridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FormPosition extends js.Object

@JSGlobal("ej.Grid.FormPosition")
@js.native
object FormPosition extends js.Object {
  ///Form position is bottomleft.
  @js.native
  sealed trait BottomLeft
    extends ejDotWebDotAllLib.ejNs.GridNs.FormPosition
  
  ///Form position is topright.
  @js.native
  sealed trait TopRight
    extends ejDotWebDotAllLib.ejNs.GridNs.FormPosition
  
  val BottomLeft: BottomLeft with java.lang.String = js.native
  val TopRight: TopRight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.GridNs.FormPosition with java.lang.String] = js.native
}

