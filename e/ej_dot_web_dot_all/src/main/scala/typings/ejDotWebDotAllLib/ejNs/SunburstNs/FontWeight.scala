package typings
package ejDotWebDotAllLib.ejNs.SunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontWeight extends js.Object

@JSGlobal("ej.Sunburst.FontWeight")
@js.native
object FontWeight extends js.Object {
  //string
  @js.native
  sealed trait Bold
    extends ejDotWebDotAllLib.ejNs.SunburstNs.FontWeight
  
  //string
  @js.native
  sealed trait Lighter
    extends ejDotWebDotAllLib.ejNs.SunburstNs.FontWeight
  
  //string
  @js.native
  sealed trait Regular
    extends ejDotWebDotAllLib.ejNs.SunburstNs.FontWeight
  
  val Bold: Bold with java.lang.String = js.native
  val Lighter: Lighter with java.lang.String = js.native
  val Regular: Regular with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SunburstNs.FontWeight with java.lang.String] = js.native
}

