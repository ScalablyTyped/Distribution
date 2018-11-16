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
  
  val Majorinterval: Majorinterval with java.lang.String = js.native
  val Minorinterval: Minorinterval with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.TicksType with java.lang.String
  ] = js.native
}

