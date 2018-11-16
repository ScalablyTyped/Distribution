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
  
  val Cylinder: Cylinder with java.lang.String = js.native
  val Rectangle: Rectangle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ColumnFacet with java.lang.String
  ] = js.native
}

