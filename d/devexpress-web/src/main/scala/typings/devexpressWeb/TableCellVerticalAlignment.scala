package typings.devexpressWeb

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TableCellVerticalAlignment with Double] = js.native
  /* 1 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  /* 3 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 2 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 0 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

