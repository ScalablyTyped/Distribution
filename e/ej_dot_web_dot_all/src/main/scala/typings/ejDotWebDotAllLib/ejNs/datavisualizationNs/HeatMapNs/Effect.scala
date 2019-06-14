package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Effect extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.Effect")
@js.native
object Effect extends js.Object {
  //Sets tooltip animation as Fade
  @js.native
  sealed trait Fade
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Effect
  
  //Sets tooltip animation as None
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Effect
  
  //Sets tooltip animation as Slide
  @js.native
  sealed trait Slide
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Effect
  
  /* 1 */ val Fade: Fade with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val Slide: Slide with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Effect with scala.Double] = js.native
}

