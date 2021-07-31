package typings.devexpressWeb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TabAlign extends StObject
/**
  * List alignment types for tab stops.
  */
@JSGlobal("TabAlign")
@js.native
object TabAlign extends StObject {
  
  /**
    * Text is centered on the tab stop.
    */
  @js.native
  sealed trait Center
    extends StObject
       with TabAlign
  
  /**
    * The decimal point is located at the tab stop.
    */
  @js.native
  sealed trait Decimal
    extends StObject
       with TabAlign
  
  /**
    * Text is left aligned with the tab stop.
    */
  @js.native
  sealed trait Left
    extends StObject
       with TabAlign
  
  /**
    * For internal use only.
    */
  @js.native
  sealed trait Numbering
    extends StObject
       with TabAlign
  
  /**
    * Text is right aligned with the tab stop.
    */
  @js.native
  sealed trait Right
    extends StObject
       with TabAlign
}
