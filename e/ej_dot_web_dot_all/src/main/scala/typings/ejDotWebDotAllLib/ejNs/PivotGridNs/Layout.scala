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
  
  /* 3 */ val ExcelLikeLayout: ExcelLikeLayout with scala.Double = js.native
  /* 2 */ val NoSummaries: NoSummaries with scala.Double = js.native
  /* 0 */ val Normal: Normal with scala.Double = js.native
  /* 1 */ val NormalTopSummary: NormalTopSummary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[ejDotWebDotAllLib.ejNs.PivotGridNs.Layout with scala.Double] = js.native
}

