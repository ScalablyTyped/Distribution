package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait HeaderFooterType extends js.Object

@JSGlobal("HeaderFooterType")
@js.native
object HeaderFooterType extends js.Object {
  @js.native
  sealed trait Even
    extends devexpressDashWebLib.HeaderFooterType
  
  @js.native
  sealed trait First
    extends devexpressDashWebLib.HeaderFooterType
  
  @js.native
  sealed trait Odd
    extends devexpressDashWebLib.HeaderFooterType
  
  @js.native
  sealed trait Primary
    extends devexpressDashWebLib.HeaderFooterType
  
  /* 2 */ val Even: Even with scala.Double = js.native
  /* 0 */ val First: First with scala.Double = js.native
  /* 1 */ val Odd: Odd with scala.Double = js.native
  /* 1 */ val Primary: Primary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.HeaderFooterType with scala.Double] = js.native
}

