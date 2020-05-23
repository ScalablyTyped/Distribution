package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WrapStrategy extends js.Object

/**
  * An enumeration of the strategies used to handle cell text wrapping.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.WrapStrategy")
@js.native
object WrapStrategy extends js.Object {
  @js.native
  sealed trait CLIP extends WrapStrategy
  
  @js.native
  sealed trait OVERFLOW extends WrapStrategy
  
  @js.native
  sealed trait WRAP extends WrapStrategy
  
}

