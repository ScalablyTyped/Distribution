package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendIcons extends js.Object

@JSGlobal("ej.datavisualization.Map.LegendIcons")
@js.native
object LegendIcons extends js.Object {
  //specifies the circle position
  @js.native
  sealed trait Circle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LegendIcons
  
  //specifies the rectangle position
  @js.native
  sealed trait Rectangle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LegendIcons
  
  /* 1 */ val Circle: Circle with scala.Double = js.native
  /* 0 */ val Rectangle: Rectangle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LegendIcons with scala.Double] = js.native
}

