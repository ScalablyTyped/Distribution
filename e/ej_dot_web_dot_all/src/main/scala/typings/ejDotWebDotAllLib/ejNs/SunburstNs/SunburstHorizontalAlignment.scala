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
  
  val Center: Center with java.lang.String = js.native
  val Left: Left with java.lang.String = js.native
  val Right: Right with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.SunburstNs.SunburstHorizontalAlignment with java.lang.String
  ] = js.native
}

