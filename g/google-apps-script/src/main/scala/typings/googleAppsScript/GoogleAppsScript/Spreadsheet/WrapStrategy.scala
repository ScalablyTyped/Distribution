package typings.googleAppsScript.GoogleAppsScript.Spreadsheet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait WrapStrategy extends StObject
/**
  * An enumeration of the strategies used to handle cell text wrapping.
  */
@JSGlobal("GoogleAppsScript.Spreadsheet.WrapStrategy")
@js.native
object WrapStrategy extends StObject {
  
  @js.native
  sealed trait CLIP extends WrapStrategy
  
  @js.native
  sealed trait OVERFLOW extends WrapStrategy
  
  @js.native
  sealed trait WRAP extends WrapStrategy
}
