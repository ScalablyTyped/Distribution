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
  
  /* 0 */ val Float: Float with scala.Double = js.native
  /* 1 */ val Grouping: Grouping with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.CrosshairMode with scala.Double
  ] = js.native
}

