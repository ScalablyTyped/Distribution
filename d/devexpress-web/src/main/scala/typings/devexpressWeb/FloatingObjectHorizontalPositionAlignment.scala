package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FloatingObjectHorizontalPositionAlignment extends StObject
/**
  * Lists values specifying how a floating object is horizontally aligned relative to the specified element.
  */
@JSGlobal("FloatingObjectHorizontalPositionAlignment")
@js.native
object FloatingObjectHorizontalPositionAlignment extends StObject {
  
  /**
    * The shape is centered relative to its FloatingObjectAlignmentPositionSettings.horizontalPositionType.
    */
  @js.native
  sealed trait Center
    extends StObject
       with FloatingObjectHorizontalPositionAlignment
  
  /**
    * The shape is aligned inside relative to its FloatingObjectAlignmentPositionSettings.horizontalPositionType.
    */
  @js.native
  sealed trait Inside
    extends StObject
       with FloatingObjectHorizontalPositionAlignment
  
  /**
    * The shape is left-aligned relative to its FloatingObjectAlignmentPositionSettings.horizontalPositionType.
    */
  @js.native
  sealed trait Left
    extends StObject
       with FloatingObjectHorizontalPositionAlignment
  
  /**
    * The shape is not horizontally aligned.
    */
  @js.native
  sealed trait None
    extends StObject
       with FloatingObjectHorizontalPositionAlignment
  
  /**
    * The shape is aligned outside relative to its FloatingObjectAlignmentPositionSettings.horizontalPositionType.
    */
  @js.native
  sealed trait Outside
    extends StObject
       with FloatingObjectHorizontalPositionAlignment
  
  /**
    * The shape is right-aligned relative to its FloatingObjectAlignmentPositionSettings.horizontalPositionType.
    */
  @js.native
  sealed trait Right
    extends StObject
       with FloatingObjectHorizontalPositionAlignment
}
