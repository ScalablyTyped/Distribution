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
  
  val Inner: Inner with java.lang.String = js.native
  val Outer: Outer with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.CustomLabelPositionType with java.lang.String
  ] = js.native
}

