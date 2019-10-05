package typings.ejDotWebDotAll.ej.datavisualization.Chart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSGlobal("ej.datavisualization.Chart.Mode")
@js.native
object Mode extends js.Object {
  //string
  @js.native
  sealed trait Cluster extends Mode
  
  //string
  @js.native
  sealed trait Point extends Mode
  
  //string
  @js.native
  sealed trait Range extends Mode
  
  //string
  @js.native
  sealed trait Series extends Mode
  
  /* 2 */ val Cluster: typings.ejDotWebDotAll.ej.datavisualization.Chart.Mode.Cluster with Double = js.native
  /* 1 */ val Point: typings.ejDotWebDotAll.ej.datavisualization.Chart.Mode.Point with Double = js.native
  /* 3 */ val Range: typings.ejDotWebDotAll.ej.datavisualization.Chart.Mode.Range with Double = js.native
  /* 0 */ val Series: typings.ejDotWebDotAll.ej.datavisualization.Chart.Mode.Series with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Mode with Double] = js.native
}

