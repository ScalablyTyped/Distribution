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
  
  /* 1 */ val Marker: Marker with scala.Double = js.native
  /* 0 */ val Needle: Needle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.CircularGaugeNs.PointerType with scala.Double
  ] = js.native
}

