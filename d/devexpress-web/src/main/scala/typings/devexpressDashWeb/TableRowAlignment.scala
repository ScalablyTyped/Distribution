package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TableRowAlignment with Double] = js.native
  /* 0 */ @js.native
  object Both extends TopLevel[Both with Double]
  
  /* 1 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 2 */ @js.native
  object Distribute extends TopLevel[Distribute with Double]
  
  /* 3 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 4 */ @js.native
  object NumTab extends TopLevel[NumTab with Double]
  
  /* 5 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

