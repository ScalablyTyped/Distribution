package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FloatingObjectRelativeWidthType extends StObject
/**
  * Lists values specifying to what element the floating object width is relative.
  */
@JSGlobal("FloatingObjectRelativeWidthType")
@js.native
object FloatingObjectRelativeWidthType extends StObject {
  
  /**
    * Relative to inside margin.
    */
  @js.native
  sealed trait InsideMargin
    extends StObject
       with FloatingObjectRelativeWidthType
  
  /**
    * Relative to left margin.
    */
  @js.native
  sealed trait LeftMargin
    extends StObject
       with FloatingObjectRelativeWidthType
  
  /**
    * Relative to margin.
    */
  @js.native
  sealed trait Margin
    extends StObject
       with FloatingObjectRelativeWidthType
  
  /**
    * Relative to outside margin.
    */
  @js.native
  sealed trait OutsideMargin
    extends StObject
       with FloatingObjectRelativeWidthType
  
  /**
    * Relative to page.
    */
  @js.native
  sealed trait Page
    extends StObject
       with FloatingObjectRelativeWidthType
  
  /**
    * Relative to right margin.
    */
  @js.native
  sealed trait RightMargin
    extends StObject
       with FloatingObjectRelativeWidthType
}
