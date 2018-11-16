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
  
  val OLAP: OLAP with java.lang.String = js.native
  val Pivot: Pivot with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotNs.AnalysisMode with java.lang.String] = js.native
}

