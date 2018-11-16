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
  
  val Average: Average with java.lang.String = js.native
  val Count: Count with java.lang.String = js.native
  val Max: Max with java.lang.String = js.native
  val Min: Min with java.lang.String = js.native
  val Sum: Sum with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SummaryType with java.lang.String] = js.native
}

