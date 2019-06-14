package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Themes extends js.Object

@JSGlobal("ej.datavisualization.LinearGauge.Themes")
@js.native
object Themes extends js.Object {
  //string
  @js.native
  sealed trait FlatDark
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.Themes
  
  //string
  @js.native
  sealed trait FlatLight
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.Themes
  
  /* 1 */ val FlatDark: FlatDark with scala.Double = js.native
  /* 0 */ val FlatLight: FlatLight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.Themes with scala.Double
  ] = js.native
}

