package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LineJoin extends js.Object

@JSGlobal("ej.datavisualization.Chart.LineJoin")
@js.native
object LineJoin extends js.Object {
  //string
  @js.native
  sealed trait Bevel
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LineJoin
  
  //string
  @js.native
  sealed trait Miter
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LineJoin
  
  //string
  @js.native
  sealed trait Round
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LineJoin
  
  /* 1 */ val Bevel: Bevel with scala.Double = js.native
  /* 2 */ val Miter: Miter with scala.Double = js.native
  /* 0 */ val Round: Round with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LineJoin with scala.Double] = js.native
}

