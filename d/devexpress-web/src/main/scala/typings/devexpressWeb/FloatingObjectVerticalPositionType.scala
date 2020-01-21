package typings.devexpressWeb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectVerticalPositionType extends js.Object

/**
  * Lists values specifying to what element the vertical position of a floating object is relative.
  */
@JSGlobal("FloatingObjectVerticalPositionType")
@js.native
object FloatingObjectVerticalPositionType extends js.Object {
  /**
    * Relative to bottom margin.
    */
  @js.native
  sealed trait BottomMargin extends FloatingObjectVerticalPositionType
  
  /**
    * Relative to inside margin.
    */
  @js.native
  sealed trait InsideMargin extends FloatingObjectVerticalPositionType
  
  /**
    * Relative to line.
    */
  @js.native
  sealed trait Line extends FloatingObjectVerticalPositionType
  
  /**
    * Relative to margin.
    */
  @js.native
  sealed trait Margin extends FloatingObjectVerticalPositionType
  
  /**
    * Relative to outside margin.
    */
  @js.native
  sealed trait OutsideMargin extends FloatingObjectVerticalPositionType
  
  /**
    * Relative to page.
    */
  @js.native
  sealed trait Page extends FloatingObjectVerticalPositionType
  
  /**
    * Relative to paragraph.
    */
  @js.native
  sealed trait Paragraph extends FloatingObjectVerticalPositionType
  
  /**
    * Relative to top margin.
    */
  @js.native
  sealed trait TopMargin extends FloatingObjectVerticalPositionType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectVerticalPositionType with Double] = js.native
  /* 5 */ @js.native
  object BottomMargin extends TopLevel[BottomMargin with Double]
  
  /* 6 */ @js.native
  object InsideMargin extends TopLevel[InsideMargin with Double]
  
  /* 1 */ @js.native
  object Line extends TopLevel[Line with Double]
  
  /* 3 */ @js.native
  object Margin extends TopLevel[Margin with Double]
  
  /* 7 */ @js.native
  object OutsideMargin extends TopLevel[OutsideMargin with Double]
  
  /* 0 */ @js.native
  object Page extends TopLevel[Page with Double]
  
  /* 2 */ @js.native
  object Paragraph
    extends TopLevel[typings.devexpressWeb.FloatingObjectVerticalPositionType.Paragraph with Double]
  
  /* 4 */ @js.native
  object TopMargin extends TopLevel[TopMargin with Double]
  
}

