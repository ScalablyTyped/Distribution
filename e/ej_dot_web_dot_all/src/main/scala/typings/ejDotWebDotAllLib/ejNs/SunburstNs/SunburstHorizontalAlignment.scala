package typings
package ejDotWebDotAllLib.ejNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstHorizontalAlignment extends js.Object

@JSGlobal("ej.Sunburst.SunburstHorizontalAlignment")
@js.native
object SunburstHorizontalAlignment extends js.Object {
  //string
  @js.native
  sealed trait Center
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstHorizontalAlignment
  
  //string
  @js.native
  sealed trait Left
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstHorizontalAlignment
  
  //string
  @js.native
  sealed trait Right
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstHorizontalAlignment
  
  /* 0 */ val Center: Center with scala.Double = js.native
  /* 1 */ val Left: Left with scala.Double = js.native
  /* 2 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SunburstNs.SunburstHorizontalAlignment with scala.Double] = js.native
}

