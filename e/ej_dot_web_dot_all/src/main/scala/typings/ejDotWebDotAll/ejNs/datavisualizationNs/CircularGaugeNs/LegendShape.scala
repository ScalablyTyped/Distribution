package typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs

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
  sealed trait Circle extends LegendShape
  
  //string
  @js.native
  sealed trait Diamond extends LegendShape
  
  //string
  @js.native
  sealed trait Ellipse extends LegendShape
  
  //string
  @js.native
  sealed trait Line extends LegendShape
  
  //string
  @js.native
  sealed trait Pentagon extends LegendShape
  
  //string
  @js.native
  sealed trait Rectangle extends LegendShape
  
  //string
  @js.native
  sealed trait Slider extends LegendShape
  
  //string
  @js.native
  sealed trait Trapezoid extends LegendShape
  
  //string
  @js.native
  sealed trait Triangle extends LegendShape
  
  /* 1 */ val Circle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape.Circle with Double = js.native
  /* 4 */ val Diamond: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape.Diamond with Double = js.native
  /* 3 */ val Ellipse: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape.Ellipse with Double = js.native
  /* 8 */ val Line: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape.Line with Double = js.native
  /* 5 */ val Pentagon: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape.Pentagon with Double = js.native
  /* 0 */ val Rectangle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape.Rectangle with Double = js.native
  /* 6 */ val Slider: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape.Slider with Double = js.native
  /* 7 */ val Trapezoid: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape.Trapezoid with Double = js.native
  /* 2 */ val Triangle: typings.ejDotWebDotAll.ejNs.datavisualizationNs.CircularGaugeNs.LegendShape.Triangle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[LegendShape with Double] = js.native
}

