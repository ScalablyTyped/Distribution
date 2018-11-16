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
  
  val FlatDark: FlatDark with java.lang.String = js.native
  val FlatLight: FlatLight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstTheme with java.lang.String
  ] = js.native
}

