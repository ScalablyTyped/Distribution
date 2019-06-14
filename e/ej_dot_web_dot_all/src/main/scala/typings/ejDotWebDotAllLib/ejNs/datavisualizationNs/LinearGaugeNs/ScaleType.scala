package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScaleType extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.ScaleType")
@js.native
object ScaleType extends js.Object {
  //string
  @js.native
  sealed trait Major
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.ScaleType
  
  //string
  @js.native
  sealed trait Minor
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.ScaleType
  
  /* 0 */ val Major: Major with scala.Double = js.native
  /* 1 */ val Minor: Minor with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.ScaleType with scala.Double
  ] = js.native
}

