package typings.devexpressDashWeb

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
  
  /* 2 */ val Center: typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.Center with Double = js.native
  /* 4 */ val Inside: typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.Inside with Double = js.native
  /* 1 */ val Left: typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.Left with Double = js.native
  /* 0 */ val None: typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.None with Double = js.native
  /* 5 */ val Outside: typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.Outside with Double = js.native
  /* 3 */ val Right: typings.devexpressDashWeb.FloatingObjectHorizontalPositionAlignment.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectHorizontalPositionAlignment with Double] = js.native
}

