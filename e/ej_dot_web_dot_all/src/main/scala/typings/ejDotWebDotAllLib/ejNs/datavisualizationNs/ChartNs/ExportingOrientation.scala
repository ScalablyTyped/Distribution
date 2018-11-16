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
  
  val Landscape: Landscape with java.lang.String = js.native
  val Portrait: Portrait with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.ExportingOrientation with java.lang.String
  ] = js.native
}

