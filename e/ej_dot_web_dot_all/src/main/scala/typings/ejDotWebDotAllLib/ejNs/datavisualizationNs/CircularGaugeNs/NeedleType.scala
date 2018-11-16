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
  
  val Arrow: Arrow with java.lang.String = js.native
  val Image: Image with java.lang.String = js.native
  val Rectangle: Rectangle with java.lang.String = js.native
  val Trapezoid: Trapezoid with java.lang.String = js.native
  val Triangle: Triangle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.NeedleType with java.lang.String
  ] = js.native
}

