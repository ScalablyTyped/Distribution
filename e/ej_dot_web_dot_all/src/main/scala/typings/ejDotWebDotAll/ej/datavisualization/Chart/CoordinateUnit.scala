package typings.ejDotWebDotAll.ej.datavisualization.Chart

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
  
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Chart.CoordinateUnit.None with Double = js.native
  /* 1 */ val Pixels: typings.ejDotWebDotAll.ej.datavisualization.Chart.CoordinateUnit.Pixels with Double = js.native
  /* 2 */ val Points: typings.ejDotWebDotAll.ej.datavisualization.Chart.CoordinateUnit.Points with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CoordinateUnit with Double] = js.native
}

