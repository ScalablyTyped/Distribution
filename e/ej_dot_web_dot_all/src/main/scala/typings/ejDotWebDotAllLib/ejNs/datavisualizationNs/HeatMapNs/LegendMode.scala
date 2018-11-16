package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendMode extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.LegendMode")
@js.native
object LegendMode extends js.Object {
  //Scales the graphic content non-uniformly to the width and height of the diagram area
  @js.native
  sealed trait Gradient
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.LegendMode
  
  //Used to align the image at the top left of diagram area
  @js.native
  sealed trait List
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.LegendMode
  
  val Gradient: Gradient with java.lang.String = js.native
  val List: List with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.LegendMode with java.lang.String
  ] = js.native
}

