package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TextToColumnsDelimiter extends StObject
/**
  * An enumeration of the types of preset delimiters that can split a column of text into multiple
  * columns.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.TextToColumnsDelimiter")
@js.native
object TextToColumnsDelimiter extends StObject {
  
  @js.native
  sealed trait COMMA
    extends StObject
       with TextToColumnsDelimiter
  
  @js.native
  sealed trait PERIOD
    extends StObject
       with TextToColumnsDelimiter
  
  @js.native
  sealed trait SEMICOLON
    extends StObject
       with TextToColumnsDelimiter
  
  @js.native
  sealed trait SPACE
    extends StObject
       with TextToColumnsDelimiter
}
