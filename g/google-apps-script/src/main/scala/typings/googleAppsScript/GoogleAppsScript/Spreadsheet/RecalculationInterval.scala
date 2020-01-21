package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RecalculationInterval extends js.Object

/**
  * An enumeration representing the possible intervals used in spreadsheet recalculation.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.RecalculationInterval")
@js.native
object RecalculationInterval extends js.Object {
  @js.native
  sealed trait HOUR extends RecalculationInterval
  
  @js.native
  sealed trait MINUTE extends RecalculationInterval
  
  @js.native
  sealed trait ON_CHANGE extends RecalculationInterval
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[RecalculationInterval with Double] = js.native
  /* 2 */ @js.native
  object HOUR extends TopLevel[HOUR with Double]
  
  /* 1 */ @js.native
  object MINUTE extends TopLevel[MINUTE with Double]
  
  /* 0 */ @js.native
  object ON_CHANGE extends TopLevel[ON_CHANGE with Double]
  
}

