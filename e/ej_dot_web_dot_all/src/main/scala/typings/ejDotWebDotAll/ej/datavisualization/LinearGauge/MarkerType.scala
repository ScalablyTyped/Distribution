package typings.ejDotWebDotAll.ej.datavisualization.LinearGauge

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.MarkerType.Circle
import typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.MarkerType.Diamond
import typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.MarkerType.Ellipse
import typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.MarkerType.Pentagon
import typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.MarkerType.Pointer
import typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.MarkerType.Rectangle
import typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.MarkerType.RoundedRectangle
import typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.MarkerType.Star
import typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.MarkerType.Trapezoid
import typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.MarkerType.Triangle
import typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.MarkerType.Wedge
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MarkerType extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.MarkerType")
@js.native
object MarkerType extends js.Object {
  //string
  @js.native
  sealed trait Circle extends MarkerType
  
  //string
  @js.native
  sealed trait Diamond extends MarkerType
  
  //string
  @js.native
  sealed trait Ellipse extends MarkerType
  
  //string
  @js.native
  sealed trait Pentagon extends MarkerType
  
  //string
  @js.native
  sealed trait Pointer extends MarkerType
  
  //string
  @js.native
  sealed trait Rectangle extends MarkerType
  
  //string
  @js.native
  sealed trait RoundedRectangle extends MarkerType
  
  //string
  @js.native
  sealed trait Slider extends MarkerType
  
  //string
  @js.native
  sealed trait Star extends MarkerType
  
  //string
  @js.native
  sealed trait Trapezoid extends MarkerType
  
  //string
  @js.native
  sealed trait Triangle extends MarkerType
  
  //string
  @js.native
  sealed trait Wedge extends MarkerType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[MarkerType with Double] = js.native
  /* 5 */ @js.native
  object Circle extends TopLevel[Circle with Double]
  
  /* 3 */ @js.native
  object Diamond extends TopLevel[Diamond with Double]
  
  /* 2 */ @js.native
  object Ellipse extends TopLevel[Ellipse with Double]
  
  /* 4 */ @js.native
  object Pentagon extends TopLevel[Pentagon with Double]
  
  /* 8 */ @js.native
  object Pointer extends TopLevel[Pointer with Double]
  
  /* 0 */ @js.native
  object Rectangle extends TopLevel[Rectangle with Double]
  
  /* 11 */ @js.native
  object RoundedRectangle extends TopLevel[RoundedRectangle with Double]
  
  /* 7 */ @js.native
  object Slider
    extends TopLevel[
          typings.ejDotWebDotAll.ej.datavisualization.LinearGauge.MarkerType.Slider with Double
        ]
  
  /* 6 */ @js.native
  object Star extends TopLevel[Star with Double]
  
  /* 10 */ @js.native
  object Trapezoid extends TopLevel[Trapezoid with Double]
  
  /* 1 */ @js.native
  object Triangle extends TopLevel[Triangle with Double]
  
  /* 9 */ @js.native
  object Wedge extends TopLevel[Wedge with Double]
  
}

