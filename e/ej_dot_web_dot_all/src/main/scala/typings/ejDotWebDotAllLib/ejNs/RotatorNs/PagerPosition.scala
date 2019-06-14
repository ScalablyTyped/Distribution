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
  
  /* 0 */ val BottomLeft: BottomLeft with scala.Double = js.native
  /* 1 */ val BottomRight: BottomRight with scala.Double = js.native
  /* 2 */ val Outside: Outside with scala.Double = js.native
  /* 3 */ val TopCenter: TopCenter with scala.Double = js.native
  /* 4 */ val TopLeft: TopLeft with scala.Double = js.native
  /* 5 */ val TopRight: TopRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.RotatorNs.PagerPosition with scala.Double] = js.native
}

