package typings.devexpressDashWeb

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
  
  /* 0 */ val Both: typings.devexpressDashWeb.TableRowAlignment.Both with Double = js.native
  /* 1 */ val Center: typings.devexpressDashWeb.TableRowAlignment.Center with Double = js.native
  /* 2 */ val Distribute: typings.devexpressDashWeb.TableRowAlignment.Distribute with Double = js.native
  /* 3 */ val Left: typings.devexpressDashWeb.TableRowAlignment.Left with Double = js.native
  /* 4 */ val NumTab: typings.devexpressDashWeb.TableRowAlignment.NumTab with Double = js.native
  /* 5 */ val Right: typings.devexpressDashWeb.TableRowAlignment.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TableRowAlignment with Double] = js.native
}

