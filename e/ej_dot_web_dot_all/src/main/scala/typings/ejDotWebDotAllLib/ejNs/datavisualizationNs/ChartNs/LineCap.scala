package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineCap extends js.Object

@JSGlobal("ej.datavisualization.Chart.LineCap")
@js.native
object LineCap extends js.Object {
  //string
  @js.native
  sealed trait Butt
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LineCap
  
  //string
  @js.native
  sealed trait Round
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LineCap
  
  //string
  @js.native
  sealed trait Square
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LineCap
  
  val Butt: Butt with java.lang.String = js.native
  val Round: Round with java.lang.String = js.native
  val Square: Square with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LineCap with java.lang.String] = js.native
}

