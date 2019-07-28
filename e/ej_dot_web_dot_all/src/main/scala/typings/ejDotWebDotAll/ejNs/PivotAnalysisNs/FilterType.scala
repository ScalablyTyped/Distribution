package typings.ejDotWebDotAll.ejNs.PivotAnalysisNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FilterType extends js.Object

@JSGlobal("ej.PivotAnalysis.FilterType")
@js.native
object FilterType extends js.Object {
  //Excludes the specified values among the members of the field.
  @js.native
  sealed trait Exclude
    extends typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.FilterType
  
  //Includes the specified values alone among the members of the field.
  @js.native
  sealed trait Include
    extends typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.FilterType
  
  /* 0 */ val Exclude: typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.FilterType.Exclude with Double = js.native
  /* 1 */ val Include: typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.FilterType.Include with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.ejDotWebDotAll.ejNs.PivotAnalysisNs.FilterType with Double] = js.native
}

