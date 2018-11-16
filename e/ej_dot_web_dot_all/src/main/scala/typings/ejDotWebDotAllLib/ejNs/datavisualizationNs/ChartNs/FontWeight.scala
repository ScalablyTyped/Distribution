package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontWeight extends js.Object

@JSGlobal("ej.datavisualization.Chart.FontWeight")
@js.native
object FontWeight extends js.Object {
  //string
  @js.native
  sealed trait Bold
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.FontWeight
  
  //string
  @js.native
  sealed trait Lighter
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.FontWeight
  
  //string
  @js.native
  sealed trait Regular
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.FontWeight
  
  val Bold: Bold with java.lang.String = js.native
  val Lighter: Lighter with java.lang.String = js.native
  val Regular: Regular with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.FontWeight with java.lang.String
  ] = js.native
}

