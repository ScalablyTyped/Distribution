package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
import typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.Character
import typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.Column
import typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.InsideMargin
import typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.LeftMargin
import typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.Margin
import typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.OutsideMargin
import typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.Page
import typings.devexpressDashWeb.FloatingObjectHorizontalPositionType.RightMargin
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectHorizontalPositionType with Double] = js.native
  /* 1 */ @js.native
  object Character extends TopLevel[Character with Double]
  
  /* 2 */ @js.native
  object Column extends TopLevel[Column with Double]
  
  /* 6 */ @js.native
  object InsideMargin extends TopLevel[InsideMargin with Double]
  
  /* 4 */ @js.native
  object LeftMargin extends TopLevel[LeftMargin with Double]
  
  /* 3 */ @js.native
  object Margin extends TopLevel[Margin with Double]
  
  /* 7 */ @js.native
  object OutsideMargin extends TopLevel[OutsideMargin with Double]
  
  /* 0 */ @js.native
  object Page extends TopLevel[Page with Double]
  
  /* 5 */ @js.native
  object RightMargin extends TopLevel[RightMargin with Double]
  
}

