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
  
  val FlatDark: FlatDark with java.lang.String = js.native
  val FlatLight: FlatLight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.LinearGaugeNs.Themes with java.lang.String
  ] = js.native
}

