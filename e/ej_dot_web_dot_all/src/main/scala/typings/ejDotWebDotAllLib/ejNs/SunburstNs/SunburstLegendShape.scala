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
  
  /* 3 */ val Circle: Circle with scala.Double = js.native
  /* 4 */ val Cross: Cross with scala.Double = js.native
  /* 0 */ val Diamond: Diamond with scala.Double = js.native
  /* 1 */ val Pentagon: Pentagon with scala.Double = js.native
  /* 2 */ val Rectangle: Rectangle with scala.Double = js.native
  /* 5 */ val Triangle: Triangle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SunburstNs.SunburstLegendShape with scala.Double] = js.native
}

