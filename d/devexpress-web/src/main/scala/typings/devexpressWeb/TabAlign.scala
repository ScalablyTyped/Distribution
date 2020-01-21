package typings.devexpressWeb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TabAlign with Double] = js.native
  /* 1 */ @js.native
  object Center extends TopLevel[Center with Double]
  
  /* 3 */ @js.native
  object Decimal extends TopLevel[Decimal with Double]
  
  /* 0 */ @js.native
  object Left extends TopLevel[Left with Double]
  
  /* 4 */ @js.native
  object Numbering extends TopLevel[Numbering with Double]
  
  /* 2 */ @js.native
  object Right extends TopLevel[Right with Double]
  
}

