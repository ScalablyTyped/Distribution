package typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs

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
  sealed trait Fade extends Effect
  
  //Sets tooltip animation as None
  @js.native
  sealed trait None extends Effect
  
  //Sets tooltip animation as Slide
  @js.native
  sealed trait Slide extends Effect
  
  /* 1 */ val Fade: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.Effect.Fade with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.Effect.None with Double = js.native
  /* 2 */ val Slide: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.Effect.Slide with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Effect with Double] = js.native
}

