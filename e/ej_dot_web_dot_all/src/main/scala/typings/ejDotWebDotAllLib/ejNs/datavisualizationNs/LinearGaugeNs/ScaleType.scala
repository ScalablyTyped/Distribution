package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ScaleType extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.ScaleType")
@js.native
object ScaleType extends js.Object {
  //string
  @js.native
  sealed trait Major
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.ScaleType
  
  //string
  @js.native
  sealed trait Minor
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.ScaleType
  
  val Major: Major with java.lang.String = js.native
  val Minor: Minor with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.ScaleType with java.lang.String
  ] = js.native
}

