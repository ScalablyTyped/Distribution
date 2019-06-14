package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait LabelType extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.LabelType")
@js.native
object LabelType extends js.Object {
  //string
  @js.native
  sealed trait Major
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LabelType
  
  //string
  @js.native
  sealed trait Minor
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LabelType
  
  /* 0 */ val Major: Major with scala.Double = js.native
  /* 1 */ val Minor: Minor with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LabelType with scala.Double
  ] = js.native
}

