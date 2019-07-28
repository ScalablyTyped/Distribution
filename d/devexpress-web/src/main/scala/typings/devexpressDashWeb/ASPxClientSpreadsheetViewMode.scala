package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ASPxClientSpreadsheetViewMode extends js.Object

@JSGlobal("ASPxClientSpreadsheetViewMode")
@js.native
object ASPxClientSpreadsheetViewMode extends js.Object {
  @js.native
  sealed trait Editing extends ASPxClientSpreadsheetViewMode
  
  @js.native
  sealed trait Reading extends ASPxClientSpreadsheetViewMode
  
  /* 0 */ val Editing: typings.devexpressDashWeb.ASPxClientSpreadsheetViewMode.Editing with Double = js.native
  /* 1 */ val Reading: typings.devexpressDashWeb.ASPxClientSpreadsheetViewMode.Reading with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ASPxClientSpreadsheetViewMode with Double] = js.native
}

