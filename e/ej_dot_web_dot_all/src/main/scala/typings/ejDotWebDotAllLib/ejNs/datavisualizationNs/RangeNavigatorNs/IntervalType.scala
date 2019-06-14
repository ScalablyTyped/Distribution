package typings
package ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait IntervalType extends js.Object

@JSGlobal("ej.datavisualization.RangeNavigator.IntervalType")
@js.native
object IntervalType extends js.Object {
  //string
  @js.native
  sealed trait Days
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType
  
  //string
  @js.native
  sealed trait Hours
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType
  
  //string
  @js.native
  sealed trait Minutes
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType
  
  //string
  @js.native
  sealed trait Months
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType
  
  //string
  @js.native
  sealed trait Quarters
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType
  
  //string
  @js.native
  sealed trait Weeks
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType
  
  //string
  @js.native
  sealed trait Years
    extends ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType
  
  /* 4 */ val Days: Days with scala.Double = js.native
  /* 5 */ val Hours: Hours with scala.Double = js.native
  /* 6 */ val Minutes: Minutes with scala.Double = js.native
  /* 2 */ val Months: Months with scala.Double = js.native
  /* 1 */ val Quarters: Quarters with scala.Double = js.native
  /* 3 */ val Weeks: Weeks with scala.Double = js.native
  /* 0 */ val Years: Years with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType with scala.Double
  ] = js.native
}

