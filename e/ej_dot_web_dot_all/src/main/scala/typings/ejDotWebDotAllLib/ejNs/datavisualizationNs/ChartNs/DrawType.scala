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
  
  val Area: Area with java.lang.String = js.native
  val Column: Column with java.lang.String = js.native
  val Line: Line with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.DrawType with java.lang.String
  ] = js.native
}

