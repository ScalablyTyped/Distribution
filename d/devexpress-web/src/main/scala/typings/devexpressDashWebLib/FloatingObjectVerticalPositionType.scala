package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectVerticalPositionType extends js.Object

@JSGlobal("FloatingObjectVerticalPositionType")
@js.native
object FloatingObjectVerticalPositionType extends js.Object {
  @js.native
  sealed trait BottomMargin
    extends devexpressDashWebLib.FloatingObjectVerticalPositionType
  
  @js.native
  sealed trait InsideMargin
    extends devexpressDashWebLib.FloatingObjectVerticalPositionType
  
  @js.native
  sealed trait Line
    extends devexpressDashWebLib.FloatingObjectVerticalPositionType
  
  @js.native
  sealed trait Margin
    extends devexpressDashWebLib.FloatingObjectVerticalPositionType
  
  @js.native
  sealed trait OutsideMargin
    extends devexpressDashWebLib.FloatingObjectVerticalPositionType
  
  @js.native
  sealed trait Page
    extends devexpressDashWebLib.FloatingObjectVerticalPositionType
  
  @js.native
  sealed trait Paragraph
    extends devexpressDashWebLib.FloatingObjectVerticalPositionType
  
  @js.native
  sealed trait TopMargin
    extends devexpressDashWebLib.FloatingObjectVerticalPositionType
  
  /* 5 */ val BottomMargin: BottomMargin with scala.Double = js.native
  /* 6 */ val InsideMargin: InsideMargin with scala.Double = js.native
  /* 1 */ val Line: Line with scala.Double = js.native
  /* 3 */ val Margin: Margin with scala.Double = js.native
  /* 7 */ val OutsideMargin: OutsideMargin with scala.Double = js.native
  /* 0 */ val Page: Page with scala.Double = js.native
  /* 2 */ val Paragraph: Paragraph with scala.Double = js.native
  /* 4 */ val TopMargin: TopMargin with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[devexpressDashWebLib.FloatingObjectVerticalPositionType with scala.Double] = js.native
}

