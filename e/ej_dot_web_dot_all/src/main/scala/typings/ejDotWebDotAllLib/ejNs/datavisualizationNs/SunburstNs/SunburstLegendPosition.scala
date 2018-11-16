package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstLegendPosition extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstLegendPosition")
@js.native
object SunburstLegendPosition extends js.Object {
  //string
  @js.native
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLegendPosition
  
  //string
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLegendPosition
  
  //string
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLegendPosition
  
  //string
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLegendPosition
  
  val Bottom: Bottom with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstLegendPosition with java.lang.String
  ] = js.native
}

