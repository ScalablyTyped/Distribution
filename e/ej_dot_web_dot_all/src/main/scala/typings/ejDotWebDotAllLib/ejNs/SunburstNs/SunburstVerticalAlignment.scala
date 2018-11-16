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
  
  val Bottom: Bottom with java.lang.String = js.native
  val Middle: Middle with java.lang.String = js.native
  val Top: Top with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.SunburstNs.SunburstVerticalAlignment with java.lang.String
  ] = js.native
}

