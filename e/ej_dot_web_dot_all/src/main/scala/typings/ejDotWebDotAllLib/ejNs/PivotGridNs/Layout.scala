package typings
package ejDotWebDotAllLib.ejNs.PivotGridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Layout extends js.Object

@JSGlobal("ej.PivotGrid.Layout")
@js.native
object Layout extends js.Object {
  ///To set excel-like layout in PivotGrid.
  @js.native
  sealed trait ExcelLikeLayout
    extends ejDotWebDotAllLib.ejNs.PivotGridNs.Layout
  
  ///To set layout without summaries in PivotGrid.
  @js.native
  sealed trait NoSummaries
    extends ejDotWebDotAllLib.ejNs.PivotGridNs.Layout
  
  ///To set normal summary layout in PivotGrid.
  @js.native
  sealed trait Normal
    extends ejDotWebDotAllLib.ejNs.PivotGridNs.Layout
  
  ///To set layout with summaries at the top in PivotGrid.
  @js.native
  sealed trait NormalTopSummary
    extends ejDotWebDotAllLib.ejNs.PivotGridNs.Layout
  
  val ExcelLikeLayout: ExcelLikeLayout with java.lang.String = js.native
  val NoSummaries: NoSummaries with java.lang.String = js.native
  val Normal: Normal with java.lang.String = js.native
  val NormalTopSummary: NormalTopSummary with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotGridNs.Layout with java.lang.String] = js.native
}

