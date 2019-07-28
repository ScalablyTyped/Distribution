package typings.ejDotWebDotAll.ejNs.RotatorNs

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
  sealed trait BottomLeft extends PagerPosition
  
  ///string
  @js.native
  sealed trait BottomRight extends PagerPosition
  
  ///string
  @js.native
  sealed trait Outside extends PagerPosition
  
  ///string
  @js.native
  sealed trait TopCenter extends PagerPosition
  
  ///string
  @js.native
  sealed trait TopLeft extends PagerPosition
  
  ///string
  @js.native
  sealed trait TopRight extends PagerPosition
  
  /* 0 */ val BottomLeft: typings.ejDotWebDotAll.ejNs.RotatorNs.PagerPosition.BottomLeft with Double = js.native
  /* 1 */ val BottomRight: typings.ejDotWebDotAll.ejNs.RotatorNs.PagerPosition.BottomRight with Double = js.native
  /* 2 */ val Outside: typings.ejDotWebDotAll.ejNs.RotatorNs.PagerPosition.Outside with Double = js.native
  /* 3 */ val TopCenter: typings.ejDotWebDotAll.ejNs.RotatorNs.PagerPosition.TopCenter with Double = js.native
  /* 4 */ val TopLeft: typings.ejDotWebDotAll.ejNs.RotatorNs.PagerPosition.TopLeft with Double = js.native
  /* 5 */ val TopRight: typings.ejDotWebDotAll.ejNs.RotatorNs.PagerPosition.TopRight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PagerPosition with Double] = js.native
}

