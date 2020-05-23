package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TextToColumnsDelimiter extends js.Object

/**
  * An enumeration of the types of preset delimiters that can split a column of text into multiple
  * columns.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter")
@js.native
object TextToColumnsDelimiter extends js.Object {
  @js.native
  sealed trait COMMA extends TextToColumnsDelimiter
  
  @js.native
  sealed trait PERIOD extends TextToColumnsDelimiter
  
  @js.native
  sealed trait SEMICOLON extends TextToColumnsDelimiter
  
  @js.native
  sealed trait SPACE extends TextToColumnsDelimiter
  
}

