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
  
  val Fade: Fade with java.lang.String = js.native
  val None: None with java.lang.String = js.native
  val Slide: Slide with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Effect with java.lang.String
  ] = js.native
}

