package typings
package ejDotWebDotAllLib.ejNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstVerticalAlignment extends js.Object

@JSGlobal("ej.Sunburst.SunburstVerticalAlignment")
@js.native
object SunburstVerticalAlignment extends js.Object {
  //string
  @js.native
  sealed trait Bottom
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstVerticalAlignment
  
  //string
  @js.native
  sealed trait Middle
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstVerticalAlignment
  
  //string
  @js.native
  sealed trait Top
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstVerticalAlignment
  
  /* 1 */ val Bottom: Bottom with scala.Double = js.native
  /* 2 */ val Middle: Middle with scala.Double = js.native
  /* 0 */ val Top: Top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SunburstNs.SunburstVerticalAlignment with scala.Double] = js.native
}

