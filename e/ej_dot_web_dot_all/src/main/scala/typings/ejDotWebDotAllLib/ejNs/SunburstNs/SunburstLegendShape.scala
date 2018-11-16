package typings
package ejDotWebDotAllLib.ejNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstLegendShape extends js.Object

@JSGlobal("ej.Sunburst.SunburstLegendShape")
@js.native
object SunburstLegendShape extends js.Object {
  //string
  @js.native
  sealed trait Circle
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstLegendShape
  
  //string
  @js.native
  sealed trait Cross
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstLegendShape
  
  //string
  @js.native
  sealed trait Diamond
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstLegendShape
  
  //string
  @js.native
  sealed trait Pentagon
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstLegendShape
  
  //string
  @js.native
  sealed trait Rectangle
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstLegendShape
  
  //string
  @js.native
  sealed trait Triangle
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstLegendShape
  
  val Circle: Circle with java.lang.String = js.native
  val Cross: Cross with java.lang.String = js.native
  val Diamond: Diamond with java.lang.String = js.native
  val Pentagon: Pentagon with java.lang.String = js.native
  val Rectangle: Rectangle with java.lang.String = js.native
  val Triangle: Triangle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SunburstNs.SunburstLegendShape with java.lang.String] = js.native
}

