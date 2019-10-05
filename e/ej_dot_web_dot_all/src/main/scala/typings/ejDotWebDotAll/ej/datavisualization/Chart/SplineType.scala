package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SplineType extends js.Object

@JSGlobal("ej.datavisualization.Chart.SplineType")
@js.native
object SplineType extends js.Object {
  //string
  @js.native
  sealed trait Cardinal extends SplineType
  
  //string
  @js.native
  sealed trait Clamped extends SplineType
  
  //string
  @js.native
  sealed trait Monotonic extends SplineType
  
  //string
  @js.native
  sealed trait Natural extends SplineType
  
  /* 2 */ val Cardinal: typings.ejDotWebDotAll.ej.datavisualization.Chart.SplineType.Cardinal with Double = js.native
  /* 3 */ val Clamped: typings.ejDotWebDotAll.ej.datavisualization.Chart.SplineType.Clamped with Double = js.native
  /* 1 */ val Monotonic: typings.ejDotWebDotAll.ej.datavisualization.Chart.SplineType.Monotonic with Double = js.native
  /* 0 */ val Natural: typings.ejDotWebDotAll.ej.datavisualization.Chart.SplineType.Natural with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SplineType with Double] = js.native
}

