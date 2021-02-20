package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FloatingObjectRelativeHeightType extends StObject
/**
  * Lists values specifying to what element the floating object height is relative.
  */
@JSGlobal("FloatingObjectRelativeHeightType")
@js.native
object FloatingObjectRelativeHeightType extends StObject {
  
  /**
    * Relative to bottom margin.
    */
  @js.native
  sealed trait BottomMargin extends FloatingObjectRelativeHeightType
  
  /**
    * Relative to inside margin.
    */
  @js.native
  sealed trait InsideMargin extends FloatingObjectRelativeHeightType
  
  /**
    * Relative to margin.
    */
  @js.native
  sealed trait Margin extends FloatingObjectRelativeHeightType
  
  /**
    * Relative to outside margin.
    */
  @js.native
  sealed trait OutsideMargin extends FloatingObjectRelativeHeightType
  
  /**
    * Relative to page.
    */
  @js.native
  sealed trait Page extends FloatingObjectRelativeHeightType
  
  /**
    * Relative to top margin.
    */
  @js.native
  sealed trait TopMargin extends FloatingObjectRelativeHeightType
}
