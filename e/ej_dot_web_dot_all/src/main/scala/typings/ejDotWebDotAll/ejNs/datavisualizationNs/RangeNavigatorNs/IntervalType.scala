package typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs

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
  sealed trait Days extends IntervalType
  
  //string
  @js.native
  sealed trait Hours extends IntervalType
  
  //string
  @js.native
  sealed trait Minutes extends IntervalType
  
  //string
  @js.native
  sealed trait Months extends IntervalType
  
  //string
  @js.native
  sealed trait Quarters extends IntervalType
  
  //string
  @js.native
  sealed trait Weeks extends IntervalType
  
  //string
  @js.native
  sealed trait Years extends IntervalType
  
  /* 4 */ val Days: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType.Days with Double = js.native
  /* 5 */ val Hours: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType.Hours with Double = js.native
  /* 6 */ val Minutes: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType.Minutes with Double = js.native
  /* 2 */ val Months: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType.Months with Double = js.native
  /* 1 */ val Quarters: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType.Quarters with Double = js.native
  /* 3 */ val Weeks: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType.Weeks with Double = js.native
  /* 0 */ val Years: typings.ejDotWebDotAll.ejNs.datavisualizationNs.RangeNavigatorNs.IntervalType.Years with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IntervalType with Double] = js.native
}

