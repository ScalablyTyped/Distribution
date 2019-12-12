package typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator

import org.scalablytyped.runtime.TopLevel
import typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.IntervalType.Days
import typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.IntervalType.Hours
import typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.IntervalType.Minutes
import typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.IntervalType.Months
import typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.IntervalType.Quarters
import typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.IntervalType.Weeks
import typings.ejDotWebDotAll.ej.datavisualization.RangeNavigator.IntervalType.Years
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IntervalType with Double] = js.native
  /* 4 */ @js.native
  object Days extends TopLevel[Days with Double]
  
  /* 5 */ @js.native
  object Hours extends TopLevel[Hours with Double]
  
  /* 6 */ @js.native
  object Minutes extends TopLevel[Minutes with Double]
  
  /* 2 */ @js.native
  object Months extends TopLevel[Months with Double]
  
  /* 1 */ @js.native
  object Quarters extends TopLevel[Quarters with Double]
  
  /* 3 */ @js.native
  object Weeks extends TopLevel[Weeks with Double]
  
  /* 0 */ @js.native
  object Years extends TopLevel[Years with Double]
  
}

