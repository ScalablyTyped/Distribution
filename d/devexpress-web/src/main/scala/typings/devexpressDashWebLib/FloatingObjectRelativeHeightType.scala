package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectRelativeHeightType extends js.Object

@JSGlobal("FloatingObjectRelativeHeightType")
@js.native
object FloatingObjectRelativeHeightType extends js.Object {
  @js.native
  sealed trait BottomMargin
    extends devexpressDashWebLib.FloatingObjectRelativeHeightType
  
  @js.native
  sealed trait InsideMargin
    extends devexpressDashWebLib.FloatingObjectRelativeHeightType
  
  @js.native
  sealed trait Margin
    extends devexpressDashWebLib.FloatingObjectRelativeHeightType
  
  @js.native
  sealed trait OutsideMargin
    extends devexpressDashWebLib.FloatingObjectRelativeHeightType
  
  @js.native
  sealed trait Page
    extends devexpressDashWebLib.FloatingObjectRelativeHeightType
  
  @js.native
  sealed trait TopMargin
    extends devexpressDashWebLib.FloatingObjectRelativeHeightType
  
  /* 3 */ val BottomMargin: BottomMargin with scala.Double = js.native
  /* 4 */ val InsideMargin: InsideMargin with scala.Double = js.native
  /* 0 */ val Margin: Margin with scala.Double = js.native
  /* 5 */ val OutsideMargin: OutsideMargin with scala.Double = js.native
  /* 1 */ val Page: Page with scala.Double = js.native
  /* 2 */ val TopMargin: TopMargin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.FloatingObjectRelativeHeightType with scala.Double] = js.native
}

