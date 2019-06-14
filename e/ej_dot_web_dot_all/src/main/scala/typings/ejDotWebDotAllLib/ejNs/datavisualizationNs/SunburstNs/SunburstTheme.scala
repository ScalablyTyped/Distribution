package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstTheme extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstTheme")
@js.native
object SunburstTheme extends js.Object {
  //string
  @js.native
  sealed trait FlatDark
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstTheme
  
  //string
  @js.native
  sealed trait FlatLight
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstTheme
  
  /* 1 */ val FlatDark: FlatDark with scala.Double = js.native
  /* 0 */ val FlatLight: FlatLight with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstTheme with scala.Double
  ] = js.native
}

