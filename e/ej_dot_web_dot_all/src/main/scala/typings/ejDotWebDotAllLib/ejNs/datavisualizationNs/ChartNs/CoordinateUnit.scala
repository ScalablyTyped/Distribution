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
  
  val None: None with java.lang.String = js.native
  val Pixels: Pixels with java.lang.String = js.native
  val Points: Points with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.CoordinateUnit with java.lang.String
  ] = js.native
}

