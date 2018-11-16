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
  
  val Default: Default with java.lang.String = js.native
  val Fixed: Fixed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.LabelSize with java.lang.String] = js.native
}

