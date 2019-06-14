package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelSize extends js.Object

@JSGlobal("ej.datavisualization.Map.LabelSize")
@js.native
object LabelSize extends js.Object {
  //specifies the default size
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LabelSize
  
  //specifies the fixed size
  @js.native
  sealed trait Fixed
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LabelSize
  
  /* 1 */ val Default: Default with scala.Double = js.native
  /* 0 */ val Fixed: Fixed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LabelSize with scala.Double] = js.native
}

