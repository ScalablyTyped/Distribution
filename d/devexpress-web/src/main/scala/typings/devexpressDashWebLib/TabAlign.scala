package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TabAlign extends js.Object

@JSGlobal("TabAlign")
@js.native
object TabAlign extends js.Object {
  @js.native
  sealed trait Center
    extends devexpressDashWebLib.TabAlign
  
  @js.native
  sealed trait Decimal
    extends devexpressDashWebLib.TabAlign
  
  @js.native
  sealed trait Left
    extends devexpressDashWebLib.TabAlign
  
  @js.native
  sealed trait Right
    extends devexpressDashWebLib.TabAlign
  
  /* 1 */ val Center: Center with scala.Double = js.native
  /* 3 */ val Decimal: Decimal with scala.Double = js.native
  /* 0 */ val Left: Left with scala.Double = js.native
  /* 2 */ val Right: Right with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.TabAlign with scala.Double] = js.native
}

