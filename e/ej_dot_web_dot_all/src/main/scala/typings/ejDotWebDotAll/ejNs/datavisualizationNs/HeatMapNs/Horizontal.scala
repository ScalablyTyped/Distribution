package typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Horizontal extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.Horizontal")
@js.native
object Horizontal extends js.Object {
  //Used to display the tooltip horizontally on center side of rows/columns
  @js.native
  sealed trait Center extends Horizontal
  
  //Used to display the tooltip horizontally on left side of rows/columns
  @js.native
  sealed trait Left extends Horizontal
  
  //Used to display the tooltip horizontally on right side of rows/columns
  @js.native
  sealed trait Right extends Horizontal
  
  /* 1 */ val Center: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.Horizontal.Center with Double = js.native
  /* 0 */ val Left: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.Horizontal.Left with Double = js.native
  /* 2 */ val Right: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.Horizontal.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Horizontal with Double] = js.native
}

