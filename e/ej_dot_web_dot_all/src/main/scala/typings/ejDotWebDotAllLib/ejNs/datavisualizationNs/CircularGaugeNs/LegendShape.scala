package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LegendShape extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.LegendShape")
@js.native
object LegendShape extends js.Object {
  //string
  @js.native
  sealed trait Circle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape
  
  //string
  @js.native
  sealed trait Diamond
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape
  
  //string
  @js.native
  sealed trait Ellipse
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape
  
  //string
  @js.native
  sealed trait Line
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape
  
  //string
  @js.native
  sealed trait Pentagon
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape
  
  //string
  @js.native
  sealed trait Rectangle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape
  
  //string
  @js.native
  sealed trait Slider
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape
  
  //string
  @js.native
  sealed trait Trapezoid
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape
  
  //string
  @js.native
  sealed trait Triangle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape
  
  /* 1 */ val Circle: Circle with scala.Double = js.native
  /* 4 */ val Diamond: Diamond with scala.Double = js.native
  /* 3 */ val Ellipse: Ellipse with scala.Double = js.native
  /* 8 */ val Line: Line with scala.Double = js.native
  /* 5 */ val Pentagon: Pentagon with scala.Double = js.native
  /* 0 */ val Rectangle: Rectangle with scala.Double = js.native
  /* 6 */ val Slider: Slider with scala.Double = js.native
  /* 7 */ val Trapezoid: Trapezoid with scala.Double = js.native
  /* 2 */ val Triangle: Triangle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape with scala.Double
  ] = js.native
}

