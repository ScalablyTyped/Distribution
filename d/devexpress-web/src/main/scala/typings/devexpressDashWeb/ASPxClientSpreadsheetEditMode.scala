package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ASPxClientSpreadsheetEditMode extends js.Object

@JSGlobal("ASPxClientSpreadsheetEditMode")
@js.native
object ASPxClientSpreadsheetEditMode extends js.Object {
  @js.native
  sealed trait Cell extends ASPxClientSpreadsheetEditMode
  
  @js.native
  sealed trait Comment extends ASPxClientSpreadsheetEditMode
  
  @js.native
  sealed trait None extends ASPxClientSpreadsheetEditMode
  
  /* 1 */ val Cell: typings.devexpressDashWeb.ASPxClientSpreadsheetEditMode.Cell with Double = js.native
  /* 2 */ val Comment: typings.devexpressDashWeb.ASPxClientSpreadsheetEditMode.Comment with Double = js.native
  /* 0 */ val None: typings.devexpressDashWeb.ASPxClientSpreadsheetEditMode.None with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ASPxClientSpreadsheetEditMode with Double] = js.native
}

