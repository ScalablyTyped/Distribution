package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendType extends js.Object

@JSGlobal("ej.datavisualization.Map.LegendType")
@js.native
object LegendType extends js.Object {
  //specifies the bubbles type
  @js.native
  sealed trait Bubbles
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LegendType
  
  //specifies the layers type
  @js.native
  sealed trait Layers
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LegendType
  
  /* 1 */ val Bubbles: Bubbles with scala.Double = js.native
  /* 0 */ val Layers: Layers with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LegendType with scala.Double] = js.native
}

