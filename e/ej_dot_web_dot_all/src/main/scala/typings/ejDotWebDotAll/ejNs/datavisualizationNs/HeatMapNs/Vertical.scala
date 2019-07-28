package typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Vertical extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.Vertical")
@js.native
object Vertical extends js.Object {
  //Used to display the tooltip horizontally on right side of rows/columns
  @js.native
  sealed trait Bottom extends Vertical
  
  //Used to display the tooltip horizontally on center side of rows/columns
  @js.native
  sealed trait Center extends Vertical
  
  //Used to display the tooltip horizontally on left side of rows/columns
  @js.native
  sealed trait Top extends Vertical
  
  /* 2 */ val Bottom: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.Vertical.Bottom with Double = js.native
  /* 1 */ val Center: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.Vertical.Center with Double = js.native
  /* 0 */ val Top: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.Vertical.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Vertical with Double] = js.native
}

