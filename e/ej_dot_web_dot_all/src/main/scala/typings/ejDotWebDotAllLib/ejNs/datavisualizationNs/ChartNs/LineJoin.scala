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
  
  val Bevel: Bevel with java.lang.String = js.native
  val Miter: Miter with java.lang.String = js.native
  val Round: Round with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.LineJoin with java.lang.String
  ] = js.native
}

