package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CoordinateUnit extends js.Object

@JSGlobal("ej.datavisualization.Chart.CoordinateUnit")
@js.native
object CoordinateUnit extends js.Object {
  //string
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.CoordinateUnit
  
  //string
  @js.native
  sealed trait Pixels
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.CoordinateUnit
  
  //string
  @js.native
  sealed trait Points
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.CoordinateUnit
  
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Pixels: Pixels with scala.Double = js.native
  /* 2 */ val Points: Points with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.CoordinateUnit with scala.Double
  ] = js.native
}

