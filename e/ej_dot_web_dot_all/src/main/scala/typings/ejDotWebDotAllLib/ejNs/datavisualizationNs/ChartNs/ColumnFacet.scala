package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColumnFacet extends js.Object

@JSGlobal("ej.datavisualization.Chart.ColumnFacet")
@js.native
object ColumnFacet extends js.Object {
  //string
  @js.native
  sealed trait Cylinder
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ColumnFacet
  
  //string
  @js.native
  sealed trait Rectangle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ColumnFacet
  
  /* 1 */ val Cylinder: Cylinder with scala.Double = js.native
  /* 0 */ val Rectangle: Rectangle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ColumnFacet with scala.Double] = js.native
}

