package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ExportingOrientation extends js.Object

@JSGlobal("ej.datavisualization.Chart.ExportingOrientation")
@js.native
object ExportingOrientation extends js.Object {
  //string
  @js.native
  sealed trait Landscape
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ExportingOrientation
  
  //string
  @js.native
  sealed trait Portrait
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ExportingOrientation
  
  /* 1 */ val Landscape: Landscape with scala.Double = js.native
  /* 0 */ val Portrait: Portrait with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ExportingOrientation with scala.Double
  ] = js.native
}

