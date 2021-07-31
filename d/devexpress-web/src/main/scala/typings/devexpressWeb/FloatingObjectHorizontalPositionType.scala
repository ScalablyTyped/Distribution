package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FloatingObjectHorizontalPositionType extends StObject
/**
  * Lists values specifying to what element the horizontal position of a floating object is relative.
  */
@JSGlobal("FloatingObjectHorizontalPositionType")
@js.native
object FloatingObjectHorizontalPositionType extends StObject {
  
  /**
    * Relative to character.
    */
  @js.native
  sealed trait Character
    extends StObject
       with FloatingObjectHorizontalPositionType
  
  /**
    * Relative to column.
    */
  @js.native
  sealed trait Column
    extends StObject
       with FloatingObjectHorizontalPositionType
  
  /**
    * Relative to inside margin.
    */
  @js.native
  sealed trait InsideMargin
    extends StObject
       with FloatingObjectHorizontalPositionType
  
  /**
    * Relative to left margin.
    */
  @js.native
  sealed trait LeftMargin
    extends StObject
       with FloatingObjectHorizontalPositionType
  
  /**
    * Relative to margin.
    */
  @js.native
  sealed trait Margin
    extends StObject
       with FloatingObjectHorizontalPositionType
  
  /**
    * Relative to outside margin.
    */
  @js.native
  sealed trait OutsideMargin
    extends StObject
       with FloatingObjectHorizontalPositionType
  
  /**
    * Relative to page.
    */
  @js.native
  sealed trait Page
    extends StObject
       with FloatingObjectHorizontalPositionType
  
  /**
    * Relative to right margin.
    */
  @js.native
  sealed trait RightMargin
    extends StObject
       with FloatingObjectHorizontalPositionType
}
