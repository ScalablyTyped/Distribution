package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableCellVerticalAlignment extends js.Object

@JSGlobal("TableCellVerticalAlignment")
@js.native
object TableCellVerticalAlignment extends js.Object {
  @js.native
  sealed trait Both
    extends devexpressDashWebLib.TableCellVerticalAlignment
  
  @js.native
  sealed trait Bottom
    extends devexpressDashWebLib.TableCellVerticalAlignment
  
  @js.native
  sealed trait Center
    extends devexpressDashWebLib.TableCellVerticalAlignment
  
  @js.native
  sealed trait Top
    extends devexpressDashWebLib.TableCellVerticalAlignment
  
  /* 1 */ val Both: Both with scala.Double = js.native
  /* 3 */ val Bottom: Bottom with scala.Double = js.native
  /* 2 */ val Center: Center with scala.Double = js.native
  /* 0 */ val Top: Top with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.TableCellVerticalAlignment with scala.Double] = js.native
}

