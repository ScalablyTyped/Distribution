package typings.devexpressDashWeb

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TableHeightUnitType extends js.Object

/**
  * Lists values that specify unit types for the table height.
  */
@JSGlobal("TableHeightUnitType")
@js.native
object TableHeightUnitType extends js.Object {
  /**
    * The height increases automatically to accommodate the content.
    */
  @js.native
  sealed trait Auto extends TableHeightUnitType
  
  /**
    * The exact height as specified. If the text cannot fit the height, it will appear truncated.
    */
  @js.native
  sealed trait Exact extends TableHeightUnitType
  
  /**
    * The minimum height will be the specified height. The height can be increased, if needed, to accommodate the content.
    */
  @js.native
  sealed trait Minimum extends TableHeightUnitType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TableHeightUnitType with Double] = js.native
  /* 1 */ @js.native
  object Auto extends TopLevel[Auto with Double]
  
  /* 2 */ @js.native
  object Exact extends TopLevel[Exact with Double]
  
  /* 0 */ @js.native
  object Minimum extends TopLevel[Minimum with Double]
  
}

