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
  
  val Days: Days with java.lang.String = js.native
  val Hours: Hours with java.lang.String = js.native
  val Minutes: Minutes with java.lang.String = js.native
  val Months: Months with java.lang.String = js.native
  val Quarters: Quarters with java.lang.String = js.native
  val Weeks: Weeks with java.lang.String = js.native
  val Years: Years with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    ejDotWebDotAllLib.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType with java.lang.String
  ] = js.native
}

