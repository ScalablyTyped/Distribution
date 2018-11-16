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
  
  val Circle: Circle with java.lang.String = js.native
  val Rectangle: Rectangle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LegendIcons with java.lang.String
  ] = js.native
}

