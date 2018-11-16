package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectHorizontalPositionType extends js.Object

@JSGlobal("FloatingObjectHorizontalPositionType")
@js.native
object FloatingObjectHorizontalPositionType extends js.Object {
  @js.native
  sealed trait Character
    extends devexpressDashWebLib.FloatingObjectHorizontalPositionType
  
  @js.native
  sealed trait Column
    extends devexpressDashWebLib.FloatingObjectHorizontalPositionType
  
  @js.native
  sealed trait InsideMargin
    extends devexpressDashWebLib.FloatingObjectHorizontalPositionType
  
  @js.native
  sealed trait LeftMargin
    extends devexpressDashWebLib.FloatingObjectHorizontalPositionType
  
  @js.native
  sealed trait Margin
    extends devexpressDashWebLib.FloatingObjectHorizontalPositionType
  
  @js.native
  sealed trait OutsideMargin
    extends devexpressDashWebLib.FloatingObjectHorizontalPositionType
  
  @js.native
  sealed trait Page
    extends devexpressDashWebLib.FloatingObjectHorizontalPositionType
  
  @js.native
  sealed trait RightMargin
    extends devexpressDashWebLib.FloatingObjectHorizontalPositionType
  
  /* 1 */ val Character: Character with scala.Double = js.native
  /* 2 */ val Column: Column with scala.Double = js.native
  /* 6 */ val InsideMargin: InsideMargin with scala.Double = js.native
  /* 4 */ val LeftMargin: LeftMargin with scala.Double = js.native
  /* 3 */ val Margin: Margin with scala.Double = js.native
  /* 7 */ val OutsideMargin: OutsideMargin with scala.Double = js.native
  /* 0 */ val Page: Page with scala.Double = js.native
  /* 5 */ val RightMargin: RightMargin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.FloatingObjectHorizontalPositionType with scala.Double] = js.native
}

