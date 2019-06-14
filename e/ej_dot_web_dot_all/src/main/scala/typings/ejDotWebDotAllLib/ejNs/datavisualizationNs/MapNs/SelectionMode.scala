package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SelectionMode extends js.Object

@JSGlobal("ej.datavisualization.Map.SelectionMode")
@js.native
object SelectionMode extends js.Object {
  //specifies the default position
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.SelectionMode
  
  //specifies the multiple position
  @js.native
  sealed trait Multiple
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.SelectionMode
  
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 1 */ val Multiple: Multiple with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.SelectionMode with scala.Double] = js.native
}

