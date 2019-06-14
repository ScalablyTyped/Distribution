package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstHighlightType extends js.Object

@JSGlobal("ej.datavisualization.Sunburst.SunburstHighlightType")
@js.native
object SunburstHighlightType extends js.Object {
  //string
  @js.native
  sealed trait Color
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHighlightType
  
  //string
  @js.native
  sealed trait Opacity
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHighlightType
  
  /* 1 */ val Color: Color with scala.Double = js.native
  /* 0 */ val Opacity: Opacity with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.SunburstNs.SunburstHighlightType with scala.Double
  ] = js.native
}

