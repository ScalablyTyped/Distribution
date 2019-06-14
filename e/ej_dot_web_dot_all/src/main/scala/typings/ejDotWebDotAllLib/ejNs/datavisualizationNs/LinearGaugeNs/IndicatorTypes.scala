package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IndicatorTypes extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.IndicatorTypes")
@js.native
object IndicatorTypes extends js.Object {
  //string
  @js.native
  sealed trait Circle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.IndicatorTypes
  
  //string
  @js.native
  sealed trait Rectangle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.IndicatorTypes
  
  //string
  @js.native
  sealed trait RoundedRectangle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.IndicatorTypes
  
  //string
  @js.native
  sealed trait Text
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.IndicatorTypes
  
  /* 1 */ val Circle: Circle with scala.Double = js.native
  /* 0 */ val Rectangle: Rectangle with scala.Double = js.native
  /* 2 */ val RoundedRectangle: RoundedRectangle with scala.Double = js.native
  /* 3 */ val Text: Text with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.IndicatorTypes with scala.Double
  ] = js.native
}

