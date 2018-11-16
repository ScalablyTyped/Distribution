package typings
package ejDotWebDotAllLib.ejNs.RotatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PagerPosition extends js.Object

@JSGlobal("ej.Rotator.PagerPosition")
@js.native
object PagerPosition extends js.Object {
  ///string
  @js.native
  sealed trait BottomLeft
    extends ejDotWebDotAllLib.ejNs.RotatorNs.PagerPosition
  
  ///string
  @js.native
  sealed trait BottomRight
    extends ejDotWebDotAllLib.ejNs.RotatorNs.PagerPosition
  
  ///string
  @js.native
  sealed trait Outside
    extends ejDotWebDotAllLib.ejNs.RotatorNs.PagerPosition
  
  ///string
  @js.native
  sealed trait TopCenter
    extends ejDotWebDotAllLib.ejNs.RotatorNs.PagerPosition
  
  ///string
  @js.native
  sealed trait TopLeft
    extends ejDotWebDotAllLib.ejNs.RotatorNs.PagerPosition
  
  ///string
  @js.native
  sealed trait TopRight
    extends ejDotWebDotAllLib.ejNs.RotatorNs.PagerPosition
  
  val BottomLeft: BottomLeft with java.lang.String = js.native
  val BottomRight: BottomRight with java.lang.String = js.native
  val Outside: Outside with java.lang.String = js.native
  val TopCenter: TopCenter with java.lang.String = js.native
  val TopLeft: TopLeft with java.lang.String = js.native
  val TopRight: TopRight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.RotatorNs.PagerPosition with java.lang.String] = js.native
}

