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
  
  /* 0 */ val Butt: Butt with scala.Double = js.native
  /* 1 */ val Round: Round with scala.Double = js.native
  /* 2 */ val Square: Square with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LineCap with scala.Double] = js.native
}

