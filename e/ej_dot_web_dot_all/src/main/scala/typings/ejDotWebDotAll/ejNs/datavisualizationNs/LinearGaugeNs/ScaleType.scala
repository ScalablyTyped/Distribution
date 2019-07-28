package typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs

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
  sealed trait Major extends ScaleType
  
  //string
  @js.native
  sealed trait Minor extends ScaleType
  
  /* 0 */ val Major: typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.ScaleType.Major with Double = js.native
  /* 1 */ val Minor: typings.ejDotWebDotAll.ejNs.datavisualizationNs.LinearGaugeNs.ScaleType.Minor with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ScaleType with Double] = js.native
}

