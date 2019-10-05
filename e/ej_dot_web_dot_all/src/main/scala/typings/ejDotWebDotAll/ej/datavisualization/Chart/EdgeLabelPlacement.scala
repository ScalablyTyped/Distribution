package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EdgeLabelPlacement extends js.Object

@JSGlobal("ej.datavisualization.Chart.EdgeLabelPlacement")
@js.native
object EdgeLabelPlacement extends js.Object {
  //string
  @js.native
  sealed trait Hide extends EdgeLabelPlacement
  
  //string
  @js.native
  sealed trait None extends EdgeLabelPlacement
  
  //string
  @js.native
  sealed trait Shift extends EdgeLabelPlacement
  
  /* 2 */ val Hide: typings.ejDotWebDotAll.ej.datavisualization.Chart.EdgeLabelPlacement.Hide with Double = js.native
  /* 0 */ val None: typings.ejDotWebDotAll.ej.datavisualization.Chart.EdgeLabelPlacement.None with Double = js.native
  /* 1 */ val Shift: typings.ejDotWebDotAll.ej.datavisualization.Chart.EdgeLabelPlacement.Shift with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EdgeLabelPlacement with Double] = js.native
}

