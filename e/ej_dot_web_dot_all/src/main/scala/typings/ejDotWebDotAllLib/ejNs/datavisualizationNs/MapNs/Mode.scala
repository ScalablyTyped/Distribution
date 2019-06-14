package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Mode extends js.Object

@JSGlobal("ej.datavisualization.Map.Mode")
@js.native
object Mode extends js.Object {
  //specifies the default mode
  @js.native
  sealed trait Default
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.Mode
  
  //specifies the interactive mode
  @js.native
  sealed trait Interactive
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.Mode
  
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 1 */ val Interactive: Interactive with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.Mode with scala.Double] = js.native
}

