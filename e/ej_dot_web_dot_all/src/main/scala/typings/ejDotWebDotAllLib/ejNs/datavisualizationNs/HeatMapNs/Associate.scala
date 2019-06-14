package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Associate extends js.Object

@JSGlobal("ej.datavisualization.HeatMap.Associate")
@js.native
object Associate extends js.Object {
  //Used to set the associate of tooltip as MouseEnter
  @js.native
  sealed trait MouseEnter
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Associate
  
  //Used to set the associate of tooltip as MouseFollow
  @js.native
  sealed trait MouseFollow
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Associate
  
  //Used to set the associate of tooltip as Target
  @js.native
  sealed trait Target
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Associate
  
  /* 2 */ val MouseEnter: MouseEnter with scala.Double = js.native
  /* 1 */ val MouseFollow: MouseFollow with scala.Double = js.native
  /* 0 */ val Target: Target with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Associate with scala.Double] = js.native
}

