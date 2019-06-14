package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

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
  sealed trait FullCircle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.FrameType
  
  //string
  @js.native
  sealed trait HalfCircle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.FrameType
  
  /* 0 */ val FullCircle: FullCircle with scala.Double = js.native
  /* 1 */ val HalfCircle: HalfCircle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.FrameType with scala.Double
  ] = js.native
}

