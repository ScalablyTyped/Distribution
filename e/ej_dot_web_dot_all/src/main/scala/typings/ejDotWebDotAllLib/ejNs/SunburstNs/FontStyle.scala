package typings
package ejDotWebDotAllLib.ejNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStyle extends js.Object

@JSGlobal("ej.Sunburst.FontStyle")
@js.native
object FontStyle extends js.Object {
  //string
  @js.native
  sealed trait Italic
    extends ejDotWebDotAllLib.ejNs.SunburstNs.FontStyle
  
  //string
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.SunburstNs.FontStyle
  
  val Italic: Italic with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SunburstNs.FontStyle with java.lang.String] = js.native
}

