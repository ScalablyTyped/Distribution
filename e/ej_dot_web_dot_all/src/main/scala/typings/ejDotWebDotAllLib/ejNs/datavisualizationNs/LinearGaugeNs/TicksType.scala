package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TicksType extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.TicksType")
@js.native
object TicksType extends js.Object {
  //string
  @js.native
  sealed trait Majorinterval
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.TicksType
  
  //string
  @js.native
  sealed trait Minorinterval
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.TicksType
  
  /* 0 */ val Majorinterval: Majorinterval with scala.Double = js.native
  /* 1 */ val Minorinterval: Minorinterval with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.TicksType with scala.Double
  ] = js.native
}

