package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Trigger extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.Trigger")
@js.native
object Trigger extends js.Object {
  //Tooltip can be triggered on mouse click
  @js.native
  sealed trait Click
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Trigger
  
  //Tooltip can be triggered on mouse hovers
  @js.native
  sealed trait Hover
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Trigger
  
  /* 1 */ val Click: Click with scala.Double = js.native
  /* 0 */ val Hover: Hover with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Trigger with scala.Double] = js.native
}

