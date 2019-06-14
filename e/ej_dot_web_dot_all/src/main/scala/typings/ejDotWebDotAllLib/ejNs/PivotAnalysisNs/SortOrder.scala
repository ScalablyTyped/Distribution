package typings
package ejDotWebDotAllLib.ejNs.PivotAnalysisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SortOrder extends js.Object

@JSGlobal("ej.PivotAnalysis.SortOrder")
@js.native
object SortOrder extends js.Object {
  //Sorts the members of the field in ascending order.
  @js.native
  sealed trait Ascending
    extends ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SortOrder
  
  //Sorts the members of the field in descending order.
  @js.native
  sealed trait Descending
    extends ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SortOrder
  
  //Displays the members without sorting in default order.
  @js.native
  sealed trait None
    extends ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SortOrder
  
  /* 0 */ val Ascending: Ascending with scala.Double = js.native
  /* 1 */ val Descending: Descending with scala.Double = js.native
  /* 2 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotAnalysisNs.SortOrder with scala.Double] = js.native
}

