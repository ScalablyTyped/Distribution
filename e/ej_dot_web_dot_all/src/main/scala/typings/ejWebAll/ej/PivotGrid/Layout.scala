package typings.ejWebAll.ej.PivotGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
