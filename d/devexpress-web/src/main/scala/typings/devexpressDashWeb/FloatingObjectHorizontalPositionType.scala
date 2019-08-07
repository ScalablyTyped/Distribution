package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectHorizontalPositionType extends js.Object

/**
  * Lists values specifying to what element the horizontal position of a floating object is relative.
  */
@JSGlobal("FloatingObjectHorizontalPositionType")
@js.native
object FloatingObjectHorizontalPositionType extends js.Object {
  /**
    * Relative to character.
    */
  @js.native
  sealed trait Character extends FloatingObjectHorizontalPositionType
  
  /**
    * Relative to column.
    */
  @js.native
  sealed trait Column extends FloatingObjectHorizontalPositionType
  
  /**
    * Relative to inside margin.
    */
  @js.native
  sealed trait InsideMargin extends FloatingObjectHorizontalPositionType
  
  /**
    * Relative to left margin.
    */
  @js.native
  sealed trait LeftMargin extends FloatingObjectHorizontalPositionType
  
  /**
    * Relative to margin.
    */
  @js.native
  sealed trait Margin extends FloatingObjectHorizontalPositionType
  
  /**
    * Relative to outside margin.
    */
  @js.native
  sealed trait OutsideMargin extends FloatingObjectHorizontalPositionType
  
  /**
    * Relative to page.
    */
  @js.native
  sealed trait Page extends FloatingObjectHorizontalPositionType
  
  /**
    * Relative to right margin.
    */
  @js.native
  sealed trait RightMargin extends FloatingObjectHorizontalPositionType
  
  /* 1 */ val Character: typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.Character with Double = js.native
  /* 2 */ val Column: typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.Column with Double = js.native
  /* 6 */ val InsideMargin: typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.InsideMargin with Double = js.native
  /* 4 */ val LeftMargin: typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.LeftMargin with Double = js.native
  /* 3 */ val Margin: typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.Margin with Double = js.native
  /* 7 */ val OutsideMargin: typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.OutsideMargin with Double = js.native
  /* 0 */ val Page: typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.Page with Double = js.native
  /* 5 */ val RightMargin: typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.RightMargin with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectHorizontalPositionType with Double] = js.native
}

