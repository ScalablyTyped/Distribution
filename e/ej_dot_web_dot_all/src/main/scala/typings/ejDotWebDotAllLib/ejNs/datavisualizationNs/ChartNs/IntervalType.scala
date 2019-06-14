package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IntervalType extends js.Object

@JSGlobal("ej.datavisualization.Chart.IntervalType")
@js.native
object IntervalType extends js.Object {
  //string
  @js.native
  sealed trait Days
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.IntervalType
  
  //string
  @js.native
  sealed trait Hours
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.IntervalType
  
  //string
  @js.native
  sealed trait Milliseconds
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.IntervalType
  
  //string
  @js.native
  sealed trait Minutes
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.IntervalType
  
  //string
  @js.native
  sealed trait Months
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.IntervalType
  
  //string
  @js.native
  sealed trait Seconds
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.IntervalType
  
  //string
  @js.native
  sealed trait Years
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.IntervalType
  
  /* 0 */ val Days: Days with scala.Double = js.native
  /* 1 */ val Hours: Hours with scala.Double = js.native
  /* 3 */ val Milliseconds: Milliseconds with scala.Double = js.native
  /* 4 */ val Minutes: Minutes with scala.Double = js.native
  /* 5 */ val Months: Months with scala.Double = js.native
  /* 2 */ val Seconds: Seconds with scala.Double = js.native
  /* 6 */ val Years: Years with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.ChartNs.IntervalType with scala.Double
  ] = js.native
}

