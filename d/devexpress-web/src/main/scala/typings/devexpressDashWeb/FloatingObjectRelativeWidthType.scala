package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectRelativeWidthType extends js.Object

@JSGlobal("FloatingObjectRelativeWidthType")
@js.native
object FloatingObjectRelativeWidthType extends js.Object {
  @js.native
  sealed trait InsideMargin extends FloatingObjectRelativeWidthType
  
  @js.native
  sealed trait LeftMargin extends FloatingObjectRelativeWidthType
  
  @js.native
  sealed trait Margin extends FloatingObjectRelativeWidthType
  
  @js.native
  sealed trait OutsideMargin extends FloatingObjectRelativeWidthType
  
  @js.native
  sealed trait Page extends FloatingObjectRelativeWidthType
  
  @js.native
  sealed trait RightMargin extends FloatingObjectRelativeWidthType
  
  /* 4 */ val InsideMargin: typings.devexpressDashWeb.FloatingObjectRelativeWidthType.InsideMargin with Double = js.native
  /* 2 */ val LeftMargin: typings.devexpressDashWeb.FloatingObjectRelativeWidthType.LeftMargin with Double = js.native
  /* 0 */ val Margin: typings.devexpressDashWeb.FloatingObjectRelativeWidthType.Margin with Double = js.native
  /* 5 */ val OutsideMargin: typings.devexpressDashWeb.FloatingObjectRelativeWidthType.OutsideMargin with Double = js.native
  /* 1 */ val Page: typings.devexpressDashWeb.FloatingObjectRelativeWidthType.Page with Double = js.native
  /* 3 */ val RightMargin: typings.devexpressDashWeb.FloatingObjectRelativeWidthType.RightMargin with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectRelativeWidthType with Double] = js.native
}

