package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CustomLabelPositionType extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.CustomLabelPositionType")
@js.native
object CustomLabelPositionType extends js.Object {
  //string
  @js.native
  sealed trait Inner
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.CustomLabelPositionType
  
  //string
  @js.native
  sealed trait Outer
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.CustomLabelPositionType
  
  /* 0 */ val Inner: Inner with scala.Double = js.native
  /* 1 */ val Outer: Outer with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.CustomLabelPositionType with scala.Double
  ] = js.native
}

