package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait gaugePosition extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.gaugePosition")
@js.native
object gaugePosition extends js.Object {
  //string
  @js.native
  sealed trait BottomCenter
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition
  
  //string
  @js.native
  sealed trait BottomLeft
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition
  
  //string
  @js.native
  sealed trait BottomRight
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition
  
  //string
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition
  
  //string
  @js.native
  sealed trait MiddleLeft
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition
  
  //string
  @js.native
  sealed trait MiddleRight
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition
  
  //string
  @js.native
  sealed trait TopCenter
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition
  
  //string
  @js.native
  sealed trait TopLeft
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition
  
  //string
  @js.native
  sealed trait TopRight
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition
  
  /* 8 */ val BottomCenter: BottomCenter with scala.Double = js.native
  /* 6 */ val BottomLeft: BottomLeft with scala.Double = js.native
  /* 7 */ val BottomRight: BottomRight with scala.Double = js.native
  /* 5 */ val Center: Center with scala.Double = js.native
  /* 3 */ val MiddleLeft: MiddleLeft with scala.Double = js.native
  /* 4 */ val MiddleRight: MiddleRight with scala.Double = js.native
  /* 2 */ val TopCenter: TopCenter with scala.Double = js.native
  /* 0 */ val TopLeft: TopLeft with scala.Double = js.native
  /* 1 */ val TopRight: TopRight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition with scala.Double
  ] = js.native
}

