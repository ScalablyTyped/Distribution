package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs

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
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.Animation
  
  //string
  @js.native
  sealed trait Rotation
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.Animation
  
  /* 1 */ val FadeIn: FadeIn with scala.Double = js.native
  /* 0 */ val Rotation: Rotation with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.Animation with scala.Double
  ] = js.native
}

