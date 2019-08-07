package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableCellVerticalAlignment extends js.Object

/**
  * Lists possible vertical alignments for cell content.
  */
@JSGlobal("TableCellVerticalAlignment")
@js.native
object TableCellVerticalAlignment extends js.Object {
  /**
    * The cell content is vertically justified.
    */
  @js.native
  sealed trait Both extends TableCellVerticalAlignment
  
  /**
    * The cell content is vertically aligned at the bottom.
    */
  @js.native
  sealed trait Bottom extends TableCellVerticalAlignment
  
  /**
    * The cell content is centered vertically.
    */
  @js.native
  sealed trait Center extends TableCellVerticalAlignment
  
  /**
    * The cell content is vertically aligned at the top.
    */
  @js.native
  sealed trait Top extends TableCellVerticalAlignment
  
  /* 1 */ val Both: typings.devexpressDashWeb.TableCellVerticalAlignment.Both with Double = js.native
  /* 3 */ val Bottom: typings.devexpressDashWeb.TableCellVerticalAlignment.Bottom with Double = js.native
  /* 2 */ val Center: typings.devexpressDashWeb.TableCellVerticalAlignment.Center with Double = js.native
  /* 0 */ val Top: typings.devexpressDashWeb.TableCellVerticalAlignment.Top with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TableCellVerticalAlignment with Double] = js.native
}

