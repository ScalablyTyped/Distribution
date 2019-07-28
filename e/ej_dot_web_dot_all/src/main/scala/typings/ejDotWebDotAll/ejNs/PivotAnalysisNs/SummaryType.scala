package typings.ejDotWebDotAll.ejNs.PivotAnalysisNs

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
  sealed trait Average extends SummaryType
  
  //Displays the count of items in summaries.
  @js.native
  sealed trait Count extends SummaryType
  
  //Displays the maximum value of all the items in the summary.
  @js.native
  sealed trait Max extends SummaryType
  
  //Displays the minimum value of all the items in the summary.
  @js.native
  sealed trait Min extends SummaryType
  
  //Calculates the summary as the total of all values.
  @js.native
  sealed trait Sum extends SummaryType
  
  /* 1 */ val Average: typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.SummaryType.Average with Double = js.native
  /* 2 */ val Count: typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.SummaryType.Count with Double = js.native
  /* 4 */ val Max: typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.SummaryType.Max with Double = js.native
  /* 3 */ val Min: typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.SummaryType.Min with Double = js.native
  /* 0 */ val Sum: typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.SummaryType.Sum with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SummaryType with Double] = js.native
}

