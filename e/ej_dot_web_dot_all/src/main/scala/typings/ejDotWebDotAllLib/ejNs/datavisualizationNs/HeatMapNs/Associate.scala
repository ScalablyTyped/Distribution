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
  
  val MouseEnter: MouseEnter with java.lang.String = js.native
  val MouseFollow: MouseFollow with java.lang.String = js.native
  val Target: Target with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Associate with java.lang.String
  ] = js.native
}

