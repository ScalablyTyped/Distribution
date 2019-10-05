package typings.ejDotWebDotAll.ej.datavisualization.Chart

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
  sealed trait Days extends IntervalType
  
  //string
  @js.native
  sealed trait Hours extends IntervalType
  
  //string
  @js.native
  sealed trait Milliseconds extends IntervalType
  
  //string
  @js.native
  sealed trait Minutes extends IntervalType
  
  //string
  @js.native
  sealed trait Months extends IntervalType
  
  //string
  @js.native
  sealed trait Seconds extends IntervalType
  
  //string
  @js.native
  sealed trait Years extends IntervalType
  
  /* 0 */ val Days: typings.ejDotWebDotAll.ej.datavisualization.Chart.IntervalType.Days with Double = js.native
  /* 1 */ val Hours: typings.ejDotWebDotAll.ej.datavisualization.Chart.IntervalType.Hours with Double = js.native
  /* 3 */ val Milliseconds: typings.ejDotWebDotAll.ej.datavisualization.Chart.IntervalType.Milliseconds with Double = js.native
  /* 4 */ val Minutes: typings.ejDotWebDotAll.ej.datavisualization.Chart.IntervalType.Minutes with Double = js.native
  /* 5 */ val Months: typings.ejDotWebDotAll.ej.datavisualization.Chart.IntervalType.Months with Double = js.native
  /* 2 */ val Seconds: typings.ejDotWebDotAll.ej.datavisualization.Chart.IntervalType.Seconds with Double = js.native
  /* 6 */ val Years: typings.ejDotWebDotAll.ej.datavisualization.Chart.IntervalType.Years with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IntervalType with Double] = js.native
}

