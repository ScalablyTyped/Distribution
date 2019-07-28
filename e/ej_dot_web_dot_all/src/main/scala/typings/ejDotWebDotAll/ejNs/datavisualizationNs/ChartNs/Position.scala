package typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Position extends js.Object

@JSGlobal("ej.datavisualization.Chart.Position")
@js.native
object Position extends js.Object {
  //string
  @js.native
  sealed trait Bottom extends Position
  
  //string
  @js.native
  sealed trait Left extends Position
  
  //string
  @js.native
  sealed trait Right extends Position
  
  //string
  @js.native
  sealed trait Top extends Position
  
  /* 3 */ val Bottom: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.Position.Bottom with Double = js.native
  /* 0 */ val Left: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.Position.Left with Double = js.native
  /* 1 */ val Right: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.Position.Right with Double = js.native
  /* 2 */ val Top: typings.ejDotWebDotAll.ejNs.datavisualizationNs.ChartNs.Position.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Position with Double] = js.native
}

