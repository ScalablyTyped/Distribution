package typings.devexpressWeb

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
  
}

