package typings.devexpressDashWeb

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
  
  /* 1 */ val Center: typings.devexpressDashWeb.TabAlign.Center with Double = js.native
  /* 3 */ val Decimal: typings.devexpressDashWeb.TabAlign.Decimal with Double = js.native
  /* 0 */ val Left: typings.devexpressDashWeb.TabAlign.Left with Double = js.native
  /* 4 */ val Numbering: typings.devexpressDashWeb.TabAlign.Numbering with Double = js.native
  /* 2 */ val Right: typings.devexpressDashWeb.TabAlign.Right with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TabAlign with Double] = js.native
}

