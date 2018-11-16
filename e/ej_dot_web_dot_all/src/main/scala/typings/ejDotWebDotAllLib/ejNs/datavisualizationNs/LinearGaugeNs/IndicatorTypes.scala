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
  
  val Circle: Circle with java.lang.String = js.native
  val Rectangle: Rectangle with java.lang.String = js.native
  val RoundedRectangle: RoundedRectangle with java.lang.String = js.native
  val Text: Text with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.IndicatorTypes with java.lang.String
  ] = js.native
}

