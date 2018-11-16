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
  
  val Default: Default with java.lang.String = js.native
  val Interactive: Interactive with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.MapNs.Mode with java.lang.String] = js.native
}

