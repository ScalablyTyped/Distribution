package typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs

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
  sealed trait MouseEnter extends Associate
  
  //Used to set the associate of tooltip as MouseFollow
  @js.native
  sealed trait MouseFollow extends Associate
  
  //Used to set the associate of tooltip as Target
  @js.native
  sealed trait Target extends Associate
  
  /* 2 */ val MouseEnter: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.Associate.MouseEnter with Double = js.native
  /* 1 */ val MouseFollow: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.Associate.MouseFollow with Double = js.native
  /* 0 */ val Target: typings.ejDotWebDotAll.ejNs.datavisualizationNs.HeatMapNs.Associate.Target with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Associate with Double] = js.native
}

