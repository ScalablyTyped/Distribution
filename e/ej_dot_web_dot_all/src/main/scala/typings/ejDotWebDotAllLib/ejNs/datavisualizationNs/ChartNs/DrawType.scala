package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DrawType extends js.Object

@JSGlobal("ej.datavisualization.Chart.DrawType")
@js.native
object DrawType extends js.Object {
  //string
  @js.native
  sealed trait Area
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.DrawType
  
  //string
  @js.native
  sealed trait Column
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.DrawType
  
  //string
  @js.native
  sealed trait Line
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.DrawType
  
  /* 1 */ val Area: Area with scala.Double = js.native
  /* 2 */ val Column: Column with scala.Double = js.native
  /* 0 */ val Line: Line with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.DrawType with scala.Double] = js.native
}

