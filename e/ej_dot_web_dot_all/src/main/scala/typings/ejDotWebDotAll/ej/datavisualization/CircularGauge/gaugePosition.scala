package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.BottomCenter
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.BottomLeft
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.BottomRight
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.Center
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.MiddleLeft
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.MiddleRight
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.TopCenter
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.TopLeft
import typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.gaugePosition.TopRight
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[gaugePosition with Double] = js.native
  /* 8 */ @js.native
  object BottomCenter extends TopLevel[BottomCenter with Double]
  
  /* 6 */ @js.native
  object BottomLeft extends TopLevel[BottomLeft with Double]
  
  /* 7 */ @js.native
  object BottomRight extends TopLevel[BottomRight with Double]
  
  /* 5 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 3 */ @js.native
  object MiddleLeft extends TopLevel[MiddleLeft with Double]
  
  /* 4 */ @js.native
  object MiddleRight extends TopLevel[MiddleRight with Double]
  
  /* 2 */ @js.native
  object TopCenter extends TopLevel[TopCenter with Double]
  
  /* 0 */ @js.native
  object TopLeft extends TopLevel[TopLeft with Double]
  
  /* 1 */ @js.native
  object TopRight extends TopLevel[TopRight with Double]
  
}

