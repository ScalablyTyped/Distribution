package typings.ejDotWebDotAll.ej.datavisualization.CircularGauge

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait NeedleType extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.NeedleType")
@js.native
object NeedleType extends js.Object {
  //string
  @js.native
  sealed trait Arrow extends NeedleType
  
  //string
  @js.native
  sealed trait Image extends NeedleType
  
  //string
  @js.native
  sealed trait Rectangle extends NeedleType
  
  //string
  @js.native
  sealed trait Trapezoid extends NeedleType
  
  //string
  @js.native
  sealed trait Triangle extends NeedleType
  
  /* 2 */ val Arrow: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.NeedleType.Arrow with Double = js.native
  /* 3 */ val Image: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.NeedleType.Image with Double = js.native
  /* 1 */ val Rectangle: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.NeedleType.Rectangle with Double = js.native
  /* 4 */ val Trapezoid: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.NeedleType.Trapezoid with Double = js.native
  /* 0 */ val Triangle: typings.ejDotWebDotAll.ej.datavisualization.CircularGauge.NeedleType.Triangle with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[NeedleType with Double] = js.native
}

