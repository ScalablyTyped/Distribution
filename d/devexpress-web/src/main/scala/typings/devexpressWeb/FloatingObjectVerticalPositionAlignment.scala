package typings.devexpressWeb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FloatingObjectVerticalPositionAlignment extends js.Object

/**
  * Lists values specifying how a floating object is vertically aligned relative to the specified element.
  */
@JSGlobal("FloatingObjectVerticalPositionAlignment")
@js.native
object FloatingObjectVerticalPositionAlignment extends js.Object {
  /**
    * The shape is aligned to the bottom relative to its FloatingObjectAlignmentPositionSettings.verticalPositionType.
    */
  @js.native
  sealed trait Bottom extends FloatingObjectVerticalPositionAlignment
  
  /**
    * The shape is centered relative to its FloatingObjectAlignmentPositionSettings.verticalPositionType.
    */
  @js.native
  sealed trait Center extends FloatingObjectVerticalPositionAlignment
  
  /**
    * The shape is aligned inside relative to its FloatingObjectAlignmentPositionSettings.verticalPositionType.
    */
  @js.native
  sealed trait Inside extends FloatingObjectVerticalPositionAlignment
  
  /**
    * The shape is not vertically aligned.
    */
  @js.native
  sealed trait None extends FloatingObjectVerticalPositionAlignment
  
  /**
    * The shape is aligned outside relative to its FloatingObjectAlignmentPositionSettings.verticalPositionType.
    */
  @js.native
  sealed trait Outside extends FloatingObjectVerticalPositionAlignment
  
  /**
    * The shape is top aligned relative to its FloatingObjectAlignmentPositionSettings.verticalPositionType.
    */
  @js.native
  sealed trait Top extends FloatingObjectVerticalPositionAlignment
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FloatingObjectVerticalPositionAlignment with Double] = js.native
  /* 3 */ @js.native
  object Bottom extends TopLevel[Bottom with Double]
  
  /* 2 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 4 */ @js.native
  object Inside extends TopLevel[Inside with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 5 */ @js.native
  object Outside extends TopLevel[Outside with Double]
  
  /* 1 */ @js.native
  object Top extends TopLevel[Top with Double]
  
}

