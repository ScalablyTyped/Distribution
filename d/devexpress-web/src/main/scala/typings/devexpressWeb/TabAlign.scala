package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TabAlign extends js.Object
/**
  * List alignment types for tab stops.
  */
@JSGlobal("TabAlign")
@js.native
object TabAlign extends js.Object {
  
  /**
    * Text is centered on the tab stop.
    */
  @js.native
  sealed trait Center extends TabAlign
  
  /**
    * The decimal point is located at the tab stop.
    */
  @js.native
  sealed trait Decimal extends TabAlign
  
  /**
    * Text is left aligned with the tab stop.
    */
  @js.native
  sealed trait Left extends TabAlign
  
  /**
    * For internal use only.
    */
  @js.native
  sealed trait Numbering extends TabAlign
  
  /**
    * Text is right aligned with the tab stop.
    */
  @js.native
  sealed trait Right extends TabAlign
}
