package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectRelativeWidthType extends js.Object

@JSGlobal("FloatingObjectRelativeWidthType")
@js.native
object FloatingObjectRelativeWidthType extends js.Object {
  @js.native
  sealed trait InsideMargin
    extends devexpressDashWebLib.FloatingObjectRelativeWidthType
  
  @js.native
  sealed trait LeftMargin
    extends devexpressDashWebLib.FloatingObjectRelativeWidthType
  
  @js.native
  sealed trait Margin
    extends devexpressDashWebLib.FloatingObjectRelativeWidthType
  
  @js.native
  sealed trait OutsideMargin
    extends devexpressDashWebLib.FloatingObjectRelativeWidthType
  
  @js.native
  sealed trait Page
    extends devexpressDashWebLib.FloatingObjectRelativeWidthType
  
  @js.native
  sealed trait RightMargin
    extends devexpressDashWebLib.FloatingObjectRelativeWidthType
  
  /* 4 */ val InsideMargin: InsideMargin with scala.Double = js.native
  /* 2 */ val LeftMargin: LeftMargin with scala.Double = js.native
  /* 0 */ val Margin: Margin with scala.Double = js.native
  /* 5 */ val OutsideMargin: OutsideMargin with scala.Double = js.native
  /* 1 */ val Page: Page with scala.Double = js.native
  /* 3 */ val RightMargin: RightMargin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.FloatingObjectRelativeWidthType with scala.Double] = js.native
}

