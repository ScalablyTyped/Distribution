package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait BorderStyle extends js.Object
/**
  * Styles that can be set on a range using Range.setBorder(top, left, bottom, right, vertical, horizontal, color, style).
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.BorderStyle")
@js.native
object BorderStyle extends js.Object {
  
  @js.native
  sealed trait DASHED extends BorderStyle
  
  @js.native
  sealed trait DOTTED extends BorderStyle
  
  @js.native
  sealed trait DOUBLE extends BorderStyle
  
  @js.native
  sealed trait SOLID extends BorderStyle
  
  @js.native
  sealed trait SOLID_MEDIUM extends BorderStyle
  
  @js.native
  sealed trait SOLID_THICK extends BorderStyle
}
