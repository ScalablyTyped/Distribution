package typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs

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
  sealed trait Majorinterval extends TicksType
  
  //string
  @js.native
  sealed trait Minorinterval extends TicksType
  
  /* 0 */ val Majorinterval: typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.TicksType.Majorinterval with Double = js.native
  /* 1 */ val Minorinterval: typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.TicksType.Minorinterval with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TicksType with Double] = js.native
}

