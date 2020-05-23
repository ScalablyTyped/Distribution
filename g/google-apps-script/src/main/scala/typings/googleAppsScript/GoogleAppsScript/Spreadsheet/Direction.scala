package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Direction extends js.Object

/**
  * An enumeration representing the possible directions that one can move within a spreadsheet using
  * the arrow keys.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.Direction")
@js.native
object Direction extends js.Object {
  @js.native
  sealed trait DOWN extends Direction
  
  @js.native
  sealed trait NEXT extends Direction
  
  @js.native
  sealed trait PREVIOUS extends Direction
  
  @js.native
  sealed trait UP extends Direction
  
}

