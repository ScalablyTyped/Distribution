package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CrosshairType extends js.Object

@JSGlobal("ej.datavisualization.Chart.CrosshairType")
@js.native
object CrosshairType extends js.Object {
  //string
  @js.native
  sealed trait Crosshair
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.CrosshairType
  
  //string
  @js.native
  sealed trait Trackball
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.CrosshairType
  
  val Crosshair: Crosshair with java.lang.String = js.native
  val Trackball: Trackball with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.CrosshairType with java.lang.String
  ] = js.native
}

