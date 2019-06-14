package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendOrientation extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.LegendOrientation")
@js.native
object LegendOrientation extends js.Object {
  //Scales the graphic content non-uniformly to the width and height of the diagram area
  @js.native
  sealed trait Horizontal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.LegendOrientation
  
  //Used to align the image at the top left of diagram area
  @js.native
  sealed trait Vertical
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.LegendOrientation
  
  /* 0 */ val Horizontal: Horizontal with scala.Double = js.native
  /* 1 */ val Vertical: Vertical with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.LegendOrientation with scala.Double
  ] = js.native
}

