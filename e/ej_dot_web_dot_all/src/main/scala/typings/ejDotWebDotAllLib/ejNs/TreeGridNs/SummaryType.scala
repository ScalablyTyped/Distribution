package typings
package ejDotWebDotAllLib.ejNs.TreeGridNs

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
  sealed trait Average
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SummaryType
  
  ///Displays the total count of summary column
  @js.native
  sealed trait Count
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SummaryType
  
  ///Displays the value from custom summary function
  @js.native
  sealed trait Custom
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SummaryType
  
  ///Displays the false count value for boolean summary columns
  @js.native
  sealed trait FalseCount
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SummaryType
  
  ///Displays the maximum value of summary column
  @js.native
  sealed trait Maximum
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SummaryType
  
  ///Displays the maximum date value in summary column
  @js.native
  sealed trait MaximumDate
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SummaryType
  
  ///Displays the minimum value of summary column
  @js.native
  sealed trait Minimum
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SummaryType
  
  ///Displays the minimum date value in summary column
  @js.native
  sealed trait MinimumDate
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SummaryType
  
  ///Displays the sum of summary column
  @js.native
  sealed trait Sum
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SummaryType
  
  ///Displays the true count value for boolean summary columns
  @js.native
  sealed trait TrueCount
    extends ejDotWebDotAllLib.ejNs.TreeGridNs.SummaryType
  
  /* 1 */ val Average: Average with scala.Double = js.native
  /* 4 */ val Count: Count with scala.Double = js.native
  /* 9 */ val Custom: Custom with scala.Double = js.native
  /* 8 */ val FalseCount: FalseCount with scala.Double = js.native
  /* 2 */ val Maximum: Maximum with scala.Double = js.native
  /* 6 */ val MaximumDate: MaximumDate with scala.Double = js.native
  /* 3 */ val Minimum: Minimum with scala.Double = js.native
  /* 5 */ val MinimumDate: MinimumDate with scala.Double = js.native
  /* 0 */ val Sum: Sum with scala.Double = js.native
  /* 7 */ val TrueCount: TrueCount with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.TreeGridNs.SummaryType with scala.Double] = js.native
}

