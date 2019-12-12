package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
import typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.Center
import typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.Inside
import typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.Left
import typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.None
import typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.Outside
import typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.Right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectHorizontalPositionAlignment extends js.Object

/**
  * Lists values specifying how a floating object is horizontally aligned relative to the specified element.
  */
@JSGlobal("FloatingObjectHorizontalPositionAlignment")
@js.native
object FloatingObjectHorizontalPositionAlignment extends js.Object {
  /**
    * The shape is centered relative to its FloatingObjectAlignmentPositionSettings.horizontalPositionType.
    */
  @js.native
  sealed trait Center extends FloatingObjectHorizontalPositionAlignment
  
  /**
    * The shape is aligned inside relative to its FloatingObjectAlignmentPositionSettings.horizontalPositionType.
    */
  @js.native
  sealed trait Inside extends FloatingObjectHorizontalPositionAlignment
  
  /**
    * The shape is left-aligned relative to its FloatingObjectAlignmentPositionSettings.horizontalPositionType.
    */
  @js.native
  sealed trait Left extends FloatingObjectHorizontalPositionAlignment
  
  /**
    * The shape is not horizontally aligned.
    */
  @js.native
  sealed trait None extends FloatingObjectHorizontalPositionAlignment
  
  /**
    * The shape is aligned outside relative to its FloatingObjectAlignmentPositionSettings.horizontalPositionType.
    */
  @js.native
  sealed trait Outside extends FloatingObjectHorizontalPositionAlignment
  
  /**
    * The shape is right-aligned relative to its FloatingObjectAlignmentPositionSettings.horizontalPositionType.
    */
  @js.native
  sealed trait Right extends FloatingObjectHorizontalPositionAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectHorizontalPositionAlignment with Double] = js.native
  /* 2 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 4 */ @js.native
  object Inside extends TopLevel[Inside with Double]
  
  /* 1 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 5 */ @js.native
  object Outside extends TopLevel[Outside with Double]
  
  /* 3 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

