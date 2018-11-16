package typings
package ejDotWebDotAllLib.ejNs.SparklineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FontWeight extends js.Object

@JSGlobal("ej.Sparkline.FontWeight")
@js.native
object FontWeight extends js.Object {
  //string
  @js.native
  sealed trait Bold
    extends ejDotWebDotAllLib.ejNs.SparklineNs.FontWeight
  
  //string
  @js.native
  sealed trait Lighter
    extends ejDotWebDotAllLib.ejNs.SparklineNs.FontWeight
  
  //string
  @js.native
  sealed trait Regular
    extends ejDotWebDotAllLib.ejNs.SparklineNs.FontWeight
  
  val Bold: Bold with java.lang.String = js.native
  val Lighter: Lighter with java.lang.String = js.native
  val Regular: Regular with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SparklineNs.FontWeight with java.lang.String] = js.native
}

