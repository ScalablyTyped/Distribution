package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CrosshairMode extends js.Object

@JSGlobal("ej.datavisualization.Chart.CrosshairMode")
@js.native
object CrosshairMode extends js.Object {
  //string
  @js.native
  sealed trait Float
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.CrosshairMode
  
  //string
  @js.native
  sealed trait Grouping
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.CrosshairMode
  
  val Float: Float with java.lang.String = js.native
  val Grouping: Grouping with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.CrosshairMode with java.lang.String
  ] = js.native
}

