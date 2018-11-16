package typings
package ejDotWebDotAllLib.ejNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstHighlightType extends js.Object

@JSGlobal("ej.Sunburst.SunburstHighlightType")
@js.native
object SunburstHighlightType extends js.Object {
  //string
  @js.native
  sealed trait Color
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstHighlightType
  
  //string
  @js.native
  sealed trait Opacity
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstHighlightType
  
  val Color: Color with java.lang.String = js.native
  val Opacity: Opacity with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SunburstNs.SunburstHighlightType with java.lang.String] = js.native
}

