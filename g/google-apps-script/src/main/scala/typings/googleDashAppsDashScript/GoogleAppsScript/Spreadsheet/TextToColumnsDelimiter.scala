package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TextToColumnsDelimiter with Double] = js.native
  /* 0 */ @js.native
  object COMMA extends TopLevel[COMMA with Double]
  
  /* 2 */ @js.native
  object PERIOD extends TopLevel[PERIOD with Double]
  
  /* 1 */ @js.native
  object SEMICOLON extends TopLevel[SEMICOLON with Double]
  
  /* 3 */ @js.native
  object SPACE extends TopLevel[SPACE with Double]
  
}

