package typings.ejDotWebDotAll.ejNs.PivotAnalysisNs

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
    extends typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.SortOrder
  
  //Sorts the members of the field in descending order.
  @js.native
  sealed trait Descending
    extends typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.SortOrder
  
  //Displays the members without sorting in default order.
  @js.native
  sealed trait None
    extends typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.SortOrder
  
  /* 0 */ val Ascending: typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.SortOrder.Ascending with Double = js.native
  /* 1 */ val Descending: typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.SortOrder.Descending with Double = js.native
  /* 2 */ val None: typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.SortOrder.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.SortOrder with Double] = js.native
}

