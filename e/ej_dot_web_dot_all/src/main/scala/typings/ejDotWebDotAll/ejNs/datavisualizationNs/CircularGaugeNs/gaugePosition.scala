package typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs

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
  sealed trait BottomCenter extends gaugePosition
  
  //string
  @js.native
  sealed trait BottomLeft extends gaugePosition
  
  //string
  @js.native
  sealed trait BottomRight extends gaugePosition
  
  //string
  @js.native
  sealed trait Center extends gaugePosition
  
  //string
  @js.native
  sealed trait MiddleLeft extends gaugePosition
  
  //string
  @js.native
  sealed trait MiddleRight extends gaugePosition
  
  //string
  @js.native
  sealed trait TopCenter extends gaugePosition
  
  //string
  @js.native
  sealed trait TopLeft extends gaugePosition
  
  //string
  @js.native
  sealed trait TopRight extends gaugePosition
  
  /* 8 */ val BottomCenter: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition.BottomCenter with Double = js.native
  /* 6 */ val BottomLeft: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition.BottomLeft with Double = js.native
  /* 7 */ val BottomRight: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition.BottomRight with Double = js.native
  /* 5 */ val Center: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition.Center with Double = js.native
  /* 3 */ val MiddleLeft: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition.MiddleLeft with Double = js.native
  /* 4 */ val MiddleRight: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition.MiddleRight with Double = js.native
  /* 2 */ val TopCenter: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition.TopCenter with Double = js.native
  /* 0 */ val TopLeft: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition.TopLeft with Double = js.native
  /* 1 */ val TopRight: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.gaugePosition.TopRight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[gaugePosition with Double] = js.native
}

