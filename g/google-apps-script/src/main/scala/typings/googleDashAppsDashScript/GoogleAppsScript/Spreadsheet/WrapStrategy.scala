package typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WrapStrategy extends js.Object

@JSGlobal("GoogleAppsScript.Spreadsheet.WrapStrategy")
@js.native
object WrapStrategy extends js.Object {
  @js.native
  sealed trait CLIP extends WrapStrategy
  
  @js.native
  sealed trait OVERFLOW extends WrapStrategy
  
  @js.native
  sealed trait WRAP extends WrapStrategy
  
  /* 2 */ val CLIP: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.WrapStrategy.CLIP with Double = js.native
  /* 1 */ val OVERFLOW: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.WrapStrategy.OVERFLOW with Double = js.native
  /* 0 */ val WRAP: typings.googleDashAppsDashScript.GoogleAppsScript.Spreadsheet.WrapStrategy.WRAP with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WrapStrategy with Double] = js.native
}

