package typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs

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
  sealed trait Click extends Trigger
  
  //Tooltip can be triggered on mouse hovers
  @js.native
  sealed trait Hover extends Trigger
  
  /* 1 */ val Click: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.Trigger.Click with Double = js.native
  /* 0 */ val Hover: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.Trigger.Hover with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Trigger with Double] = js.native
}

