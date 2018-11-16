package typings
package ejDotWebDotAllLib.ejNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstHighlightMode extends js.Object

@JSGlobal("ej.Sunburst.SunburstHighlightMode")
@js.native
object SunburstHighlightMode extends js.Object {
  //string
  @js.native
  sealed trait All
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Child
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Parent
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstHighlightMode
  
  //string
  @js.native
  sealed trait Point
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstHighlightMode
  
  val All: All with java.lang.String = js.native
  val Child: Child with java.lang.String = js.native
  val Parent: Parent with java.lang.String = js.native
  val Point: Point with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SunburstNs.SunburstHighlightMode with java.lang.String] = js.native
}

