package typings.ejDotWebDotAll.ej.PivotGrid

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
  sealed trait ExcelLikeLayout extends Layout
  
  ///To set layout without summaries in PivotGrid.
  @js.native
  sealed trait NoSummaries extends Layout
  
  ///To set normal summary layout in PivotGrid.
  @js.native
  sealed trait Normal extends Layout
  
  ///To set layout with summaries at the top in PivotGrid.
  @js.native
  sealed trait NormalTopSummary extends Layout
  
  /* 3 */ val ExcelLikeLayout: typings.ejDotWebDotAll.ej.PivotGrid.Layout.ExcelLikeLayout with Double = js.native
  /* 2 */ val NoSummaries: typings.ejDotWebDotAll.ej.PivotGrid.Layout.NoSummaries with Double = js.native
  /* 0 */ val Normal: typings.ejDotWebDotAll.ej.PivotGrid.Layout.Normal with Double = js.native
  /* 1 */ val NormalTopSummary: typings.ejDotWebDotAll.ej.PivotGrid.Layout.NormalTopSummary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Layout with Double] = js.native
}

