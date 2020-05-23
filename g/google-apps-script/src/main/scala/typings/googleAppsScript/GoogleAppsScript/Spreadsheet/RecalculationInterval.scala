package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

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
  
}

