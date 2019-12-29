package typings.ejDotWebDotAll.ej.TreeGrid

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SummaryType extends js.Object

@JSGlobal("ej.TreeGrid.SummaryType")
@js.native
object SummaryType extends js.Object {
  ///Displays the average of summary column
  @js.native
  sealed trait Average extends SummaryType
  
  ///Displays the total count of summary column
  @js.native
  sealed trait Count extends SummaryType
  
  ///Displays the value from custom summary function
  @js.native
  sealed trait Custom extends SummaryType
  
  ///Displays the false count value for boolean summary columns
  @js.native
  sealed trait FalseCount extends SummaryType
  
  ///Displays the maximum value of summary column
  @js.native
  sealed trait Maximum extends SummaryType
  
  ///Displays the maximum date value in summary column
  @js.native
  sealed trait MaximumDate extends SummaryType
  
  ///Displays the minimum value of summary column
  @js.native
  sealed trait Minimum extends SummaryType
  
  ///Displays the minimum date value in summary column
  @js.native
  sealed trait MinimumDate extends SummaryType
  
  ///Displays the sum of summary column
  @js.native
  sealed trait Sum extends SummaryType
  
  ///Displays the true count value for boolean summary columns
  @js.native
  sealed trait TrueCount extends SummaryType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SummaryType with Double] = js.native
  /* 1 */ @js.native
  object Average extends TopLevel[Average with Double]
  
  /* 4 */ @js.native
  object Count extends TopLevel[Count with Double]
  
  /* 9 */ @js.native
  object Custom extends TopLevel[Custom with Double]
  
  /* 8 */ @js.native
  object FalseCount extends TopLevel[FalseCount with Double]
  
  /* 2 */ @js.native
  object Maximum extends TopLevel[Maximum with Double]
  
  /* 6 */ @js.native
  object MaximumDate extends TopLevel[MaximumDate with Double]
  
  /* 3 */ @js.native
  object Minimum extends TopLevel[Minimum with Double]
  
  /* 5 */ @js.native
  object MinimumDate extends TopLevel[MinimumDate with Double]
  
  /* 0 */ @js.native
  object Sum extends TopLevel[Sum with Double]
  
  /* 7 */ @js.native
  object TrueCount extends TopLevel[TrueCount with Double]
  
}

