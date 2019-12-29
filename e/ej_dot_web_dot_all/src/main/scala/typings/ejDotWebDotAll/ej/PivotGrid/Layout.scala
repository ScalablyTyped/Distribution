package typings.ejDotWebDotAll.ej.PivotGrid

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Layout with Double] = js.native
  /* 3 */ @js.native
  object ExcelLikeLayout extends TopLevel[ExcelLikeLayout with Double]
  
  /* 2 */ @js.native
  object NoSummaries extends TopLevel[NoSummaries with Double]
  
  /* 0 */ @js.native
  object Normal extends TopLevel[Normal with Double]
  
  /* 1 */ @js.native
  object NormalTopSummary extends TopLevel[NormalTopSummary with Double]
  
}

