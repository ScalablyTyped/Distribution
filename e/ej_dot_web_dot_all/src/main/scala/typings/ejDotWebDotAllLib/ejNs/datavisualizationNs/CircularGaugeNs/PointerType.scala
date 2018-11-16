package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PointerType extends js.Object

@JSGlobal("ej.datavisualization.CircularGauge.PointerType")
@js.native
object PointerType extends js.Object {
  //string
  @js.native
  sealed trait Marker
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.PointerType
  
  //string
  @js.native
  sealed trait Needle
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.PointerType
  
  val Marker: Marker with java.lang.String = js.native
  val Needle: Needle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.PointerType with java.lang.String
  ] = js.native
}

