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
  
  val FullCircle: FullCircle with java.lang.String = js.native
  val HalfCircle: HalfCircle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.FrameType with java.lang.String
  ] = js.native
}

