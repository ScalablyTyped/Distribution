package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

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
  sealed trait None extends CoordinateUnit
  
  //string
  @js.native
  sealed trait Pixels extends CoordinateUnit
  
  //string
  @js.native
  sealed trait Points extends CoordinateUnit
  
  /* 0 */ val None: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.CoordinateUnit.None with Double = js.native
  /* 1 */ val Pixels: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.CoordinateUnit.Pixels with Double = js.native
  /* 2 */ val Points: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.CoordinateUnit.Points with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoordinateUnit with Double] = js.native
}

