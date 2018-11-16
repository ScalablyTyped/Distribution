package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableRowAlignment extends js.Object

@JSGlobal("TableRowAlignment")
@js.native
object TableRowAlignment extends js.Object {
  @js.native
  sealed trait Both
    extends devexpressDashWebLib.TableRowAlignment
  
  @js.native
  sealed trait Center
    extends devexpressDashWebLib.TableRowAlignment
  
  @js.native
  sealed trait Distribute
    extends devexpressDashWebLib.TableRowAlignment
  
  @js.native
  sealed trait Left
    extends devexpressDashWebLib.TableRowAlignment
  
  @js.native
  sealed trait NumTab
    extends devexpressDashWebLib.TableRowAlignment
  
  @js.native
  sealed trait Right
    extends devexpressDashWebLib.TableRowAlignment
  
  /* 0 */ val Both: Both with scala.Double = js.native
  /* 1 */ val Center: Center with scala.Double = js.native
  /* 2 */ val Distribute: Distribute with scala.Double = js.native
  /* 3 */ val Left: Left with scala.Double = js.native
  /* 4 */ val NumTab: NumTab with scala.Double = js.native
  /* 5 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.TableRowAlignment with scala.Double] = js.native
}

