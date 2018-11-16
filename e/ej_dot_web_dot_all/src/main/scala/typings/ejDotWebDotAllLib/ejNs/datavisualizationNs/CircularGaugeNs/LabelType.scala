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
  
  val Major: Major with java.lang.String = js.native
  val Minor: Minor with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.LabelType with java.lang.String
  ] = js.native
}

