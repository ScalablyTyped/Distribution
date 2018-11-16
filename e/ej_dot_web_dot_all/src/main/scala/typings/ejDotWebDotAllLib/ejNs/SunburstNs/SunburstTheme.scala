package typings
package ejDotWebDotAllLib.ejNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SunburstTheme extends js.Object

@JSGlobal("ej.Sunburst.SunburstTheme")
@js.native
object SunburstTheme extends js.Object {
  //string
  @js.native
  sealed trait FlatDark
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstTheme
  
  //string
  @js.native
  sealed trait FlatLight
    extends ejDotWebDotAllLib.ejNs.SunburstNs.SunburstTheme
  
  val FlatDark: FlatDark with java.lang.String = js.native
  val FlatLight: FlatLight with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SunburstNs.SunburstTheme with java.lang.String] = js.native
}

