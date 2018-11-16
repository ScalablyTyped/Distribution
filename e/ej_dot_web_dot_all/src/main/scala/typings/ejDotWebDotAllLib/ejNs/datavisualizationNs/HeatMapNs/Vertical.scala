package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

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
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Vertical
  
  //Used to display the tooltip horizontally on center side of rows/columns
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Vertical
  
  //Used to display the tooltip horizontally on left side of rows/columns
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Vertical
  
  val Bottom: Bottom with java.lang.String = js.native
  val Center: Center with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Vertical with java.lang.String
  ] = js.native
}

