package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

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
  sealed trait Arrow
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.NeedleType
  
  //string
  @js.native
  sealed trait Image
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.NeedleType
  
  //string
  @js.native
  sealed trait Rectangle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.NeedleType
  
  //string
  @js.native
  sealed trait Trapezoid
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.NeedleType
  
  //string
  @js.native
  sealed trait Triangle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.NeedleType
  
  /* 2 */ val Arrow: Arrow with scala.Double = js.native
  /* 3 */ val Image: Image with scala.Double = js.native
  /* 1 */ val Rectangle: Rectangle with scala.Double = js.native
  /* 4 */ val Trapezoid: Trapezoid with scala.Double = js.native
  /* 0 */ val Triangle: Triangle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.NeedleType with scala.Double
  ] = js.native
}

