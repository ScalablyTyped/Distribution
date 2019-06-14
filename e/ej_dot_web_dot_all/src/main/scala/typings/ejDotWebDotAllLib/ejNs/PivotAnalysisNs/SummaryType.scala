package typings
package ejDotWebDotAllLib.ejNs.PivotAnalysisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SummaryType extends js.Object

@JSGlobal("ej.PivotAnalysis.SummaryType")
@js.native
object SummaryType extends js.Object {
  //Displays the average of all values as the summaries.
  @js.native
  sealed trait Average
    extends ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SummaryType
  
  //Displays the count of items in summaries.
  @js.native
  sealed trait Count
    extends ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SummaryType
  
  //Displays the maximum value of all the items in the summary.
  @js.native
  sealed trait Max
    extends ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SummaryType
  
  //Displays the minimum value of all the items in the summary.
  @js.native
  sealed trait Min
    extends ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SummaryType
  
  //Calculates the summary as the total of all values.
  @js.native
  sealed trait Sum
    extends ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SummaryType
  
  /* 1 */ val Average: Average with scala.Double = js.native
  /* 2 */ val Count: Count with scala.Double = js.native
  /* 4 */ val Max: Max with scala.Double = js.native
  /* 3 */ val Min: Min with scala.Double = js.native
  /* 0 */ val Sum: Sum with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SummaryType with scala.Double] = js.native
}

