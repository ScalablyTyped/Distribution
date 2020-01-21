package typings.devexpressWeb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectRelativeHeightType extends js.Object

/**
  * Lists values specifying to what element the floating object height is relative.
  */
@JSGlobal("FloatingObjectRelativeHeightType")
@js.native
object FloatingObjectRelativeHeightType extends js.Object {
  /**
    * Relative to bottom margin.
    */
  @js.native
  sealed trait BottomMargin extends FloatingObjectRelativeHeightType
  
  /**
    * Relative to inside margin.
    */
  @js.native
  sealed trait InsideMargin extends FloatingObjectRelativeHeightType
  
  /**
    * Relative to margin.
    */
  @js.native
  sealed trait Margin extends FloatingObjectRelativeHeightType
  
  /**
    * Relative to outside margin.
    */
  @js.native
  sealed trait OutsideMargin extends FloatingObjectRelativeHeightType
  
  /**
    * Relative to page.
    */
  @js.native
  sealed trait Page extends FloatingObjectRelativeHeightType
  
  /**
    * Relative to top margin.
    */
  @js.native
  sealed trait TopMargin extends FloatingObjectRelativeHeightType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectRelativeHeightType with Double] = js.native
  /* 3 */ @js.native
  object BottomMargin extends TopLevel[BottomMargin with Double]
  
  /* 4 */ @js.native
  object InsideMargin extends TopLevel[InsideMargin with Double]
  
  /* 0 */ @js.native
  object Margin extends TopLevel[Margin with Double]
  
  /* 5 */ @js.native
  object OutsideMargin extends TopLevel[OutsideMargin with Double]
  
  /* 1 */ @js.native
  object Page extends TopLevel[Page with Double]
  
  /* 2 */ @js.native
  object TopMargin extends TopLevel[TopMargin with Double]
  
}

