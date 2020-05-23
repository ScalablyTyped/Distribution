package typings.ejWebAll.ej.datavisualization.CircularGauge

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
  
}

