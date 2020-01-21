package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Dimension extends js.Object

/**
  * An enumeration of possible directions along which data can be stored in a spreadsheet.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.Dimension")
@js.native
object Dimension extends js.Object {
  @js.native
  sealed trait COLUMNS extends Dimension
  
  @js.native
  sealed trait ROWS extends Dimension
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[Dimension with Double] = js.native
  /* 0 */ @js.native
  object COLUMNS extends TopLevel[COLUMNS with Double]
  
  /* 1 */ @js.native
  object ROWS extends TopLevel[ROWS with Double]
  
}

