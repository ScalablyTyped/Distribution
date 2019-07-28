package typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FrameType extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.FrameType")
@js.native
object FrameType extends js.Object {
  //string
  @js.native
  sealed trait FullCircle extends FrameType
  
  //string
  @js.native
  sealed trait HalfCircle extends FrameType
  
  /* 0 */ val FullCircle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.FrameType.FullCircle with Double = js.native
  /* 1 */ val HalfCircle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.FrameType.HalfCircle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FrameType with Double] = js.native
}

