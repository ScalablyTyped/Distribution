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
  
  val Click: Click with java.lang.String = js.native
  val Hover: Hover with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.HeatMapNs.Trigger with java.lang.String
  ] = js.native
}

