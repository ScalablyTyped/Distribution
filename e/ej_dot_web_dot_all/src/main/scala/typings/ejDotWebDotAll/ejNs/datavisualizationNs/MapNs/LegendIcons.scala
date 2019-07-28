package typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs

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
  sealed trait Circle extends LegendIcons
  
  //specifies the rectangle position
  @js.native
  sealed trait Rectangle extends LegendIcons
  
  /* 1 */ val Circle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs.LegendIcons.Circle with Double = js.native
  /* 0 */ val Rectangle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.MapNs.LegendIcons.Rectangle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LegendIcons with Double] = js.native
}

