package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectRelativeWidthType extends js.Object

/**
  * Lists values specifying to what element the floating object width is relative.
  */
@JSGlobal("FloatingObjectRelativeWidthType")
@js.native
object FloatingObjectRelativeWidthType extends js.Object {
  /**
    * Relative to inside margin.
    */
  @js.native
  sealed trait InsideMargin extends FloatingObjectRelativeWidthType
  
  /**
    * Relative to left margin.
    */
  @js.native
  sealed trait LeftMargin extends FloatingObjectRelativeWidthType
  
  /**
    * Relative to margin.
    */
  @js.native
  sealed trait Margin extends FloatingObjectRelativeWidthType
  
  /**
    * Relative to outside margin.
    */
  @js.native
  sealed trait OutsideMargin extends FloatingObjectRelativeWidthType
  
  /**
    * Relative to page.
    */
  @js.native
  sealed trait Page extends FloatingObjectRelativeWidthType
  
  /**
    * Relative to right margin.
    */
  @js.native
  sealed trait RightMargin extends FloatingObjectRelativeWidthType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectRelativeWidthType with Double] = js.native
  /* 4 */ @js.native
  object InsideMargin extends TopLevel[InsideMargin with Double]
  
  /* 2 */ @js.native
  object LeftMargin extends TopLevel[LeftMargin with Double]
  
  /* 0 */ @js.native
  object Margin extends TopLevel[Margin with Double]
  
  /* 5 */ @js.native
  object OutsideMargin extends TopLevel[OutsideMargin with Double]
  
  /* 1 */ @js.native
  object Page extends TopLevel[Page with Double]
  
  /* 3 */ @js.native
  object RightMargin extends TopLevel[RightMargin with Double]
  
}

