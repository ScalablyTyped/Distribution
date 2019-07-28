package typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Animation extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.Animation")
@js.native
object Animation extends js.Object {
  //string
  @js.native
  sealed trait FadeIn
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.Animation
  
  //string
  @js.native
  sealed trait Rotation
    extends typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.Animation
  
  /* 1 */ val FadeIn: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.Animation.FadeIn with Double = js.native
  /* 0 */ val Rotation: typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.Animation.Rotation with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ejNs.datavisualizationNs.SunburstNs.Animation with Double] = js.native
}

