package typings.ejDotWebDotAll.ejNs.PivotNs

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
  sealed trait OLAP extends AnalysisMode
  
  //To bind a relational data source to PivotGrid.
  @js.native
  sealed trait Pivot extends AnalysisMode
  
  /* 0 */ val OLAP: typings.ejDotWebDotAll.ejNs.PivotNs.AnalysisMode.OLAP with Double = js.native
  /* 1 */ val Pivot: typings.ejDotWebDotAll.ejNs.PivotNs.AnalysisMode.Pivot with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AnalysisMode with Double] = js.native
}

