package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstHighlightMode extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstHighlightMode")
@js.native
object SunburstHighlightMode extends js.Object {
  //string
  @js.native
  sealed trait All
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Child
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Parent
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Point
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHighlightMode
  
  /* 3 */ val All: All with scala.Double = js.native
  /* 2 */ val Child: Child with scala.Double = js.native
  /* 1 */ val Parent: Parent with scala.Double = js.native
  /* 0 */ val Point: Point with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHighlightMode with scala.Double
  ] = js.native
}

