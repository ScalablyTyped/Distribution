package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ViewType extends js.Object

@JSGlobal("ViewType")
@js.native
object ViewType extends js.Object {
  @js.native
  sealed trait PrintLayout
    extends devexpressDashWebLib.ViewType
  
  @js.native
  sealed trait Simple
    extends devexpressDashWebLib.ViewType
  
  /* 1 */ val PrintLayout: PrintLayout with scala.Double = js.native
  /* 0 */ val Simple: Simple with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.ViewType with scala.Double] = js.native
}

