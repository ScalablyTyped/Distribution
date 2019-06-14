package typings
package ejDotWebDotAllLib.ejNs.PivotAnalysisNs

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
    extends ejDotWebDotAllLib.ejNs.PivotAnalysisNs.FilterType
  
  //Includes the specified values alone among the members of the field.
  @js.native
  sealed trait Include
    extends ejDotWebDotAllLib.ejNs.PivotAnalysisNs.FilterType
  
  /* 0 */ val Exclude: Exclude with scala.Double = js.native
  /* 1 */ val Include: Include with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotAnalysisNs.FilterType with scala.Double] = js.native
}

