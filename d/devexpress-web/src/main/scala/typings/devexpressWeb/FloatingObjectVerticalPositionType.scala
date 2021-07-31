package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FloatingObjectVerticalPositionType extends StObject
/**
  * Lists values specifying to what element the vertical position of a floating object is relative.
  */
@JSGlobal("FloatingObjectVerticalPositionType")
@js.native
object FloatingObjectVerticalPositionType extends StObject {
  
  /**
    * Relative to bottom margin.
    */
  @js.native
  sealed trait BottomMargin
    extends StObject
       with FloatingObjectVerticalPositionType
  
  /**
    * Relative to inside margin.
    */
  @js.native
  sealed trait InsideMargin
    extends StObject
       with FloatingObjectVerticalPositionType
  
  /**
    * Relative to line.
    */
  @js.native
  sealed trait Line
    extends StObject
       with FloatingObjectVerticalPositionType
  
  /**
    * Relative to margin.
    */
  @js.native
  sealed trait Margin
    extends StObject
       with FloatingObjectVerticalPositionType
  
  /**
    * Relative to outside margin.
    */
  @js.native
  sealed trait OutsideMargin
    extends StObject
       with FloatingObjectVerticalPositionType
  
  /**
    * Relative to page.
    */
  @js.native
  sealed trait Page
    extends StObject
       with FloatingObjectVerticalPositionType
  
  /**
    * Relative to paragraph.
    */
  @js.native
  sealed trait Paragraph
    extends StObject
       with FloatingObjectVerticalPositionType
  
  /**
    * Relative to top margin.
    */
  @js.native
  sealed trait TopMargin
    extends StObject
       with FloatingObjectVerticalPositionType
}
