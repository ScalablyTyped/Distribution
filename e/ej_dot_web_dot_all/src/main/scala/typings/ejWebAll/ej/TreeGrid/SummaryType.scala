package typings.ejWebAll.ej.TreeGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
