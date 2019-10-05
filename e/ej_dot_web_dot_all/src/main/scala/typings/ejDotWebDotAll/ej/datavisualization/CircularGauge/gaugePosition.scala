package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

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
  
  /* 8 */ val BottomCenter: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.BottomCenter with Double = js.native
  /* 6 */ val BottomLeft: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.BottomLeft with Double = js.native
  /* 7 */ val BottomRight: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.BottomRight with Double = js.native
  /* 5 */ val Center: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.Center with Double = js.native
  /* 3 */ val MiddleLeft: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.MiddleLeft with Double = js.native
  /* 4 */ val MiddleRight: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.MiddleRight with Double = js.native
  /* 2 */ val TopCenter: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.TopCenter with Double = js.native
  /* 0 */ val TopLeft: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.TopLeft with Double = js.native
  /* 1 */ val TopRight: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.TopRight with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[gaugePosition with Double] = js.native
}

