package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSGlobal("ej.datavisualization.Map.Position")
@js.native
object Position extends js.Object {
  //specifies the bottomcenter position
  @js.native
  sealed trait Bottomcenter
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.Position
  
  //specifies the bottomleft position
  @js.native
  sealed trait Bottomleft
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.Position
  
  //specifies the bottomright position
  @js.native
  sealed trait Bottomright
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.Position
  
  //specifies the center position
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.Position
  
  //specifies the centerleft position
  @js.native
  sealed trait Centerleft
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.Position
  
  //specifies the centerright position
  @js.native
  sealed trait Centerright
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.Position
  
  //specifies the none position
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.Position
  
  //specifies the topcenter position
  @js.native
  sealed trait Topcenter
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.Position
  
  //specifies the topleft position
  @js.native
  sealed trait Topleft
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.Position
  
  //specifies the topright position
  @js.native
  sealed trait Topright
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.Position
  
  /* 8 */ val Bottomcenter: Bottomcenter with scala.Double = js.native
  /* 7 */ val Bottomleft: Bottomleft with scala.Double = js.native
  /* 9 */ val Bottomright: Bottomright with scala.Double = js.native
  /* 5 */ val Center: Center with scala.Double = js.native
  /* 4 */ val Centerleft: Centerleft with scala.Double = js.native
  /* 6 */ val Centerright: Centerright with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Topcenter: Topcenter with scala.Double = js.native
  /* 1 */ val Topleft: Topleft with scala.Double = js.native
  /* 3 */ val Topright: Topright with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.Position with scala.Double] = js.native
}

