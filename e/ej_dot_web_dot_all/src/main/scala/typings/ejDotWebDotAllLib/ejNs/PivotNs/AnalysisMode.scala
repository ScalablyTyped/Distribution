package typings
package ejDotWebDotAllLib.ejNs.PivotNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnalysisMode extends js.Object

@JSGlobal("ej.Pivot.AnalysisMode")
@js.native
object AnalysisMode extends js.Object {
  //To bind an OLAP data source to PivotGrid.
  @js.native
  sealed trait OLAP
    extends ejDotWebDotAllLib.ejNs.PivotNs.AnalysisMode
  
  //To bind a relational data source to PivotGrid.
  @js.native
  sealed trait Pivot
    extends ejDotWebDotAllLib.ejNs.PivotNs.AnalysisMode
  
  /* 0 */ val OLAP: OLAP with scala.Double = js.native
  /* 1 */ val Pivot: Pivot with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotNs.AnalysisMode with scala.Double] = js.native
}

