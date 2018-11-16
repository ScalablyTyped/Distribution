package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

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
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Horizontal
  
  //Used to display the tooltip horizontally on left side of rows/columns
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Horizontal
  
  //Used to display the tooltip horizontally on right side of rows/columns
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Horizontal
  
  val Center: Center with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Horizontal with java.lang.String
  ] = js.native
}

