package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BorderStyle extends StObject
/**
  * Styles that can be set on a range using Range.setBorder(top, left, bottom, right, vertical, horizontal, color, style).
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.BorderStyle")
@js.native
object BorderStyle extends StObject {
  
  @js.native
  sealed trait DASHED
    extends StObject
       with BorderStyle
  
  @js.native
  sealed trait DOTTED
    extends StObject
       with BorderStyle
  
  @js.native
  sealed trait DOUBLE
    extends StObject
       with BorderStyle
  
  @js.native
  sealed trait SOLID
    extends StObject
       with BorderStyle
  
  @js.native
  sealed trait SOLID_MEDIUM
    extends StObject
       with BorderStyle
  
  @js.native
  sealed trait SOLID_THICK
    extends StObject
       with BorderStyle
}
