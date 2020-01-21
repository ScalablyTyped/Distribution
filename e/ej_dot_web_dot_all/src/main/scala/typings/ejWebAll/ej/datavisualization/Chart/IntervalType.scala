package typings.ejWebAll.ej.datavisualization.Chart

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[IntervalType with Double] = js.native
  /* 0 */ @js.native
  object Days extends TopLevel[Days with Double]
  
  /* 1 */ @js.native
  object Hours extends TopLevel[Hours with Double]
  
  /* 3 */ @js.native
  object Milliseconds extends TopLevel[Milliseconds with Double]
  
  /* 4 */ @js.native
  object Minutes extends TopLevel[Minutes with Double]
  
  /* 5 */ @js.native
  object Months extends TopLevel[Months with Double]
  
  /* 2 */ @js.native
  object Seconds extends TopLevel[Seconds with Double]
  
  /* 6 */ @js.native
  object Years extends TopLevel[Years with Double]
  
}

