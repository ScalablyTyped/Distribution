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
  
  /* 0 */ val Crosshair: Crosshair with scala.Double = js.native
  /* 1 */ val Trackball: Trackball with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.CrosshairType with scala.Double
  ] = js.native
}

