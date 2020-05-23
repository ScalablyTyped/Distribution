package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableRowAlignment extends js.Object

/**
  * Lists alignments allowed for the table row.
  */
@JSGlobal("TableRowAlignment")
@js.native
object TableRowAlignment extends js.Object {
  /**
    * Justified.
    */
  @js.native
  sealed trait Both extends TableRowAlignment
  
  /**
    * Align center.
    */
  @js.native
  sealed trait Center extends TableRowAlignment
  
  /**
    * Distribute all characters equally.
    */
  @js.native
  sealed trait Distribute extends TableRowAlignment
  
  /**
    * Align left.
    */
  @js.native
  sealed trait Left extends TableRowAlignment
  
  /**
    * Align to the list tab.
    */
  @js.native
  sealed trait NumTab extends TableRowAlignment
  
  /**
    * Align right.
    */
  @js.native
  sealed trait Right extends TableRowAlignment
  
}

