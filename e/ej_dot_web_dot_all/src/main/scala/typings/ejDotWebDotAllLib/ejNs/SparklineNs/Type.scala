package typings
package ejDotWebDotAllLib.ejNs.SparklineNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Type extends js.Object

@JSGlobal("ej.Sparkline.Type")
@js.native
object Type extends js.Object {
  //string
  @js.native
  sealed trait Area
    extends ejDotWebDotAllLib.ejNs.SparklineNs.Type
  
  //string
  @js.native
  sealed trait Column
    extends ejDotWebDotAllLib.ejNs.SparklineNs.Type
  
  //string
  @js.native
  sealed trait Line
    extends ejDotWebDotAllLib.ejNs.SparklineNs.Type
  
  //string
  @js.native
  sealed trait Pie
    extends ejDotWebDotAllLib.ejNs.SparklineNs.Type
  
  //string
  @js.native
  sealed trait WinLoss
    extends ejDotWebDotAllLib.ejNs.SparklineNs.Type
  
  val Area: Area with java.lang.String = js.native
  val Column: Column with java.lang.String = js.native
  val Line: Line with java.lang.String = js.native
  val Pie: Pie with java.lang.String = js.native
  val WinLoss: WinLoss with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.SparklineNs.Type with java.lang.String] = js.native
}

