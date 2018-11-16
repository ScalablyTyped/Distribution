package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ErrorBarMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.ErrorBarMode")
@js.native
object ErrorBarMode extends js.Object {
  //string
  @js.native
  sealed trait Both
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarMode
  
  //string
  @js.native
  sealed trait Horizontal
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarMode
  
  //string
  @js.native
  sealed trait Vertical
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarMode
  
  val Both: Both with java.lang.String = js.native
  val Horizontal: Horizontal with java.lang.String = js.native
  val Vertical: Vertical with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ErrorBarMode with java.lang.String
  ] = js.native
}

