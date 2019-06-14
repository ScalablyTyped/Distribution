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
  
  /* 0 */ val Area: Area with scala.Double = js.native
  /* 2 */ val Column: Column with scala.Double = js.native
  /* 1 */ val Line: Line with scala.Double = js.native
  /* 3 */ val Pie: Pie with scala.Double = js.native
  /* 4 */ val WinLoss: WinLoss with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.SparklineNs.Type with scala.Double] = js.native
}

