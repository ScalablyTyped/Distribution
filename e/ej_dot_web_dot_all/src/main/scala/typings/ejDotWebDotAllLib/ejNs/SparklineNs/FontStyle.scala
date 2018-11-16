package typings
package ejDotWebDotAllLib.ejNs.SparklineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontStyle extends js.Object

@JSGlobal("ej.Sparkline.FontStyle")
@js.native
object FontStyle extends js.Object {
  //string
  @js.native
  sealed trait Italic
    extends ejDotWebDotAllLib.ejNs.SparklineNs.FontStyle
  
  //string
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.SparklineNs.FontStyle
  
  val Italic: Italic with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SparklineNs.FontStyle with java.lang.String] = js.native
}

