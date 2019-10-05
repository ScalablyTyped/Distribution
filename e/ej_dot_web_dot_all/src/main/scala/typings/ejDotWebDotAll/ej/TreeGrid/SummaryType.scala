package typings.ejDotWebDotAll.ej.TreeGrid

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
  
  /* 1 */ val Average: typings.ejDotWebDotAll.ej.TreeGrid.SummaryType.Average with Double = js.native
  /* 4 */ val Count: typings.ejDotWebDotAll.ej.TreeGrid.SummaryType.Count with Double = js.native
  /* 9 */ val Custom: typings.ejDotWebDotAll.ej.TreeGrid.SummaryType.Custom with Double = js.native
  /* 8 */ val FalseCount: typings.ejDotWebDotAll.ej.TreeGrid.SummaryType.FalseCount with Double = js.native
  /* 2 */ val Maximum: typings.ejDotWebDotAll.ej.TreeGrid.SummaryType.Maximum with Double = js.native
  /* 6 */ val MaximumDate: typings.ejDotWebDotAll.ej.TreeGrid.SummaryType.MaximumDate with Double = js.native
  /* 3 */ val Minimum: typings.ejDotWebDotAll.ej.TreeGrid.SummaryType.Minimum with Double = js.native
  /* 5 */ val MinimumDate: typings.ejDotWebDotAll.ej.TreeGrid.SummaryType.MinimumDate with Double = js.native
  /* 0 */ val Sum: typings.ejDotWebDotAll.ej.TreeGrid.SummaryType.Sum with Double = js.native
  /* 7 */ val TrueCount: typings.ejDotWebDotAll.ej.TreeGrid.SummaryType.TrueCount with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SummaryType with Double] = js.native
}

