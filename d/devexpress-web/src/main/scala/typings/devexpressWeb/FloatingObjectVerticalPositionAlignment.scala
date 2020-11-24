package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
