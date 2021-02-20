package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
}
