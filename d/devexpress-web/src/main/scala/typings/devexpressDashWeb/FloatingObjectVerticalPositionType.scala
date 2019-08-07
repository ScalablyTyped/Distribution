package typings.devexpressDashWeb

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
  
  /* 5 */ val BottomMargin: typings.devexpressDashWeb.FloatingObjectVerticalPositionType.BottomMargin with Double = js.native
  /* 6 */ val InsideMargin: typings.devexpressDashWeb.FloatingObjectVerticalPositionType.InsideMargin with Double = js.native
  /* 1 */ val Line: typings.devexpressDashWeb.FloatingObjectVerticalPositionType.Line with Double = js.native
  /* 3 */ val Margin: typings.devexpressDashWeb.FloatingObjectVerticalPositionType.Margin with Double = js.native
  /* 7 */ val OutsideMargin: typings.devexpressDashWeb.FloatingObjectVerticalPositionType.OutsideMargin with Double = js.native
  /* 0 */ val Page: typings.devexpressDashWeb.FloatingObjectVerticalPositionType.Page with Double = js.native
  /* 2 */ val Paragraph: typings.devexpressDashWeb.FloatingObjectVerticalPositionType.Paragraph with Double = js.native
  /* 4 */ val TopMargin: typings.devexpressDashWeb.FloatingObjectVerticalPositionType.TopMargin with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectVerticalPositionType with Double] = js.native
}

