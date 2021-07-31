package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FloatingObjectVerticalPositionAlignment extends StObject
/**
  * Lists values specifying how a floating object is vertically aligned relative to the specified element.
  */
@JSGlobal("FloatingObjectVerticalPositionAlignment")
@js.native
object FloatingObjectVerticalPositionAlignment extends StObject {
  
  /**
    * The shape is aligned to the bottom relative to its FloatingObjectAlignmentPositionSettings.verticalPositionType.
    */
  @js.native
  sealed trait Bottom
    extends StObject
       with FloatingObjectVerticalPositionAlignment
  
  /**
    * The shape is centered relative to its FloatingObjectAlignmentPositionSettings.verticalPositionType.
    */
  @js.native
  sealed trait Center
    extends StObject
       with FloatingObjectVerticalPositionAlignment
  
  /**
    * The shape is aligned inside relative to its FloatingObjectAlignmentPositionSettings.verticalPositionType.
    */
  @js.native
  sealed trait Inside
    extends StObject
       with FloatingObjectVerticalPositionAlignment
  
  /**
    * The shape is not vertically aligned.
    */
  @js.native
  sealed trait None
    extends StObject
       with FloatingObjectVerticalPositionAlignment
  
  /**
    * The shape is aligned outside relative to its FloatingObjectAlignmentPositionSettings.verticalPositionType.
    */
  @js.native
  sealed trait Outside
    extends StObject
       with FloatingObjectVerticalPositionAlignment
  
  /**
    * The shape is top aligned relative to its FloatingObjectAlignmentPositionSettings.verticalPositionType.
    */
  @js.native
  sealed trait Top
    extends StObject
       with FloatingObjectVerticalPositionAlignment
}
